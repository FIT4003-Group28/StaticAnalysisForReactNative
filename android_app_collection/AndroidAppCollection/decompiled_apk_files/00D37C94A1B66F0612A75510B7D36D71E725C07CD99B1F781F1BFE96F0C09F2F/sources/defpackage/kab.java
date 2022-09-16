package defpackage;
/* compiled from: PG */
/* renamed from: kab  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kab implements ayqb {
    public final /* synthetic */ kad a;
    private final /* synthetic */ int b;

    public /* synthetic */ kab(kad kadVar, int i) {
        this.b = i;
        this.a = kadVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            kad kadVar = this.a;
            kadVar.c = ((Boolean) obj).booleanValue();
            kadVar.c();
            return;
        }
        kad kadVar2 = this.a;
        kadVar2.b = ((Boolean) obj).booleanValue();
        kadVar2.c();
    }
}
