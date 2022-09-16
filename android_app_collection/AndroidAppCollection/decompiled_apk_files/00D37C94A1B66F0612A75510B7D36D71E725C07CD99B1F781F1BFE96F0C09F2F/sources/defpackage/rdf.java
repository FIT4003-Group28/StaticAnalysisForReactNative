package defpackage;
/* compiled from: PG */
/* renamed from: rdf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rdf implements ruw {
    public final /* synthetic */ rvh a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdf(rvh rvhVar, int i) {
        this.b = i;
        this.a = rvhVar;
    }

    @Override // defpackage.ruw
    public final void c(Exception exc) {
        if (this.b == 0) {
            this.a.c(exc);
        } else {
            this.a.b(null);
        }
    }
}
