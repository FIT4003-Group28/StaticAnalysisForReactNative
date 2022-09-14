package com.baidu.platform.comapi;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f1995a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f1995a = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        this.f1995a.a(message);
    }
}
