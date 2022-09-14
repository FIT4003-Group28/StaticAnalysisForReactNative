package defpackage;

import android.app.Application;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: dcq  reason: default package */
/* loaded from: classes5.dex */
public final class dcq implements cze {
    public final Application a;
    private final dxio<dcn> b;
    private boolean c = false;
    private final HashSet<dehn<dck>> d = new HashSet<>();

    public dcq(Application application, dxio<dcn> dxioVar) {
        this.a = application;
        this.b = dxioVar;
    }

    private final synchronized dehn<dck> d(dehn<dck> dehnVar) {
        dehn<dck> o;
        if (this.c) {
            o = deha.c();
        } else {
            o = deha.o(dehnVar);
            this.d.add(o);
        }
        return o;
    }

    private final synchronized void e(dehn<dck> dehnVar) {
        this.d.remove(dehnVar);
    }

    @Override // defpackage.cze
    public final Callable<InputStream> a(final czd czdVar) {
        final String lastPathSegment = Uri.parse(czdVar.c()).getLastPathSegment();
        dbsk.s(lastPathSegment);
        dbsk.a(!lastPathSegment.isEmpty());
        return new Callable(this, czdVar, lastPathSegment) { // from class: dcp
            private final dcq a;
            private final czd b;
            private final String c;

            {
                this.a = this;
                this.b = czdVar;
                this.c = lastPathSegment;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(this.b, this.c);
            }
        };
    }

    @Override // defpackage.cze
    public final synchronized void b() {
        this.c = true;
        Iterator<dehn<dck>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().cancel(false);
        }
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream c(czd czdVar, String str) {
        FileInputStream fileInputStream;
        File file = new File(new File(this.a.getCacheDir(), "ar_assets"), czdVar.a());
        File file2 = new File(file, str);
        if (file2.exists()) {
            synchronized (this) {
                if (this.c) {
                    throw new CancellationException("The ArAssetManager has been shutdown");
                }
                fileInputStream = new FileInputStream(file2);
            }
            return fileInputStream;
        }
        dehn<dck> d = d(this.b.a().a(czdVar.c(), file, str));
        try {
            try {
                dck dckVar = d.get(20L, TimeUnit.SECONDS);
                if (dckVar != null && dckVar.c() == 1) {
                    dbsk.l(file2.getCanonicalPath().equals(dckVar.a().getCanonicalPath()));
                    File a = dckVar.a();
                    dbsk.s(a);
                    return new FileInputStream(a);
                }
                String valueOf = String.valueOf(czdVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                sb.append("Failed to download asset from URL. Asset: ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            } catch (InterruptedException e) {
                e = e;
                String valueOf2 = String.valueOf(czdVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                sb2.append("Failed to download asset from URL. Asset: ");
                sb2.append(valueOf2);
                throw new IOException(sb2.toString(), e);
            } catch (ExecutionException e2) {
                e = e2;
                String valueOf22 = String.valueOf(czdVar);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 42);
                sb22.append("Failed to download asset from URL. Asset: ");
                sb22.append(valueOf22);
                throw new IOException(sb22.toString(), e);
            } catch (TimeoutException e3) {
                String valueOf3 = String.valueOf(czdVar);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 51);
                sb3.append("Timeout while attempting to download asset. Asset: ");
                sb3.append(valueOf3);
                throw new IOException(sb3.toString(), e3);
            }
        } finally {
            e(d);
        }
    }
}
