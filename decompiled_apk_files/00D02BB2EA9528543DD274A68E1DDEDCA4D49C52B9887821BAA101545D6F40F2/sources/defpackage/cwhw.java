package defpackage;

import android.content.Context;
import android.os.UserManager;
/* compiled from: PG */
/* renamed from: cwhw  reason: default package */
/* loaded from: classes5.dex */
public final class cwhw {
    public static boolean a(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager == null || !userManager.hasUserRestriction("no_modify_accounts");
    }
}
