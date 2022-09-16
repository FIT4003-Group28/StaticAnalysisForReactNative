package defpackage;

import android.content.Intent;
/* renamed from: afix  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class afix implements dbsl {
    static final dbsl a = new afix();

    private afix() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Intent intent = (Intent) obj;
        return intent != null && "com.google.android.apps.gmm.ACTION_ENSURE_CORRECT_LOGIN_STATUS_THEN_CONTINUE".equals(intent.getAction()) && intent.hasExtra("WRAPPED_INTENT") && intent.hasExtra("TARGET_USER_OBFUSCATED_GAIA_ID");
    }
}
