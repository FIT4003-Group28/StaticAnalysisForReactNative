package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: aikh  reason: default package */
/* loaded from: classes.dex */
public final class aikh implements ynl {
    public FormatStreamModel a;
    private final yni b;
    private Throwable c;
    private aikg d;

    public aikh(yni yniVar) {
        this.b = yniVar;
    }

    public final synchronized int a() {
        return b().b.get();
    }

    public final synchronized aikg b() {
        aikg aikgVar;
        aikgVar = this.d;
        if (aikgVar == null) {
            throw new RuntimeException("PlaybackMonitor queried outside playback sequence", this.c);
        }
        return aikgVar;
    }

    public final String c() {
        return b().a;
    }

    public final synchronized void d() {
        aikg aikgVar = this.d;
        if (aikgVar != null) {
            this.b.m(aikgVar);
            this.d = null;
            this.c = new Throwable("currentPlaybackSequenceMonitor became null here");
        }
    }

    public final void e(boolean z) {
        b().g = z;
    }

    public final synchronized void g() {
        d();
        this.c = null;
        aikg aikgVar = new aikg();
        this.d = aikgVar;
        this.b.g(aikgVar);
    }

    public final boolean h() {
        aikg aikgVar = this.d;
        return aikgVar != null && aikgVar.g;
    }

    public final synchronized boolean i() {
        boolean z;
        aikg b = b();
        if (!b.e) {
            if (!b.a()) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized boolean j() {
        return this.d != null;
    }

    public final synchronized boolean k() {
        return b().a();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                this.a = ((aesr) obj).f();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aesr.class};
    }
}
