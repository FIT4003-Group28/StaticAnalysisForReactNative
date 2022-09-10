package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnm  reason: default package */
/* loaded from: classes2.dex */
public final class afnm implements afks {
    private final aflh a;

    public afnm(aflh aflhVar) {
        dbsk.s(aflhVar);
        this.a = aflhVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        duqk duqkVar = duqpVar.b;
        if (duqkVar == null) {
            duqkVar = duqk.d;
        }
        String str = duqkVar.c;
        duqk duqkVar2 = duqpVar.b;
        if (duqkVar2 == null) {
            duqkVar2 = duqk.d;
        }
        if ((duqkVar2.a & 2) == 0 || str.isEmpty()) {
            throw new afkt("No mfe url in response.");
        }
        return new aflg(this.a, str);
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_HANDLE_MFE_URL;
    }
}
