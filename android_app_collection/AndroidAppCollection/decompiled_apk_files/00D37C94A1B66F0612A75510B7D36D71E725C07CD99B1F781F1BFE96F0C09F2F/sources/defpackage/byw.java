package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: byw  reason: default package */
/* loaded from: classes2.dex */
final class byw implements byv {
    private final List a;
    private cdi c = null;
    private float d = -1.0f;
    private cdi b = g(0.0f);

    public byw(List list) {
        this.a = list;
    }

    private final cdi g(float f) {
        List list;
        cdi cdiVar = (cdi) this.a.get(list.size() - 1);
        if (f >= cdiVar.c()) {
            return cdiVar;
        }
        for (int size = this.a.size() - 2; size > 0; size--) {
            cdi cdiVar2 = (cdi) this.a.get(size);
            if (this.b != cdiVar2 && cdiVar2.d(f)) {
                return cdiVar2;
            }
        }
        return (cdi) this.a.get(0);
    }

    @Override // defpackage.byv
    public final float a() {
        List list = this.a;
        return ((cdi) list.get(list.size() - 1)).b();
    }

    @Override // defpackage.byv
    public final float b() {
        return ((cdi) this.a.get(0)).c();
    }

    @Override // defpackage.byv
    public final cdi c() {
        return this.b;
    }

    @Override // defpackage.byv
    public final boolean d(float f) {
        cdi cdiVar = this.c;
        cdi cdiVar2 = this.b;
        if (cdiVar == cdiVar2 && this.d == f) {
            return true;
        }
        this.c = cdiVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.byv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.byv
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}
