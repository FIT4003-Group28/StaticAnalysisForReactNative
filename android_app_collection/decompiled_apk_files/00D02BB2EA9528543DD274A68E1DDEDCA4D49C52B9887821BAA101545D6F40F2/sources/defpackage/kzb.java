package defpackage;
/* compiled from: PG */
/* renamed from: kzb  reason: default package */
/* loaded from: classes7.dex */
public final class kzb implements araa {
    @dzsi
    public aqzz a;
    private final amzi b;

    public kzb(amzi amziVar) {
        this.b = amziVar;
    }

    @Override // defpackage.araa
    public final void a(aqzz aqzzVar) {
        this.a = aqzzVar;
        aqzzVar.a(this.b);
    }

    @Override // defpackage.araa
    public final void b() {
        aqzz aqzzVar = this.a;
        dbsk.s(aqzzVar);
        aqzzVar.b();
        this.a = null;
    }
}
