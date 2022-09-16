package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: adg  reason: default package */
/* loaded from: classes.dex */
public class adg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }

    public void b() {
    }

    public void c(CharSequence charSequence) {
    }

    public void d() {
    }
}
