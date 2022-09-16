package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahta  reason: default package */
/* loaded from: classes.dex */
public final class ahta implements ahub, airt, ynl {
    public static final ahua a = new ahtb(amuk.r(acuo.b(22156)), amuk.u(acuo.b(28239), acuo.b(28240), acuo.b(123454), acuo.b(123453)));
    public final ahtx b;
    public String c;
    public apzg d;
    public ahty e;
    public boolean f;
    private final yni g;
    private final aadd h;
    private final Set i = new HashSet();
    private final boolean j;
    private final boolean k;
    private final aypf l;
    private final azqb m;
    private final azqb n;
    private ahtc o;
    private ahuc p;
    private acti q;
    private ahua r;
    private final ahtj s;
    private final aidn t;

    public ahta(aidn aidnVar, azqb azqbVar, yni yniVar, ahtx ahtxVar, axxb axxbVar, aacz aaczVar, aadd aaddVar, azqb azqbVar2, ahtj ahtjVar, byte[] bArr) {
        this.t = aidnVar;
        this.n = azqbVar;
        this.g = yniVar;
        this.b = ahtxVar;
        this.h = aaddVar;
        this.m = azqbVar2;
        this.s = ahtjVar;
        r((acti) azqbVar2.get());
        this.r = a;
        this.k = axxbVar.d().booleanValue();
        atzt atztVar = aaczVar.b().v;
        this.j = (atztVar == null ? atzt.a : atztVar).f;
        this.l = new aypf();
    }

    public static ampq a(apzg apzgVar) {
        return !apzgVar.qn(WatchEndpointOuterClass.watchEndpoint) ? amon.a : ampq.j(((awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint)).c);
    }

    public static apzg b(apzg apzgVar) {
        aopa createBuilder;
        if (apzgVar == null) {
            return null;
        }
        aopa createBuilder2 = awbs.a.createBuilder();
        aoob aoobVar = apzgVar.c;
        createBuilder2.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder2.instance;
        aoobVar.getClass();
        awbsVar.b |= 1;
        awbsVar.c = aoobVar;
        awbs awbsVar2 = (awbs) createBuilder2.mo39build();
        if (apzgVar.qn(atno.b)) {
            createBuilder = ((atnp) apzgVar.qm(atno.b)).mo52toBuilder();
        } else {
            createBuilder = atnp.a.createBuilder();
        }
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopg aopgVar = atno.b;
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        awbsVar2.getClass();
        atnpVar.h = awbsVar2;
        atnpVar.b |= 1024;
        aopcVar.e(aopgVar, (atnp) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    private final void v() {
        n(false);
    }

    private final void w(acti actiVar) {
        if (this.q != actiVar) {
            v();
            this.q = actiVar;
            this.b.d(actiVar);
        }
    }

    private final void x() {
        if (this.j) {
            this.l.c();
        } else {
            this.g.m(this);
        }
    }

    @Override // defpackage.ahub
    public final void c(ahtz ahtzVar) {
        this.i.add(ahtzVar);
    }

    public final void d(ahhm ahhmVar) {
        if (this.k) {
            return;
        }
        u(ahhmVar);
    }

    public final void e(ahhw ahhwVar) {
        String e = ahhwVar.e();
        this.c = e;
        if (!TextUtils.isEmpty(e)) {
            ahtx ahtxVar = this.b;
            ahtx.c(ahtxVar.e, ahtxVar.b, this.c);
        }
        if (this.e != ahty.NEW) {
            ahtx ahtxVar2 = this.b;
            PlayerResponseModel a2 = ahhwVar.a();
            String k = ahhwVar.k();
            apzg b = this.f ? b(this.d) : null;
            if (a2 == null || TextUtils.isEmpty(k)) {
                return;
            }
            if (ahtxVar2.a.contains(ByteBuffer.wrap(a2.J()))) {
                return;
            }
            byte[] J2 = a2.J();
            acum a3 = ahtx.a(b);
            if (a3 != null) {
                ahtxVar2.e.E(new acte(J2), a3);
                ahtxVar2.e.s(a3, k);
            } else {
                ahtxVar2.e.D(new acte(J2));
                ahtxVar2.e.r(k);
            }
            ahtxVar2.a.add(ByteBuffer.wrap(a2.J()));
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 512L)).h(aiwv.l(1)).aa(new ahsy(this, 2), ahqs.e), airwVar.ao().h(aiwv.n(airwVar.aB(), 512L)).h(aiwv.l(1)).aa(new ahsy(this), ahqs.e), airwVar.al().h(aiwv.n(airwVar.aB(), 512L)).h(aiwv.l(1)).aa(new ahsy(this, 1), ahqs.e)};
    }

    @Override // defpackage.ahub
    public final void h() {
        x();
        if (this.o == null) {
            ((Context) this.s.a.get()).getClass();
            this.o = new ahti(this);
        }
        if (this.j) {
            this.l.g(g(this.t.a));
        } else {
            this.g.g(this);
        }
    }

