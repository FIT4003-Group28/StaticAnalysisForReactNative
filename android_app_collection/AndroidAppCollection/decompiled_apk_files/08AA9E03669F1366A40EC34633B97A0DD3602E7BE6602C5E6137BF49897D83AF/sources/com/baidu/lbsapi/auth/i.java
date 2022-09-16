package com.baidu.lbsapi.auth;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Hashtable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f1501a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Looper looper) {
        super(looper);
        this.f1501a = hVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Hashtable hashtable;
        if (a.f1483a) {
            a.a("handleMessage !!");
        }
        String string = message.getData().getString("listenerKey");
        hashtable = h.f;
        m mVar = (m) hashtable.get(string);
        if (a.f1483a) {
            a.a("handleMessage listener = " + mVar);
        }
        if (mVar != null) {
            mVar.a(message.what, message.obj.toString());
        }
    }
}
