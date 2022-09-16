package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aagv  reason: default package */
/* loaded from: classes2.dex */
public final class aagv {
    private final bwqv a;

    public aagv(bwqv bwqvVar) {
        this.a = bwqvVar;
    }

    public final aagx a(aaao aaaoVar, @dzsi diwb diwbVar) {
        dbsk.s(aaaoVar.a());
        dbsk.s(aaaoVar.b());
        aagx aagxVar = new aagx();
        Bundle bundle = new Bundle();
        if (diwbVar != null) {
            bvrs.l(bundle, diwbVar);
        }
        this.a.c(bundle, "option", bwrs.a(aaaoVar));
        aagxVar.B(bundle);
        aagxVar.an = aaaoVar;
        return aagxVar;
    }
}
