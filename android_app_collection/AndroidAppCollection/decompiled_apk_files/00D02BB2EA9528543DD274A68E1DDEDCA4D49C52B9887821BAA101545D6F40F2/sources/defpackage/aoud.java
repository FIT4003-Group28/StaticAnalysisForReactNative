package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseIntArray;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aoud  reason: default package */
/* loaded from: classes2.dex */
public final class aoud implements angz {
    private final dxio<aouc> a;
    private final dxio<akox> b;
    private final dxio<hwe> c;
    private final dxio<axsc> d;
    private final dxio<akzh> e;
    private final dxio<gll> f;
    private final dxio<aotz> g;
    private aogm h = aogm.a;
    private dbsg<hwb> i = dbpy.a;
    @dzsi
    private dcdc<akte> j;
    @dzsi
    private dcdc<akuh> k;

    public aoud(dxio<aouc> dxioVar, dxio<akox> dxioVar2, dxio<hwe> dxioVar3, dxio<axsc> dxioVar4, dxio<akzh> dxioVar5, dxio<gll> dxioVar6, dxio<aotz> dxioVar7) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = dxioVar6;
        this.g = dxioVar7;
    }

    private final void c() {
        dcdc<akte> dcdcVar = this.j;
        this.j = null;
        if (dcdcVar != null) {
            aktz aB = this.b.a().aj().aB();
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                akte akteVar = dcdcVar.get(i);
                aB.h(akteVar);
                aB.a(akteVar);
            }
        }
    }

    private final void d() {
        dcdc<akuh> dcdcVar = this.k;
        this.k = null;
        if (dcdcVar != null) {
            akvz aE = this.b.a().aj().aE();
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                aE.j(dcdcVar.get(i));
            }
        }
    }

    private static akte e(aktz aktzVar, dmqd dmqdVar, dech dechVar, int i) {
        dspd b = akxh.b(dechVar.e());
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar = (dmqg) dmqdVar.b;
        dmqg dmqgVar2 = dmqg.p;
        b.getClass();
        int i2 = dmqgVar.a | 1;
        dmqgVar.a = i2;
        dmqgVar.b = b;
        dmqgVar.a = i2 | 256;
        dmqgVar.l = i;
        int b2 = dechVar.b() / 2;
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar3 = (dmqg) dmqdVar.b;
        dmqgVar3.a |= 2;
        dmqgVar3.c = b2;
        akte c = aktzVar.c((dmqg) dmqdVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_DOUBLE);
        c.h();
        return c;
    }

    @Override // defpackage.angz
    public final void a(aogm aogmVar) {
        aogl b;
        dcdc<aogk> b2;
        int size;
        int i;
        dech dechVar;
        dcdc<aogk> dcdcVar;
        bvrj.UI_THREAD.c();
        if (!this.h.c().equals(aogmVar.c())) {
            if (this.i.a()) {
                this.c.a().j(this.i.b());
                this.i = dbpy.a;
            }
            if (aogmVar.c().a()) {
                this.i = dbsg.j(this.c.a().i(akpp.o(aogmVar.c().b()), true));
            }
        }
        boolean z = false;
        if (!this.h.d().equals(aogmVar.d())) {
            c();
            d();
            if (!this.h.d().equals(aogmVar.d()) && aogmVar.d().a() && (size = (b2 = (b = aogmVar.d().b()).b()).size()) != 0) {
                akvz aE = this.b.a().aj().aE();
                ArrayList arrayList = new ArrayList(size);
                dccx dccxVar = new dccx();
                SparseIntArray sparseIntArray = new SparseIntArray();
                int i2 = 0;
                while (i2 < size) {
                    int a = b2.get(i2).a();
                    if (b2.get(i2).b()) {
                        a = (a & 16777215) | 1174405120;
                    }
                    int i3 = sparseIntArray.get(a, -1);
                    if (i3 == -1) {
                        int argb = Color.argb(Color.alpha(a), Math.min(Math.round(Color.red(a) * 0.7f), 255), Math.min(Math.round(Color.green(a) * 0.7f), 255), Math.min(Math.round(Color.blue(a) * 0.7f), 255));
                        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                        dmoo dmooVar = (dmoo) dmop.h.bZ();
                        if (dmooVar.c) {
                            dmooVar.bF();
                            dmooVar.c = z;
                        }
                        dmop dmopVar = (dmop) dmooVar.b;
                        dmopVar.a |= 1;
                        int i4 = z ? 1 : 0;
                        int i5 = z ? 1 : 0;
                        dmopVar.b = i4;
                        dmqj bZ = dmqk.j.bZ();
                        dmsk bZ2 = dmsl.l.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dmsl dmslVar = (dmsl) bZ2.b;
                        dcdcVar = b2;
                        int i6 = dmslVar.a | 1;
                        dmslVar.a = i6;
                        dmslVar.b = argb;
                        dmslVar.a = i6 | 4;
                        dmslVar.d = 64;
                        bZ.a(bZ2);
                        dmsk bZ3 = dmsl.l.bZ();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dmsl dmslVar2 = (dmsl) bZ3.b;
                        int i7 = dmslVar2.a | 1;
                        dmslVar2.a = i7;
                        dmslVar2.b = a;
                        dmslVar2.a = i7 | 4;
                        dmslVar2.d = 48;
                        bZ.a(bZ3);
                        if (dmooVar.c) {
                            dmooVar.bF();
                            dmooVar.c = false;
                        }
                        dmop dmopVar2 = (dmop) dmooVar.b;
                        dmqk bK = bZ.bK();
                        bK.getClass();
                        dmopVar2.e = bK;
                        dmopVar2.a |= 8;
                        dmqtVar.a(dmooVar);
                        aktg c = aE.c((dmqx) dmqtVar.bK());
                        dccxVar.g(c);
                        i3 = c.a();
                        sparseIntArray.put(a, i3);
                    } else {
                        dcdcVar = b2;
                    }
                    arrayList.add(Integer.valueOf(i3));
                    i2++;
                    b2 = dcdcVar;
                    z = false;
                }
                this.k = dccxVar.f();
                dccx dccxVar2 = new dccx();
                dmqd dmqdVar = (dmqd) dmqg.p.bZ();
                if (dmqdVar.c) {
                    dmqdVar.bF();
                    dmqdVar.c = false;
                }
                dmqg dmqgVar = (dmqg) dmqdVar.b;
                dmqgVar.f = 1;
                dmqgVar.a |= 4;
                dmqg dmqgVar2 = (dmqg) dmqdVar.b;
                dmqgVar2.g = 1;
                dmqgVar2.a |= 8;
                dmqg dmqgVar3 = (dmqg) dmqdVar.b;
                dmqgVar3.h = 2;
                int i8 = dmqgVar3.a | 16;
                dmqgVar3.a = i8;
                int i9 = i8 | 1024;
                dmqgVar3.a = i9;
                dmqgVar3.n = 0;
                dmqgVar3.a = i9 | 2048;
                dmqgVar3.o = 0;
                dcdc<akqq> a2 = b.a();
                int size2 = a2.size();
                decg a3 = dech.a(size2 + size2);
                int size3 = a2.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    akqq akqqVar = a2.get(i10);
                    a3.a(akqqVar.a);
                    a3.a(akqqVar.b);
                }
                int i11 = a3.b;
                if (i11 == 0) {
                    dechVar = dech.a;
                    i = 0;
                } else {
                    i = 0;
                    dechVar = new dech(a3.a, 0, i11);
                }
                aktz aB = this.b.a().aj().aB();
                int intValue = ((Integer) arrayList.get(i)).intValue();
                int i12 = 0;
                for (int i13 = 1; i13 < size; i13++) {
                    int intValue2 = ((Integer) arrayList.get(i13)).intValue();
                    if (intValue != intValue2) {
                        dccxVar2.g(e(aB, dmqdVar, dechVar.f(i12 + i12, i13 + i13 + 2), intValue));
                        i12 = i13;
                        intValue = intValue2;
                    }
                }
                dccxVar2.g(e(aB, dmqdVar, dechVar.f(i12 + i12, size + size + 2), intValue));
                this.j = dccxVar2.f();
            }
        }
        if (!dchl.m(this.h.g(), aogmVar.g())) {
            if (!aogmVar.g().isEmpty()) {
                akoq aj = this.b.a().aj();
                this.a.a();
                this.b.a().O("MapsActivityPlaceLabels", new aoua(aj.aC(), aj.aE(), aogmVar.g()));
            } else {
                this.b.a().Q("MapsActivityPlaceLabels");
            }
        }
        if (this.h.h() != aogmVar.h()) {
            this.d.a().e(!aogmVar.h());
            if (aogmVar.h()) {
                this.b.a().O("MapsActivityLabelRestrictions", this.g.a());
            } else {
                this.b.a().Q("MapsActivityLabelRestrictions");
            }
        }
        if (!aogmVar.e().isEmpty()) {
            dcdc<akqq> e = aogmVar.e();
            akqr a4 = akqs.a();
            int size4 = e.size();
            for (int i14 = 0; i14 < size4; i14++) {
                a4.d(e.get(i14));
            }
            akqs b3 = a4.b();
            Rect b4 = aogmVar.f().a() ? aogmVar.f().b() : this.f.a().b();
            bnuw A = this.e.a().A();
            akox a5 = this.b.a();
            akyc n = (b4.left >= b4.right || b4.top >= b4.bottom) ? akyt.n(b3, 0, 0, 0, 0) : akyt.n(b3, b4.left, A.a() - b4.right, b4.top, A.b() - b4.bottom);
            n.b = 250;
            a5.p(n);
            if (aogmVar.b().a()) {
                double l = akqo.l(b3, this.e.a().A().b(), this.e.a().A().a(), this.e.a().B());
                float floatValue = aogmVar.b().b().floatValue();
                if (floatValue < l) {
                    this.b.a().p(akyt.b(floatValue));
                }
            }
        } else if (aogmVar.a().a() || aogmVar.b().a()) {
            akyc j = akyt.j(aogmVar.a().a() ? aogmVar.a().b() : this.e.a().p().i, aogmVar.b().a() ? aogmVar.b().b().floatValue() : this.e.a().p().k, this.f.a().b());
            j.b = 250;
            this.b.a().p(j);
        }
        this.h = aogmVar;
    }

    @Override // defpackage.angz
    public final void b() {
        a(aogm.a);
        c();
        d();
    }
}
