package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: wtw  reason: default package */
/* loaded from: classes7.dex */
public class wtw {
    public static final gen a(drgz drgzVar, @dzsi String str) {
        wtx wtxVar = new wtx();
        Bundle bundle = new Bundle();
        dsuv.d(bundle, "fare_breakdown", drgzVar);
        bundle.putString("disclaimer", str);
        wtxVar.B(bundle);
        return wtxVar;
    }
}
