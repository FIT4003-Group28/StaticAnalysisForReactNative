package defpackage;

import com.google.android.youtube.R;
import j$.time.Duration;
import java.util.Set;
/* compiled from: PG */
/* renamed from: eod  reason: default package */
/* loaded from: classes3.dex */
public final class eod implements aino {
    private static final Duration b = Duration.ofSeconds(10);
    public Duration a = b;
    private final aizn c;

    public eod(aizn aiznVar) {
        this.c = aiznVar;
    }

    @Override // defpackage.aino
    public final int a() {
        if (this.a.getSeconds() == 10) {
            return 2131232520;
        }
        return this.a.getSeconds() == 30 ? 2131232524 : 2131232491;
    }

    @Override // defpackage.aino
    public final int b() {
        return R.string.accessibility_fast_forward;
    }

    @Override // defpackage.aino
    public final ampq c() {
        return ampq.j(actj.BACKGROUND_PLAYBACK_NOTIFICATION_SEEK_FORWARD_BUTTON);
    }

    @Override // defpackage.aino
    public final String d() {
        return "SEEK_FORWARD_NOTIFICATION_ACTION_PLUGIN";
    }

    @Override // defpackage.aino
    public final /* synthetic */ Set e() {
        return airu.c(this);
    }

    @Override // defpackage.aino
    public final void f() {
        this.c.g(this.a.toMillis());
    }

    @Override // defpackage.aino
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aino
    public final /* synthetic */ void h(ainn ainnVar) {
    }

    @Override // defpackage.aino
    public final /* synthetic */ boolean i(String str) {
        return airu.d(this, str);
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
