package defpackage;
/* compiled from: PG */
/* renamed from: nsi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nsi implements ayqb {
    public final /* synthetic */ nsj a;
    private final /* synthetic */ int b;

    public /* synthetic */ nsi(nsj nsjVar, int i) {
        this.b = i;
        this.a = nsjVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.o = (nsr) obj;
        } else if (i == 1) {
            this.a.n = ((Integer) obj).intValue();
        } else {
            this.a.p = ((Boolean) obj).booleanValue();
        }
    }
}
