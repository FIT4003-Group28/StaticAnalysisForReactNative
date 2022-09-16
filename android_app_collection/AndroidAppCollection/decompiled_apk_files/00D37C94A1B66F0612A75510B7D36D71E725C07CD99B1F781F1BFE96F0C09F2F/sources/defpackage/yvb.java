package defpackage;
/* compiled from: PG */
/* renamed from: yvb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yvb implements anir {
    public final /* synthetic */ ampg a;
    private final /* synthetic */ int b;

    public /* synthetic */ yvb(ampg ampgVar) {
        this.a = ampgVar;
    }

    public /* synthetic */ yvb(ampg ampgVar, int i) {
        this.b = i;
        this.a = ampgVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            return ((vmu) obj).a.b(this.a, anjk.a);
        }
        return anlz.q(this.a.apply(obj));
    }
}
