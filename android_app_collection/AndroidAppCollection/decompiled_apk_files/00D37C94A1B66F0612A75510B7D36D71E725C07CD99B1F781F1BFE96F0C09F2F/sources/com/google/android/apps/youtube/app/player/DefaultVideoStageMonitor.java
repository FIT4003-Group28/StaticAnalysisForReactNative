package com.google.android.apps.youtube.app.player;

import com.google.android.apps.youtube.app.player.DefaultVideoStageMonitor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultVideoStageMonitor implements f, jwn, ynl {
    private ahhw b;
    private final yni c;
    private final airw d;
    private final aacz f;
    private final aypf e = new aypf();
    private final Set a = new HashSet();

    public DefaultVideoStageMonitor(yni yniVar, airw airwVar, aacz aaczVar) {
        this.c = yniVar;
        this.d = airwVar;
        this.f = aaczVar;
    }

    @Override // defpackage.jwn
    public final String g() {
        PlayerResponseModel b;
        if (!this.b.c().h() || this.b.a() == null) {
            b = !this.b.c().h() ? this.b.b() : null;
        } else {
            b = this.b.a();
        }
        if (b != null) {
            return b.B();
        }
        return null;
    }

    public final void h(ahhw ahhwVar) {
        this.b = ahhwVar;
        if (this.a.isEmpty()) {
            return;
        }
        for (jwm jwmVar : this.a) {
            jwmVar.a();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                h((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.f)) {
            this.e.c();
        } else {
            this.c.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.f)) {
            this.e.c();
            this.e.g(this.d.G().b.aa(new ayqb() { // from class: jvs
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    DefaultVideoStageMonitor.this.h((ahhw) obj);
                }
            }, ick.s));
            return;
        }
        this.c.g(this);
    }
}
