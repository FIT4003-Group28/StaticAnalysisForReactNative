package com.google.firebase.messaging;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements anxq {
    @Override // defpackage.anxq
    public List getComponents() {
        anxm a = anxn.a(FirebaseMessaging.class);
        a.b(anxy.c(anwg.class));
        a.b(anxy.a(aoae.class));
        a.b(anxy.b(aodn.class));
        a.b(anxy.b(anzl.class));
        a.b(anxy.a(osn.class));
        a.b(anxy.c(aoal.class));
        a.b(anxy.c(anzh.class));
        a.c(anyl.g);
        a.e();
        return Arrays.asList(a.a(), aodm.a("fire-fcm", "20.1.7_1p"));
    }
}
