package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseMessagingRegistrar implements depb {
    static clcw determineFactory(clcw clcwVar) {
        return clcwVar == null ? new deus() : clcwVar;
    }

    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(deox deoxVar) {
        return new FirebaseMessaging((dela) deoxVar.a(dela.class), (FirebaseInstanceId) deoxVar.a(FirebaseInstanceId.class), deoxVar.b(devr.class), deoxVar.b(derf.class), (desz) deoxVar.a(desz.class), determineFactory((clcw) deoxVar.a(clcw.class)), (dera) deoxVar.a(dera.class));
    }

    @Override // defpackage.depb
    public List<deow<?>> getComponents() {
        deov builder = deow.builder(FirebaseMessaging.class);
        builder.b(depi.required(dela.class));
        builder.b(depi.required(FirebaseInstanceId.class));
        builder.b(depi.optionalProvider(devr.class));
        builder.b(depi.optionalProvider(derf.class));
        builder.b(depi.optional(clcw.class));
        builder.b(depi.required(desz.class));
        builder.b(depi.required(dera.class));
        builder.c(deur.a);
        builder.e();
        return Arrays.asList(builder.a(), devq.create("fire-fcm", "20.1.7_1p"));
    }
}
