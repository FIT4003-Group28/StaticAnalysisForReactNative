package defpackage;

import java.lang.reflect.Array;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcar  reason: default package */
/* loaded from: classes5.dex */
public final class dcar<R, C, V> extends dcmv<R, C, V> {
    public final dcdn<R, Integer> b;
    public final dcdn<C, Integer> c;
    public final int[] d;
    public final int[] e;
    public final V[][] f;
    private final dcdn<R, dcdn<C, V>> g;
    private final dcdn<C, dcdn<R, V>> h;
    private final int[] i;
    private final int[] j;

    public dcar(dcdc<dcot<R, C, V>> dcdcVar, dcep<R> dcepVar, dcep<C> dcepVar2) {
        this.f = (V[][]) ((Object[][]) Array.newInstance(Object.class, dcepVar.size(), dcepVar2.size()));
        dcdn<R, Integer> G = dcjz.G(dcepVar);
        this.b = G;
        dcdn<C, Integer> G2 = dcjz.G(dcepVar2);
        this.c = G2;
        this.d = new int[G.size()];
        this.e = new int[G2.size()];
        int[] iArr = new int[dcdcVar.size()];
        int[] iArr2 = new int[dcdcVar.size()];
        for (int i = 0; i < dcdcVar.size(); i++) {
            dcot<R, C, V> dcotVar = dcdcVar.get(i);
            R a = dcotVar.a();
            C b = dcotVar.b();
            int intValue = this.b.get(a).intValue();
            int intValue2 = this.c.get(b).intValue();
            w(a, b, this.f[intValue][intValue2], dcotVar.c());
            this.f[intValue][intValue2] = dcotVar.c();
            int[] iArr3 = this.d;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.e;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i] = intValue;
            iArr2[i] = intValue2;
        }
        this.i = iArr;
        this.j = iArr2;
        this.g = new dcaq(this);
        this.h = new dcam(this);
    }

    @Override // defpackage.dbyu, defpackage.dcou
    public final V b(Object obj, Object obj2) {
        Integer num = this.b.get(obj);
        Integer num2 = this.c.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f[num.intValue()][num2.intValue()];
    }

    @Override // defpackage.dcfg
    public final dcdn<C, Map<R, V>> j() {
        return dcdn.r(this.h);
    }

    @Override // defpackage.dcfg, defpackage.dcou
    /* renamed from: k */
    public final dcdn<R, Map<C, V>> p() {
        return dcdn.r(this.g);
    }

    @Override // defpackage.dcou
    public final int l() {
        return this.i.length;
    }

    @Override // defpackage.dcmv
    public final dcot<R, C, V> m(int i) {
        int i2 = this.i[i];
        int i3 = this.j[i];
        return q(u().v().get(i2), t().v().get(i3), this.f[i2][i3]);
    }

    @Override // defpackage.dcmv
    public final V n(int i) {
        return this.f[this.i[i]][this.j[i]];
    }

    @Override // defpackage.dcfg
    public final dcff o() {
        return dcff.a(this, this.i, this.j);
    }
}
