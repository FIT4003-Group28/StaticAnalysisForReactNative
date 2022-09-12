package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: hz  reason: default package */
/* loaded from: classes6.dex */
public final class hz extends ih {
    public Bitmap a;
    private Bitmap b;
    private boolean c;

    @Override // defpackage.ih
    protected final String a() {
        return "android.support.v4.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.ih
    public final void b(hw hwVar) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((ii) hwVar).a).setBigContentTitle(this.e).bigPicture(this.a);
        if (this.c) {
            bigPicture.bigLargeIcon(this.b);
        }
        if (this.g) {
            bigPicture.setSummaryText(this.f);
        }
    }

    @Override // defpackage.ih
    public final void c(Bundle bundle) {
        super.c(bundle);
        if (this.c) {
            bundle.putParcelable("android.largeIcon.big", this.b);
        }
        bundle.putParcelable("android.picture", this.a);
    }

    @Override // defpackage.ih
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.b = (Bitmap) bundle.getParcelable("android.largeIcon.big");
            this.c = true;
        }
        this.a = (Bitmap) bundle.getParcelable("android.picture");
    }

    public final void e(Bitmap bitmap) {
        this.b = bitmap;
        this.c = true;
    }

    public final void f(CharSequence charSequence) {
        this.e = ib.c(charSequence);
    }

    public final void g(CharSequence charSequence) {
        this.f = ib.c(charSequence);
        this.g = true;
    }
}
