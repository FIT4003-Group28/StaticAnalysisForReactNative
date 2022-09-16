package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: oez  reason: default package */
/* loaded from: classes3.dex */
public final class oez implements ezd, feg, fee, airt, ynl {
    public final oao a;
    public oey b;
    public acvg c;
    private final yni d;
    private final airw e;
    private final azqb g;
    private final boolean j;
    private final boolean k;
    private ezw l;
    private avhn m;
    private final aypf f = new aypf();
    private final Set h = new CopyOnWriteArraySet();
    private final Set i = new CopyOnWriteArraySet();

    public oez(yni yniVar, airw airwVar, azqb azqbVar, axxb axxbVar, aacz aaczVar, oao oaoVar) {
        this.d = yniVar;
        this.e = airwVar;
        this.a = oaoVar;
        this.g = azqbVar;
        this.j = axxbVar.d().booleanValue();
        atzt atztVar = aaczVar.b().v;
        this.k = (atztVar == null ? atzt.a : atztVar).g;
    }

    private final synchronized void p() {
        if (this.l == null) {
            return;
        }
        t(null, null);
    }

    private final synchronized void q() {
        for (ezb ezbVar : this.h) {
            ezbVar.h(this.l);
        }
    }

    private final synchronized void r() {
        for (ezc ezcVar : this.i) {
            ezcVar.a(this.l, this.m);
        }
    }

    private final void s(apzg apzgVar, avhn avhnVar) {
        ezw ezwVar = this.l;
        if (ezwVar == null || !ezwVar.f(apzgVar)) {
            ezwVar = new ezw(apzgVar);
        } else {
            ezwVar.d(apzgVar);
        }
        t(ezwVar, avhnVar);
        jfw.k();
    }

    private final void t(ezw ezwVar, avhn avhnVar) {
        WatchNextResponseModel b;
        ezw ezwVar2 = this.l;
        if (ezwVar2 != null && ezwVar != null && ezwVar2.f(ezwVar.a())) {
            this.l.d(ezwVar.a());
        } else {
            this.l = ezwVar;
        }
        jfw.k();
        if (ezwVar2 != this.l) {
            q();
        }
        avhn avhnVar2 = this.m;
        if (avhnVar == null) {
            oan oanVar = ((oex) this.b).a.c;
            if (oanVar != null) {
                if (oanVar.d == null && (b = oanVar.b()) != null) {
                    asgt asgtVar = b.a;
                    if ((asgtVar.b & 8192) != 0) {
                        avhn avhnVar3 = asgtVar.o;
                        if (avhnVar3 == null) {
                            avhnVar3 = avhn.a;
                        }
                        oanVar.d = avhnVar3;
                    }
                }
                avhnVar = oanVar.d;
            } else {
                avhnVar = null;
            }
        }
        if (ezwVar2 != this.l || !akzj.f(avhnVar2, avhnVar)) {
            this.m = avhnVar;
            r();
            oey oeyVar = this.b;
            avhn avhnVar4 = this.m;
            oan oanVar2 = ((oex) oeyVar).a.c;
            if (oanVar2 == null || avhnVar4 == null || akzj.f(oanVar2.d, avhnVar4)) {
                return;
            }
            oanVar2.d = avhnVar4;
            oanVar2.e(4);
        }
    }

    @Override // defpackage.ezd
    public final synchronized ezw a() {
        return this.l;
    }

    @Override // defpackage.ezd
    public final void d(ezb ezbVar) {
        this.h.add(ezbVar);
    }

    @Override // defpackage.ezd
    public final void e(ezc ezcVar) {
        this.i.add(ezcVar);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ao().I().G(aypa.a()).aa(new oew(this, 2), npy.q), airwVar.ah().I().G(aypa.a()).aa(new oew(this), npy.q), airwVar.G().h.aa(new oew(this, 3), npy.q)};
    }

    @Override // defpackage.ezd
    public final void h(ezb ezbVar) {
        this.h.remove(ezbVar);
    }

    @Override // defpackage.fee
    public final void i() {
        p();
    }

    @Override // defpackage.fee
    public final synchronized void j(apzg apzgVar, avhn avhnVar) {
        s(apzgVar, avhnVar);
        jfw.k();
    }

    public final void k(ahhm ahhmVar) {
        if (this.j) {
            return;
        }
        m(ahhmVar, null);
    }

    @Override // defpackage.feg
    public final void kF() {
        this.f.c();
        if (!this.k) {
            this.d.m(this);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhi ahhiVar = (ahhi) obj;
                o();
                return null;
            } else if (i == 1) {
                k((ahhm) obj);
                return null;
            } else if (i == 2) {
                l((aikd) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhi.class, ahhm.class, aikd.class};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(aikd aikdVar) {
        this.b.a(aikdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(ahhm ahhmVar, acuv acuvVar) {
        avhn avhnVar;
        if (!ahhmVar.c().b(aijx.VIDEO_LOADING)) {
            return;
        }
        apzg d = ahhmVar.d();
        if (d == null) {
            airr airrVar = (airr) this.g.get();
            d = aikb.f(airrVar.q(), airrVar.p(), airrVar.g(), 0.0f);
        }
        PlayerResponseModel b = ahhmVar.b();
        if (b != null) {
            b.b();
            avhnVar = b.b().e();
        } else {
            avhnVar = null;
        }
        s(d, avhnVar);
        if (b != null) {
            oey oeyVar = this.b;
            String A = b.A();
            String z = b.z();
            oan oanVar = ((oex) oeyVar).a.c;
            if (oanVar != null && (!TextUtils.equals(oanVar.b, A) || !TextUtils.equals(oanVar.c, z))) {
                oanVar.b = A;
                oanVar.c = z;
                oanVar.e(2);
            }
        }
        if (ahhmVar.c() == aijx.VIDEO_WATCH_LOADED) {
            acvg acvgVar = this.c;
            if (acvgVar != null) {
                acvgVar.c("wnls");
            }
            oey oeyVar2 = this.b;
            WatchNextResponseModel a = ahhmVar.a();
            oan oanVar2 = ((oex) oeyVar2).a.c;
            if (oanVar2 == null) {
                return;
            }
            if (oanVar2.f != null) {
                a = null;
            }
            if (a == null) {
                oanVar2.i(null);
            }
            oanVar2.e(oanVar2.a(a, acuvVar));
        } else if (ahhmVar.c() == aijx.VIDEO_PLAYBACK_ERROR) {
        } else {
            this.b.a(null);
        }
    }

    public final oaj n() {
        return ((oex) this.b).a;
    }

    @Override // defpackage.feg
    public final void nr() {
        if (this.k) {
            this.f.g(g(this.e));
        } else {
            this.d.g(this);
        }
        this.f.d(this.e.V().C(oav.g).aa(new oew(this, 1), npy.q));
        if (!fcw.c((airr) this.g.get())) {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.b.a(null);
    }
}
