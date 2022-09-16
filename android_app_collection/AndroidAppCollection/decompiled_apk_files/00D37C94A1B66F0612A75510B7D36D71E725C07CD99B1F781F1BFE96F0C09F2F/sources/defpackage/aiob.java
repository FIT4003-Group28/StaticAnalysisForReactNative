package defpackage;

import com.google.android.youtube.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aiob  reason: default package */
/* loaded from: classes.dex */
public final class aiob implements aino {
    private final aizp a;
    private final aizn b;
    private final /* synthetic */ int c;

    public aiob(aizp aizpVar, aizn aiznVar) {
        this.a = aizpVar;
        this.b = aiznVar;
    }

    public aiob(aizp aizpVar, aizn aiznVar, int i) {
        this.c = i;
        this.a = aizpVar;
        this.b = aiznVar;
    }

    @Override // defpackage.aino
    public final int a() {
        if (this.c != 0) {
            if (!this.a.d) {
                return R.drawable.ic_notifications_menu_next_video_disabled;
            }
            return 2131232743;
        } else if (!this.a.c) {
            return R.drawable.ic_notifications_menu_previous_video_disabled;
        } else {
            return 2131232749;
        }
    }

    @Override // defpackage.aino
    public final int b() {
        return this.c != 0 ? R.string.playback_control_next : R.string.playback_control_previous;
    }

    @Override // defpackage.aino
    public final /* synthetic */ ampq c() {
        return this.c != 0 ? amon.a : amon.a;
    }

    @Override // defpackage.aino
    public final String d() {
        return this.c != 0 ? this.a.d ? "com.google.android.libraries.youtube.player.action.controller_notification_next" : "noop" : this.a.c ? "com.google.android.libraries.youtube.player.action.controller_notification_prev" : "noop";
    }

    @Override // defpackage.aino
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aino
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aino
    public final /* synthetic */ void h(ainn ainnVar) {
    }

    @Override // defpackage.aino
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aino
    public final boolean k() {
        return true;
    }

    @Override // defpackage.aino
    public final Set e() {
        if (this.c == 0) {
            return amvn.r("com.google.android.libraries.youtube.player.action.controller_notification_prev");
        }
        return amvn.r("com.google.android.libraries.youtube.player.action.controller_notification_next");
    }

    @Override // defpackage.aino
    public final boolean i(String str) {
        if (this.c == 0) {
            if (!"com.google.android.libraries.youtube.player.action.controller_notification_prev".equals(str)) {
                return false;
            }
            this.b.k();
            return true;
        } else if (!"com.google.android.libraries.youtube.player.action.controller_notification_next".equals(str)) {
            return false;
        } else {
            this.b.j();
            return true;
        }
    }
}
