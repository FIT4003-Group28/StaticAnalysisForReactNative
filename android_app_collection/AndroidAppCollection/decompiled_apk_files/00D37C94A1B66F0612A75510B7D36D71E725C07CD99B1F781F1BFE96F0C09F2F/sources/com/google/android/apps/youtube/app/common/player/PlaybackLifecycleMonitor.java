package com.google.android.apps.youtube.app.common.player;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaybackLifecycleMonitor implements ezb, f, feg, airt, ynl {
    public int b;
    private final airr c;
    private final yni d;
    private final airw e;
    private String g;
    private String h;
    private final aacz i;
    private final aypf f = new aypf();
    public final Set a = new HashSet();

    public PlaybackLifecycleMonitor(airr airrVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.c = airrVar;
        this.d = yniVar;
        this.e = airwVar;
        this.i = aaczVar;
        this.b = 0;
        String q = airrVar.q();
        this.g = q;
        if (!TextUtils.isEmpty(q)) {
            this.b = true == airrVar.d() ? 2 : 1;
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().j.aa(new fdx(this), dzq.l), airwVar.G().b.aa(new fdx(this, 1), dzq.l)};
    }

    @Override // defpackage.ezb
    public final synchronized void h(ezw ezwVar) {
        boolean z = false;
        if (ezwVar == null) {
            this.g = null;
            this.h = null;
            l(0);
            return;
        }
        String c = ezwVar.c();
        String b = ezwVar.b();
        if (TextUtils.equals(c, this.g)) {
            return;
        }
        boolean z2 = !TextUtils.isEmpty(b) && TextUtils.equals(b, this.h);
        if (!TextUtils.isEmpty(this.g) && TextUtils.isEmpty(c)) {
            z = true;
        }
        if (z2 && z) {
            return;
        }
        l(1);
        this.h = ezwVar.b();
    }

    public final void i(fdy fdyVar) {
        this.a.add(fdyVar);
    }

    public final synchronized void j(ahhw ahhwVar) {
        if (ahhwVar.c().a(aika.NEW)) {
            this.g = null;
        } else if (!ahhwVar.c().a(aika.PLAYBACK_LOADED) || ahhwVar.b() == null) {
        } else {
            this.g = ahhwVar.b().B();
        }
    }

    public final void k(ahia ahiaVar) {
        if (ahiaVar.a() == 2) {
            l(2);
        } else if (ahiaVar.a() == 8) {
            l(4);
        } else if (ahiaVar.f() || this.b == 1) {
        } else {
            l(3);
        }
    }

    @Override // defpackage.feg
    public final void kF() {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                j((ahhw) obj);
                return null;
            } else if (i == 1) {
                k((ahia) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, ahia.class};
    }

    final void l(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        for (fdy fdyVar : this.a) {
            fdyVar.d(i);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        if (eog.ap(this.i)) {
            this.f.g(g(this.e));
        } else {
            this.d.g(this);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        if (eog.ap(this.i)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.feg
    public final synchronized void nr() {
        if (this.c.d()) {
            return;
        }
        if (!TextUtils.isEmpty(this.g)) {
            l(5);
        } else {
            l(0);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
