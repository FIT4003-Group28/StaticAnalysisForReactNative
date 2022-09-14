package com.baidu.platform.comapi;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.UIMsg;
import com.baidu.mapapi.VersionInfo;
import com.baidu.platform.comapi.util.PermissionCheck;
import com.baidu.platform.comapi.util.f;
import com.baidu.platform.comjni.engine.AppEngine;
import com.baidu.vi.VMsg;
/* loaded from: classes.dex */
public class a implements PermissionCheck.c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1980a = "a";
    private static a f = null;
    private static int g = -100;

    /* renamed from: b  reason: collision with root package name */
    private Context f1981b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f1982c;

    /* renamed from: d  reason: collision with root package name */
    private d f1983d;
    private int e;

    static {
        NativeLoader.getInstance().loadLibrary(VersionInfo.getKitName());
        AppEngine.InitClass();
    }

    private a() {
    }

    public static a a() {
        if (f == null) {
            f = new a();
        }
        return f;
    }

    private void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        if (this.f1981b == null || this.f1983d == null) {
            return;
        }
        this.f1981b.registerReceiver(this.f1983d, intentFilter);
    }

    private void g() {
        if (this.f1983d == null || this.f1981b == null) {
            return;
        }
        this.f1981b.unregisterReceiver(this.f1983d);
    }

    public void a(Context context) {
        this.f1981b = context;
    }

    public void a(Message message) {
        Intent intent;
        if (message.what != 2012) {
            if (message.arg2 == 3) {
                this.f1981b.sendBroadcast(new Intent(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR));
            }
            if (message.arg2 != 2 && message.arg2 != 404 && message.arg2 != 5 && message.arg2 != 8) {
                return;
            }
            intent = new Intent(SDKInitializer.SDK_BROADCAST_ACTION_STRING_NETWORK_ERROR);
        } else if (message.arg1 == 0) {
            intent = new Intent(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_OK);
        } else {
            Intent intent2 = new Intent(SDKInitializer.SDK_BROADTCAST_ACTION_STRING_PERMISSION_CHECK_ERROR);
            intent2.putExtra(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, message.arg1);
            intent = intent2;
        }
        this.f1981b.sendBroadcast(intent);
    }

    @Override // com.baidu.platform.comapi.util.PermissionCheck.c
    public void a(PermissionCheck.b bVar) {
        if (bVar == null) {
            return;
        }
        if (bVar.f2112a == 0) {
            f.A = bVar.e;
            f.a(bVar.f2113b, bVar.f2114c);
        } else {
            Log.e("baidumapsdk", "Authentication Error " + bVar.toString());
        }
        if (this.f1982c == null || bVar.f2112a == g) {
            return;
        }
        g = bVar.f2112a;
        Message.obtain(this.f1982c, 2012, bVar.f2112a, bVar.f2112a, null).sendToTarget();
    }

    public void b() {
        if (this.e == 0) {
            if (this.f1981b == null) {
                throw new IllegalStateException("you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
            }
            com.baidu.vi.b.a(this.f1981b);
            VMsg.init();
            AppEngine.InitEngine(this.f1981b, f.a());
            AppEngine.StartSocketProc();
            this.f1983d = new d();
            f();
            com.baidu.platform.comapi.util.c.a(this.f1981b);
        }
        this.e++;
    }

    public boolean c() {
        if (this.f1981b == null) {
            throw new IllegalStateException("you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
        }
        com.baidu.platform.comjni.engine.a.a(UIMsg.m_AppUI.MSG_APP_DATA_OK, this.f1982c);
        this.f1982c = new b(this);
        f.b(this.f1981b);
        f.b();
        f.e();
        PermissionCheck.init(this.f1981b);
        PermissionCheck.setPermissionCheckResultListener(this);
        PermissionCheck.permissionCheck();
        return true;
    }

    public void d() {
        this.e--;
        if (this.e == 0) {
            g();
            VMsg.destroy();
            com.baidu.platform.comjni.engine.a.a();
            AppEngine.UnInitEngine();
        }
    }

    public Context e() {
        if (this.f1981b == null) {
            throw new IllegalStateException("you have not supplyed the global app context info from SDKInitializer.initialize(Context) function.");
        }
        return this.f1981b;
    }
}
