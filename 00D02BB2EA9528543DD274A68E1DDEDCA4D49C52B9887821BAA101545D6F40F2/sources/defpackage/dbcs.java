package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Texture;
import com.google.ar.sceneform.rendering.EngineInstance;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
/* compiled from: PG */
/* renamed from: dbcs  reason: default package */
/* loaded from: classes5.dex */
public final class dbcs extends dbcn {
    public final dbch a;
    public final dbcw b;
    public boolean c;
    final dbds d;
    public final dbdd e;
    public final ArrayList<dxg> f;
    private final dbdb g;
    private dbfh h;

    dbcs() {
        this.c = false;
        this.d = new dbds();
        this.e = new dbdd();
        this.f = new ArrayList<>();
        this.b = null;
        this.h = null;
        this.a = new dbch();
        if (!dbix.c()) {
            this.g = null;
        } else {
            this.g = new dbdb();
        }
    }

    public final void a(dbfh dbfhVar) {
        dbjb.d(dbfhVar, "Parameter \"lightProbe\" was null.");
        this.h = dbfhVar;
        this.c = true;
        dbhq dbhqVar = this.b.f;
        dbjb.c(dbhqVar);
        if (dbfhVar == null) {
            throw new AssertionError("Passed in an invalid light probe.");
        }
        dbjb.d(dbfhVar.f, "\"irradianceData\" was null.");
        dbjb.b(dbfhVar.f.length >= 3, "\"irradianceData\" does not have enough components to store a vector");
        if (dbfhVar.c != null) {
            float[] fArr = dbfhVar.f;
            dbep dbepVar = dbfhVar.e;
            float f = dbepVar.a;
            dbep dbepVar2 = dbfhVar.d;
            fArr[0] = f * dbepVar2.a;
            fArr[1] = dbepVar.b * dbepVar2.b;
            fArr[2] = dbepVar.c * dbepVar2.c;
            IndirectLight.Builder builder = new IndirectLight.Builder();
            builder.reflections(dbfhVar.c);
            builder.irradiance(3, dbfhVar.f);
            builder.intensity(dbfhVar.i * dbfhVar.j);
            IndirectLight build = builder.build(EngineInstance.a().a);
            if (build == null) {
                throw new IllegalStateException("Light Probe is invalid.");
            }
            dbhqVar.k.setIndirectLight(build);
            IndirectLight indirectLight = dbhqVar.l;
            if (indirectLight != null && indirectLight != build) {
                EngineInstance.a().i(dbhqVar.l);
            }
            dbhqVar.l = build;
            dbhqVar.m = dbfhVar;
            return;
        }
        throw new IllegalStateException("reflectCubemap is null.");
    }

    public final void b(dbep dbepVar, float f) {
        dbez v;
        dbfh dbfhVar = this.h;
        if (dbfhVar != null) {
            dbfhVar.j = Math.min((f * 1.8f) + 0.0f, 1.0f);
            dbfhVar.d.a(dbepVar);
            a(this.h);
        }
        dbdb dbdbVar = this.g;
        if (dbdbVar == null || (v = dbdbVar.v()) == null) {
            return;
        }
        float f2 = dbdbVar.b;
        if (f2 == 0.0f) {
            f2 = v.c;
            dbdbVar.b = f2;
        }
        float min = Math.min((f * 1.8f) + 0.0f, 1.0f);
        dbep dbepVar2 = new dbep(-863292);
        dbepVar2.a *= dbepVar.a;
        dbepVar2.b *= dbepVar.b;
        dbepVar2.c *= dbepVar.c;
        v.b.a(dbepVar2);
        v.d();
        v.c = Math.max(f2 * min, 1.0E-4f);
        v.d();
    }

    @Override // defpackage.dbcn
    public final void i(dbcm dbcmVar) {
        super.i(dbcmVar);
        dbcmVar.y(this);
    }

    @Override // defpackage.dbcn
    public final void j(dbcm dbcmVar) {
        super.j(dbcmVar);
        dbcmVar.y(null);
    }

