package defpackage;

import com.google.android.youtube.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adhl  reason: default package */
/* loaded from: classes.dex */
public final class adhl implements aino {
    private final ainz a;
    private final azqb b;
    private final /* synthetic */ int c;

    public adhl(ainz ainzVar, azqb azqbVar) {
        this.a = ainzVar;
        this.b = azqbVar;
    }

    public adhl(ainz ainzVar, azqb azqbVar, int i) {
        this.c = i;
        this.a = ainzVar;
        this.b = azqbVar;
    }

    private final boolean l() {
        return ((adoa) this.b.get()).m();
    }

    private final boolean m() {
        return ((xes) this.b.get()).c == 1;
    }

    @Override // defpackage.aino
    public final /* synthetic */ ampq c() {
        return this.c != 0 ? amon.a : amon.a;
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
    public final Set e() {
        if (this.c == 0) {
            return this.a.e();
        }
        return this.a.e();
    }

    @Override // defpackage.aino
    public final /* synthetic */ boolean i(String str) {
        if (this.c == 0) {
            return airu.d(this, str);
        }
        return airu.d(this, str);
    }

    @Override // defpackage.aino
    public final boolean j() {
        if (this.c != 0) {
            return !m();
        }
        l();
        return true;
    }

    @Override // defpackage.aino
    public final boolean k() {
        return this.c != 0 ? !m() : !l();
    }

    @Override // defpackage.aino
    public final int a() {
        if (this.c == 0) {
            return l() ? R.drawable.ic_notifications_pause_disabled : this.a.a();
        } else if (!m()) {
            return this.a.a();
        } else {
            return 0;
        }
    }

    @Override // defpackage.aino
    public final int b() {
        if (this.c == 0) {
            return l() ? R.string.playback_control_play_pause : this.a.b();
        } else if (!m()) {
            return this.a.b();
        } else {
            return 0;
        }
    }

    @Override // defpackage.aino
    public final String d() {
        return this.c != 0 ? m() ? "noop" : this.a.d() : l() ? "noop" : this.a.d();
    }
}
