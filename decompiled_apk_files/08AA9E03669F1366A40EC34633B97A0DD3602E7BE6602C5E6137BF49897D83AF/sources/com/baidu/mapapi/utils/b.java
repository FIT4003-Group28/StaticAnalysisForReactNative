package com.baidu.mapapi.utils;

import android.os.IBinder;
import android.util.Log;
import com.baidu.a.a.a.a;
import com.baidu.a.a.a.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends c.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f1952a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i) {
        this.f1952a = i;
    }

    @Override // com.baidu.a.a.a.c
    public void a(IBinder iBinder) {
        String str;
        com.baidu.a.a.a.a aVar;
        str = a.f1950c;
        Log.d(str, "onClientReady");
        aVar = a.e;
        if (aVar != null) {
            com.baidu.a.a.a.a unused = a.e = null;
        }
        com.baidu.a.a.a.a unused2 = a.e = a.AbstractBinderC0032a.a(iBinder);
        a.a(this.f1952a);
        boolean unused3 = a.t = true;
    }
}
