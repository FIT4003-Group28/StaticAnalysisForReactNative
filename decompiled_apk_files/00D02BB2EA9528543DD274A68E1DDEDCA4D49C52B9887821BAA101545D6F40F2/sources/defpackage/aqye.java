package defpackage;
/* compiled from: PG */
/* renamed from: aqye  reason: default package */
/* loaded from: classes.dex */
public class aqye implements araa {
    public final amzi a;
    public final aqzz b;
    @dzsi
    public aqzz c;

    public aqye(amzi amziVar, aqzz aqzzVar) {
        dbsk.s(amziVar);
        this.a = amziVar;
        dbsk.s(aqzzVar);
        this.b = aqzzVar;
    }

    @Override // defpackage.araa
    public final void a(aqzz aqzzVar) {
        dbsk.s(aqzzVar);
        dbsk.l(this.c == null);
        this.b.b();
        this.c = aqzzVar;
        aqzzVar.a(this.a);
    }

    @Override // defpackage.araa
    public final void b() {
        dbsk.s(this.c);
        this.c.b();
        this.c = null;
        this.b.a(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(amzi amziVar) {
        throw null;
    }
}
