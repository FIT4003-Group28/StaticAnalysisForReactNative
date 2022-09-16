package com.google.android.libraries.youtube.player.background.service;

import android.content.Intent;
import android.os.IBinder;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class BackgroundPlayerService extends ahfj {
    public airr a;
    public ainq b;
    public aijf c;
    public bame d;
    public bame e;
    public airy f;
    private final IBinder g = new ahfi();
    private boolean h;
    private boolean i;

    private final void c() {
        if (this.h) {
            return;
        }
        this.a.A();
        this.b.d(this);
        this.h = true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!this.i) {
            b();
            this.i = true;
        }
        c();
        return this.g;
    }

    @Override // defpackage.ahfj, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.i = true;
        c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.d.c(ahfg.a);
        boolean P = this.a.P();
        if (P) {
            this.a.s();
        }
        this.b.e(this);
        this.b.c(P);
        this.c.l();
        this.h = false;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.e.c(ahfg.b);
        airy airyVar = this.f;
        aipq aipqVar = airyVar.a;
        airr airrVar = airyVar.b;
        if (aipqVar.c()) {
            airrVar.s();
        }
    }
}
