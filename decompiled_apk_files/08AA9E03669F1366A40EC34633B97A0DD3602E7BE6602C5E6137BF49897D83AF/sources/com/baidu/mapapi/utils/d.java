package com.baidu.mapapi.utils;

import android.os.IBinder;
import android.util.Log;
import com.baidu.a.a.a.a;
import com.baidu.a.a.a.c;
/* loaded from: classes.dex */
class d extends c.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f1953a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar) {
        this.f1953a = cVar;
    }

    @Override // com.baidu.a.a.a.c
    public void a(IBinder iBinder) {
        String str;
        com.baidu.a.a.a.a aVar;
        boolean z;
        str = a.f1950c;
        Log.d(str, "onClientReady");
        aVar = a.e;
        if (aVar != null) {
            com.baidu.a.a.a.a unused = a.e = null;
        }
        com.baidu.a.a.a.a unused2 = a.e = a.AbstractBinderC0032a.a(iBinder);
        z = a.t;
        if (!z) {
            a.a(a.f1948a);
        }
        boolean unused3 = a.t = true;
    }
}
