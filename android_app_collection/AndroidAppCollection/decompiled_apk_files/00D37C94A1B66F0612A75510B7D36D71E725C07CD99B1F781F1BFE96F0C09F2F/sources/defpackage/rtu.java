package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: rtu  reason: default package */
/* loaded from: classes4.dex */
final class rtu extends tzc {
    @Override // defpackage.tzc
    public final /* bridge */ /* synthetic */ qsn b(Context context, Looper looper, qwu qwuVar, Object obj, qsv qsvVar, qsw qswVar) {
        rtz rtzVar = (rtz) obj;
        rtz rtzVar2 = qwuVar.g;
        Integer num = qwuVar.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", qwuVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new rud(context, looper, qwuVar, bundle, qsvVar, qswVar);
    }
}
