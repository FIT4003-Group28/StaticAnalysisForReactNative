package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ ax a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ as(ax axVar, int i) {
        this.a = axVar;
        this.b = i;
    }

    public /* synthetic */ as(ax axVar, int i, int i2) {
        this.c = i2;
        this.a = axVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            ax axVar = this.a;
            try {
                axVar.k.j(this.b);
                return;
            } catch (RemoteException unused) {
                aqvb.k("Problem sending error to client.", new Object[0]);
                return;
            }
        }
        ax axVar2 = this.a;
        axVar2.c.h.f(this.b);
    }
}
