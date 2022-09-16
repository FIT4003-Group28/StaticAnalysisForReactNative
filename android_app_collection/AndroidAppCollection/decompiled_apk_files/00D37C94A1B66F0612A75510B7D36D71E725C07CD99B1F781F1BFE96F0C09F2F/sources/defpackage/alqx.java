package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: alqx  reason: default package */
/* loaded from: classes.dex */
public final class alqx extends alrw {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alqx(Context context) {
        super(new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
        new alrz("AppUpdateListenerRegistry");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alrw
    public final void a(Context context, Intent intent) {
        if (context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            for (String str : intent.getExtras().keySet()) {
                intent.getExtras().get(str);
            }
            intent.getIntExtra("install.status", 0);
            intent.getIntExtra("error.code", 0);
            d(new alrr(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name")));
            return;
        }
        intent.getStringExtra("package.name");
    }
}
