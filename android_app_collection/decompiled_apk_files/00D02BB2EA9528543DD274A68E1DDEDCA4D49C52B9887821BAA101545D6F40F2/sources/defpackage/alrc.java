package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.hardware.SensorManager;
import android.view.View;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alrc  reason: default package */
/* loaded from: classes.dex */
public final class alrc extends akor {
    private final Object A;
    private final String B;
    private final btmv C;
    private final btvt D;
    private final bvnx E;
    private final cjvm F;
    private final amoh G;
    private final akfa H;
    private final ammc I;
    private final bvkx J;
    private final altp K;
    private final amym L;
    private final dehq M;
    private final dehq N;
    private final Executor O;
    private final Executor P;
    private final dehq Q;
    private final alvc R;
    private final ambz S;
    private final akry T;
    private final alyx U;
    private final anat V;
    @dzsi
    private final aliu W;
    @dzsi
    private final akpr X;
    private final dbty<Boolean> Y;
    private final boolean Z;
    public final dzsj<akwr> a;
    private final boolean aa;
    @dzsi
    private final alpn ab;
    private final akrz ac;
    @dzsi
    private almu ah;
    private final hwv al;
    public final Context b;
    public final ckcw c;
    public final cqat d;
    public final Context e;
    public final alwc f;
    public final btrm g;
    public final bvjj h;
    public final dxio<akpe> i;
    public final dxio<bnsn> j;
    public final dxio<amyd> k;
    public final akpl l;
    public final akpq m;
    public final amfi n;
    public final Resources o;
    public final dbty<Boolean> p;
    public final akza q;
    public final akyw r;
    public final boolean s;
    public final amyj t;
    private final dzsj<akwp> u;
    private final dzsj<akwx> v;
    private final dzsj<akwt> w;
    private final dzsj<dmxf> x;
    private final dzsj<akwv> y;
    private final Map<dmti, akqn> z = new EnumMap(dcdn.m(dmti.WORLD_ENCODING_LAT_LNG_E7, new akqu(), dmti.WORLD_ENCODING_LAT_LNG_DOUBLE, new akqt(), dmti.SCREEN_SPACE_FLOAT, new akrt()));
    private final dbty<bnss> ad = dbud.a(new alqt(this));
    private final dbty<akzh> ae = dbud.a(new alqu(this));
    private final dbty<alrv> af = dbud.a(new alqv(this));
    @dzsi
    private akoq ag = null;
    @dzsi
    private ammx ai = null;
    @dzsi
    private akpc aj = null;
    private final dxio<amom> ak = btsp.b(new alqz(this));

    static {
        SensorManager.getAltitude(1.0f, 1.0f);
    }

    public alrc(Object obj, String str, Resources resources, alwc alwcVar, akpl akplVar, Context context, altp altpVar, akry akryVar, dxio dxioVar, akpq akpqVar, dxio dxioVar2, dxio dxioVar3, ammc ammcVar, Context context2, btmv btmvVar, ckcw ckcwVar, final akwu akwuVar, cqat cqatVar, btvt btvtVar, bvnx bvnxVar, btrm btrmVar, cjvm cjvmVar, amoh amohVar, bvjj bvjjVar, akfa akfaVar, amfi amfiVar, amym amymVar, bvkx bvkxVar, dehq dehqVar, dehq dehqVar2, Executor executor, Executor executor2, dehq dehqVar3, ambz ambzVar, alvc alvcVar, hwv hwvVar, alyx alyxVar, aliu aliuVar, dbty dbtyVar, dbty dbtyVar2, boolean z, boolean z2, akpr akprVar, amyj amyjVar, anat anatVar, akrz akrzVar, alpn alpnVar, boolean z3) {
        this.A = obj;
        this.B = str;
        this.b = context2;
        this.C = btmvVar;
        this.c = ckcwVar;
        akwuVar.getClass();
        this.a = new dzsj(akwuVar) { // from class: alqk
            private final akwu a;

            {
                this.a = akwuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.a();
            }
        };
        akwuVar.getClass();
        this.u = new dzsj(akwuVar) { // from class: alql
            private final akwu a;

            {
                this.a = akwuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.b();
            }
        };
        akwuVar.getClass();
        this.v = new dzsj(akwuVar) { // from class: alqm
            private final akwu a;

            {
                this.a = akwuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.c();
            }
        };
        akwuVar.getClass();
        this.w = new dzsj(akwuVar) { // from class: alqn
            private final akwu a;

            {
                this.a = akwuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.d();
            }
        };
        akwuVar.getClass();
        this.x = new dzsj(akwuVar) { // from class: alqo
            private final akwu a;

            {
                this.a = akwuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.e();
            }
        };
        akwuVar.getClass();
        this.y = new dzsj(akwuVar) { // from class: alqp
            private final akwu a;

            {
                this.a = akwuVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.g();
            }
        };
        this.d = cqatVar;
        this.D = btvtVar;
        this.E = bvnxVar;
        this.g = btrmVar;
        this.F = cjvmVar;
        this.G = amohVar;
        this.H = akfaVar;
        this.n = amfiVar;
        this.h = bvjjVar;
        this.J = bvkxVar;
        this.L = amymVar;
        this.M = dehqVar;
        this.N = dehqVar2;
        this.O = executor;
        this.P = executor2;
        this.Q = dehqVar3;
        this.S = ambzVar;
        this.R = alvcVar;
        this.al = hwvVar;
        this.U = alyxVar;
        this.W = aliuVar;
        this.Y = dbtyVar;
        this.p = dbtyVar2;
        this.Z = z;
        this.aa = z2;
        this.o = resources;
        this.l = akplVar;
        this.j = dxioVar;
        this.f = alwcVar;
        this.e = context;
        this.K = altpVar;
        this.T = akryVar;
        this.m = akpqVar;
        this.k = dxioVar2;
        this.i = dxioVar3;
        this.I = ammcVar;
        this.X = akprVar;
        this.t = amyjVar;
        this.V = anatVar;
        akza akzaVar = new akza(resources.getDisplayMetrics(), akwuVar.b().a());
        this.q = akzaVar;
        this.r = new akyw(akzaVar);
        this.ab = alpnVar;
        this.ac = akrzVar;
        this.s = z3;
    }

