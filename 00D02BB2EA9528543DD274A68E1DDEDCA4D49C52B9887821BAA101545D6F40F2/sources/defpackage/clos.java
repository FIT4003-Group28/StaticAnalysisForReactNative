package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clos  reason: default package */
/* loaded from: classes5.dex */
public final class clos implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, cmoy, clrt, cmgf, cmbx, cllp, clll, clou, clof {
    final /* synthetic */ clot a;

    public clos(clot clotVar) {
        this.a = clotVar;
    }

    @Override // defpackage.clrt
    public final void A(clte clteVar) {
        Iterator<clrt> it = this.a.j.iterator();
        while (it.hasNext()) {
            it.next().A(clteVar);
        }
    }

    @Override // defpackage.clrt
    public final void B(int i) {
        clot clotVar = this.a;
        if (clotVar.p == i) {
            return;
        }
        clotVar.p = i;
        Iterator<clre> it = clotVar.e.iterator();
        while (it.hasNext()) {
            clre next = it.next();
            if (!clotVar.j.contains(next)) {
                next.B(clotVar.p);
            }
        }
        Iterator<clrt> it2 = clotVar.j.iterator();
        while (it2.hasNext()) {
            it2.next().B(clotVar.p);
        }
    }

    @Override // defpackage.clrt
    public final void C(String str, long j, long j2) {
        Iterator<clrt> it = this.a.j.iterator();
        while (it.hasNext()) {
            it.next().C(str, j, j2);
        }
    }

    @Override // defpackage.clrt
    public final void D(Format format) {
        Iterator<clrt> it = this.a.j.iterator();
        while (it.hasNext()) {
            it.next().D(format);
        }
    }

    @Override // defpackage.clrt
    public final void E(long j) {
        Iterator<clrt> it = this.a.j.iterator();
        while (it.hasNext()) {
            it.next().E(j);
        }
    }

    @Override // defpackage.clrt
    public final void F(int i, long j, long j2) {
        Iterator<clrt> it = this.a.j.iterator();
        while (it.hasNext()) {
            it.next().F(i, j, j2);
        }
    }

    @Override // defpackage.clrt
    public final void G(String str) {
        Iterator<clrt> it = this.a.j.iterator();
        while (it.hasNext()) {
            it.next().G(str);
        }
    }

    @Override // defpackage.clrt
    public final void H(clte clteVar) {
        Iterator<clrt> it = this.a.j.iterator();
        while (it.hasNext()) {
            it.next().H(clteVar);
        }
        this.a.p = 0;
    }

    @Override // defpackage.clrt
    public final void I(boolean z) {
        clot clotVar = this.a;
        if (clotVar.r == z) {
            return;
        }
        clotVar.r = z;
        Iterator<clre> it = clotVar.e.iterator();
        while (it.hasNext()) {
            clre next = it.next();
            if (!clotVar.j.contains(next)) {
                next.I(clotVar.r);
            }
        }
        Iterator<clrt> it2 = clotVar.j.iterator();
        while (it2.hasNext()) {
            it2.next().I(clotVar.r);
        }
    }

    @Override // defpackage.cmgf
    public final void J(List<cmfw> list) {
        Iterator<cmgf> it = this.a.f.iterator();
        while (it.hasNext()) {
            it.next().J(list);
        }
    }

    @Override // defpackage.cmbx
    public final void K(Metadata metadata) {
        Iterator<cmbx> it = this.a.g.iterator();
        while (it.hasNext()) {
            it.next().K(metadata);
        }
    }

    @Override // defpackage.clof
    public final void RK(clpb clpbVar, int i) {
        cloe.a(this, clpbVar);
    }

    @Override // defpackage.clof
    public final void RL(clno clnoVar, int i) {
    }

    @Override // defpackage.clof
    public final void RM(TrackGroupArray trackGroupArray, cmjn cmjnVar) {
    }

    @Override // defpackage.clof
    public final void RN(List list) {
    }

    @Override // defpackage.clof
    public final void RO(boolean z, int i) {
    }

    @Override // defpackage.clof
    public final void f(boolean z) {
    }

    @Override // defpackage.clof
    public final void g(int i) {
        this.a.s();
    }

    @Override // defpackage.clof
    public final void h(boolean z, int i) {
        this.a.s();
    }

    @Override // defpackage.clof
    public final void i(int i) {
    }

    @Override // defpackage.clof
    public final void j(boolean z) {
    }

    @Override // defpackage.clof
    public final void k(cllz cllzVar) {
    }

    @Override // defpackage.clof
    public final void l(int i) {
    }

    @Override // defpackage.clof
    public final void m(clod clodVar) {
    }

    @Override // defpackage.clof
    public final void n() {
    }

    @Override // defpackage.clof
    public final void o() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.o(new Surface(surfaceTexture), true);
        this.a.p(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.o(null, true);
        this.a.p(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.p(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.clof
    public final void p() {
        this.a.s();
    }

    @Override // defpackage.clof
    public final void q() {
    }

    @Override // defpackage.cmoy
    public final void r(clte clteVar) {
        Iterator<cmoy> it = this.a.i.iterator();
        while (it.hasNext()) {
            it.next().r(clteVar);
        }
    }

    @Override // defpackage.cmoy
    public final void s(String str, long j, long j2) {
        Iterator<cmoy> it = this.a.i.iterator();
        while (it.hasNext()) {
            it.next().s(str, j, j2);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.p(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.o(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.o(null, false);
        this.a.p(0, 0);
    }

    @Override // defpackage.cmoy
    public final void t(Format format) {
        Iterator<cmoy> it = this.a.i.iterator();
        while (it.hasNext()) {
            it.next().t(format);
        }
    }

    @Override // defpackage.cmoy
    public final void u(int i, long j) {
        Iterator<cmoy> it = this.a.i.iterator();
        while (it.hasNext()) {
            it.next().u(i, j);
        }
    }

    @Override // defpackage.cmoy
    public final void v(int i, int i2, int i3, float f) {
        Iterator<cmon> it = this.a.d.iterator();
        while (it.hasNext()) {
            cmon next = it.next();
            if (!this.a.i.contains(next)) {
                next.v(i, i2, i3, f);
            }
        }
        Iterator<cmoy> it2 = this.a.i.iterator();
        while (it2.hasNext()) {
            it2.next().v(i, i2, i3, f);
        }
    }

    @Override // defpackage.cmoy
    public final void w(Surface surface) {
        clot clotVar = this.a;
        if (clotVar.n == surface) {
            Iterator<cmon> it = clotVar.d.iterator();
            while (it.hasNext()) {
                it.next().L();
            }
        }
        Iterator<cmoy> it2 = this.a.i.iterator();
        while (it2.hasNext()) {
            it2.next().w(surface);
        }
    }

    @Override // defpackage.cmoy
    public final void x(String str) {
        Iterator<cmoy> it = this.a.i.iterator();
        while (it.hasNext()) {
            it.next().x(str);
        }
    }

    @Override // defpackage.cmoy
    public final void y(clte clteVar) {
        Iterator<cmoy> it = this.a.i.iterator();
        while (it.hasNext()) {
            it.next().y(clteVar);
        }
    }

    @Override // defpackage.cmoy
    public final void z(long j, int i) {
        Iterator<cmoy> it = this.a.i.iterator();
        while (it.hasNext()) {
            it.next().z(j, i);
        }
    }
}
