package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: scn  reason: default package */
/* loaded from: classes4.dex */
public class scn implements sco {
    private int a;
    private List b;
    private List c;
    private float[] d;
    private set e;
    private List f;
    private float[] g;
    private List h;
    private float[] i;
    private set j;
    private int[] k;
    private final Map l = shp.h();

    @Override // defpackage.sco
    public final void B() {
    }

    @Override // defpackage.sco
    public final void C() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final scp f() {
        if (this.e == null) {
            return null;
        }
        List list = this.b;
        int i = this.a;
        return new scp(list, i, new scx(this.c, this.d, i), this.e.h(), new scx(this.f, this.g, this.a), new scx(this.h, this.i, this.a), this.j.h());
    }

    @Override // defpackage.sco
    public final void g(float f) {
    }

    @Override // defpackage.sco
    public final float h(int i) {
        sho.f(i, this.a);
        return this.d[i];
    }

    @Override // defpackage.sco
    public final float i(int i) {
        sho.f(i, this.a);
        return this.i[i];
    }

    @Override // defpackage.sco
    public final float j(int i) {
        sho.f(i, this.a);
        return this.g[i];
    }

    @Override // defpackage.sco
    public final int k(int i) {
        sho.f(i, this.a);
        return this.k[i];
    }

    @Override // defpackage.sco
    public final int l() {
        return this.a;
    }

    @Override // defpackage.sco
    public final int m(Object obj) {
        return ((Integer) this.l.get(obj)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final scr n() {
        return new scr(this.k, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(scr scrVar) {
        this.k = scrVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(scp scpVar) {
        this.a = scpVar.b;
        this.b = scpVar.a;
        scx scxVar = scpVar.c;
        this.c = scxVar.a;
        this.d = scxVar.b;
        this.e = scpVar.d;
        scx scxVar2 = scpVar.e;
        this.f = scxVar2.a;
        this.g = scxVar2.b;
        scx scxVar3 = scpVar.f;
        this.h = scxVar3.a;
        this.i = scxVar3.b;
        this.j = scpVar.g;
    }

    @Override // defpackage.sco
    public final Double r(int i) {
        sho.f(i, this.a);
        return (Double) this.f.get(i);
    }

    @Override // defpackage.sco
    public final Object s(int i) {
        sho.f(i, this.a);
        return this.b.get(i);
    }

    @Override // defpackage.sco
    public final Object t(int i) {
        sho.f(i, this.a);
        return this.c.get(i);
    }

    @Override // defpackage.sco
    public final Set u(sek sekVar) {
        HashSet e = shp.e(this.a);
        for (int i = 0; i < this.a; i++) {
            if (((Float) sekVar.a).floatValue() <= this.d[i] && ((Float) sekVar.b).floatValue() >= this.d[i]) {
                e.add(this.c.get(i));
            }
        }
        return e;
    }

    @Override // defpackage.sco
    public final void x(set setVar, set setVar2, sgp sgpVar, sgt sgtVar) {
        int a = sgtVar.a();
        float[] fArr = this.d;
        if (fArr == null || a > fArr.length) {
            this.b = sbv.f(a);
            this.c = sbv.f(a);
            this.d = new float[a];
            this.f = sbv.f(a);
            this.g = new float[a];
            this.h = sbv.f(a);
            this.i = new float[a];
            this.k = new int[a];
        } else {
            this.b.clear();
            this.c.clear();
            this.f.clear();
            this.h.clear();
            this.l.clear();
        }
        this.e = setVar;
        this.j = setVar2;
        sgp c = sgtVar.c(sgq.a);
        sgp d = sgtVar.d(sgq.b, Double.valueOf(0.0d));
        sgp d2 = sgtVar.d(sgq.e, -16777216);
        this.a = 0;
        for (Object obj : sgtVar.a) {
            this.b.add(obj);
            Object a2 = sgpVar.a(obj, this.a, sgtVar);
            this.c.add(a2);
            this.d[this.a] = setVar.a(a2);
            this.l.put(a2, Integer.valueOf(this.a));
            Double d3 = (Double) c.a(obj, this.a, sgtVar);
            Double d4 = (Double) d.a(obj, this.a, sgtVar);
            this.f.add(d3);
            this.g[this.a] = setVar2.b(d3, d4);
            this.h.add(d4);
            this.i[this.a] = setVar2.a(d4);
            int[] iArr = this.k;
            int i = this.a;
            iArr[i] = ((Integer) d2.a(obj, i, sgtVar)).intValue();
            this.a++;
        }
    }
}
