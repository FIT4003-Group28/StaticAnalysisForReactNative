package com.baidu.mapapi.utils;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.baidu.a.a.a.b;
/* loaded from: classes.dex */
final class c implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Thread thread;
        String str;
        String str2;
        com.baidu.a.a.a.b bVar;
        com.baidu.a.a.a.b bVar2;
        com.baidu.a.a.a.b bVar3;
        thread = a.v;
        thread.interrupt();
        str = a.f1950c;
        Log.d(str, "onServiceConnected " + componentName);
        try {
            bVar2 = a.f1951d;
            if (bVar2 != null) {
                com.baidu.a.a.a.b unused = a.f1951d = null;
            }
            com.baidu.a.a.a.b unused2 = a.f1951d = b.a.a(iBinder);
            bVar3 = a.f1951d;
            bVar3.a(new d(this));
        } catch (RemoteException e) {
            str2 = a.f1950c;
            Log.d(str2, "getComOpenClient ", e);
            bVar = a.f1951d;
            if (bVar == null) {
                return;
            }
            com.baidu.a.a.a.b unused3 = a.f1951d = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        String str;
        com.baidu.a.a.a.b bVar;
        str = a.f1950c;
        Log.d(str, "onServiceDisconnected " + componentName);
        bVar = a.f1951d;
        if (bVar != null) {
            com.baidu.a.a.a.b unused = a.f1951d = null;
            boolean unused2 = a.u = false;
        }
    }
}