    @Override // defpackage.ahub
    public final void i(acti actiVar, apzg apzgVar) {
        if (this.q == actiVar || this.e == ahty.NEW) {
            return;
        }
        this.q = actiVar;
        this.b.d(actiVar);
        this.f = false;
        p(apzgVar);
        ahtx ahtxVar = this.b;
        String str = this.c;
        byte[] bArr = ahtxVar.c;
        if (bArr != null) {
            ahtxVar.e.D(new acte(bArr));
            ahtxVar.e.r(str);
        }
        byte[] bArr2 = ahtxVar.d;
        if (bArr2 == null) {
            return;
        }
        ahtxVar.e.D(new acte(bArr2));
        ahtxVar.e.r(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(apzg apzgVar) {
        if (this.q == null || akzj.f(this.d, apzgVar)) {
            return;
        }
        if (apzgVar == null) {
            airr airrVar = (airr) this.n.get();
            apzgVar = aikb.f(airrVar.q(), airrVar.p(), airrVar.g(), 0.0f);
        }
        if (aijn.d(this.d, apzgVar)) {
            return;
        }
        this.q.t();
    }

    @Override // defpackage.ahub
    public final void k() {
        acti actiVar = this.b.e;
        this.p = new ahuc(actiVar != null ? actiVar.k() : null, acuo.b(22156));
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhk ahhkVar = (ahhk) obj;
                t();
                return null;
            } else if (i == 1) {
                d((ahhm) obj);
                return null;
            } else if (i == 2) {
                e((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhk.class, ahhm.class, ahhw.class};
    }

    @Override // defpackage.ahub
    public final void l() {
        x();
        v();
        this.i.clear();
        w((acti) this.m.get());
        this.f = false;
    }

    @Override // defpackage.ahub
    public final void m(ahtz ahtzVar) {
        this.i.remove(ahtzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        auld auldVar;
        aull aullVar;
        if (!z) {
            this.d = null;
            arhd a2 = this.h.a();
            if (a2 == null || (a2.b & 1073741824) == 0) {
                auldVar = null;
            } else {
                auldVar = a2.u;
                if (auldVar == null) {
                    auldVar = auld.a;
                }
            }
            if (auldVar == null || (auldVar.b & 512) == 0) {
                aullVar = null;
            } else {
                aullVar = auldVar.d;
                if (aullVar == null) {
                    aullVar = aull.a;
                }
            }
            if (aullVar != null && aullVar.g) {
                this.c = null;
            }
        }
        if (!this.f && this.q != null) {
            ahtx ahtxVar = this.b;
            ahtxVar.a.clear();
            ahtxVar.b = null;
            ahtxVar.c = null;
            ahtxVar.d = null;
            this.q.y();
        }
        o(ahty.NEW);
    }

    public final void o(ahty ahtyVar) {
        this.e = ahtyVar;
        for (ahtz ahtzVar : this.i) {
            ahtzVar.a(ahtyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(apzg apzgVar) {
        if (!this.f) {
            this.r.a(this.q, apzgVar, this.p);
            o(ahty.LOGGED_NEW_SCREEN);
        }
        this.d = apzgVar;
        this.p = null;
    }

    @Override // defpackage.ahub
    public final void q(ahua ahuaVar) {
        ahuaVar.getClass();
        this.r = ahuaVar;
    }

    @Override // defpackage.ahub
    public final void r(acti actiVar) {
        w(actiVar);
        this.f = false;
    }

    @Override // defpackage.ahub
    public final void s(acti actiVar) {
        w(actiVar);
        this.f = true;
    }

    public final void t() {
        ahtc ahtcVar = this.o;
        if (ahtcVar != null) {
            ((ahti) ahtcVar).b.j(null);
        }
    }

    public final void u(ahhm ahhmVar) {
        ahty ahtyVar;
        ahtg a2;
        ahtc ahtcVar = this.o;
        if (ahtcVar == null || (ahtyVar = (ahty) ahti.a.get(ahhmVar.c())) == null) {
            return;
        }
        apzg d = ahhmVar.d();
        ahti ahtiVar = (ahti) ahtcVar;
        ahtg ahtgVar = ahtiVar.c;
        if (ahtgVar == null || !akzj.f(ahtgVar.c(), d) || ahtyVar == ahty.NEW) {
            ahtg ahtgVar2 = ahtiVar.c;
            if (ahtgVar2 == null) {
                a2 = new ahth(ahtiVar, d, false);
            } else {
                a2 = ahtgVar2.a(d);
            }
        } else {
            a2 = (!ahtiVar.c.b().a(ahtyVar) || !(ahtyVar == ahty.LOGGED_ATTACH_PLAYER || ahtyVar == ahty.LOGGED_ATTACH_WATCH_NEXT)) ? ahtiVar.c : new ahtf(ahtiVar, d);
        }
        if (a2.b() == ahty.NEW) {
            a2.e();
        }
        if (!ahtyVar.a(a2.b())) {
            return;
        }
        while (ahtyVar != a2.b()) {
            Optional d2 = a2.d(ahhmVar);
            if (!d2.isPresent()) {
                break;
            }
            a2 = (ahtg) d2.get();
            a2.e();
        }
        ahtiVar.c = a2;
    }
}
