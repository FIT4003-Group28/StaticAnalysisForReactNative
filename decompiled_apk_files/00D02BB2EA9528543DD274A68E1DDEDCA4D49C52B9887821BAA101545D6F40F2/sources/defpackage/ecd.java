package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ecd  reason: default package */
/* loaded from: classes6.dex */
public class ecd implements ebl {
    public final ff a;
    public final dkfv b;
    public final Runnable c;

    public ecd(ff ffVar, dkfv dkfvVar, Runnable runnable) {
        this.a = ffVar;
        this.b = dkfvVar;
        this.c = runnable;
    }

    @Override // defpackage.ebl
    public List<ebo> a() {
        dccx F = dcdc.F();
        dkgl dkglVar = this.b.d;
        if (dkglVar == null) {
            dkglVar = dkgl.d;
        }
        int i = dkglVar.a;
        dkgf dkgfVar = this.b.c;
        if (dkgfVar == null) {
            dkgfVar = dkgf.c;
        }
        for (dkgh dkghVar : dkgfVar.a) {
            int i2 = dkghVar.a;
            if (i2 != 0) {
                F.g(new ecr(dkghVar, i2 <= i));
            }
        }
        return F.f();
    }

    @Override // defpackage.ebl
    public jad b() {
        return new ecc(this);
    }
}
