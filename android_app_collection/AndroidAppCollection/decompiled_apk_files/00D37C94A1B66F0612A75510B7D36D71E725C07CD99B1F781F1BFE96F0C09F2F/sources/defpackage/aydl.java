package defpackage;
/* compiled from: PG */
/* renamed from: aydl  reason: default package */
/* loaded from: classes2.dex */
final class aydl implements Runnable {
    final aydj a;
    final /* synthetic */ String b;
    final /* synthetic */ ayat c;
    final /* synthetic */ ayax d;
    final /* synthetic */ aymk e;
    final /* synthetic */ axyd f;
    final /* synthetic */ aydm g;

    public aydl(aydm aydmVar, String str, ayat ayatVar, ayax ayaxVar, aymk aymkVar, axyd axydVar) {
        this.g = aydmVar;
        this.b = str;
        this.c = ayatVar;
        this.d = ayaxVar;
        this.e = aymkVar;
        this.f = axydVar;
        this.a = new aydj(str, aydmVar.a, aydmVar.e, ayatVar, aydmVar, this, aydmVar.c, aydmVar.f, ayaxVar, aymkVar, axydVar, aydmVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.c) {
            aydm aydmVar = this.g;
            if (aydmVar.h) {
                this.a.p.f(aydmVar.i, true, new ayat());
            } else if (aydmVar.j) {
                aydj aydjVar = this.a;
                aydmVar.d.add(aydjVar);
                aydjVar.p.z.o = aydmVar.k;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