    @Override // defpackage.akor
    public final akoq a() {
        return k();
    }

    @Override // defpackage.akor
    public final akzh b() {
        return this.ae.a();
    }

    @Override // defpackage.akor
    public final synchronized dxio<amom> c() {
        return this.ak;
    }

    @Override // defpackage.akor
    public final synchronized akzz d() {
        ammx ammxVar;
        k();
        ammxVar = this.ai;
        dbsk.s(ammxVar);
        return ammxVar;
    }

    @Override // defpackage.akor
    public final bnss e() {
        return this.ad.a();
    }

    @Override // defpackage.akor
    public final akpc f() {
        return l();
    }

    @Override // defpackage.akor
    public final cjvm g() {
        return this.F;
    }

    @Override // defpackage.akor
    public final alrh h() {
        return new alrh(b().b());
    }

    public final alrv i() {
        return this.af.a();
    }

    public final synchronized almu j() {
        almu almuVar;
        almuVar = this.ah;
        dbsk.s(almuVar);
        return almuVar;
    }

    public final synchronized akoq k() {
        alpo alptVar;
        akoq akoqVar = this.ag;
        if (akoqVar != null) {
            return akoqVar;
        }
        akzh b = b();
        alqw alqwVar = new alqw(this);
        alrv i = i();
        alnu alnuVar = new alnu(i);
        alom alomVar = new alom(i, alnuVar, this.N, alqwVar, this.z, this.o.getDisplayMetrics().density, new alnc(this.N, this.n, alnuVar), b, this.m, this.a.a().j(), this.a.a().l(), this.p, this.s);
        aljr aljrVar = new aljr(alomVar);
        alqx alqxVar = new alqx(this);
        bnsn a = this.j.a();
        bnvb bnvbVar = a.i;
        bnvb bnvbVar2 = a.j;
        Resources resources = this.o;
        float f = resources.getDisplayMetrics().density;
        btmv btmvVar = this.C;
        ckcw ckcwVar = this.c;
        amfi amfiVar = this.n;
        btmk a2 = new btml(ckcwVar).a(ckip.Y);
        amix amixVar = new amix(btmvVar, resources, new ammu(bnvbVar, f, new Paint(), new Paint(), a2), new amkv(bnvbVar, amfiVar, f, a2), new amkv(bnvbVar2, amfiVar, f, a2), null, alomVar, alomVar, alnuVar);
        altp altpVar = this.K;
        alol alolVar = alomVar.d;
        alok alokVar = alomVar.e;
        alne alneVar = alomVar.p;
        btmv btmvVar2 = this.C;
        ckcw ckcwVar2 = this.c;
        dzsj<akwt> dzsjVar = this.w;
        btrm btrmVar = this.g;
        hwv hwvVar = this.al;
        dehq dehqVar = this.Q;
        dehq dehqVar2 = this.M;
        new dzsj(this) { // from class: alqr
            private final alrc a;

            {
                this.a = this;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return Boolean.valueOf(this.a.h.m(bvjk.ax, false));
            }
        };
        new dzsj(this) { // from class: alqs
            private final alrc a;

            {
                this.a = this;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.h.z(bvjk.V, "");
            }
        };
        amiu amiuVar = new amiu(alqxVar, altpVar, alolVar, alokVar, amixVar, alneVar, btmvVar2, ckcwVar2, dzsjVar, btrmVar, hwvVar, dehqVar, dehqVar2, alnuVar, this.p, this.E, this.l.a, new anbe(this.D, this.d), this.s);
        alov alovVar = new alov(amiuVar, this.V);
        alrw alrwVar = new alrw(a, this.ak, this.I, this.J, this.G, this.S, this.d, this.D, this.N, this.O, this.R, this.U, this.F, this.c, b, this.K, this.T, this.t, this.aa, this.v, alomVar, this.ac);
        String b2 = this.y.a().b(this.B, akry.BASE.H);
        alyk q = alyl.q();
        q.c(this.B);
        q.e(!dbsj.d(this.B));
        ((alvg) q).g = b2;
        amml c = alrwVar.c(akry.BASE, q.b(), this.o, amxf.ROADMAP, amxf.ROADMAP.a(this.s), this.X);
        amml c2 = this.t.a() ? alrwVar.c(akry.BUILDING_3D, alyl.o, this.o, amxf.ROADMAP, amxf.ROADMAP.a(this.s), null) : null;
        amyd a3 = this.k.a();
        alpn alpnVar = this.ab;
        if (alpnVar != null) {
            alptVar = alpnVar.a();
        } else {
            alptVar = new alpt(this.o, b, a3, a, amiuVar, this.a, this.g, this.Y, this.S, this.s);
        }
        alpo alpoVar = alptVar;
        alpj alpjVar = new alpj(this.m, a, b, this.N, this.c);
        alop alopVar = new alop(alpoVar);
        alot alotVar = new alot(a, i, this.z, this.m, b, this.g, this.b, this.E);
        aljt aljtVar = new aljt(i, alotVar, this.z, a, this.m, b, this.g, this.e);
        alms almsVar = new alms();
        almp almpVar = new almp(b, this.o.getDisplayMetrics().density, this.g, a, almsVar, this.P, this.M, this.V, this.p);
        this.ah = new almu(this, a, almsVar, aljtVar, alotVar, alomVar, i, alopVar, alpjVar);
        ammx ammxVar = new ammx(this.e, b, this.r, this.E, this.u, this.g);
        this.ai = ammxVar;
        ammxVar.a.c.b = new alqy(this, b);
        Object obj = this.A;
        String str = this.B;
        almu almuVar = this.ah;
        dbsk.s(almuVar);
        alrf alrfVar = (alrf) this.m;
        altp altpVar2 = this.K;
        Context context = this.e;
        dzsj<akwr> dzsjVar2 = this.a;
        dzsj<akwx> dzsjVar3 = this.v;
        dzsj<dmxf> dzsjVar4 = this.x;
        dzsj<akwv> dzsjVar5 = this.y;
        ammc ammcVar = this.I;
        ammx ammxVar2 = this.ai;
        dbsk.s(ammxVar2);
        alqj alqjVar = new alqj(obj, str, almuVar, alrfVar, a, altpVar2, b, a3, context, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, ammcVar, ammxVar2, almpVar, alpoVar, amiuVar, alrwVar, i, alomVar, aljrVar, alotVar, aljtVar, amixVar, this.C, this.c, this.g, this.f, this.h, this.n, this.L, this.M, this.N, this.S, this.U, new amrg(alomVar, alomVar.n), alovVar, this.t, this.X, this.H, this.Z, c, c2, this.s);
        this.ag = alqjVar;
        return alqjVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [akzz, akya] */
    public final synchronized akpc l() {
        akpc akpcVar = this.aj;
        if (akpcVar == null) {
            k();
            bnss e = e();
            amnb amnbVar = new amnb(this.d, this.g, (ammx) d(), this.o.getDisplayMetrics().density);
            akzh b = b();
            View a = e.a();
            Context context = this.e;
            almu almuVar = this.ah;
            dbsk.s(almuVar);
            amna amnaVar = new amna(a, context, b, almuVar, amnbVar, this.I);
            if (this.W != null) {
                b.e = d();
            } else {
                b.e = null;
            }
            aliu aliuVar = this.W;
            amnaVar.d = aliuVar != null ? aliuVar.a : new alio();
            amnbVar.b = amnaVar;
            e.setGestureController(new alrb(amnaVar));
            this.aj = amnaVar;
            return amnaVar;
        }
        return akpcVar;
    }
}
