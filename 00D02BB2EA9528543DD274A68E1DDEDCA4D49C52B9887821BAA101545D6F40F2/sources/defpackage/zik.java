package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zik  reason: default package */
/* loaded from: classes7.dex */
public final class zik implements bzml {
    public static final dcqe a = dcqe.c("zik");
    public final ff b;
    public final yzi c;
    public final ania d;
    public dqvj e;
    public dqvj f;
    public amvh g;
    public List<amvh> h;
    public dwao i;
    public Runnable j;
    public zid k;
    private final eeu l;
    private final bwqv m;
    private final dxio<akfa> n;
    private final akfc o;
    private final dxio<axwq> p;
    private final dzsj<axwy> q;
    private final bzqc r;
    private final axws s;
    private final Executor t;
    private axwt u = axwt.a;
    private final bzgj v = new bzgj();
    private final bzgf w = new bzgf(this) { // from class: zig
        private final zik a;

        {
            this.a = this;
        }

        @Override // defpackage.bzgf
        public final void a() {
            this.a.g();
        }
    };

    public zik(ff ffVar, eeu eeuVar, bwqv bwqvVar, yzi yziVar, dxio<akfa> dxioVar, akfc akfcVar, dxio<axwq> dxioVar2, dzsj<axwy> dzsjVar, axws axwsVar, bzqc bzqcVar, ania aniaVar, Executor executor) {
        this.b = ffVar;
        this.l = eeuVar;
        this.m = bwqvVar;
        this.c = yziVar;
        this.n = dxioVar;
        this.o = akfcVar;
        this.p = dxioVar2;
        this.q = dzsjVar;
        this.r = bzqcVar;
        this.d = aniaVar;
        this.s = axwsVar;
        this.t = executor;
    }

    private final Runnable h() {
        return new zii(this);
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.DIRECTIONS_NUDGEBAR_SHORTCUT;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        dqvj dqvjVar = this.f;
        if (dqvjVar == null || !this.c.c() || dqvjVar == dqvj.TAXI) {
            return false;
        }
        if (!this.v.c()) {
            return true;
        }
        bzgg.b(this.w, this.s, this.v, this.t);
        return true;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (bzmkVar != bzmk.VISIBLE || this.h == null || this.j == null || this.e == null || this.g == null || this.i == null || this.k == null) {
            return false;
        }
        g();
        if (!this.u.b()) {
            return false;
        }
        this.r.b(bzqb.WEB_AND_APP_ACTIVITY, new dbsz(this) { // from class: zih
            private final zik a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                this.a.d.c(((UdcCacheResponse.UdcSetting) obj).b == 2, 2);
            }
        });
        amvh amvhVar = (amvh) dcft.s(this.h);
        dbsk.s(amvhVar);
        dcdc<azva> n = this.p.a().n();
        int size = n.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            azva azvaVar = n.get(i);
            if ((akqi.d(azvaVar.c) && amvhVar.m() && azvaVar.c.equals(amvhVar.d)) || akqq.v(azvaVar.e, amvhVar.e, 1.0d)) {
                z = true;
            }
        }
        if (!this.d.a() || z) {
            zhc i2 = zhd.i();
            zgi zgiVar = (zgi) i2;
            zgiVar.a = cqrt.f(R.mipmap.adaptiveproduct_maps_2020);
            zgiVar.b = cqrt.l(R.string.CREATE_DIRECTIONS_SHORTCUT_NUDGEBAR_TITLE);
            zgiVar.c = cqrt.l(R.string.CREATE_DIRECTIONS_SHORTCUT_NUDGEBAR_DESCRIPTION);
            i2.b(cjtd.a(dtxn.di));
            i2.c(new zij(this, this.e, this.g, this.h, this.i));
            zgiVar.d = cjtd.a(dtxn.dj);
            i2.d(h());
            this.k.a(i2.a());
        } else {
            ily ilyVar = new ily();
            ilyVar.I(amvhVar);
            this.k.a(new zhv(this.b, this.l, this.m, this.c, this.n, this.o, this.p, this.q, this.j, h(), bwrs.a(ilyVar.d()), this.e, this.g, this.h, this.i, this.u.a()));
        }
        return true;
    }

    public final void g() {
        axws axwsVar = this.s;
        dbsk.s(axwsVar);
        this.u = axwsVar.b();
    }
}
