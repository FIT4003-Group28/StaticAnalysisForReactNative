package defpackage;
/* compiled from: PG */
/* renamed from: ciac  reason: default package */
/* loaded from: classes4.dex */
final class ciac extends abm {
    @dzsi
    public chyv c = null;

    @dzsi
    private static chyv c(chyv chyvVar) {
        if (chyvVar.b()) {
            return chyvVar;
        }
        for (chyv chyvVar2 : chyvVar.d()) {
            chyv c = c(chyvVar2);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    @Override // defpackage.abm
    public final void a(acl aclVar) {
        super.a(aclVar);
        cqkp i = cqkx.i(aclVar.a);
        if (i instanceof chyv) {
            this.c = (chyv) i;
        }
    }

    @dzsi
    public final chyv b() {
        chyv chyvVar = this.c;
        if (chyvVar == null) {
            return null;
        }
        return c(chyvVar);
    }
}
