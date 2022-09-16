package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qsq  reason: default package */
/* loaded from: classes4.dex */
public final class qsq extends Exception {
    private final afw a;

    public qsq(afw afwVar) {
        this.a = afwVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (qtp qtpVar : this.a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.a.get(qtpVar);
            qnm.b(connectionResult);
            z &= !connectionResult.c();
            String a = qtpVar.a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(a.length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
