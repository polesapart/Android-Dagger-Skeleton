package br.com.aleques.skeleton

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import timber.log.Timber

class MessageService : FirebaseMessagingService() {

    override fun onMessageReceived(msg: RemoteMessage) {
        Timber.e("Got remote message from ${msg.from}: ${msg.data}")
        msg.notification?.also {
            Timber.e("Notification \"${it.title}\": ${it.body}")
        }
    }

    override fun onNewToken(token: String) {
     Timber.w("Message Token Id: $token")
    }
}
