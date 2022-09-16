package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class o {
    private boolean c;
    private long b = 0;
    private final List a = new ArrayList();
    private int d = 0;

    private final void d() {
        int i = this.d;
        if ((i == 2 || i == 3) && this.c) {
            for (alyb alybVar : this.a) {
                try {
                    alybVar.a(this.b);
                } catch (RemoteException unused) {
                    aqvb.k("Problem sending getDuration result to client.", new Object[0]);
                }
            }
            this.a.clear();
        }
    }

    public final synchronized void a(long j) {
        this.b = j;
        this.c = true;
        d();
    }

    public final synchronized void b(int i) {
        this.d = i;
        if (i == 5) {
            this.c = false;
        }
        d();
    }

    public final synchronized void c(alyb alybVar) {
        if (alybVar == null) {
            return;
        }
        this.a.add(alybVar);
        d();
    }
}
