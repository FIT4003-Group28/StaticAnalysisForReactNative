package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: PG */
/* renamed from: btyf  reason: default package */
/* loaded from: classes.dex */
public final class btyf implements btyh {
    private final Application b;
    private final bvjj c;
    private final btrm d;
    @dzsi
    private btye e = null;
    protected boolean a = false;
    private boolean f = false;

    public btyf(Application application, bvjj bvjjVar, btrm btrmVar) {
        this.b = application;
        this.c = bvjjVar;
        this.d = btrmVar;
    }

    private final boolean e() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    private final void f() {
        this.f = false;
        this.d.b(new btyi());
    }

    private final void g() {
        this.f = true;
        this.d.b(new btyi());
    }

    @Override // defpackage.btyh
    public final void a(boolean z) {
        this.c.S(bvjk.et, z);
        c();
    }

    @Override // defpackage.btyh
    public final boolean b() {
        return this.f;
    }

    public final void c() {
        if (!this.c.m(bvjk.et, false)) {
            if (!this.a) {
                return;
            }
            synchronized (this) {
                btye btyeVar = this.e;
                if (btyeVar != null) {
                    this.b.unregisterReceiver(btyeVar);
                    this.e = null;
                }
            }
            this.d.b(new btyj(false));
            this.a = false;
            if (!this.f) {
                return;
            }
            f();
        } else if (this.a) {
        } else {
            synchronized (this) {
                if (this.e == null) {
                    btye btyeVar2 = new btye(this);
                    this.e = btyeVar2;
                    this.b.registerReceiver(btyeVar2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
            this.d.b(new btyj(true));
            this.a = true;
            if (e()) {
                f();
            } else {
                g();
            }
        }
    }

    @Override // defpackage.btyh
    public final void d() {
        if (e()) {
            if (!this.f) {
                return;
            }
            f();
        } else if (this.f) {
        } else {
            g();
        }
    }
}
