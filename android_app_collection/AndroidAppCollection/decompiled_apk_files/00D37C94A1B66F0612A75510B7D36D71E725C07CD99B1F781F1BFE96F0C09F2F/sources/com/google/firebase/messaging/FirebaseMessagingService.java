package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class FirebaseMessagingService extends aobm {
    private static final Queue a = new ArrayDeque(10);

    public void a(RemoteMessage remoteMessage) {
    }

    public void b(String str) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027b  */
    @Override // defpackage.aobm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.h(android.content.Intent):void");
    }

    @Override // defpackage.aobm
    protected final Intent i() {
        return (Intent) aoci.a().c.poll();
    }
}
