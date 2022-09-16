package defpackage;

import android.app.PendingIntent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfa  reason: default package */
/* loaded from: classes2.dex */
public final class bfa implements View.OnClickListener {
    final /* synthetic */ bfl a;
    private final /* synthetic */ int b;

    public bfa(bfl bflVar) {
        this.a = bflVar;
    }

    public bfa(bfl bflVar, int i) {
        this.b = i;
        this.a = bflVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PendingIntent sessionActivity;
        PlaybackStateCompat playbackStateCompat;
        int i = this.b;
        if (i == 0) {
            ip ipVar = this.a.C;
            if (ipVar == null || (sessionActivity = ((in) ipVar.a).a.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                this.a.dismiss();
                return;
            } catch (PendingIntent.CanceledException unused) {
                Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                return;
            }
        }
        int i2 = 1;
        if (i == 1) {
            this.a.dismiss();
            return;
        }
        int i3 = 0;
        if (i != 2) {
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                if (this.a.d.m()) {
                    if (id == 16908313) {
                        i2 = 2;
                    }
                    bhd.o(i2);
                }
                this.a.dismiss();
                return;
            } else if (id != R.id.mr_control_playback_ctrl) {
                if (id != R.id.mr_close) {
                    return;
                }
                this.a.dismiss();
                return;
            } else {
                bfl bflVar = this.a;
                if (bflVar.C == null || (playbackStateCompat = bflVar.E) == null) {
                    return;
                }
                int i4 = playbackStateCompat.a;
                if (i4 != 3 || !bflVar.v()) {
                    if (i4 != 3 || !this.a.x()) {
                        if (i4 != 3 && this.a.w()) {
                            this.a.C.b().a.play();
                            i3 = R.string.mr_controller_play;
                        }
                    } else {
                        this.a.C.b().a.stop();
                        i3 = R.string.mr_controller_stop;
                    }
                } else {
                    this.a.C.b().a.pause();
                    i3 = R.string.mr_controller_pause;
                }
                AccessibilityManager accessibilityManager = this.a.V;
                if (accessibilityManager == null || !accessibilityManager.isEnabled() || i3 == 0) {
                    return;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                obtain.setPackageName(this.a.e.getPackageName());
                obtain.setClassName(getClass().getName());
                obtain.getText().add(this.a.e.getString(i3));
                this.a.V.sendAccessibilityEvent(obtain);
                return;
            }
        }
        bfl bflVar2 = this.a;
        boolean z = !bflVar2.O;
        bflVar2.O = z;
        if (z) {
            bflVar2.o.setVisibility(0);
        }
        this.a.m();
        this.a.r(true);
    }
}