    public dbcs(dbcw dbcwVar) {
        this.c = false;
        this.d = new dbds();
        this.e = new dbdd();
        this.f = new ArrayList<>();
        this.b = dbcwVar;
        this.a = new dbch(this);
        if (!dbix.c()) {
            this.g = null;
            return;
        }
        this.g = new dbdb(this);
        Context context = dbcwVar.getContext();
        int identifier = context.getResources().getIdentifier("sceneform_default_light_probe", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        try {
            dbfg dbfgVar = new dbfg();
            dbfgVar.a = dbja.a(dbcwVar.getContext(), identifier);
            dbfgVar.c = "small_empty_house_2k";
            if (dbfgVar.a != null) {
                final dbfh dbfhVar = new dbfh(dbfgVar);
                final Callable<InputStream> callable = dbfgVar.a;
                CompletableFuture thenApplyAsync = CompletableFuture.supplyAsync(new Supplier(dbfhVar, callable) { // from class: dbfe
                    private final dbfh a;
                    private final Callable b;

                    {
                        this.a = dbfhVar;
                        this.b = callable;
                    }

                    @Override // java.util.function.Supplier
                    public final Object get() {
                        dbfh dbfhVar2 = this.a;
                        Callable callable2 = this.b;
                        if (callable2 != null) {
                            try {
                                InputStream inputStream = (InputStream) callable2.call();
                                ByteBuffer a = dbjc.a(inputStream);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (a != null) {
                                    try {
                                        dbkg a2 = dbhu.a(a);
                                        if (a2 == null) {
                                            throw new AssertionError("The Sceneform bundle containing the Light Probe could not be loaded.");
                                        }
                                        int g = a2.g(18);
                                        int i = 0;
                                        int j = g != 0 ? a2.j(g) : 0;
                                        if (j > 0) {
                                            if (dbfhVar2.g != null) {
                                                while (true) {
                                                    if (i >= j) {
                                                        i = -1;
                                                        break;
                                                    }
                                                    dbjy b = a2.b(i);
                                                    int g2 = b.g(4);
                                                    if ((g2 != 0 ? b.i(g2 + b.a) : null).equals(dbfhVar2.g)) {
                                                        break;
                                                    }
                                                    i++;
                                                }
                                                if (i < 0) {
                                                    String str = dbfhVar2.g;
                                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
                                                    sb.append("Light Probe asset \"");
                                                    sb.append(str);
                                                    sb.append("\" not found in bundle.");
                                                    throw new IllegalArgumentException(sb.toString());
                                                }
                                            }
                                            dbjy b2 = a2.b(i);
                                            if (b2 == null) {
                                                throw new IllegalStateException("LightingDef is invalid.");
                                            }
                                            return b2;
                                        }
                                        throw new IllegalStateException("Content does not contain any Light Probe data.");
                                    } catch (dbht e) {
                                        throw new CompletionException(e);
                                    }
                                }
                                throw new AssertionError("The Sceneform bundle containing the Light Probe could not be loaded.");
                            } catch (Exception e2) {
                                throw new CompletionException(e2);
                            }
                        }
                        throw new IllegalArgumentException("Invalid source.");
                    }
                }, AsyncTask.THREAD_POOL_EXECUTOR).thenApplyAsync(new Function(dbfhVar) { // from class: dbff
                    private final dbfh a;

                    {
                        this.a = dbfhVar;
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dbfh dbfhVar2 = this.a;
                        dbjy dbjyVar = (dbjy) obj;
                        dbfhVar2.a();
                        dbfhVar2.h.c();
                        if (dbjyVar == null) {
                            throw new IllegalStateException("buildFilamentResource called but no resource is available to load.");
                        }
                        dbet a = EngineInstance.a();
                        int g = dbjyVar.g(8);
                        int j = g != 0 ? dbjyVar.j(g) : 0;
                        if (j <= 0) {
                            throw new IllegalStateException("Lighting cubemap has no image data.");
                        }
                        dbjx a2 = dbjyVar.a(0).a(0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inPremultiplied = false;
                        options.inScaled = false;
                        options.inJustDecodeBounds = true;
                        ByteBuffer a3 = a2.a();
                        BitmapFactory.decodeByteArray(a3.array(), a3.arrayOffset() + a3.position(), a3.limit() - a3.position(), options);
                        int i = options.outWidth;
                        int i2 = options.outHeight;
                        if (i < 4 || i2 < 4 || i != i2) {
                            StringBuilder sb = new StringBuilder(66);
                            sb.append("Lighting cubemap has invalid dimensions: ");
                            sb.append(i);
                            sb.append(" x ");
                            sb.append(i2);
                            throw new IllegalStateException(sb.toString());
                        }
                        Texture.Builder builder = new Texture.Builder();
                        builder.width(i);
                        builder.height(i2);
                        builder.levels(j);
                        builder.format(Texture.InternalFormat.R11F_G11F_B10F);
                        builder.sampler(Texture.Sampler.SAMPLER_CUBEMAP);
                        Texture build = builder.build(a.a);
                        int i3 = i * i2 * 4;
                        int i4 = 6;
                        int[] iArr = new int[6];
                        options.inJustDecodeBounds = false;
                        int i5 = 0;
                        while (i5 < j) {
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * 6);
                            dbjw a4 = dbjyVar.a(i5);
                            int i6 = 0;
                            while (i6 < i4) {
                                dbjx a5 = a4.a(dbfh.b[i6]);
                                iArr[i6] = i3 * i6;
                                ByteBuffer a6 = a5.a();
                                int i7 = j;
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a6.array(), a6.arrayOffset() + a6.position(), a6.limit() - a6.position(), options);
                                if (decodeByteArray.getWidth() == i && decodeByteArray.getHeight() == i2) {
                                    decodeByteArray.copyPixelsToBuffer(allocateDirect);
                                    i6++;
                                    j = i7;
                                    i4 = 6;
                                } else {
                                    throw new AssertionError("All cube map textures must have the same size");
                                }
                            }
                            allocateDirect.rewind();
                            build.setImage(a.a, i5, new Texture.PixelBufferDescriptor(allocateDirect, Texture.Format.RGB, Texture.Type.UINT_10F_11F_11F_REV), iArr);
                            i >>= 1;
                            i2 >>= 1;
                            i3 = i * i2 * 4;
                            i5++;
                            j = j;
                            i4 = 6;
                        }
                        if (build == null) {
                            throw new IllegalStateException("Load reflection cubemap failed.");
                        }
                        dbfhVar2.b(build);
                        int g2 = dbjyVar.g(10);
                        int j2 = g2 != 0 ? dbjyVar.j(g2) : 0;
                        if (j2 >= 9) {
                            int i8 = j2 * 3;
                            float[] fArr = dbfhVar2.f;
                            if (fArr == null || fArr.length != i8) {
                                dbfhVar2.f = new float[i8];
                            }
                            for (int i9 = 0; i9 < j2; i9++) {
                                dbjj dbjjVar = new dbjj();
                                int g3 = dbjyVar.g(10);
                                if (g3 != 0) {
                                    dbjjVar.d(dbjyVar.k(g3) + (i9 * 12), dbjyVar.b);
                                } else {
                                    dbjjVar = null;
                                }
                                int i10 = i9 * 3;
                                dbfhVar2.f[i10] = dbjjVar.a() / 3.1415927f;
                                dbfhVar2.f[i10 + 1] = dbjjVar.b() / 3.1415927f;
                                dbfhVar2.f[i10 + 2] = dbjjVar.c() / 3.1415927f;
                            }
                            dbep dbepVar = dbfhVar2.e;
                            float[] fArr2 = dbfhVar2.f;
                            dbepVar.b(fArr2[0], fArr2[1], fArr2[2]);
                            return dbfhVar2;
                        }
                        throw new IllegalStateException("Too few SH vectors for the current Order (3).");
                    }
                }, dbie.a());
                if (thenApplyAsync != null) {
                    String str = dbfh.a;
                    String str2 = dbfgVar.c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34);
                    sb.append("Unable to load LightProbe: name='");
                    sb.append(str2);
                    sb.append("'");
                    dbew.a(str, thenApplyAsync, sb.toString());
                    thenApplyAsync.thenAccept(new Consumer(this) { // from class: dbcp
                        private final dbcs a;

                        {
                            this.a = this;
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            dbcs dbcsVar = this.a;
                            dbfh dbfhVar2 = (dbfh) obj;
                            if (!dbcsVar.c) {
                                dbcsVar.a(dbfhVar2);
                            }
                        }
                    }).exceptionally(dbcq.a);
                    return;
                }
                throw new IllegalStateException("CompletableFuture result is null.");
            }
            throw new IllegalStateException("Light Probe source is NULL, this should never happen.");
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getLocalizedMessage());
            throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create the default Light Probe: ".concat(valueOf) : new String("Failed to create the default Light Probe: "));
        }
    }
}
