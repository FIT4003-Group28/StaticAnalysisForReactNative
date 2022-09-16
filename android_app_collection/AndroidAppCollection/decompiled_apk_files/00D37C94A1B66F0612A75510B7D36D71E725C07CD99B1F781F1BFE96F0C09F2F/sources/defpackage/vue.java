package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vue  reason: default package */
/* loaded from: classes4.dex */
public abstract class vue extends FrameLayout implements TextureView.SurfaceTextureListener, ota {
    private final Runnable a;
    private boolean b;
    private vvg c;
    private long d;
    private long e;
    public final TextureView h;
    protected final ImageView i;
    public final View j;
    public View k;
    public float l;
    public int m;
    public otb n;
    public TextureView.SurfaceTextureListener o;
    public zor p;

    public vue(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new vub(this);
        this.b = false;
        this.l = 1.7777778f;
        this.m = Integer.MAX_VALUE;
        this.e = -1L;
        LayoutInflater.from(context).inflate(R.layout.video_with_preview_view, (ViewGroup) this, true);
        TextureView textureView = (TextureView) findViewById(R.id.video_surface);
        this.h = textureView;
        textureView.setSurfaceTextureListener(this);
        this.i = (ImageView) findViewById(R.id.preview_image);
        this.j = findViewById(R.id.preview_image_error);
    }

    private static final boolean a(int i) {
        return i == 2 || i == 3;
    }

    protected abstract float d();

    protected abstract float e();

    protected abstract void i();

    protected abstract float n();

    protected abstract void o();

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.o;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        i();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.o;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.o;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        i();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if ((this.p == null || this.n == null) && this.c != null) {
            q(null, false);
        }
    }

    public abstract void p();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(vvg vvgVar, boolean z) {
        vvg vvgVar2 = this.c;
        if (vvgVar2 != null) {
            vvgVar2.d();
        }
        this.c = vvgVar != null ? vvgVar.c() : null;
        if (z) {
            this.d = -1L;
        } else {
            this.d = System.currentTimeMillis() + 50;
            postDelayed(this.a, 50L);
        }
        zor zorVar = this.p;
        if (zorVar != null) {
            vvg vvgVar3 = this.c;
            if (vvgVar3 == null) {
                zorVar.a(null);
            } else if (vvgVar3.f() == 2) {
                this.p.a(this.c.b().copy(Bitmap.Config.ARGB_8888, false));
            }
        } else {
            vvg vvgVar4 = this.c;
            if (vvgVar4 == null) {
                this.i.setImageBitmap(null);
                this.i.setVisibility(8);
            } else if (vvgVar4.f() == 2) {
                this.i.setImageBitmap(this.c.b());
                this.i.setVisibility(0);
                float e = e();
                this.i.setPivotX(d());
                this.i.setPivotY(n());
                this.i.setScaleX(e);
                this.i.setScaleY(e);
            }
        }
        t();
    }

    public final void r(float f) {
        if (this.l != f) {
            this.l = f;
            o();
        }
    }

    @Override // defpackage.ota
    public final void rL() {
    }

    @Override // defpackage.ota
    public final void rM(osx osxVar) {
    }

    @Override // defpackage.ota
    public final void rN(boolean z, int i) {
        otb otbVar;
        if (this.c != null && (otbVar = this.n) != null && this.p != null && ((vtr) otbVar).a.b(0) >= 0 && !a(i)) {
            vtr vtrVar = (vtr) this.n;
            if (!vtrVar.b && ((otd) vtrVar.a).f == 0) {
                q(null, false);
            }
        }
        post(new vud(this, i));
    }

    public final void s(int i) {
        this.b = a(i);
        t();
    }

    public final void t() {
        boolean z;
        if (this.k != null) {
            long currentTimeMillis = System.currentTimeMillis();
            vvg vvgVar = this.c;
            int i = 0;
            boolean z2 = vvgVar == null || vvgVar.f() != 2;
            long j = this.d;
            boolean z3 = j != -1 && j < currentTimeMillis;
            if (!this.b || (!z2 && !z3)) {
                this.e = -1L;
                z = false;
            } else {
                long j2 = this.e;
                if (j2 == -1) {
                    this.e = currentTimeMillis;
                    j2 = currentTimeMillis;
                }
                long j3 = currentTimeMillis - j2;
                z = j3 > 500;
                if (!z) {
                    postDelayed(this.a, (500 - j3) + 1);
                }
            }
            View view = this.k;
            if (true != z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final boolean u() {
        return this.m != Integer.MAX_VALUE;
    }
}
