package defpackage;
/* compiled from: PG */
/* renamed from: ailz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ailz implements ayqb {
    public final /* synthetic */ agp a;
    private final /* synthetic */ int b;

    public /* synthetic */ ailz(agp agpVar, int i) {
        this.b = i;
        this.a = agpVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.c(obj);
        } else if (i == 1) {
            this.a.d((Throwable) obj);
        } else {
            this.a.d((Throwable) obj);
        }
    }
}
