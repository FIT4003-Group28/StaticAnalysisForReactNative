package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ao implements Runnable {
    public final /* synthetic */ ax a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ ao(ax axVar, boolean z) {
        this.a = axVar;
        this.b = z;
    }

    public /* synthetic */ ao(ax axVar, boolean z, int i) {
        this.c = i;
        this.a = axVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            ax axVar = this.a;
            try {
                axVar.k.i(this.b);
            } catch (RemoteException unused) {
                aqvb.k("Problem sending ad events authorization to client.", new Object[0]);
            }
        } else if (i == 1) {
            ax axVar2 = this.a;
            try {
                axVar2.k.k(this.b);
            } catch (RemoteException unused2) {
                aqvb.k("Cannot send fullscreen event, client disconnected.", new Object[0]);
            }
        } else if (i == 2) {
            ax axVar3 = this.a;
            axVar3.c.h.p(this.b);
        } else {
            ax axVar4 = this.a;
            axVar4.c.h.e(this.b);
        }
    }
}
