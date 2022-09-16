package defpackage;
/* compiled from: PG */
/* renamed from: yjz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yjz implements ampg {
    public final /* synthetic */ ykd a;
    private final /* synthetic */ int b;

    public /* synthetic */ yjz(ykd ykdVar, int i) {
        this.b = i;
        this.a = ykdVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            Void r2 = (Void) obj;
            this.a.a.run();
            return null;
        }
        this.a.c.e();
        return obj;
    }
}
