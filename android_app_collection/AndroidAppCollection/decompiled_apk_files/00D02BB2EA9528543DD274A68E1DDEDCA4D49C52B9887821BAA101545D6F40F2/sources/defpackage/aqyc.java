package defpackage;
/* compiled from: PG */
/* renamed from: aqyc  reason: default package */
/* loaded from: classes2.dex */
public class aqyc implements areb {
    private int a = -1;
    private final aqxy b;

    public aqyc(aqxy aqxyVar) {
        this.b = aqxyVar;
    }

    @Override // defpackage.areb
    public void a(int i) {
        this.a = akn.b(i, 0, 3);
    }

    @Override // defpackage.areb
    public Integer b() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.areb
    public cqkl c() {
        this.b.aT();
        return cqkl.a;
    }
}
