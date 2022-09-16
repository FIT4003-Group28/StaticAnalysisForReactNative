package defpackage;
/* compiled from: PG */
/* renamed from: aefs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aefs implements anir {
    public final /* synthetic */ ankt a;
    private final /* synthetic */ int b;

    public /* synthetic */ aefs(ankt anktVar, int i) {
        this.b = i;
        this.a = anktVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            Exception exc = (Exception) obj;
            return this.a;
        } else if (i == 1) {
            arbf arbfVar = (arbf) obj;
            return this.a;
        } else if (i == 2) {
            return ((Boolean) obj).booleanValue() ? this.a : anlz.q(false);
        } else {
            Void r3 = (Void) obj;
            return this.a;
        }
    }
}
