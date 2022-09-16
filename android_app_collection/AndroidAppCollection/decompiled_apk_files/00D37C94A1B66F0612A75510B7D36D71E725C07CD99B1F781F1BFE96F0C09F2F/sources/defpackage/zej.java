package defpackage;

import android.os.Looper;
import com.google.android.libraries.stitch.sslguard.SslGuardServerSocketFactory;
import com.google.android.libraries.stitch.sslguard.SslGuardSocketFactory;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.Security;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: zej  reason: default package */
/* loaded from: classes4.dex */
public final class zej {
    public static volatile boolean a = false;
    private static boolean d = false;
    public final Executor b;
    public final azqb c;
    private final boolean e;
    private final zeh f;
    private final zei g;

    public zej(boolean z, azqb azqbVar, Executor executor, zeh zehVar, zei zeiVar) {
        this.e = z;
        this.c = azqbVar;
        this.b = executor;
        this.f = zehVar;
        this.g = zeiVar;
    }

    public final void a() {
        if (a) {
            return;
        }
        synchronized (zej.class) {
            if (a) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    zep.b("Blocking main thread on ProviderInstaller.");
                }
                if (this.e && !d) {
                    final amqo i = aqxo.i(new amqo() { // from class: zee
                        @Override // defpackage.amqo
                        public final Object get() {
                            return ((CronetEngine) zej.this.c.get()).createURLStreamHandlerFactory();
                        }
                    });
                    URL.setURLStreamHandlerFactory(new URLStreamHandlerFactory() { // from class: zeg
                        @Override // java.net.URLStreamHandlerFactory
                        public final URLStreamHandler createURLStreamHandler(String str) {
                            return ((URLStreamHandlerFactory) amqo.this.get()).createURLStreamHandler(str);
                        }
                    });
                    d = true;
                }
                if (this.e) {
                    zei zeiVar = this.g;
                    vim vimVar = new vim(new vio());
                    vin vinVar = new vin(zeiVar.a);
                    synchronized (vim.a) {
                        if (vin.a != null) {
                            int i2 = vin.a.c;
                        } else {
                            vin.a = vinVar;
                            if (vim.b == null) {
                                vim.b = new viq();
                            }
                            if (Security.insertProviderAt(vim.b, 1) == 1) {
                                SslGuardSocketFactory.a(vimVar.c);
                                SslGuardServerSocketFactory.a(vimVar.c);
                                vim.b();
                                vim.a();
                            } else {
                                throw new RuntimeException("Failed to install SslGuard with top priority.");
                            }
                        }
                    }
                } else {
                    rtt.a(this.f.a);
                }
                a = true;
            } catch (qsc | qsd e) {
                zep.n("ProviderInstaller failed.", e);
                a = true;
            }
        }
    }
}
