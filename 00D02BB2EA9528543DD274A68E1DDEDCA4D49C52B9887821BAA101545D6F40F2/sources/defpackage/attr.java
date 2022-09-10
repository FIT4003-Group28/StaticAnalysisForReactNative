package defpackage;

import android.content.Context;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: attr  reason: default package */
/* loaded from: classes2.dex */
public class attr extends atsu<crqb> implements atxq {
    private static final cqrp B = cqrp.d(24.0d);
    final asxv A;
    private final Context C;
    private final bvsl D;
    private final asxw E;
    private final vtn F;
    @dzsi
    private atxw G;
    @dzsi
    private atxw H;
    private final atsn I;
    public final asxu c;
    @dzsi
    public crqg d;

    public attr(Context context, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, vtn vtnVar, bvsl bvslVar, dehq dehqVar, Executor executor, atsr atsrVar, asxu asxuVar, asxw asxwVar, crqb crqbVar, boolean z) {
        super(crqbVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, crqbVar.f == 1 ? 20000L : 8000L, true);
        this.A = new attp(this);
        this.I = new atto(this);
        this.C = context;
        this.D = bvslVar;
        this.E = asxwVar;
        this.F = vtnVar;
        this.c = asxuVar;
    }

    private final String G() {
        dbsk.s(((crqb) this.e).a);
        dpfh dpfhVar = ((crpt) ((crqb) this.e).a).c;
        if (dpfhVar != null) {
            return dpfhVar.b;
        }
        return null;
    }

    private final attq ao() {
        return ((crqb) this.e).f == 1 ? attq.OPPORTUNISTIC : attq.EXPLICIT;
    }

