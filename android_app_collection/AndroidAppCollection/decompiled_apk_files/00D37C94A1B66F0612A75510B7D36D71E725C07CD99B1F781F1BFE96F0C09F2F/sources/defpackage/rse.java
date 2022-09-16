package defpackage;
/* compiled from: PG */
/* renamed from: rse  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rse implements qvo {
    public final /* synthetic */ rso a;
    private final /* synthetic */ int b;

    public /* synthetic */ rse(rso rsoVar, int i) {
        this.b = i;
        this.a = rsoVar;
    }

    @Override // defpackage.qvo
    public final void a(Object obj, Object obj2) {
        if (this.b == 0) {
            ((rsm) ((rst) obj).D()).a(this.a, true, 1);
            ((rvh) obj2).b(null);
            return;
        }
        ((rsm) ((rst) obj).D()).a(this.a, false, 0);
        ((rvh) obj2).b(true);
    }
}
