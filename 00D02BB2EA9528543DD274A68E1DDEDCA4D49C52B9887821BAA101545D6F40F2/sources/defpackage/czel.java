package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czel  reason: default package */
/* loaded from: classes5.dex */
public final class czel extends cyvd<cygn, cygn> {
    public final czem a = new czem(new czej(this));
    public final czem b = new czem(new czek(this));
    private final czem c;

    public czel(czem czemVar) {
        this.c = czemVar;
    }

    @Override // defpackage.cyvd
    protected final /* bridge */ /* synthetic */ void a(cygn cygnVar, cygn cygnVar2) {
        cygn cygnVar3 = cygnVar;
        cygn cygnVar4 = cygnVar2;
        if (cygnVar3.a() == cyes.SUCCESS) {
            this.c.a(cygnVar3);
        } else {
            this.c.a(cygnVar4);
        }
    }
}
