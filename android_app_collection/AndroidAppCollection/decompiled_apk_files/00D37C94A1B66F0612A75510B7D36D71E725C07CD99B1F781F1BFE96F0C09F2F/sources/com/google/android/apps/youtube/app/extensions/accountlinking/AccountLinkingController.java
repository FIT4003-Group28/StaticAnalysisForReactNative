package com.google.android.apps.youtube.app.extensions.accountlinking;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountLinkingController implements f {
    public final aagi a;
    public aypg b;
    public WeakReference c = new WeakReference(null);
    public final azpm d = azpm.e();
    private final kpc e;
    private aypg f;
    private aypg g;

    public AccountLinkingController(aagi aagiVar, kpc kpcVar) {
        this.a = aagiVar;
        this.e = kpcVar;
    }

    public final aowi g() {
        ajbf o = this.e.E().o();
        if (o == null) {
            zep.b("failed to get presence menu data: no current playback");
            return null;
        }
        PlayerResponseModel c = o.c();
        if (c == null) {
            zep.b("failed to get presence menu data: no player response in current playback");
            return null;
        }
        aowh n = c.n();
        if (n == null) {
            zep.b("failed to get presence menu data: no AL config in player response");
            return null;
        }
        aowi aowiVar = n.e;
        return aowiVar == null ? aowi.a : aowiVar;
    }

    public final void h() {
        aiuo aiuoVar = (aiuo) this.c.get();
        if (aiuoVar != null) {
            aiuoVar.a(null);
        }
        aypg aypgVar = this.b;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.b = null;
        }
    }

    public final void i(boolean z) {
        aiuo aiuoVar = (aiuo) this.c.get();
        if (aiuoVar == null) {
            return;
        }
        this.d.c(Boolean.valueOf(z));
        aopa createBuilder = aowk.a.createBuilder();
        aopa createBuilder2 = aowj.a.createBuilder();
        createBuilder2.copyOnWrite();
        aowj aowjVar = (aowj) createBuilder2.instance;
        aowjVar.b |= 1;
        aowjVar.c = z;
        createBuilder.copyOnWrite();
        aowk aowkVar = (aowk) createBuilder.instance;
        aowj aowjVar2 = (aowj) createBuilder2.mo39build();
        aowjVar2.getClass();
        aopu aopuVar = aowkVar.b;
        if (!aopuVar.c()) {
            aowkVar.b = aopi.mutableCopy(aopuVar);
        }
        aowkVar.b.add(aowjVar2);
        aiuoVar.a((aowk) createBuilder.mo39build());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        azof.f((AtomicReference) this.f);
        azof.f((AtomicReference) this.g);
        h();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.f = this.e.V().aa(new goe(this, 2), fzc.n);
        this.g = this.e.ad().aa(new goe(this, 3), fzc.n);
    }
}
