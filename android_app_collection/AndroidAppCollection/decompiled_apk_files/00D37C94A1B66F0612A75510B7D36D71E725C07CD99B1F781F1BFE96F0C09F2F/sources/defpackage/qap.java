package defpackage;

import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: qap  reason: default package */
/* loaded from: classes4.dex */
public final class qap {
    public final qag a;
    public final qaf b;
    public qfv c;

    public qap(qag qagVar, qaf qafVar) {
        this.a = qagVar;
        this.b = qafVar;
    }

    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        qar.c();
        qga.i(context, qar.b().a, bundle);
    }

    public static final qfm b(Context context, qeo qeoVar) {
        return (qfm) new qak(context, qeoVar).d(context);
    }
}
