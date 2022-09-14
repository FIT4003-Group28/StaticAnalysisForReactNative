package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aryy  reason: default package */
/* loaded from: classes2.dex */
public final class aryy implements arzc {
    final /* synthetic */ arzd a;
    private final CharSequence b;
    private final CharSequence c = "";
    private final CharSequence d = "";

    public aryy(arzd arzdVar, CharSequence charSequence) {
        this.a = arzdVar;
        this.b = charSequence;
    }

    @Override // defpackage.arzc
    public final void a(ib ibVar, boolean z, long j, @dzsi cray crayVar, @dzsi amut amutVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ibVar.l(this.b);
            ibVar.k(this.c);
            ibVar.B = this.a.c.getApplicationContext().getResources().getColor(R.color.nav_status_notification_background);
            ibVar.i();
            if (this.a.h.a() || this.a.g.a()) {
                return;
            }
            ibVar.e(2131232581, this.a.c.getString(R.string.DA_EXIT_NAVIGATION), this.a.j);
        }
    }

    @Override // defpackage.arzc
    public final boolean b() {
        return !this.a.h.a() && !this.a.g.a();
    }

    @Override // defpackage.arzc
    public final void c(RemoteViews remoteViews) {
        remoteViews.setTextViewText(R.id.nav_title, this.b);
        int i = 0;
        remoteViews.setViewVisibility(R.id.nav_title, true != TextUtils.isEmpty(this.b) ? 0 : 8);
        remoteViews.setTextViewText(R.id.nav_description, this.c);
        if (true == TextUtils.isEmpty(this.c)) {
            i = 8;
        }
        remoteViews.setViewVisibility(R.id.nav_description, i);
        remoteViews.setViewVisibility(R.id.nav_time, 8);
    }

    @Override // defpackage.arzc
    public final void d(RemoteViews remoteViews) {
        remoteViews.setTextViewText(R.id.heads_up_distance, this.b);
        remoteViews.setTextViewText(R.id.heads_up_location, this.d);
    }

    @Override // defpackage.arzc
    public final void e(ib ibVar) {
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
            ibVar.l(TextUtils.isEmpty(this.b) ? this.c : this.b);
            return;
        }
        ibVar.l(this.b);
        ibVar.k(this.c);
    }

    @Override // defpackage.arzc
    public final void f(RemoteViews remoteViews) {
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
            remoteViews.setTextViewText(R.id.lockscreen_oneliner, TextUtils.isEmpty(this.b) ? this.c : this.b);
            remoteViews.setViewVisibility(R.id.lockscreen_directions, 8);
            remoteViews.setViewVisibility(R.id.lockscreen_eta, 8);
            remoteViews.setViewVisibility(R.id.lockscreen_oneliner, 0);
            return;
        }
        remoteViews.setTextViewText(R.id.lockscreen_directions, this.b);
        remoteViews.setTextViewText(R.id.lockscreen_eta, this.c);
        remoteViews.setViewVisibility(R.id.lockscreen_directions, 0);
        remoteViews.setViewVisibility(R.id.lockscreen_eta, 0);
        remoteViews.setViewVisibility(R.id.lockscreen_oneliner, 8);
    }
}
