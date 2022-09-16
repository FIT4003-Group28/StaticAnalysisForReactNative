package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Toast;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bm extends q {
    final /* synthetic */ bp a;

    public bm(bp bpVar) {
        this.a = bpVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final String a(String str) {
        return this.a.h.a(str);
    }

    public final void b() {
        if (this.a.f()) {
            this.a.B.h();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void f() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void g(boolean z, long j) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void h() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void i() {
        try {
            this.a.e.h(actj.PLAYER_YOU_TUBE_BUTTON.II);
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void j(String str) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void k(final boolean z) {
        this.a.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bl
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                final ax axVar;
                ax axVar2;
                bm bmVar = bm.this;
                boolean z3 = z;
                if (bmVar.a.f()) {
                    com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bmVar.a.A;
                    cVar.g = z3;
                    if (!cVar.e.b) {
                        if ((Build.VERSION.SDK_INT < 24 || !cVar.a.f()) && z3) {
                            cVar.b.o(1);
                        } else {
                            cVar.b.g();
                        }
                        bn bnVar = cVar.h;
                        if (!bnVar.a.f()) {
                            return;
                        }
                        bp bpVar = bnVar.a;
                        try {
                            z2 = bpVar.c.O();
                        } catch (RemoteException e) {
                            pcu.h(e);
                            z2 = false;
                        }
                        bpVar.F = z2;
                        com.google.android.apps.youtube.embeddedplayer.service.jar.l lVar = bnVar.a.G;
                        if (!z3) {
                            ax axVar3 = lVar.a.c;
                            if (axVar3 == null) {
                                return;
                            }
                            axVar3.d.post(new ar(axVar3, 1));
                            return;
                        }
                        com.google.android.apps.youtube.embeddedplayer.service.jar.m mVar = lVar.a;
                        if (mVar.c != null || (axVar = mVar.b) == null) {
                            return;
                        }
                        mVar.d = axVar;
                        final Bundle b = axVar.b();
                        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ai
                            @Override // java.lang.Runnable
                            public final void run() {
                                ax axVar4 = ax.this;
                                try {
                                    axVar4.k.f(b);
                                } catch (RemoteException unused) {
                                    aqvb.k("Problem showing fullscreen view.", new Object[0]);
                                }
                            }
                        });
                        return;
                    }
                    bn bnVar2 = cVar.h;
                    if (!bnVar2.a.f() || (axVar2 = bnVar2.a.G.a.b) == null) {
                        return;
                    }
                    axVar2.d.post(new ao(axVar2, z3, 1));
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void l(String str, final String str2, long j, long j2, boolean z, boolean z2, final int i) {
        this.a.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bk
            @Override // java.lang.Runnable
            public final void run() {
                bm bmVar = bm.this;
                String str3 = str2;
                int i2 = i;
                com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m mVar = bmVar.a.x;
                if (mVar.nI()) {
                    mVar.a.setVisibility(8);
                    mVar.b.setVisibility(8);
                    com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.l lVar = mVar.c;
                    if (lVar.a.getAnimation() == null) {
                        lVar.a.startAnimation(lVar.b);
                    }
                }
                bmVar.a.p.M(str3);
                bmVar.a.p.L(i2);
                com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d dVar = bmVar.a.w;
                dVar.k = i2;
                dVar.X();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void m() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void n() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void o(long j) {
        this.a.m.post(new bi(this, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void p(long j, long j2) {
        this.a.m.post(new bi(this));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void q() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void r() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void s() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void t(long j, long j2) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void u(long j) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void v() {
        this.a.m.post(new bi(this, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void w() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void x() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void y(final String str) {
        this.a.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bj
            @Override // java.lang.Runnable
            public final void run() {
                bm bmVar = bm.this;
                Toast.makeText(bmVar.a.a, str, 0).show();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void z(Intent intent) {
        this.a.a.startActivity(intent);
    }
}
