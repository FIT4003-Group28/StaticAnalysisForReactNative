package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcnt  reason: default package */
/* loaded from: classes5.dex */
public final class dcnt<R, C, V> extends dcmv<R, C, V> {
    public static final dcfg<Object, Object, Object> b = new dcnt(dcdc.e(), dcmr.a, dcmr.a);
    private final dcdn<R, dcdn<C, V>> c;
    private final dcdn<C, dcdn<R, V>> d;
    private final int[] e;
    private final int[] f;

    public dcnt(dcdc<dcot<R, C, V>> dcdcVar, dcep<R> dcepVar, dcep<C> dcepVar2) {
        dcdn G = dcjz.G(dcepVar);
        LinkedHashMap h = dcjz.h();
        dcpd<R> it = dcepVar.iterator();
        while (it.hasNext()) {
            h.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap h2 = dcjz.h();
        dcpd<C> it2 = dcepVar2.iterator();
        while (it2.hasNext()) {
            h2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[dcdcVar.size()];
        int[] iArr2 = new int[dcdcVar.size()];
        for (int i = 0; i < dcdcVar.size(); i++) {
            dcot<R, C, V> dcotVar = dcdcVar.get(i);
            R a = dcotVar.a();
            C b2 = dcotVar.b();
            V c = dcotVar.c();
            iArr[i] = ((Integer) G.get(a)).intValue();
            Map map = (Map) h.get(a);
            iArr2[i] = map.size();
            w(a, b2, map.put(b2, c), c);
            ((Map) h2.get(b2)).put(a, c);
        }
        this.e = iArr;
        this.f = iArr2;
        dcdg dcdgVar = new dcdg(h.size());
        for (Map.Entry entry : h.entrySet()) {
            dcdgVar.f(entry.getKey(), dcdn.r((Map) entry.getValue()));
        }
        this.c = dcdgVar.b();
        dcdg dcdgVar2 = new dcdg(h2.size());
        for (Map.Entry entry2 : h2.entrySet()) {
            dcdgVar2.f(entry2.getKey(), dcdn.r((Map) entry2.getValue()));
        }
        this.d = dcdgVar2.b();
    }

    @Override // defpackage.dcfg
    public final dcdn<C, Map<R, V>> j() {
        return dcdn.r(this.d);
    }

    @Override // defpackage.dcfg, defpackage.dcou
    /* renamed from: k */
    public final dcdn<R, Map<C, V>> p() {
        return dcdn.r(this.c);
    }

    @Override // defpackage.dcou
    public final int l() {
        return this.e.length;
    }

    @Override // defpackage.dcmv
    public final dcot<R, C, V> m(int i) {
        Map.Entry<R, dcdn<C, V>> entry = this.c.entrySet().v().get(this.e[i]);
        Map.Entry<C, V> entry2 = entry.getValue().entrySet().v().get(this.f[i]);
        return q(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // defpackage.dcmv
    public final V n(int i) {
        int i2 = this.e[i];
        return this.c.values().v().get(i2).values().v().get(this.f[i]);
    }

    @Override // defpackage.dcfg
    public final dcff o() {
        dcdn G = dcjz.G(t());
        int[] iArr = new int[f().size()];
        dcpd<dcot<R, C, V>> it = f().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) G.get(it.next().b())).intValue();
            i++;
        }
        return dcff.a(this, this.e, iArr);
    }
}
