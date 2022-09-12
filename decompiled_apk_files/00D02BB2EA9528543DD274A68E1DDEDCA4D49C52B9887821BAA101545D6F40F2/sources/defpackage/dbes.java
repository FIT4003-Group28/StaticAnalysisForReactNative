package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.filament.Stream;
import com.google.android.filament.Texture;
import com.google.ar.sceneform.rendering.EngineInstance;
/* compiled from: PG */
/* renamed from: dbes  reason: default package */
/* loaded from: classes5.dex */
public final class dbes {
    public Texture a;
    private final SurfaceTexture b;
    private final Surface c;

    public dbes() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        this.b = surfaceTexture;
        this.c = new Surface(surfaceTexture);
        Stream.Builder builder = new Stream.Builder();
        builder.stream(surfaceTexture);
        c(builder.build(EngineInstance.a().a));
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.b;
        dbjb.c(surfaceTexture);
        return surfaceTexture;
    }

    public final Surface b() {
        Surface surface = this.c;
        dbjb.c(surface);
        return surface;
    }

    private final void c(Stream stream) {
        if (this.a != null) {
            throw new AssertionError("Stream was initialized twice");
        }
        dbet a = EngineInstance.a();
        Texture.Sampler sampler = Texture.Sampler.SAMPLER_EXTERNAL;
        Texture.InternalFormat internalFormat = Texture.InternalFormat.RGB8;
        Texture.Builder builder = new Texture.Builder();
        builder.sampler(sampler);
        builder.format(internalFormat);
        Texture build = builder.build(a.a);
        this.a = build;
        build.setExternalStream(a.a, stream);
        dbhs.b().g.a(this, new dber(this.a, stream));
    }

    public dbes(int i, int i2, int i3) {
        this.b = null;
        this.c = null;
        Stream.Builder builder = new Stream.Builder();
        builder.stream(i);
        builder.width(i2);
        builder.height(i3);
        c(builder.build(EngineInstance.a().a));
    }
}
