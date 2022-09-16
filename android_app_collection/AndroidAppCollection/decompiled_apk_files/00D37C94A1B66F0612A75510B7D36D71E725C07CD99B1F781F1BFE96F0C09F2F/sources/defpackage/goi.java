package defpackage;
/* compiled from: PG */
/* renamed from: goi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class goi implements zdt {
    public final /* synthetic */ goj a;
    public final /* synthetic */ apzg b;
    private final /* synthetic */ int c;

    public /* synthetic */ goi(goj gojVar, apzg apzgVar) {
        this.a = gojVar;
        this.b = apzgVar;
    }

    public /* synthetic */ goi(goj gojVar, apzg apzgVar, int i) {
        this.c = i;
        this.a = gojVar;
        this.b = apzgVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            goj gojVar = this.a;
            Void r4 = (Void) obj;
            gojVar.b.a(this.b);
            gojVar.a.c();
            return;
        }
        goj gojVar2 = this.a;
        apzg apzgVar = this.b;
        zep.d("Error unlinking account", (Throwable) obj);
        gojVar2.b.a(apzgVar);
        gojVar2.a.c();
    }
}
