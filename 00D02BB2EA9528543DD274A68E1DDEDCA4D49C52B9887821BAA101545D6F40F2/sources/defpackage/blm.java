package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: blm  reason: default package */
/* loaded from: classes3.dex */
public final class blm extends blh<bpw> {
    private final bpw e;

    public blm(List<bpt<bpw>> list) {
        super(list);
        this.e = new bpw();
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ Object i(bpt bptVar, float f) {
        T t;
        T t2 = bptVar.b;
        if (t2 == 0 || (t = bptVar.c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bpw bpwVar = (bpw) t2;
        bpw bpwVar2 = (bpw) t;
        bpv<A> bpvVar = this.d;
        if (bpvVar != 0) {
            float f2 = bptVar.e;
            Float f3 = bptVar.f;
            e();
            bpw bpwVar3 = (bpw) bpvVar.b(bpwVar);
            if (bpwVar3 != null) {
                return bpwVar3;
            }
        }
        bpw bpwVar4 = this.e;
        float c = bpr.c(bpwVar.a, bpwVar2.a, f);
        float f4 = bpwVar.b;
        float f5 = bpwVar2.b;
        bpwVar4.a = c;
        bpwVar4.b = bpr.c(f4, f5, f);
        return this.e;
    }
}
