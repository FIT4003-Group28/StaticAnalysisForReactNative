package defpackage;
/* compiled from: PG */
/* renamed from: grb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class grb implements zdt {
    public final /* synthetic */ grc a;
    private final /* synthetic */ int b;

    public /* synthetic */ grb(grc grcVar) {
        this.a = grcVar;
    }

    public /* synthetic */ grb(grc grcVar, int i) {
        this.b = i;
        this.a = grcVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            gre greVar = this.a.f;
            greVar.b(greVar.r + ((Float) obj).floatValue());
        } else if (i == 1) {
            gre greVar2 = this.a.f;
            greVar2.c(greVar2.q + ((Float) obj).floatValue());
        } else {
            grc grcVar = this.a;
            gre greVar3 = grcVar.f;
            greVar3.d(greVar3.u.centerX() + (grcVar.f.getMeasuredWidth() * ((Float) obj).floatValue()));
        }
    }
}
