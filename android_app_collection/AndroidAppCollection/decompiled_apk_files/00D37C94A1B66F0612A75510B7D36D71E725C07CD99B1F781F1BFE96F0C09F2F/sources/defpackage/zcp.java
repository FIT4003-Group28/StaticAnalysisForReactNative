package defpackage;
/* compiled from: PG */
/* renamed from: zcp  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zcp implements ampg {
    public final /* synthetic */ ampg a;
    private final /* synthetic */ int b;

    public /* synthetic */ zcp(ampg ampgVar, int i) {
        this.b = i;
        this.a = ampgVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return this.a.apply((aoqu) obj);
        }
        return this.a.apply((aoqu) obj);
    }
}
