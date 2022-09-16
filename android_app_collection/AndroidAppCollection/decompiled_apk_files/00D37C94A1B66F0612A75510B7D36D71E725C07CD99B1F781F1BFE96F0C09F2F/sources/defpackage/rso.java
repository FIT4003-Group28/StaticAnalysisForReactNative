package defpackage;

import android.os.Bundle;
import android.util.Log;
/* compiled from: PG */
/* renamed from: rso  reason: default package */
/* loaded from: classes4.dex */
public final class rso extends rsl {
    public final qvd a;

    public rso(qvd qvdVar) {
        this.a = qvdVar;
    }

    @Override // defpackage.rsl
    public final void c(int i, Bundle bundle) {
        if (i != 0) {
            String c = rug.c();
            if (!Log.isLoggable(c, 5)) {
                return;
            }
            Log.w(c, "Non-success data changed callback received.");
            return;
        }
        qvd qvdVar = this.a;
        bundle.getString("account");
        bundle.getString("pagegaiaid");
        bundle.getInt("scope");
        qvdVar.b(new rsn());
    }
}
