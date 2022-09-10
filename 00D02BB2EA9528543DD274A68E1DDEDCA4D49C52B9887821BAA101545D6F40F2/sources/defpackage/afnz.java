package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnz  reason: default package */
/* loaded from: classes2.dex */
public final class afnz implements afks {
    private final afny a;

    public afnz(afny afnyVar) {
        dbsk.s(afnyVar);
        this.a = afnyVar;
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_SEARCH;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        int i = duqpVar.a;
        if ((i & 2) != 0) {
            if ((i & 4096) == 0) {
                afny afnyVar = this.a;
                dwir dwirVar = duqpVar.c;
                if (dwirVar == null) {
                    dwirVar = dwir.R;
                }
                return afnyVar.b(dwirVar);
            }
            afny afnyVar2 = this.a;
            dwir dwirVar2 = duqpVar.c;
            if (dwirVar2 == null) {
                dwirVar2 = dwir.R;
            }
            dwiv dwivVar = duqpVar.h;
            if (dwivVar == null) {
                dwivVar = dwiv.M;
            }
            return afnyVar2.a(dwirVar2, dwivVar);
        }
        throw new afkt("No search request in response.");
    }
}
