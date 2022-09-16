package defpackage;
/* compiled from: PG */
/* renamed from: xic  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xic implements xhs {
    public final /* synthetic */ xid a;
    private final /* synthetic */ int b;

    public /* synthetic */ xic(xid xidVar, int i) {
        this.b = i;
        this.a = xidVar;
    }

    @Override // defpackage.xhs
    public final void a() {
        if (this.b == 0) {
            xid xidVar = this.a;
            xig xigVar = xidVar.a;
            xigVar.getClass();
            xigVar.c(false);
            xidVar.onClick(xidVar.a());
            return;
        }
        xid xidVar2 = this.a;
        xig xigVar2 = xidVar2.a;
        xigVar2.getClass();
        xigVar2.c(true);
        xidVar2.onClick(xidVar2.f());
    }
}
