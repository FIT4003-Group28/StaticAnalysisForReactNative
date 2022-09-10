package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bvic  reason: default package */
/* loaded from: classes4.dex */
class bvic implements bvht {
    private final dcdc<bvib> a;
    private int b = 0;

    public bvic(int i) {
        dccx F = dcdc.F();
        for (int i2 = 0; i2 < i; i2++) {
            F.g(new bvib());
        }
        this.a = F.f();
    }

    @Override // defpackage.bvht
    public List<? extends bvhs> a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, Float f) {
        if (i < this.a.size()) {
            if (this.b != i) {
                int i2 = 0;
                while (i2 < this.a.size()) {
                    this.a.get(i2).a = i2 < i ? 1.0f : 0.0f;
                    i2++;
                }
            }
            this.a.get(i).a = f.floatValue();
            this.b = i;
        }
    }
}
