package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.TextureSampler;
import com.google.ar.sceneform.rendering.Texture;
import defpackage.dbhd;
import defpackage.dbhe;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
/* renamed from: dbhd  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbhd<T extends dbhe, B extends dbhd<T, B>> {
    public Object a = null;
    public Context b = null;
    public Uri c = null;
    public Callable<InputStream> d = null;
    public dbhi e = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Class<T> a();

    protected abstract dbiv<T> b();

    protected abstract T c();

    public final B d(dbhi dbhiVar) {
        this.e = dbhiVar;
        this.a = null;
        this.c = null;
        return this;
    }

    public final Boolean e() {
        boolean z = true;
        if (this.c == null && this.d == null && this.e == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        dbix.a();
        if (e().booleanValue()) {
            return;
        }
        throw new AssertionError("ModelRenderable must have a source.");
    }

    public CompletableFuture<T> g() {
        CompletableFuture<T> a;
        try {
            f();
            Object obj = this.a;
            if (obj == null || (a = b().a(obj)) == null) {
                T c = c();
                if (this.e != null) {
                    return CompletableFuture.completedFuture(c);
                }
                final Callable<InputStream> callable = this.d;
                if (callable == null) {
                    CompletableFuture<T> completableFuture = new CompletableFuture<>();
                    completableFuture.completeExceptionally(new AssertionError("Input Stream Creator is null."));
                    String simpleName = a().getSimpleName();
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("Unable to load Renderable registryId='");
                    sb.append(valueOf);
                    sb.append("'");
                    dbew.a(simpleName, completableFuture, sb.toString());
                    return completableFuture;
                }
                final dbfr dbfrVar = new dbfr(c, this.c);
                CompletableFuture<T> thenApplyAsync = CompletableFuture.supplyAsync(new Supplier(dbfrVar, callable) { // from class: dbfi
                    private final dbfr a;
                    private final Callable b;

                    {
                        this.a = dbfrVar;
                        this.b = callable;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        dbdp dbdpVar;
                        int i;
                        dbfr dbfrVar2 = this.a;
                        try {
                            InputStream inputStream = (InputStream) this.b.call();
                            ByteBuffer a2 = dbjc.a(inputStream);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (a2 == null) {
                                throw new AssertionError("Failed reading data from stream");
                            }
                            try {
                                dbkg a3 = dbhu.a(a2);
                                if (a3 != null) {
                                    try {
                                        T t = dbfrVar2.a;
                                        dbkh dbkhVar = new dbkh();
                                        int g = a3.g(12);
                                        dbjh dbjhVar = null;
                                        if (g != 0) {
                                            dbkhVar.m(a3.h(g + a3.a), a3.b);
                                        } else {
                                            dbkhVar = null;
                                        }
                                        int g2 = dbkhVar.g(4);
                                        if (g2 == 0 || (i = dbkhVar.b.getInt(g2 + dbkhVar.a)) == 0) {
                                            dbdp dbdpVar2 = new dbdp();
                                            dbdpVar2.a(new dbeb(dbkhVar.a().a(), dbkhVar.a().b(), dbkhVar.a().c()));
                                            dbdpVar2.c(new dbeb(dbkhVar.b().a(), dbkhVar.b().b(), dbkhVar.b().c()));
                                            dbdpVar = dbdpVar2;
                                        } else if (i == 1) {
                                            dbdw dbdwVar = new dbdw();
                                            dbdwVar.a(new dbeb(dbkhVar.a().a(), dbkhVar.a().b(), dbkhVar.a().c()));
                                            dbdwVar.c(dbkhVar.b().a());
                                            dbdpVar = dbdwVar;
                                        } else {
                                            throw new IOException("Invalid collisionCollisionGeometry type.");
                                        }
                                        t.i = dbdpVar;
                                        dbki dbkiVar = new dbki();
                                        int g3 = a3.g(22);
                                        if (g3 != 0) {
                                            dbkiVar.m(a3.h(g3 + a3.a), a3.b);
                                        } else {
                                            dbkiVar = null;
                                        }
                                        dbfrVar2.f = dbkiVar;
                                        dbjf dbjfVar = new dbjf();
                                        int g4 = a3.g(6);
                                        if (g4 != 0) {
                                            dbjfVar.m(a3.h(g4 + a3.a), a3.b);
                                        } else {
                                            dbjfVar = null;
                                        }
                                        dbfrVar2.d = dbjfVar;
                                        dbjb.d(dbfrVar2.d, "Model error: ModelDef is invalid.");
                                        dbjf dbjfVar2 = dbfrVar2.d;
                                        dbjh dbjhVar2 = new dbjh();
                                        int g5 = dbjfVar2.g(6);
                                        if (g5 != 0) {
                                            dbjhVar2.m(dbjfVar2.h(dbjfVar2.k(g5)), dbjfVar2.b);
                                            dbjhVar = dbjhVar2;
                                        }
                                        dbfrVar2.e = dbjhVar;
                                        dbjb.d(dbfrVar2.e, "Lull Model error: ModelInstanceDef is invalid.");
                                        ByteBuffer l = dbfrVar2.e.l(4, 1);
                                        dbjb.d(l, "Model Instance geometry data is invalid (vertexData is null).");
                                        dbjh dbjhVar3 = dbfrVar2.e;
                                        int g6 = dbjhVar3.g(4);
                                        int j = g6 != 0 ? dbjhVar3.j(g6) : 0;
                                        dbjh dbjhVar4 = dbfrVar2.e;
                                        int g7 = dbjhVar4.g(10);
                                        dbfrVar2.g = g7 != 0 ? dbjhVar4.j(g7) : 0;
                                        dbfrVar2.i = j / dbfs.a(dbfrVar2.e);
                                        if (dbfrVar2.e.b() > 0) {
                                            dbfrVar2.k = dbfrVar2.e.b();
                                            dbfrVar2.l = IndexBuffer.Builder.IndexType.UINT;
                                            dbfrVar2.n = ByteBuffer.allocateDirect(dbfrVar2.k * 4);
                                            dbfrVar2.n.put(dbfrVar2.e.l(8, 4));
                                        } else if (dbfrVar2.e.a() > 0) {
                                            dbfrVar2.k = dbfrVar2.e.a();
                                            dbfrVar2.l = IndexBuffer.Builder.IndexType.USHORT;
                                            int i2 = dbfrVar2.k;
                                            dbfrVar2.n = ByteBuffer.allocateDirect(i2 + i2);
                                            dbfrVar2.n.put(dbfrVar2.e.l(6, 2));
                                        } else {
                                            throw new AssertionError("Model Instance geometry data is invalid (model has no index data).");
                                        }
                                        dbfrVar2.n.flip();
                                        dbfrVar2.m = ByteBuffer.allocateDirect(l.remaining());
                                        dbjb.d(dbfrVar2.m, "Failed to allocate geometry for FilamentModel.");
                                        dbfrVar2.m.put(l);
                                        dbfrVar2.m.flip();
                                        dbfrVar2.j = 0;
                                        int d = dbfrVar2.e.d();
                                        for (int i3 = 0; i3 < d; i3++) {
                                            dbfrVar2.j += dbfr.a(dbfrVar2.e.c(i3).b());
                                        }
                                        return a3;
                                    } catch (IOException e) {
                                        throw new CompletionException("Unable to get collision geometry from sfb", e);
                                    }
                                }
                                String valueOf2 = String.valueOf(dbfrVar2.c);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                                sb2.append("No RCB file at uri: ");
                                sb2.append(valueOf2);
                                throw new AssertionError(sb2.toString());
                            } catch (dbht e2) {
                                throw new CompletionException(e2);
                            }
                        } catch (Exception e3) {
                            throw new CompletionException(e3);
                        }
                    }
                }, AsyncTask.THREAD_POOL_EXECUTOR).thenComposeAsync(new Function(dbfrVar) { // from class: dbfj
                    private final dbfr a;

                    {
                        this.a = dbfrVar;
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Texture.Sampler.MinFilter minFilter;
                        Texture.Sampler.MagFilter magFilter;
                        dbfr dbfrVar2 = this.a;
                        final dbkg dbkgVar = (dbkg) obj2;
                        int i = 8;
                        int i2 = 4;
                        int i3 = 1;
                        if ((dbfrVar2.a instanceof dbgt) && dbkgVar.d() > 0) {
                            dbgt dbgtVar = (dbgt) dbfrVar2.a;
                            ArrayList<dbef> arrayList = new ArrayList<>();
                            for (int i4 = 0; i4 < dbkgVar.d(); i4++) {
                                try {
                                    byte[] b = dbjc.b(dbkgVar.c(i4).l(8, 1));
                                    dbjm c2 = dbkgVar.c(i4);
                                    int g = c2.g(4);
                                    dbef a2 = dbef.b.a(b, g != 0 ? c2.i(g + c2.a) : null);
                                    if (a2 != null) {
                                        arrayList.add(a2);
                                    }
                                } catch (IOException e) {
                                    throw new CompletionException("Failed to create animation data.", e);
                                }
                            }
                            dbgtVar.a = arrayList;
                        }
                        int i5 = 14;
                        int g2 = dbkgVar.g(14);
                        int j = g2 != 0 ? dbkgVar.j(g2) : 0;
                        dbfrVar2.h = j;
                        CompletableFuture[] completableFutureArr = new CompletableFuture[j];
                        int i6 = 0;
                        while (i6 < dbfrVar2.h) {
                            dbkc dbkcVar = new dbkc();
                            int g3 = dbkgVar.g(i5);
                            if (g3 != 0) {
                                dbkcVar.m(dbkgVar.h(dbkgVar.k(g3) + (i6 * 4)), dbkgVar.b);
                            } else {
                                dbkcVar = null;
                            }
                            int g4 = dbkcVar.g(i2);
                            final dbfq dbfqVar = new dbfq(g4 != 0 ? dbkcVar.i(g4 + dbkcVar.a) : null);
                            dbfrVar2.o.add(dbfqVar);
                            dbke a3 = dbkcVar.a();
                            int g5 = a3.g(i2);
                            char c3 = g5 != 0 ? (char) a3.b.getShort(g5 + a3.a) : (char) 0;
                            int[] iArr = {1, 2, 3};
                            if (c3 < 3) {
                                int i7 = iArr[c3];
                                int g6 = dbkcVar.g(i);
                                if (g6 != 0 && dbkcVar.j(g6) != 0) {
                                    ByteBuffer l = dbkcVar.l(i, i3);
                                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(l.array(), l.arrayOffset(), l.capacity());
                                    boolean z = i7 == i3;
                                    byteArrayInputStream.skip(l.position());
                                    dbia a4 = Texture.a();
                                    a4.d = i7;
                                    TextureSampler.WrapMode[] values = TextureSampler.WrapMode.values();
                                    dbke a5 = dbkcVar.a();
                                    int g7 = a5.g(i5);
                                    Texture.Sampler.WrapMode b2 = dbfr.b(values[g7 != 0 ? (char) a5.b.getShort(g7 + a5.a) : (char) 0]);
                                    TextureSampler.WrapMode[] values2 = TextureSampler.WrapMode.values();
                                    dbke a6 = dbkcVar.a();
                                    int g8 = a6.g(10);
                                    Texture.Sampler.WrapMode b3 = dbfr.b(values2[g8 != 0 ? (char) a6.b.getShort(g8 + a6.a) : (char) 0]);
                                    TextureSampler.WrapMode[] values3 = TextureSampler.WrapMode.values();
                                    dbke a7 = dbkcVar.a();
                                    int g9 = a7.g(12);
                                    Texture.Sampler.WrapMode b4 = dbfr.b(values3[g9 != 0 ? (char) a7.b.getShort(g9 + a7.a) : (char) 0]);
                                    dbic a8 = Texture.Sampler.a();
                                    TextureSampler.MinFilter[] values4 = TextureSampler.MinFilter.values();
                                    dbke a9 = dbkcVar.a();
                                    dbfr dbfrVar3 = dbfrVar2;
                                    int g10 = a9.g(8);
                                    TextureSampler.MinFilter minFilter2 = values4[g10 != 0 ? (char) a9.b.getShort(g10 + a9.a) : (char) 0];
                                    TextureSampler.MagFilter magFilter2 = TextureSampler.MagFilter.NEAREST;
                                    int ordinal = minFilter2.ordinal();
                                    if (ordinal == 0) {
                                        minFilter = Texture.Sampler.MinFilter.NEAREST;
                                    } else if (ordinal == 1) {
                                        minFilter = Texture.Sampler.MinFilter.LINEAR;
                                    } else if (ordinal == 2) {
                                        minFilter = Texture.Sampler.MinFilter.NEAREST_MIPMAP_NEAREST;
                                    } else if (ordinal == 3) {
                                        minFilter = Texture.Sampler.MinFilter.LINEAR_MIPMAP_NEAREST;
                                    } else if (ordinal == 4) {
                                        minFilter = Texture.Sampler.MinFilter.NEAREST_MIPMAP_LINEAR;
                                    } else if (ordinal == 5) {
                                        minFilter = Texture.Sampler.MinFilter.LINEAR_MIPMAP_LINEAR;
                                    } else {
                                        throw new IllegalArgumentException("Invalid MinFilter");
                                    }
                                    a8.a = minFilter;
                                    TextureSampler.MagFilter[] values5 = TextureSampler.MagFilter.values();
                                    dbke a10 = dbkcVar.a();
                                    int g11 = a10.g(6);
                                    int ordinal2 = values5[g11 != 0 ? (char) a10.b.getShort(g11 + a10.a) : (char) 0].ordinal();
                                    if (ordinal2 == 0) {
                                        magFilter = Texture.Sampler.MagFilter.NEAREST;
                                    } else if (ordinal2 == 1) {
                                        magFilter = Texture.Sampler.MagFilter.LINEAR;
                                    } else {
                                        throw new IllegalArgumentException("Invalid MagFilter");
                                    }
                                    a8.b = magFilter;
                                    a8.e = b2;
                                    a8.c = b3;
                                    a8.d = b4;
                                    a4.c = a8.a();
                                    a4.b = z;
                                    a4.b(new Callable(byteArrayInputStream) { // from class: dbfm
                                        private final ByteArrayInputStream a;

                                        {
                                            this.a = byteArrayInputStream;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return this.a;
                                        }
                                    });
                                    completableFutureArr[i6] = a4.a().thenAccept(new Consumer(dbfqVar) { // from class: dbfn
                                        private final dbfq a;

                                        {
                                            this.a = dbfqVar;
                                        }

                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj3) {
                                            this.a.b = (Texture) obj3;
                                        }
                                    }).exceptionally(dbfo.a);
                                    i6++;
                                    dbfrVar2 = dbfrVar3;
                                    i5 = 14;
                                    i = 8;
                                    i2 = 4;
                                    i3 = 1;
                                } else {
                                    throw new IllegalStateException("Unable to load texture, no sampler definition.");
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder(34);
                                sb2.append("Invalid Texture Usage: ");
                                sb2.append((int) c3);
                                throw new AssertionError(sb2.toString());
                            }
                        }
                        return CompletableFuture.allOf(completableFutureArr).thenApply(new Function(dbkgVar) { // from class: dbfp
                            private final dbkg a;

                            {
                                this.a = dbkgVar;
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                Void r2 = (Void) obj3;
                                return this.a;
                            }
                        });
                    }
                }, dbie.a()).thenApplyAsync(new Function(dbfrVar) { // from class: dbfk
                    private final dbfr a;

                    {
                        this.a = dbfrVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:254:0x061a  */
                    /* JADX WARN: Removed duplicated region for block: B:326:0x0665 A[SYNTHETIC] */
                    @Override // java.util.function.Function
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r38) {
                        /*
                            Method dump skipped, instructions count: 2234
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbfk.apply(java.lang.Object):java.lang.Object");
                    }
                }, dbie.a());
                thenApplyAsync.exceptionally(dbfl.a);
                if (obj != null) {
                    b().d(obj, thenApplyAsync);
                }
                String simpleName2 = a().getSimpleName();
                String valueOf2 = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                sb2.append("Unable to load Renderable registryId='");
                sb2.append(valueOf2);
                sb2.append("'");
                dbew.a(simpleName2, thenApplyAsync, sb2.toString());
                return (CompletableFuture<T>) thenApplyAsync.thenApply(new Function(this) { // from class: dbhc
                    private final dbhd a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (dbhe) this.a.a().cast(((dbhe) obj2).d());
                    }
                });
            }
            return (CompletableFuture<T>) a.thenApply(new Function(this) { // from class: dbhb
                private final dbhd a;

                {
                    this.a = this;
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return (dbhe) this.a.a().cast(((dbhe) obj2).d());
                }
            });
        } catch (Throwable th) {
            CompletableFuture<T> completableFuture2 = new CompletableFuture<>();
            completableFuture2.completeExceptionally(th);
            String simpleName3 = a().getSimpleName();
            String valueOf3 = String.valueOf(this.a);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 39);
            sb3.append("Unable to load Renderable registryId='");
            sb3.append(valueOf3);
            sb3.append("'");
            dbew.a(simpleName3, completableFuture2, sb3.toString());
            return completableFuture2;
        }
    }
}
