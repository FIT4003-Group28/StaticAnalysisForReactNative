package defpackage;
/* compiled from: PG */
/* renamed from: rhx  reason: default package */
/* loaded from: classes7.dex */
public final class rhx {
    public dbsg<rij> a;
    final /* synthetic */ rhy b;

    public rhx(rhy rhyVar, dbsg<dnli> dbsgVar) {
        this.b = rhyVar;
        final rik rikVar = rhyVar.a;
        rikVar.getClass();
        this.a = dbsgVar.h(new dbrn(rikVar) { // from class: rhw
            private final rik a;

            {
                this.a = rikVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a((dnli) obj);
            }
        });
    }

    public final rij a() {
        if (this.a.a()) {
            return this.a.b();
        }
        rij a = this.b.a.a(dnli.c);
        this.a = dbsg.i(a);
        return a;
    }
}
