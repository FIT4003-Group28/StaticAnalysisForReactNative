package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: awqy  reason: default package */
/* loaded from: classes3.dex */
final class awqy {
    public final boolean a;
    public boolean b;
    @dzsi
    public GmmLocation c;
    final /* synthetic */ awqz e;
    private final Runnable f = new awqw(this);
    public final Runnable d = new awqx(this);

    public awqy(awqz awqzVar, boolean z) {
        this.e = awqzVar;
        this.a = z;
    }

    public final synchronized void a() {
        this.b = true;
    }

    public final synchronized void b() {
        if (this.b) {
            return;
        }
        this.e.c.b(this.f, bvrj.BACKGROUND_THREADPOOL);
    }
}
