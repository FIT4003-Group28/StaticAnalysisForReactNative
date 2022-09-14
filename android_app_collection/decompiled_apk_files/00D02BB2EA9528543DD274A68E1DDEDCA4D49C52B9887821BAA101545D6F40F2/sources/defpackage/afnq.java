package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnq  reason: default package */
/* loaded from: classes2.dex */
public final class afnq implements afks {
    private final aflr a;

    public afnq(aflr aflrVar) {
        dbsk.s(aflrVar);
        this.a = aflrVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        durh durhVar = duqpVar.l;
        if (durhVar == null) {
            durhVar = durh.e;
        }
        if ((durhVar.a & 1) == 0) {
            throw new afkt("No scene in response.");
        }
        aflr aflrVar = this.a;
        durh durhVar2 = duqpVar.l;
        if (durhVar2 == null) {
            durhVar2 = durh.e;
        }
        duqr duqrVar = durhVar2.b;
        if (duqrVar == null) {
            duqrVar = duqr.g;
        }
        return new aflq(aflrVar, duqrVar);
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_MAP_VIEW;
    }
}
