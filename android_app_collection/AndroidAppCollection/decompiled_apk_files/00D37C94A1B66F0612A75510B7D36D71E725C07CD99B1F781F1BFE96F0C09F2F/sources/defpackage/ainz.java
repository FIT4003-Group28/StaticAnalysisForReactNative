package defpackage;

import com.google.android.youtube.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ainz  reason: default package */
/* loaded from: classes.dex */
public final class ainz implements aino {
    private final aizp a;
    private final aizn b;

    public ainz(aizp aizpVar, aizn aiznVar) {
        this.a = aizpVar;
        this.b = aiznVar;
    }

    @Override // defpackage.aino
    public final int a() {
        switch (this.a.b) {
            case 0:
            case 3:
            case 4:
            case 10:
                return 2131232670;
            case 1:
            case 5:
            default:
                return R.drawable.ic_notification_play_arrow_disabled;
            case 2:
            case 9:
                return 2131232641;
            case 6:
                return R.drawable.ic_notifications_pause_disabled;
            case 7:
                return 2131232709;
            case 8:
                return 2131232481;
        }
    }

    @Override // defpackage.aino
    public final int b() {
        int i = this.a.b;
        if (i != 0) {
            if (i == 2) {
                return R.string.playback_control_pause;
            }
            if (i == 3 || i == 4) {
                return R.string.playback_control_play;
            }
            switch (i) {
                case 7:
                    return R.string.playback_control_replay;
                case 8:
                    return R.string.playback_control_retry;
                case 9:
                    return R.string.playback_control_pause;
                case 10:
                    return R.string.playback_control_play;
                default:
                    return R.string.playback_control_play_pause;
            }
        }
        return R.string.playback_control_play;
    }

    @Override // defpackage.aino
    public final /* synthetic */ ampq c() {
        return amon.a;
    }

    @Override // defpackage.aino
    public final String d() {
        int i = this.a.b;
        if (i != 0) {
            if (i == 2) {
                return "com.google.android.libraries.youtube.player.action.controller_notification_pause";
            }
            if (i == 3 || i == 4) {
                return "com.google.android.libraries.youtube.player.action.controller_notification_play";
            }
            switch (i) {
                case 7:
                    return "com.google.android.libraries.youtube.player.action.controller_notification_replay";
                case 8:
                    return "com.google.android.libraries.youtube.player.action.controller_notification_retry";
                case 9:
                    return "com.google.android.libraries.youtube.player.action.controller_notification_pause";
                case 10:
                    return "com.google.android.libraries.youtube.player.action.controller_notification_play";
                default:
                    return "noop";
            }
        }
        return "com.google.android.libraries.youtube.player.action.controller_notification_play";
    }

    @Override // defpackage.aino
    public final Set e() {
        return amvn.u("com.google.android.libraries.youtube.player.action.controller_notification_retry", "com.google.android.libraries.youtube.player.action.controller_notification_replay", "com.google.android.libraries.youtube.player.action.controller_notification_pause", "com.google.android.libraries.youtube.player.action.controller_notification_play");
    }

    @Override // defpackage.aino
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aino
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aino
    public final void h(ainn ainnVar) {
    }

    @Override // defpackage.aino
    public final boolean i(String str) {
        if ("com.google.android.libraries.youtube.player.action.controller_notification_play".equals(str)) {
            this.b.d();
            return true;
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_pause".equals(str)) {
            this.b.c();
            return true;
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_replay".equals(str)) {
            this.b.e();
            return true;
        } else if (!"com.google.android.libraries.youtube.player.action.controller_notification_retry".equals(str)) {
            return false;
        } else {
            this.b.f();
            return true;
        }
    }

    @Override // defpackage.aino
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aino
    public final boolean k() {
        return true;
    }
}
