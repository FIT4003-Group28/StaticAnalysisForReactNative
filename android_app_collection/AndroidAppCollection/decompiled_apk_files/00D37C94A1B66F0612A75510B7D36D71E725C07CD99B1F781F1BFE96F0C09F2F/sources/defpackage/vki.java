package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: vki  reason: default package */
/* loaded from: classes4.dex */
public final class vki implements vja {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public vki(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public static vki b() {
        return new vki(false, false);
    }

    @Override // defpackage.vja
    public final /* bridge */ /* synthetic */ Object a(viz vizVar) {
        vjr vjrVar;
        vjq vjqVar;
        Closeable f;
        FileChannel channel;
        vjp vjpVar;
        FileLock tryLock;
        Uri build = vizVar.e.buildUpon().path(String.valueOf(vizVar.f.getPath()).concat(".lock")).fragment("").build();
        if (!this.a) {
            Semaphore a = vizVar.b.b().a(build.toString());
            try {
                a.acquire();
                vjrVar = new vjr(a);
                try {
                    vjqVar = new vjq(vjrVar.a());
                } finally {
                    try {
                        vjrVar.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("semaphore not acquired: ");
                sb.append(valueOf);
                throw new InterruptedIOException(sb.toString());
            }
        } else {
            Semaphore a2 = vizVar.b.b().a(build.toString());
            if (true != a2.tryAcquire()) {
                a2 = null;
            }
            vjrVar = new vjr(a2);
            try {
                if (vjrVar.a != null) {
                    vjqVar = new vjq(vjrVar.a());
                } else {
                    vjrVar.close();
                    vjqVar = null;
                }
            } finally {
                try {
                    vjrVar.close();
                } catch (Throwable unused2) {
                }
            }
        }
        vju a3 = vju.a(vjqVar);
        try {
            if (a3.a != null) {
                if (!this.b) {
                    f = vizVar.b.f(build);
                } else if (!this.c) {
                    f = (Closeable) vizVar.a.c(build, new vkg(3));
                } else {
                    f = vizVar.b.d(build);
                }
                vju a4 = vju.a(f);
                Closeable closeable = a4.a;
                if (closeable instanceof vjl) {
                    channel = ((vjl) closeable).a();
                } else if (closeable instanceof RandomAccessFile) {
                    channel = ((RandomAccessFile) closeable).getChannel();
                } else {
                    throw new IOException("Lock stream not convertible to FileChannel");
                }
                FileChannel fileChannel = channel;
                if (!this.a) {
                    vizVar.b.b();
                    vjpVar = new vjp(fileChannel.lock(0L, Long.MAX_VALUE, this.b));
                } else {
                    vizVar.b.b();
                    try {
                        tryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, this.b);
                    } catch (IOException unused3) {
                    }
                    vjpVar = tryLock == null ? null : new vjp(tryLock);
                }
                vju a5 = vju.a(vjpVar);
                if (a5.a == null) {
                    a5.close();
                    a4.close();
                } else {
                    final Closeable b = a3.b();
                    final Closeable b2 = a4.b();
                    final Closeable b3 = a5.b();
                    Closeable closeable2 = new Closeable() { // from class: vkh
                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            Closeable closeable3 = b;
                            Closeable closeable4 = b2;
                            Closeable closeable5 = b3;
                            if (closeable5 != null) {
                                try {
                                    closeable5.close();
                                }
                            }
                            if (closeable4 != null) {
                                closeable4.close();
                            }
                            if (closeable3 != null) {
                                closeable3.close();
                            }
                        }
                    };
                    a5.close();
                    a4.close();
                    a3.close();
                    return closeable2;
                }
            }
            return null;
        } finally {
            try {
                a3.close();
            } catch (Throwable unused4) {
            }
        }
    }
}
