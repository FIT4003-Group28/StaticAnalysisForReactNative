package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
/* compiled from: PG */
/* renamed from: ahnt  reason: default package */
/* loaded from: classes.dex */
public final class ahnt extends afmx implements pgg, pxs {
    private final GLSurfaceView i;
    private final ahnu j;

    public ahnt(Context context) {
        super(context);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.i = gLSurfaceView;
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLWindowSurfaceFactory(new ahla(context));
        ahnu ahnuVar = new ahnu(new ahrz(context), new Handler(new Handler.Callback() { // from class: ahns
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                afng afngVar;
                ahnt ahntVar = ahnt.this;
                if (message.what != 3 || (afngVar = ahntVar.g) == null) {
                    return false;
                }
                afngVar.e();
                return true;
            }
        }));
        this.j = ahnuVar;
        gLSurfaceView.setRenderer(ahnuVar);
        gLSurfaceView.setRenderMode(0);
        addView(gLSurfaceView);
        this.b = this;
        this.c = this;
    }

    @Override // defpackage.afnh
    public final afnk C() {
        return afnk.GL_VPX;
    }

    @Override // defpackage.afmu
    public final void D() {
        ahnu ahnuVar = this.j;
        ahoq ahoqVar = ahnuVar.a;
        if (ahoqVar != null) {
            ahoqVar.b();
            ahnuVar.a = null;
        }
        ahru ahruVar = ahnuVar.d;
        if (ahruVar != null) {
            ahruVar.i();
            ahnuVar.d = null;
        }
        ahog ahogVar = ahnuVar.b;
        if (ahogVar != null) {
            ahogVar.k();
            ahnuVar.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna
    public final void H() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna
    public final void I() {
    }

    @Override // defpackage.afna, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
        G(this.i, i3 - i, i4 - i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.i, View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    @Override // defpackage.pgg
    public final void rR(VpxOutputBuffer vpxOutputBuffer) {
        ahnu ahnuVar = this.j;
        ahog ahogVar = ahnuVar.b;
        if (ahogVar != null) {
            ahogVar.rR(vpxOutputBuffer);
            ahnuVar.c = true;
        } else {
            vpxOutputBuffer.release();
        }
        this.i.requestRender();
    }

    @Override // defpackage.pxs
    public final void rS(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        ahnu ahnuVar = this.j;
        ahog ahogVar = ahnuVar.b;
        if (ahogVar != null) {
            ahogVar.rS(videoDecoderOutputBuffer);
            ahnuVar.c = true;
        } else {
            videoDecoderOutputBuffer.release();
        }
        this.i.requestRender();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.i.setVisibility(i);
        super.setVisibility(i);
    }
}
