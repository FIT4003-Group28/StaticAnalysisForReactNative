package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.Format;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: pkj  reason: default package */
/* loaded from: classes4.dex */
public final class pkj implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, pyk, pli, psp, pom, phg, pkm, pjv, phs {
    public final /* synthetic */ pkl a;

    public pkj(pkl pklVar) {
        this.a = pklVar;
    }

    @Override // defpackage.pyk
    public final void A(String str) {
        this.a.f.A(str);
    }

    @Override // defpackage.pyk
    public final void B(pms pmsVar) {
        this.a.f.B(pmsVar);
    }

    @Override // defpackage.pyk
    public final void C(pms pmsVar) {
        this.a.f.C(pmsVar);
    }

    @Override // defpackage.pyk
    public final void D(long j, int i) {
        this.a.f.D(j, i);
    }

    @Override // defpackage.pyk
    public final void E(Format format, pmw pmwVar) {
        this.a.f.E(format, pmwVar);
    }

    @Override // defpackage.pyk
    public final void F(asr asrVar) {
        this.a.f.F(asrVar);
        Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            ((pjx) it.next()).F(asrVar);
        }
    }

    @Override // defpackage.pli
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.phs
    public final void a(boolean z) {
        this.a.L();
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ae(int i) {
    }

    @Override // defpackage.pyk
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.pjv
    public final void al() {
        this.a.L();
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.phs
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.pli
    public final void c(Exception exc) {
        this.a.f.c(exc);
    }

    @Override // defpackage.pli
    public final void d(String str, long j, long j2) {
        this.a.f.d(str, j, j2);
    }

    @Override // defpackage.pli
    public final void e(String str) {
        this.a.f.e(str);
    }

    @Override // defpackage.pli
    public final void f(pms pmsVar) {
        this.a.f.f(pmsVar);
    }

    @Override // defpackage.pli
    public final void g(pms pmsVar) {
        this.a.f.g(pmsVar);
    }

    @Override // defpackage.pli
    public final void h(Format format, pmw pmwVar) {
        this.a.f.h(format, pmwVar);
    }

    @Override // defpackage.pli
    public final void i(long j) {
        this.a.f.i(j);
    }

    @Override // defpackage.pli
    public final void j(Exception exc) {
        this.a.f.j(exc);
    }

    @Override // defpackage.pli
    public final void k(int i, long j, long j2) {
        this.a.f.k(i, j, j2);
    }

    @Override // defpackage.pyk
    public final void m(int i, long j) {
        this.a.f.m(i, j);
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        pkl pklVar = this.a;
        Surface surface = new Surface(surfaceTexture);
        pklVar.J(surface);
        pklVar.j = surface;
        this.a.y(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.J(null);
        this.a.y(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.y(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void p(pjt pjtVar) {
    }

    @Override // defpackage.pjv
    public final void q(int i) {
        this.a.L();
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void r(pjr pjrVar) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void s(boolean z, int i) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.y(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.y(0, 0);
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void t(pjy pjyVar, pjy pjyVar2, int i) {
    }

    @Override // defpackage.pyk
    public final void v(Object obj, long j) {
        this.a.f.v(obj, j);
        pkl pklVar = this.a;
        if (pklVar.i == obj) {
            Iterator it = pklVar.e.iterator();
            while (it.hasNext()) {
                ((pjx) it.next()).u();
            }
        }
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.pli
    public final void x(boolean z) {
        pkl pklVar = this.a;
        if (pklVar.n == z) {
            return;
        }
        pklVar.n = z;
        pklVar.f.x(z);
        Iterator it = pklVar.e.iterator();
        while (it.hasNext()) {
            ((pjx) it.next()).x(pklVar.n);
        }
    }

    @Override // defpackage.pyk
    public final void y(Exception exc) {
        this.a.f.y(exc);
    }

    @Override // defpackage.pyk
    public final void z(String str, long j, long j2) {
        this.a.f.z(str, j, j2);
    }

    @Override // defpackage.pjv
    public final void n(boolean z) {
        pkl pklVar = this.a;
        pwx pwxVar = pklVar.p;
        if (pwxVar != null) {
            if (z) {
                if (pklVar.q) {
                    return;
                }
                pwxVar.a(0);
                this.a.q = true;
            } else if (!pklVar.q) {
            } else {
                pwxVar.c(0);
                this.a.q = false;
            }
        }
    }
}
