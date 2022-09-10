package defpackage;
/* compiled from: PG */
/* renamed from: aflk  reason: default package */
/* loaded from: classes2.dex */
public final class aflk {
    public final dbty<dcdn<drrb, dktk>> a;
    public final dxio<aedv> b;
    public final acyp c;
    public final dxio<qbt> d;

    public aflk(final acyp acypVar, dxio<aedv> dxioVar, dxio<qbt> dxioVar2) {
        this.b = dxioVar;
        this.c = acypVar;
        this.d = dxioVar2;
        this.a = dbud.a(new dbty(acypVar) { // from class: afli
            private final acyp a;

            {
                this.a = acypVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyp acypVar2 = this.a;
                dcdg p = dcdn.p();
                p.f(drrb.EXPLORE, dktk.EXPLORE);
                p.f(drrb.COMMUTE, dktk.COMMUTE);
                if (acypVar2.b()) {
                    p.f(drrb.CONTRIBUTE, dktk.CONTRIBUTE);
                }
                p.f(drrb.SAVED_LISTS, dktk.SAVED_LISTS);
                if (acypVar2.a()) {
                    p.f(drrb.LOCAL_STREAM, dktk.UPDATES);
                } else {
                    p.f(drrb.LOCAL_STREAM, dktk.FEED);
                }
                return p.b();
            }
        });
    }
}
