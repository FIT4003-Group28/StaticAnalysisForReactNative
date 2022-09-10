package defpackage;
/* compiled from: PG */
/* renamed from: gek  reason: default package */
/* loaded from: classes6.dex */
public final class gek {
    public final fd a;
    public final jkf b;
    @dzsi
    public jjn c;

    public gek(ff ffVar, fd fdVar, jkf jkfVar) {
        this.a = fdVar;
        this.b = jkfVar;
        ffVar.g().am(new gej(this), false);
    }

    public final jjn a(jjn jjnVar) {
        jjn jjnVar2 = this.c;
        this.c = null;
        return jjnVar2 != null ? jjnVar2 : jjnVar;
    }

    public final jjn b() {
        jjn jjnVar = this.c;
        return jjnVar != null ? jjnVar : this.b.l().L();
    }

    public final void c() {
        this.c = null;
    }
}
