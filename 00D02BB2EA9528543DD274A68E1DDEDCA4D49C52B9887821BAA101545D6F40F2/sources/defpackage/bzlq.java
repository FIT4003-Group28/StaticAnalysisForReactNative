package defpackage;
/* compiled from: PG */
/* renamed from: bzlq  reason: default package */
/* loaded from: classes4.dex */
public final class bzlq {
    private final dxio<qbt> a;

    public bzlq(dxio<qbt> dxioVar) {
        this.a = dxioVar;
    }

    public final boolean a(@dzsi ilo iloVar, @dzsi bwrs<brln> bwrsVar, @dzsi bwrs<brlu> bwrsVar2, @dzsi dnqh dnqhVar, boolean z) {
        if (iloVar == null || !iloVar.bb() || !akqi.d(iloVar.ai())) {
            return false;
        }
        qdd i = qde.i();
        i.b(iloVar.ai());
        qau qauVar = (qau) i;
        qauVar.a = iloVar.n();
        qauVar.b = dnqhVar;
        i.c(z);
        qauVar.c = bwrsVar;
        qauVar.d = bwrsVar2;
        i.e(true);
        i.d(false);
        this.a.a().s(i.a());
        return true;
    }
}
