package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: kwf  reason: default package */
/* loaded from: classes7.dex */
public final class kwf implements kxa {
    public final dxio<ammc> E;
    private final dbty<akyy> G;
    public final Context a;
    public final LayoutInflater b;
    public final akpx c;
    public final akpw d;
    public final amcp e;
    public final dxio<ahjq> f;
    public final ckcw g;
    public final cqat h;
    public final bvnx i;
    public final btrm j;
    public final bvkx k;
    public final anat l;
    public final cjvm m;
    public final ckme n;
    public final akpl o;
    public final kxu q;
    public final alja r;
    public final dbty<Boolean> s;
    public final akpn p = new kwg();
    public volatile boolean t = false;
    public final dxio<amyj> u = btsp.b(new kvq(this));
    public final dxio<bnsn> v = btsp.b(new kvr(this));
    public final dxio<altp> w = btsp.b(new kvs());
    public final dxio<akor> x = btsp.b(new kvu(this));
    public final dxio<alrf> y = btsp.b(new dbty(this) { // from class: kvi
        private final kwf a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return new alrf(this.a.v);
        }
    });
    private final dxio<hwe> F = btsp.b(new kvx(this));
    public final dxio<axxl> z = btsp.b(new kwb(this));
    public final dxio<akox> A = btsp.b(new kwd(this));
    public final dxio<hwq> B = btsp.b(new kwe(this));
    public final dxio<akpe> C = btsp.b(new kvm(this));
    public final dxio<amyd> D = btsp.b(new kvo(this));

    public kwf(Context context, LayoutInflater layoutInflater, akpx akpxVar, akpw akpwVar, amcp amcpVar, dxio<ahjq> dxioVar, ckcw ckcwVar, cqat cqatVar, bvnx bvnxVar, btrm btrmVar, bvkx bvkxVar, Point point, anat anatVar, cjvm cjvmVar, ckme ckmeVar, alja aljaVar, dbty<Boolean> dbtyVar) {
        dbty<akyy> dbtyVar2 = new dbty(this) { // from class: kvj
            private final kwf a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                kwf kwfVar = this.a;
                if (!kwfVar.t) {
                    return null;
                }
                return kwfVar.A.a().k().b;
            }
        };
        this.G = dbtyVar2;
        this.E = btsp.b(new kvp(this));
        dbsk.s(context);
        this.a = context;
        dbsk.s(layoutInflater);
        this.b = layoutInflater;
        this.c = akpxVar;
        this.d = akpwVar;
        this.e = amcpVar;
        dbsk.s(dxioVar);
        this.f = dxioVar;
        this.g = ckcwVar;
        this.h = cqatVar;
        this.i = bvnxVar;
        this.j = btrmVar;
        this.k = bvkxVar;
        this.l = anatVar;
        this.m = cjvmVar;
        dbsk.s(ckmeVar);
        this.n = ckmeVar;
        dbsk.s(aljaVar);
        this.r = aljaVar;
        this.s = dbtyVar;
        akpk a = akpl.a();
        a.a = 3;
        a.b();
        this.o = a.a();
        this.q = new kxv(new kxm(context, new ksi(context)), dbtyVar2, new Rect(0, 0, point.x, point.y));
        amyn.b = akpxVar.sO();
        amyn.c = akpxVar.sP();
        amyn.d = akpxVar.sQ();
        amyn.e = akpxVar.sR();
        amyn.f = akpxVar.sS();
        amyn.g = akpxVar.sT();
    }

    @Override // defpackage.kxa
    public final hwe a() {
        return this.F.a();
    }
}
