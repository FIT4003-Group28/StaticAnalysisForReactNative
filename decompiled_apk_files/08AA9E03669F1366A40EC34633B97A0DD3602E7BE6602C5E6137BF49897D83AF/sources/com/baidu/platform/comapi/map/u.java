package com.baidu.platform.comapi.map;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f2085a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(t tVar) {
        this.f2085a = tVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        t tVar;
        y yVar;
        super.handleMessage(message);
        tVar = t.f2082c;
        if (tVar != null) {
            yVar = this.f2085a.f2084d;
            yVar.a(message);
        }
    }
}
