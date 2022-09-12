package defpackage;

import android.app.Notification;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ia  reason: default package */
/* loaded from: classes.dex */
public final class ia extends ih {
    private CharSequence a;

    @Override // defpackage.ih
    protected final String a() {
        return "android.support.v4.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.ih
    public final void b(hw hwVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((ii) hwVar).a).setBigContentTitle(this.e).bigText(this.a);
        if (this.g) {
            bigText.setSummaryText(this.f);
        }
    }

    @Override // defpackage.ih
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.putCharSequence("android.bigText", this.a);
    }

    @Override // defpackage.ih
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.a = bundle.getCharSequence("android.bigText");
    }

    public final void e(CharSequence charSequence) {
        this.a = ib.c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = ib.c(charSequence);
    }

    public final void g(CharSequence charSequence) {
        this.f = ib.c(charSequence);
        this.g = true;
    }
}
