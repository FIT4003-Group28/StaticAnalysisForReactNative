package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import com.google.ar.sceneform.rendering.EngineInstance;
import com.google.ar.sceneform.rendering.Texture;
import com.google.ar.sceneform.rendering.TextureInternalData;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
/* compiled from: PG */
/* renamed from: dbia  reason: default package */
/* loaded from: classes5.dex */
public final class dbia {
    private Callable<InputStream> e = null;
    public int d = 1;
    public Object a = null;
    public boolean b = true;
    public Texture.Sampler c = Texture.Sampler.a().a();

    public final CompletableFuture<Texture> a() {
        CompletableFuture<Texture> a;
        dbix.a();
        Object obj = this.a;
        if (obj == null || (a = dbhs.b().b.a(obj)) == null) {
            final Callable<InputStream> callable = this.e;
            if (callable != null) {
                final boolean z = this.b;
                CompletableFuture<Texture> thenApplyAsync = CompletableFuture.supplyAsync(new Supplier(z, callable) { // from class: dbhz
                    private final boolean a;
                    private final Callable b;

                    {
                        this.a = z;
                        this.b = callable;
                    }

                    @Override // java.util.function.Supplier
                    public final Object get() {
                        boolean z2 = this.a;
                        Callable callable2 = this.b;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        options.inPremultiplied = z2;
                        try {
                            InputStream inputStream = (InputStream) callable2.call();
                            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (decodeStream == null) {
                                throw new IllegalStateException("Failed to decode the texture bitmap. The InputStream was not a valid bitmap.");
                            }
                            if (decodeStream.getConfig() != Bitmap.Config.ARGB_8888) {
                                throw new IllegalStateException("Texture must use ARGB8 format.");
                            }
                            return decodeStream;
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    }
                }, AsyncTask.THREAD_POOL_EXECUTOR).thenApplyAsync(new Function(this) { // from class: dbhy
                    private final dbia a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Texture.InternalFormat internalFormat;
                        dbia dbiaVar = this.a;
                        Bitmap bitmap = (Bitmap) obj2;
                        Texture.Sampler sampler = dbiaVar.c;
                        int i = dbiaVar.d;
                        int i2 = i - 1;
                        dbet a2 = EngineInstance.a();
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            internalFormat = Texture.InternalFormat.SRGB8_A8;
                        } else {
                            internalFormat = Texture.InternalFormat.RGBA8;
                        }
                        Texture.Sampler sampler2 = Texture.Sampler.SAMPLER_2D;
                        Texture.Builder builder = new Texture.Builder();
                        builder.width(bitmap.getWidth());
                        builder.height(bitmap.getHeight());
                        builder.depth(1);
                        builder.levels(255);
                        builder.sampler(sampler2);
                        builder.format(internalFormat);
                        com.google.android.filament.Texture build = builder.build(a2.a);
                        TextureHelper.setBitmap(a2.a, build, 0, bitmap);
                        build.generateMipmaps(a2.a);
                        return new com.google.ar.sceneform.rendering.Texture(new TextureInternalData(build, sampler));
                    }
                }, dbie.a());
                if (obj != null) {
                    dbhs.b().b.d(obj, thenApplyAsync);
                }
                String str = com.google.ar.sceneform.rendering.Texture.a;
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Unable to load Texture registryId='");
                sb.append(valueOf);
                sb.append("'");
                dbew.a(str, thenApplyAsync, sb.toString());
                return thenApplyAsync;
            }
            throw new IllegalStateException("Texture must have a source.");
        }
        return a;
    }

    public final void b(Callable<InputStream> callable) {
        dbjb.d(callable, "Parameter \"inputStreamCreator\" was null.");
        this.e = callable;
    }
}
