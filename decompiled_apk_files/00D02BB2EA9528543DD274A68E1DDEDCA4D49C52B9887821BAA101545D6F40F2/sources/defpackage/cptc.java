package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cptc  reason: default package */
/* loaded from: classes5.dex */
public final class cptc<T, D> extends cpsr<T, D> {
    private String a;
    private final boolean b;

    public cptc() {
        this.a = null;
        this.b = false;
    }

    @Override // defpackage.cptb
    public final boolean a(cpoj<T, D> cpojVar, List<cpvg<T, D>> list) {
        String str = null;
        if (list.isEmpty()) {
            boolean z = this.b;
        } else {
            float f = Float.MAX_VALUE;
            for (cpvg<T, D> cpvgVar : list) {
                float pow = (float) (Math.pow(cpvgVar.c, 2.0d) + Math.pow(cpvgVar.d, 2.0d));
                if (pow < f) {
                    str = cpvgVar.a.f;
                    f = pow;
                }
            }
        }
        String str2 = this.a;
        this.a = str;
        c();
        boolean z2 = true;
        if (str2 != null ? str2.equals(this.a) : this.a == null) {
            z2 = false;
        }
        if (z2) {
            b();
        }
        return z2;
    }

    @Override // defpackage.cptb
    public final boolean f() {
        return this.b || this.a != null;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcpvi<TT;TD;>;TD;)Ljava/lang/Object; */
    @Override // defpackage.cptb
    public final int h(cpvi cpviVar, Object obj) {
        if (this.b && this.a == null) {
            this.a = cpviVar.f;
        }
        String str = this.a;
        if (str == null) {
            return 2;
        }
        return str.equals(cpviVar.f) ? 1 : 3;
    }

    public cptc(boolean z) {
        this.a = null;
        this.b = z;
    }
}
