package defpackage;
/* compiled from: PG */
/* renamed from: yju  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yju implements ampg {
    public final /* synthetic */ yjy a;
    private final /* synthetic */ int b;

    public /* synthetic */ yju(yjy yjyVar, int i) {
        this.b = i;
        this.a = yjyVar;
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
