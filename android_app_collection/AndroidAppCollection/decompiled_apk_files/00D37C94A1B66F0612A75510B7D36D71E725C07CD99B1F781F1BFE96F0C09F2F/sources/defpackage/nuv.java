package defpackage;
/* compiled from: PG */
/* renamed from: nuv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nuv implements ayqb {
    public final /* synthetic */ nuw a;
    private final /* synthetic */ int b;

    public /* synthetic */ nuv(nuw nuwVar, int i) {
        this.b = i;
        this.a = nuwVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            nuw nuwVar = this.a;
            boolean z = ((Integer) obj).intValue() == 3;
            if (nuwVar.s == z) {
                return;
            }
            nuwVar.s = z;
            nuwVar.h = true;
            nuwVar.F(nuwVar.i, false, false);
            return;
        }
        this.a.e.set(((zaw) obj).a.a);
    }
}
