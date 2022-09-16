package defpackage;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aenz  reason: default package */
/* loaded from: classes.dex */
public class aenz implements aeof, aeoe {
    protected final aeof a;
    private aeoe b;

    public aenz(aeof aeofVar) {
        this.a = aeofVar;
        ((aeoa) aeofVar).a = this;
    }

    @Override // defpackage.aeof
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.aeof
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.aeof
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.aeoe
    public final void d(aeof aeofVar) {
        aeoe aeoeVar = this.b;
        if (aeoeVar != null) {
            aeoeVar.d(this);
        }
    }

    @Override // defpackage.aeoe
    public final void e(aeof aeofVar, int i, int i2) {
        aeoe aeoeVar = this.b;
        if (aeoeVar != null) {
            aeoeVar.e(this, i, i2);
        }
    }

    @Override // defpackage.aeof
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.aeof
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.aeof
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.aeof
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.aeof
    public final void j(long j) {
        this.a.j(j);
    }

    @Override // defpackage.aeof
    public final void k(int i) {
        this.a.k(i);
    }

    @Override // defpackage.aeof
    public void l(Context context, Uri uri, Map map, PlayerConfigModel playerConfigModel) {
        throw null;
    }

    @Override // defpackage.aeof
    public final void m(SurfaceHolder surfaceHolder) {
        this.a.m(surfaceHolder);
    }

    @Override // defpackage.aeof
    public final void n(aeoe aeoeVar) {
        this.b = aeoeVar;
    }

    @Override // defpackage.aeof
    public final void o(PlaybackParams playbackParams) {
        this.a.o(playbackParams);
    }

    @Override // defpackage.aeof
    public final void p(Surface surface) {
        this.a.p(surface);
    }

    @Override // defpackage.aeof
    public final void q(float f, float f2) {
        this.a.q(f, f2);
    }

    @Override // defpackage.aeof
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.aeoe
    public final void s(int i) {
        aeoe aeoeVar = this.b;
        if (aeoeVar != null) {
            aeoeVar.s(i);
        }
    }

    @Override // defpackage.aeoe
    public final void t() {
        aeoe aeoeVar = this.b;
        if (aeoeVar != null) {
            aeoeVar.t();
        }
    }

    @Override // defpackage.aeoe
    public final boolean u(int i, int i2) {
        aeoe aeoeVar = this.b;
        if (aeoeVar != null) {
            return aeoeVar.u(i, i2);
        }
        return false;
    }

    @Override // defpackage.aeoe
    public final void v(int i, int i2) {
        aeoe aeoeVar = this.b;
        if (aeoeVar != null) {
            aeoeVar.v(i, i2);
        }
    }

    @Override // defpackage.aeoe
    public final void w() {
        aeoe aeoeVar = this.b;
        if (aeoeVar != null) {
            aeoeVar.w();
        }
    }
}
