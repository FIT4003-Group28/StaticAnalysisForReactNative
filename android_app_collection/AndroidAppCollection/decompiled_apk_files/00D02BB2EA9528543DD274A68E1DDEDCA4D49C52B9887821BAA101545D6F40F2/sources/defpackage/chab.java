package defpackage;
/* compiled from: PG */
/* renamed from: chab  reason: default package */
/* loaded from: classes4.dex */
final class chab implements jco {
    final /* synthetic */ chac a;

    public chab(chac chacVar) {
        this.a = chacVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        if (z) {
            this.a.c.m(new cjte(deaf.SWIPE), cjtd.a(dtyd.at));
            chac chacVar = this.a;
            int i2 = chacVar.d;
            if (i == i2 || i2 == -1) {
                return;
            }
            cgzz cgzzVar = chacVar.e;
            if (cgzzVar != null) {
                ((cgdv) cgzzVar).bw(i);
            }
            this.a.S(i);
        }
    }

    @Override // defpackage.jco
    public final void b(int i) {
    }
}
