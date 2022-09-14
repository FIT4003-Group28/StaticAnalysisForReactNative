package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: cckc  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cckc implements cqjb {
    static final cqjb a = new cckc();

    private cckc() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int b;
        ccid ccidVar = (ccid) cqkpVar;
        if (!cqhl.a(context)) {
            b = iva.c(R.color.qu_amber_400, R.color.quantum_amber500).b(context);
        } else {
            b = irg.a().b(context);
        }
        return Integer.valueOf(b);
    }
}
