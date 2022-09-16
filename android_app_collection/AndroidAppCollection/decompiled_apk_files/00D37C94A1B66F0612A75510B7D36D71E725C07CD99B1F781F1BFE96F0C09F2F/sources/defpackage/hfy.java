package defpackage;

import com.google.android.libraries.youtube.player.ui.PlayerView;
/* compiled from: PG */
/* renamed from: hfy  reason: default package */
/* loaded from: classes3.dex */
public final class hfy implements hfx {
    private final hew a;
    private final hfn b;
    private long c;

    public hfy(hew hewVar, hfn hfnVar) {
        this.a = hewVar;
        this.b = hfnVar;
    }

    @Override // defpackage.hfx
    public final void a(long j) {
        this.c = j;
        this.a.c(j);
    }

    @Override // defpackage.hfx
    public final void b() {
        this.a.f(false);
        this.a.g(true);
        this.b.i(this.c);
    }

    @Override // defpackage.hfx
    public final void c() {
        this.a.g(false);
        this.a.e(1.0f);
        this.a.f(true);
        this.a.i();
    }

    @Override // defpackage.hfx
    public final void d(long j) {
        long j2 = this.a.j();
        long j3 = this.c;
        if (j2 >= j + j3) {
            this.a.c(j3);
        }
    }

    @Override // defpackage.hfx
    public final void e() {
        this.a.b();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void f(PlayerView playerView) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean g() {
        return true;
    }
}
