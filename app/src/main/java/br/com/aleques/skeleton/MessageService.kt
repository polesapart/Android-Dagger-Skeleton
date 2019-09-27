package br.com.aleques.skeleton

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import timber.log.Timber

class MessageService : FirebaseMessagingService() {

    override fun onMessageReceived(msg: RemoteMessage) {
        Timber.w("Got remote message $msg")
    }

    override fun onNewToken(token: String) {
     Timber.w("Message Token Id: $token")
    }
}
