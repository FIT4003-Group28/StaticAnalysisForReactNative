package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afog  reason: default package */
/* loaded from: classes2.dex */
public final class afog implements afks {
    private final afof a;

    public afog(afof afofVar) {
        dbsk.s(afofVar);
        this.a = afofVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        duqk duqkVar = duqpVar.b;
        if (duqkVar == null) {
            duqkVar = duqk.d;
        }
        duqi b = duqi.b(duqkVar.b);
        if (b == null) {
            b = duqi.ERROR;
        }
        String str = duqkVar.c;
        if ((duqkVar.a & 2) == 0 || str.isEmpty()) {
            throw new afkt("No redirection url in response.");
        }
        if (b == duqi.URL_REDIRECTION_BROWSER || b == duqi.URL_REDIRECTION_WEBVIEW) {
            return this.a.a(str, b);
        }
        throw new afkt("Wrong action type.");
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_WEBVIEW;
    }
}
