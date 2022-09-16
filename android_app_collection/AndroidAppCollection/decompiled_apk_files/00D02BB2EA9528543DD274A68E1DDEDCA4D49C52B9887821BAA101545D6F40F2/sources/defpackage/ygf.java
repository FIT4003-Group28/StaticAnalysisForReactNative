package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ygf  reason: default package */
/* loaded from: classes7.dex */
final class ygf implements degu<djxo> {
    final /* synthetic */ ygh a;

    public ygf(ygh yghVar) {
        this.a = yghVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof yds) {
            this.a.M(3);
            this.a.N(3);
        } else if (th instanceof ydt) {
            this.a.M(2);
            this.a.N(5);
        } else {
            this.a.M(2);
            this.a.N(4);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(djxo djxoVar) {
        int i;
        yfs yfsVar;
        djxo djxoVar2;
        int i2;
        djxo djxoVar3 = djxoVar;
        ygh yghVar = this.a;
        yghVar.b.e();
        albv.g(yghVar.g, djxoVar3);
        yfs yfsVar2 = yghVar.l < yghVar.o.size() ? yghVar.o.get(yghVar.l) : null;
        int i3 = (djxoVar3.a & 32) != 0 ? djxoVar3.e : 0;
        yghVar.n = null;
        yghVar.i = yghVar.C(djxoVar3, yghVar.l);
        int i4 = 4;
        int i5 = 1;
        if (djxoVar3.d.size() > 0) {
            djxoVar3.d.size();
            yghVar.m = djxoVar3;
            ygj ygjVar = yghVar.p;
            for (dopk dopkVar : yghVar.m.b) {
                if (!ygjVar.a.containsKey(dopkVar.d)) {
                    ygjVar.a.put(dopkVar.d, dopkVar);
                }
            }
            dccx F = dcdc.F();
            int i6 = 0;
            while (i6 < djxoVar3.d.size()) {
                djxn djxnVar = djxoVar3.d.get(i6);
                dcdc<yfs> dcdcVar = yghVar.o;
                int size = dcdcVar.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        yfsVar = null;
                        break;
                    }
                    yfsVar = dcdcVar.get(i7);
                    i7++;
                    if (yfsVar.b(djxnVar)) {
                        break;
                    }
                }
                if (yfsVar == null) {
                    ygu yguVar = yghVar.f;
                    CharSequence k = yghVar.k();
                    ygg yggVar = new ygg(yghVar);
                    ygj ygjVar2 = yghVar.p;
                    Activity activity = (Activity) ((dxjd) yguVar.a).a;
                    ygu.a(activity, i5);
                    cqat a = yguVar.b.a();
                    ygu.a(a, 2);
                    xiy a2 = yguVar.c.a();
                    ygu.a(a2, 3);
                    xhx a3 = yguVar.d.a();
                    ygu.a(a3, i4);
                    cqhn a4 = yguVar.e.a();
                    djxoVar2 = djxoVar3;
                    ygu.a(a4, 5);
                    xaz a5 = yguVar.f.a();
                    ygu.a(a5, 6);
                    ygu.a(djxnVar, 7);
                    ygu.a(yggVar, 10);
                    ygu.a(ygjVar2, 11);
                    i2 = i6;
                    yfsVar = new ygt(activity, a, a2, a3, a4, a5, djxnVar, k, i2, yggVar, ygjVar2);
                } else {
                    djxoVar2 = djxoVar3;
                    i2 = i6;
                    if (yfsVar2 == yfsVar) {
                        i3 = i2;
                    }
                }
                F.g(yfsVar);
                i6 = i2 + 1;
                djxoVar3 = djxoVar2;
                i4 = 4;
                i5 = 1;
            }
            yghVar.o = F.f();
            i = 1;
            yghVar.O(i3, true);
            yghVar.M(5);
            yghVar.I();
        } else {
            i = 1;
            yghVar.M(4);
        }
        this.a.N(i);
    }
}
