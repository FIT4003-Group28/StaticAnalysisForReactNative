package defpackage;
/* compiled from: PG */
/* renamed from: dzu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzu implements ayqb {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzu(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.c((Boolean) obj, null);
        } else if (i == 1) {
            this.a.c((Boolean) obj, null);
        } else if (i == 2) {
            this.a.c(null, (Throwable) obj);
        } else if (i == 3) {
            this.a.c(null, (Throwable) obj);
        } else {
            lbm.a((aupg) obj, this.a.c);
        }
    }
}
