package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afng  reason: default package */
/* loaded from: classes2.dex */
public final class afng implements afks {
    private final afkx a;

    public afng(afkx afkxVar) {
        dbsk.s(afkxVar);
        this.a = afkxVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        dhjx dhjxVar;
        durh durhVar = duqpVar.l;
        if (durhVar == null) {
            durhVar = durh.e;
        }
        duqr duqrVar = durhVar.b;
        if (duqrVar == null) {
            duqrVar = duqr.g;
        }
        afkx afkxVar = this.a;
        if ((duqrVar.a & 1) != 0) {
            dhjxVar = duqrVar.b;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
        } else {
            dhjxVar = null;
        }
        duqa duqaVar = duqpVar.t;
        if (duqaVar == null) {
            duqaVar = duqa.b;
        }
        return new afkw(afkxVar, dhjxVar, duqaVar);
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_ADD_A_PLACE;
    }
}