    private static void ap(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append("  •  ");
        }
    }

    private final boolean l() {
        return i().b.a.K != amtz.ONLINE;
    }

    private final cjtd m(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.b = s();
        b.g(G());
        b.d = ddhoVar;
        return b.a();
    }

    private final String s() {
        dbsk.s(((crqb) this.e).a);
        dpfh dpfhVar = ((crpt) ((crqb) this.e).a).c;
        if (dpfhVar != null) {
            return dpfhVar.c;
        }
        return null;
    }

    @Override // defpackage.atsu, defpackage.atss, defpackage.atxz
    public synchronized void Oa() {
        super.Oa();
        this.E.F(this.A);
    }

    @Override // defpackage.atsu, defpackage.atss, defpackage.atxz
    public synchronized void Ob() {
        this.E.G(this.A);
        this.E.D(null);
        this.E.l(null);
        super.Ob();
    }

    @Override // defpackage.atsu
    protected final void e() {
        String sb;
        int i = ((crqb) this.e).f;
        if (this.H == null) {
            atsm S = S(i == 1);
            cjta b = cjtd.b();
            b.b = s();
            b.g(G());
            attq ao = ao();
            attq attqVar = attq.OPPORTUNISTIC;
            b.d = ao.d;
            S.h = b.a();
            atso a = S.a();
            this.H = a;
            M(a);
        }
        if (this.G == null) {
            atsm R = R(i == 2);
            R.b();
            R.c = atso.d;
            R.d = atso.e;
            R.f = atxv.NAVIGATE;
            cjta b2 = cjtd.b();
            b2.b = s();
            b2.g(G());
            attq ao2 = ao();
            attq attqVar2 = attq.OPPORTUNISTIC;
            b2.d = ao2.e;
            R.h = b2.a();
            R.g = this.I;
            atso a2 = R.a();
            this.G = a2;
            L(a2);
        }
        this.p = i().a.s(this.j);
        g();
        if (((crqb) this.e).c || !l()) {
            amub amubVar = i().b.a;
            dpec b3 = amubVar.d.b();
            EnumSet<vux> c = vxi.c(amubVar.J);
            dqvj c2 = dqvj.c(b3.b);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            if (c2 != dqvj.DRIVE) {
                dqvj c3 = dqvj.c(b3.b);
                if (c3 == null) {
                    c3 = dqvj.DRIVE;
                }
                if (c3 != dqvj.TAXICAB) {
                    dqvj c4 = dqvj.c(b3.b);
                    if (c4 == null) {
                        c4 = dqvj.DRIVE;
                    }
                    if (c4 != dqvj.TWO_WHEELER) {
                        c.remove(vux.AVOID_HIGHWAYS);
                        c.remove(vux.AVOID_TOLLS);
                    }
                }
            }
            if (c.isEmpty()) {
                sb = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (c.contains(vux.AVOID_HIGHWAYS)) {
                    sb2.append(this.C.getString(R.string.AVOIDING_HIGHWAYS));
                }
                if (c.contains(vux.AVOID_TOLLS)) {
                    ap(sb2);
                    if (vxp.c(b3)) {
                        sb2.append(this.C.getString(R.string.COULDNT_AVOID_TOLLS));
                    } else {
                        sb2.append(this.C.getString(R.string.AVOIDING_TOLLS));
                    }
                }
                if (c.contains(vux.AVOID_FERRIES)) {
                    ap(sb2);
                    if (vxp.d(b3)) {
                        sb2.append(this.C.getString(R.string.COULDNT_AVOID_FERRIES));
                    } else {
                        sb2.append(this.C.getString(R.string.AVOIDING_FERRIES));
                    }
                }
                sb = sb2.toString();
            }
            B(sb);
        } else {
            bvsx bvsxVar = new bvsx(this.j);
            float e = B.e(this.C);
            Spannable f = bvsxVar.f(itd.c().a(this.C), e, e);
            bvsu c5 = bvsxVar.c(R.string.NO_TRAFFIC_DATA);
            bvsv a3 = bvsxVar.a(f);
            a3.g(" ");
            a3.f(c5);
            B(a3.c());
        }
        if (j() != null) {
            atvs.a(j(), this.F, this);
        } else {
            H(al());
        }
        cjta b4 = cjtd.b();
        b4.b = s();
        b4.g(G());
        attq ao3 = ao();
        attq attqVar3 = attq.OPPORTUNISTIC;
        b4.d = ao3.c;
        this.v = b4.a();
        dbsk.s(((crqb) this.e).a);
        astf f2 = astg.f();
        f2.e(((crpt) ((crqb) this.e).a).b);
        f2.d(alfa.SHOW_ALTERNATES_ONLY);
        this.E.D(f2.a());
        aryr aryrVar = ((crqb) this.e).e;
        if (aryrVar != null) {
            this.E.l(aryrVar);
        }
    }

    public final void g() {
        cray crayVar = i().b;
        if (crayVar.a() == -1 || crayVar.g == -1) {
            return;
        }
        this.q = this.m.a(bvtb.f(this.j, crayVar.a(), bvsz.ABBREVIATED, new bvsw()), this.D.h(crayVar.g, crayVar.a.I, null, null), crayVar.a.O);
    }

    public final boolean h() {
        return !l() && ((crqb) this.e).f == 2;
    }

    public final crqg i() {
        dbsk.s(((crqb) this.e).a);
        crqg crqgVar = this.d;
        return crqgVar != null ? crqgVar : ((crpt) ((crqb) this.e).a).a;
    }

    public final dpfh j() {
        dbsk.s(((crqb) this.e).a);
        return ((crpt) ((crqb) this.e).a).c;
    }

    @Override // defpackage.atxq
    @dzsi
    public atxw k() {
        return this.G;
    }

    @Override // defpackage.atss
    @dzsi
    protected final crfj u() {
        int i;
        if (((crqb) this.e).g != 3) {
            return null;
        }
        if (j() != null) {
            return atvs.b(j(), i().b.a(), this.i.q());
        }
        if (!h()) {
            return null;
        }
        crfe q = this.i.q();
        int a = i().b.a();
        dpjs dpjsVar = i().a.b;
        if (dpjsVar == dpjs.ENTITY_TYPE_HOME) {
            i = R.string.DA_SPEECH_YOU_SHOULD_GET_HOME_BY;
        } else {
            i = dpjsVar == dpjs.ENTITY_TYPE_WORK ? R.string.DA_SPEECH_YOU_SHOULD_GET_TO_WORK_BY : R.string.DA_SPEECH_YOU_SHOULD_GET_THERE_BY;
        }
        return crfj.d(crfi.OTHER, q.c(a, i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atss
    public final void v() {
        cjqp g = this.l.g();
        attq ao = ao();
        attq attqVar = attq.OPPORTUNISTIC;
        g.d(m(ao.f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atss
    public final void w() {
        cjqp g = this.l.g();
        attq ao = ao();
        attq attqVar = attq.OPPORTUNISTIC;
        g.d(m(ao.g));
    }
}
