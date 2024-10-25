
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveFileUploadManager from "./components/listers/DriveFileUploadCards"
import DriveFileUploadDetail from "./components/listers/DriveFileUploadDetail"

import VideoProcessingVideoProcessManager from "./components/listers/VideoProcessingVideoProcessCards"
import VideoProcessingVideoProcessDetail from "./components/listers/VideoProcessingVideoProcessDetail"


import NotificationNotificationManager from "./components/listers/NotificationNotificationCards"
import NotificationNotificationDetail from "./components/listers/NotificationNotificationDetail"

import IndexerIndexerManager from "./components/listers/IndexerIndexerCards"
import IndexerIndexerDetail from "./components/listers/IndexerIndexerDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/fileUploads',
                name: 'DriveFileUploadManager',
                component: DriveFileUploadManager
            },
            {
                path: '/drives/fileUploads/:id',
                name: 'DriveFileUploadDetail',
                component: DriveFileUploadDetail
            },

            {
                path: '/videoProcessings/videoProcesses',
                name: 'VideoProcessingVideoProcessManager',
                component: VideoProcessingVideoProcessManager
            },
            {
                path: '/videoProcessings/videoProcesses/:id',
                name: 'VideoProcessingVideoProcessDetail',
                component: VideoProcessingVideoProcessDetail
            },


            {
                path: '/notifications/notifications',
                name: 'NotificationNotificationManager',
                component: NotificationNotificationManager
            },
            {
                path: '/notifications/notifications/:id',
                name: 'NotificationNotificationDetail',
                component: NotificationNotificationDetail
            },

            {
                path: '/indexers/indexers',
                name: 'IndexerIndexerManager',
                component: IndexerIndexerManager
            },
            {
                path: '/indexers/indexers/:id',
                name: 'IndexerIndexerDetail',
                component: IndexerIndexerDetail
            },



    ]
})
