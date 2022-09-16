package defpackage;
/* compiled from: PG */
/* renamed from: jom  reason: default package */
/* loaded from: classes7.dex */
final class jom implements Runnable {
    final /* synthetic */ joo a;

    public jom(joo jooVar) {
        this.a = jooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        joo jooVar = this.a;
        jooVar.a.D(gfk.i(jooVar.f.getDataString(), "mail"));
        joo jooVar2 = this.a;
        if (joo.d(jooVar2.d, jooVar2.f)) {
            gga ggaVar = this.a.a;
            Integer valueOf = Integer.valueOf(dpyv.MADDEN_GROWTH.dm);
            joo jooVar3 = this.a;
            avac.bp(ggaVar, valueOf, jooVar3.c, jooVar3.b, jooVar3.d);
        }
    }
}
