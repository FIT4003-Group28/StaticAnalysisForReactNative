package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: cuin  reason: default package */
/* loaded from: classes5.dex */
public final class cuin implements cuim {
    private final CronetEngine a;

    public cuin(CronetEngine cronetEngine) {
        this.a = cronetEngine;
    }

    @Override // defpackage.cuim
    public final dyeu a(Context context, aqan aqanVar, String str, int i) {
        cxju.b(context);
        dyjw a = dyjw.a(str, i, this.a);
        if (aqanVar != null) {
            cstl.a("CronetChannelBuilder");
            a.p(csvl.b(aqanVar, context));
        } else {
            cstl.a("CronetChannelBuilder");
            a.p(csvl.a(context));
        }
        return a.c();
    }
}
