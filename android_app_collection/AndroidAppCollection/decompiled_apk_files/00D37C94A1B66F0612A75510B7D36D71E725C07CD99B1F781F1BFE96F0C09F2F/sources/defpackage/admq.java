package defpackage;
/* compiled from: PG */
/* renamed from: admq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class admq implements ayqb {
    public final /* synthetic */ admw a;
    private final /* synthetic */ int b;

    public /* synthetic */ admq(admw admwVar, int i) {
        this.b = i;
        this.a = admwVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            admw admwVar = this.a;
            advw advwVar = (advw) obj;
            admwVar.f = advwVar;
            adii b = admwVar.g.b();
            ylx.i(advwVar.a(b), new admp(admwVar, b));
            return;
        }
        this.a.g = (adik) obj;
    }
}
