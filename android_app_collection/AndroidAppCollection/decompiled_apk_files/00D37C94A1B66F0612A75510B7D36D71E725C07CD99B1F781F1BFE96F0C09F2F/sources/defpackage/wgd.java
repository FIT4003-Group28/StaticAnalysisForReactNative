package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: wgd  reason: default package */
/* loaded from: classes4.dex */
public final class wgd {
    public static final void a(aasc aascVar, String str, wfk wfkVar) {
        aascVar.a(AccountIdentity.t(str), new wgc(wfkVar), str, 6);
    }

    public static final boolean b(Context context) {
        return Build.VERSION.SDK_INT >= 23 && ((KeyguardManager) context.getSystemService("keyguard")).isDeviceSecure();
    }
}
