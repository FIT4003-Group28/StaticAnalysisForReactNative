package io.invertase.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.s;
/* loaded from: classes.dex */
public class ReactNativeFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void a(s sVar) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void a(String str) {
        io.invertase.firebase.common.g.b().b(n.a(str));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void a(String str, Exception exc) {
        io.invertase.firebase.common.g.b().b(n.a(str, exc));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void b() {
        io.invertase.firebase.common.g.b().b(n.a());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void b(String str) {
        io.invertase.firebase.common.g.b().b(n.b(str));
    }
}
