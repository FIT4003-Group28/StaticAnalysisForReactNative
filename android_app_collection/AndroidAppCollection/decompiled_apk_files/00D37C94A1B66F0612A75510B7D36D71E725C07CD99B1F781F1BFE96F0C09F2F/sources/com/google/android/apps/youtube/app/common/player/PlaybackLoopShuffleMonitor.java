package com.google.android.apps.youtube.app.common.player;

import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaybackLoopShuffleMonitor implements f, ynl {
    public int a;
    public boolean b;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    private final yni d;
    private final airw e;
    private aypg f;
    private final aacz g;

    public PlaybackLoopShuffleMonitor(yni yniVar, airw airwVar, aacz aaczVar) {
        this.d = yniVar;
        this.e = airwVar;
        this.g = aaczVar;
    }

    public final void g(fea feaVar) {
        this.c.add(feaVar);
    }

    public final void h(ahhl ahhlVar) {
        int i = this.a;
        boolean z = this.b;
        this.a = ahhlVar.a();
        boolean d = ahhlVar.d();
        this.b = d;
        if (i == this.a && z == d) {
            return;
        }
        for (fea feaVar : this.c) {
            feaVar.g(this.a, this.b);
        }
    }

    public final void i(fea feaVar) {
        this.c.remove(feaVar);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                h((ahhl) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhl.class};
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        if (eog.aq(this.g)) {
            this.f = this.e.am().aa(new ayqb() { // from class: fdz
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    PlaybackLoopShuffleMonitor.this.h((ahhl) obj);
                }
            }, dzq.m);
        } else {
            this.d.g(this);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        if (eog.aq(this.g)) {
            azof.f((AtomicReference) this.f);
            this.f = null;
            return;
        }
        this.d.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
