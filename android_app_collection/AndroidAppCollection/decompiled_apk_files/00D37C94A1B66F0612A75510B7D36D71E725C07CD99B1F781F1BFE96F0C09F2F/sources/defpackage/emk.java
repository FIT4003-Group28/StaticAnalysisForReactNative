package defpackage;
/* compiled from: PG */
/* renamed from: emk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class emk implements ayqb {
    public final /* synthetic */ eml a;
    private final /* synthetic */ int b;

    public /* synthetic */ emk(eml emlVar, int i) {
        this.b = i;
        this.a = emlVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            eml emlVar = this.a;
            ahic ahicVar = (ahic) obj;
            emlVar.c(!emlVar.a.c().booleanValue());
            return;
        }
        this.a.d(eml.e(bahu.b(((ahhx) obj).e())));
    }
}
