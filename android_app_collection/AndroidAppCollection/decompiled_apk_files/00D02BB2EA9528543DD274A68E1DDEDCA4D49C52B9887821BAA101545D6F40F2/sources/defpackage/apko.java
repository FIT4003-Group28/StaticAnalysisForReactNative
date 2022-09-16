package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: apko  reason: default package */
/* loaded from: classes2.dex */
final class apko implements awnl {
    private final apkp a;

    public apko(apkp apkpVar) {
        this.a = apkpVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.UDC_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            this.a.a(activity);
            this.a.b(activity);
        } else if (i != 0) {
        } else {
            this.a.c(activity);
        }
    }
}
