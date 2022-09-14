package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.filament.Material;
import com.google.ar.sceneform.rendering.EngineInstance;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;
import java.util.function.Supplier;
/* compiled from: PG */
/* renamed from: dbfx  reason: default package */
/* loaded from: classes5.dex */
public final class dbfx {
    ByteBuffer a;
    public Callable<InputStream> b;
    public Object c;

    public static final Material b(ByteBuffer byteBuffer) {
        try {
            Material.Builder builder = new Material.Builder();
            builder.payload(byteBuffer, byteBuffer.limit());
            return builder.build(EngineInstance.a().a);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to create material from source byte buffer.", e);
        }
    }

    public final CompletableFuture<com.google.ar.sceneform.rendering.Material> a() {
        CompletableFuture<com.google.ar.sceneform.rendering.Material> a;
        try {
            dbix.a();
            boolean z = true;
            if (this.b == null && this.a == null) {
                z = false;
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                throw new AssertionError("Material must have a source.");
            }
            Object obj = this.c;
            if (obj == null || (a = dbhs.b().c.a(obj)) == null) {
                ByteBuffer byteBuffer = this.a;
                if (byteBuffer == null) {
                    final Callable<InputStream> callable = this.b;
                    if (callable == null) {
                        CompletableFuture<com.google.ar.sceneform.rendering.Material> completableFuture = new CompletableFuture<>();
                        completableFuture.completeExceptionally(new AssertionError("Input Stream Creator is null."));
                        return completableFuture;
                    }
                    CompletableFuture<com.google.ar.sceneform.rendering.Material> thenApplyAsync = CompletableFuture.supplyAsync(new Supplier(callable) { // from class: dbfu
                        private final Callable a;

                        {
                            this.a = callable;
                        }

                        @Override // java.util.function.Supplier
                        public final Object get() {
                            try {
                                InputStream inputStream = (InputStream) this.a.call();
                                ByteBuffer a2 = dbjc.a(inputStream);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (a2 == null) {
                                    throw new IllegalStateException("Unable to read data from input stream.");
                                }
                                return a2;
                            } catch (Exception e) {
                                throw new CompletionException(e);
                            }
                        }
                    }, AsyncTask.THREAD_POOL_EXECUTOR).thenApplyAsync(new Function() { // from class: dbfv
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new com.google.ar.sceneform.rendering.Material(new dbgc(dbfx.b((ByteBuffer) obj2)));
                        }
                    }, dbie.a());
                    if (obj != null) {
                        dbhs.b().c.d(obj, thenApplyAsync);
                    }
                    return thenApplyAsync.thenApply((Function<? super com.google.ar.sceneform.rendering.Material, ? extends U>) dbfw.a);
                }
                com.google.ar.sceneform.rendering.Material material = new com.google.ar.sceneform.rendering.Material(new dbgc(b(byteBuffer)));
                if (obj != null) {
                    dbhs.b().c.d(obj, CompletableFuture.completedFuture(material));
                }
                CompletableFuture<com.google.ar.sceneform.rendering.Material> completedFuture = CompletableFuture.completedFuture(material.a());
                String str = com.google.ar.sceneform.rendering.Material.a;
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Unable to load Material registryId='");
                sb.append(valueOf);
                sb.append("'");
                dbew.a(str, completedFuture, sb.toString());
                return completedFuture;
            }
            return a.thenApply(dbft.a);
        } catch (Throwable th) {
            CompletableFuture<com.google.ar.sceneform.rendering.Material> completableFuture2 = new CompletableFuture<>();
            completableFuture2.completeExceptionally(th);
            String str2 = com.google.ar.sceneform.rendering.Material.a;
            String valueOf2 = String.valueOf(this.c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 37);
            sb2.append("Unable to load Material registryId='");
            sb2.append(valueOf2);
            sb2.append("'");
            dbew.a(str2, completableFuture2, sb2.toString());
            return completableFuture2;
        }
    }

    public final void c(Context context, int i) {
        this.c = context.getResources().getResourceName(i);
        this.b = dbja.a(context, i);
        this.a = null;
    }
}
