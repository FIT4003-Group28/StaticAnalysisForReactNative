package defpackage;
/* compiled from: PG */
/* renamed from: lld  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lld implements ayqb {
    public final /* synthetic */ lle a;
    private final /* synthetic */ int b;

    public /* synthetic */ lld(lle lleVar, int i) {
        this.b = i;
        this.a = lleVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            lle lleVar = this.a;
            zag.m(lleVar.d, onl.a(lleVar.a.getResources(), ((Integer) obj).intValue()));
            return;
        }
        lle lleVar2 = this.a;
        lleVar2.e(lleVar2.e, ((Boolean) obj).booleanValue());
        lleVar2.d();
    }
}
