package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Animatable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IllustrationVideoView extends TextureView implements Animatable, TextureView.SurfaceTextureListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener {
    protected MediaPlayer a;
    Surface b;
    private float c;
    private int d;
    private String e;
    private boolean f;
    private int g;
    private boolean h;

    public IllustrationVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1.0f;
        this.d = 0;
        this.g = 0;
        this.h = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dapf.j);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        setVideoResource(resourceId);
        setScaleX(0.9999999f);
        setScaleX(0.9999999f);
        setSurfaceTextureListener(this);
    }

    private final void c(boolean z) {
        this.h = z;
        setVisibility(this.g);
    }

    private final void d() {
        if (getWindowVisibility() == 0) {
            Surface surface = this.b;
            if (surface != null) {
                surface.release();
                this.b = null;
            }
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                c(true);
                this.b = new Surface(surfaceTexture);
            }
            if (this.b == null) {
                return;
            }
            a();
        }
    }

    protected final void a() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        if (this.b == null || this.d == 0) {
            return;
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.a = mediaPlayer2;
        mediaPlayer2.setSurface(this.b);
        this.a.setOnPreparedListener(this);
        this.a.setOnSeekCompleteListener(this);
        this.a.setOnInfoListener(this);
        this.a.setOnErrorListener(this);
        int i = this.d;
        String str = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/");
        sb.append(i);
        try {
            this.a.setDataSource(getContext(), Uri.parse(sb.toString()), (Map<String, String>) null);
            this.a.prepareAsync();
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Unable to set video data source: ");
            sb2.append(i);
            sb2.toString();
        }
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.a = null;
            this.f = false;
        }
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        MediaPlayer mediaPlayer = this.a;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(53);
        sb.append("MediaPlayer error. what=");
        sb.append(i);
        sb.append(" extra=");
        sb.append(i2);
        sb.toString();
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            c(false);
        }
        return false;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size2;
        float f2 = this.c;
        float f3 = size * f2;
        if (f < f3) {
            size = (int) (f / f2);
        } else {
            size2 = (int) f3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        float f;
        this.f = true;
        mediaPlayer.setLooping(true);
        if (mediaPlayer.getVideoWidth() <= 0 || mediaPlayer.getVideoHeight() <= 0) {
            int videoWidth = mediaPlayer.getVideoWidth();
            int videoHeight = mediaPlayer.getVideoHeight();
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unexpected video size=");
            sb.append(videoWidth);
            sb.append("x");
            sb.append(videoHeight);
            sb.toString();
            f = 0.0f;
        } else {
            f = mediaPlayer.getVideoHeight() / mediaPlayer.getVideoWidth();
        }
        if (Float.compare(this.c, f) != 0) {
            this.c = f;
            requestLayout();
        }
        if (getWindowVisibility() == 0) {
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f) {
            mediaPlayer.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        c(true);
        d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            start();
        } else {
            stop();
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            b();
        } else if (this.b != null) {
        } else {
            d();
        }
    }

    public void setVideoResource(int i) {
        setVideoResource(i, getContext().getPackageName());
    }

    public void setVideoResourceEntry(daov daovVar) {
        setVideoResource(daovVar.b, daovVar.a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.g = i;
        if (this.h && i == 0) {
            i = 4;
        }
        super.setVisibility(i);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        MediaPlayer mediaPlayer;
        if (!this.f || (mediaPlayer = this.a) == null || mediaPlayer.isPlaying()) {
            return;
        }
        this.a.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        MediaPlayer mediaPlayer;
        if (!this.f || (mediaPlayer = this.a) == null) {
            return;
        }
        mediaPlayer.pause();
    }

    public void setVideoResource(int i, String str) {
        if (i != this.d || (str != null && !str.equals(this.e))) {
            this.d = i;
            this.e = str;
            a();
        }
    }

    public void setVideoResourceEntry(dapv dapvVar) {
        int i = dapvVar.b;
        String str = dapvVar.a;
        setVideoResource(0, null);
    }
}
