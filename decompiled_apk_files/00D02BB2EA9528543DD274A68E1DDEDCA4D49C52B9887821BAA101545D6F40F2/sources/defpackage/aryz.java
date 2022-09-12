package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aryz  reason: default package */
/* loaded from: classes2.dex */
public final class aryz implements arzc {
    final /* synthetic */ arzd a;
    @dzsi
    private final cmz b;
    private final CharSequence c;
    private final CharSequence d;
    private final CharSequence e;
    private final CharSequence f;
    private final CharSequence g;
    private final CharSequence h;
    private final CharSequence i;
    @dzsi
    private final Bitmap j;

    public aryz(@dzsi arzd arzdVar, cmz cmzVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, @dzsi CharSequence charSequence7, Bitmap bitmap) {
        this.a = arzdVar;
        this.b = cmzVar;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = charSequence4;
        this.g = charSequence5;
        this.h = charSequence6;
        this.i = charSequence7;
        this.j = bitmap;
    }

    private final String g(int i, CharSequence charSequence, CharSequence charSequence2) {
        return (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence2)) ? TextUtils.isEmpty(charSequence) ? charSequence2.toString() : charSequence.toString() : this.a.c.getApplicationContext().getResources().getString(i, charSequence, charSequence2);
    }

    @Override // defpackage.arzc
    public final void a(ib ibVar, boolean z, long j, @dzsi cray crayVar, @dzsi amut amutVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ibVar.l(this.h);
            ibVar.k(this.c);
            ibVar.w(this.a.c.getApplicationContext().getResources().getString(R.string.DA_EXPANDED_NOTIFICATION_SUBTEXT, this.d, this.e, this.f));
            ibVar.B = this.a.c.getApplicationContext().getResources().getColor(R.color.nav_status_notification_background);
            ibVar.i();
            Bitmap bitmap = this.j;
            if (bitmap != null) {
                ibVar.o(bitmap);
            }
            ibVar.e(2131232581, this.a.c.getString(R.string.DA_EXIT_NAVIGATION), this.a.j);
        }
        cmz cmzVar = this.b;
        if (cmzVar != null) {
            if (z) {
                cmzVar.a = Long.valueOf(j);
                this.b.l = true;
            } else {
                cmzVar.l = false;
            }
            this.a.f.b(dpyv.NAV_RESTORE.dm);
            this.a.g.c(dpyv.NAVIGATION_STATUS.dm, ibVar, this.b);
        }
        if (crayVar != null) {
            this.a.i.a().q().j(crayVar, amutVar);
        }
    }

    @Override // defpackage.arzc
    public final boolean b() {
        return true;
    }

    @Override // defpackage.arzc
    public final void c(RemoteViews remoteViews) {
        remoteViews.setTextViewText(R.id.nav_title, this.h);
        remoteViews.setViewVisibility(R.id.nav_title, true != TextUtils.isEmpty(this.h) ? 0 : 8);
        remoteViews.setTextViewText(R.id.nav_description, this.c);
        remoteViews.setViewVisibility(R.id.nav_description, true != TextUtils.isEmpty(this.c) ? 0 : 8);
        if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) {
            remoteViews.setViewVisibility(R.id.nav_time, 8);
            return;
        }
        remoteViews.setViewVisibility(R.id.nav_time, 0);
        remoteViews.setTextViewText(R.id.nav_time, this.a.c.getApplicationContext().getResources().getString(R.string.DA_EXPANDED_NOTIFICATION_SUBTEXT, this.d, this.e, this.f));
    }

    @Override // defpackage.arzc
    public final void d(RemoteViews remoteViews) {
        remoteViews.setTextViewText(R.id.heads_up_distance, this.h);
        remoteViews.setTextViewText(R.id.heads_up_location, this.g);
    }

    @Override // defpackage.arzc
    public final void e(ib ibVar) {
        CharSequence g = g(R.string.DA_LOCKSCREEN_NOTIFICATION_DIRECTIONS, this.h, this.g);
        if (TextUtils.isEmpty(g)) {
            g = this.c;
        }
        ibVar.l(g);
        ibVar.k(g(R.string.DA_LOCKSCREEN_NOTIFICATION_SUBTEXT, this.i, this.f));
    }

    @Override // defpackage.arzc
    public final void f(RemoteViews remoteViews) {
        CharSequence g = g(R.string.DA_LOCKSCREEN_NOTIFICATION_DIRECTIONS, this.h, this.g);
        if (TextUtils.isEmpty(g)) {
            g = this.c;
        }
        remoteViews.setTextViewText(R.id.lockscreen_directions, g);
        remoteViews.setTextViewText(R.id.lockscreen_eta, g(R.string.DA_LOCKSCREEN_NOTIFICATION_SUBTEXT, this.i, this.f));
        remoteViews.setViewVisibility(R.id.lockscreen_directions, 0);
        remoteViews.setViewVisibility(R.id.lockscreen_eta, 0);
        remoteViews.setViewVisibility(R.id.lockscreen_oneliner, 8);
    }
}
