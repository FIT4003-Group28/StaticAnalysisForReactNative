package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pqg  reason: default package */
/* loaded from: classes7.dex */
abstract class pqg implements pqe {
    private final dcdc<jbf> a;
    private final boolean b;

    public pqg(List<? extends pqz> list, boolean z) {
        this.b = z;
        dccx F = dcdc.F();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            F.g(new pqf(this, list.get(i), i));
        }
        this.a = F.f();
    }

    @Override // defpackage.pqe
    public List<? extends jbf> a() {
        return this.a;
    }

    @Override // defpackage.pqe
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    public abstract void e(int i);
}
