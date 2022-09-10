package defpackage;

import android.accounts.Account;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: inc  reason: default package */
/* loaded from: classes.dex */
public final class inc extends cvzf<cwfm> {
    public final gga a;
    public final dxio<ina> b;
    public final dxio<akfa> c;
    public final crzp<btlu> d = new crzp(this) { // from class: inb
        private final inc a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            inc incVar = this.a;
            incVar.d(incVar.c((btlu) crzmVar.l()));
        }
    };
    public final dxio<GmsheadAccountsModelUpdater> e;
    public final Executor f;
    private final dxio<akfc> g;

    public inc(gga ggaVar, dxio<ina> dxioVar, dxio<akfa> dxioVar2, dxio<akfc> dxioVar3, dxio<GmsheadAccountsModelUpdater> dxioVar4, Executor executor) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.g = dxioVar3;
        this.f = executor;
        this.e = dxioVar4;
    }

    @Override // defpackage.cvzf
    public final /* bridge */ /* synthetic */ void a(@dzsi cwfm cwfmVar, @dzsi cwfm cwfmVar2, @dzsi cwfm cwfmVar3) {
        cwfm cwfmVar4 = cwfmVar;
        if (cwfmVar4 == null) {
            return;
        }
        Account m = this.c.a().m();
        if (m != null && dbsd.a(cwfmVar4.b(), m.name)) {
            return;
        }
        this.g.a().d(cwfmVar4.b());
    }

    public final void b() {
        d(c(this.c.a().j()));
    }

    @dzsi
    public final cwfm c(@dzsi btlu btluVar) {
        if (btluVar == null || btlu.i(btluVar) != btlt.GOOGLE) {
            return null;
        }
        Account s = btluVar.s();
        for (cwfm cwfmVar : this.b.a().a().a().l()) {
            if (cwfmVar.b().equals(s.name)) {
                return cwfmVar;
            }
        }
        return null;
    }

    public final void d(@dzsi cwfm cwfmVar) {
        cvzg<cwfm> a = this.b.a().a().a();
        if (cwfmVar != null) {
            a.b(cwfmVar);
        } else {
            a.m();
        }
    }

    @Override // defpackage.cvzf
    public final void e() {
        b();
    }
}
