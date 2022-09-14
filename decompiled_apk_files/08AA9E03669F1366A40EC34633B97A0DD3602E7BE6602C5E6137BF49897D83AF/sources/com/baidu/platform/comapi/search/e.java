package com.baidu.platform.comapi.search;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f2104a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d dVar) {
        this.f2104a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        long j;
        long j2;
        c cVar;
        c cVar2;
        j = this.f2104a.f2102c;
        if (j == 0) {
            return;
        }
        j2 = this.f2104a.f2102c;
        if (j2 != ((Long) message.obj).longValue()) {
            return;
        }
        cVar = this.f2104a.f2103d;
        if (cVar == null) {
            return;
        }
        cVar2 = this.f2104a.f2103d;
        cVar2.a(message);
    }
}
