package defpackage;
/* compiled from: PG */
/* renamed from: darl  reason: default package */
/* loaded from: classes5.dex */
public final class darl {
    final /* synthetic */ dasc a;
    final /* synthetic */ darn b;
    final /* synthetic */ darl c;

    public darl(darn darnVar, darl darlVar, dasc dascVar) {
        this.b = darnVar;
        this.c = darlVar;
        this.a = dascVar;
    }

    public final void a(dasf dasfVar) {
        darl darlVar = this.c;
        if (darlVar != null) {
            darlVar.a(dasfVar);
        }
        if (dasfVar.b() || !this.a.l) {
            return;
        }
        throw this.b.c(dasfVar);
    }
}
