package defpackage;
/* compiled from: PG */
/* renamed from: bbvj  reason: default package */
/* loaded from: classes3.dex */
public final class bbvj {
    private static final dcqe d = dcqe.c("bbvj");
    @dzsi
    public final bbud a;
    public final int b;
    public final int c;

    public bbvj(akqi akqiVar, Iterable<bbtj> iterable) {
        ily ilyVar = new ily();
        ilyVar.j(akqiVar);
        this.a = bbud.c(ilyVar.d());
        this.b = dcbg.b(iterable).o(a(bbti.PHOTO)).k();
        this.c = dcbg.b(iterable).o(a(bbti.VIDEO)).k();
        b(iterable);
    }

    public bbvj(@dzsi bbud bbudVar, int i, int i2) {
        this.a = bbudVar;
        this.b = i;
        this.c = i2;
    }

    private static <T extends bbtj> dbsl<T> a(final bbti bbtiVar) {
        return new dbsl(bbtiVar) { // from class: bbvi
            private final bbti a;

            {
                this.a = bbtiVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bbtj bbtjVar = (bbtj) obj;
                return bbtjVar != null && this.a == bbtjVar.b();
            }
        };
    }

    private final void b(Iterable<bbtj> iterable) {
        int a = dcft.a(iterable);
        if (this.b + this.c != a) {
            bvoo.h("Media count error, expected %d, got %d photos and %d videos", Integer.valueOf(a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }
    }

    public bbvj(@dzsi bbud bbudVar, Iterable<bbtj> iterable) {
        this.a = bbudVar;
        this.b = dcbg.b(iterable).o(a(bbti.PHOTO)).k();
        this.c = dcbg.b(iterable).o(a(bbti.VIDEO)).k();
        b(iterable);
    }
}
