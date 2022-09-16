package defpackage;

import android.os.Build;
import com.google.android.libraries.stitch.sslguard.SslGuardServerSocketFactory;
import com.google.android.libraries.stitch.sslguard.SslGuardSocketFactory;
import java.lang.reflect.Field;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
/* compiled from: PG */
/* renamed from: vim  reason: default package */
/* loaded from: classes4.dex */
public final class vim {
    public static viq b;
    public vip c;
    public static final Object a = new Object();
    private static final String d = SslGuardSocketFactory.class.getName();
    private static final String e = SslGuardServerSocketFactory.class.getName();

    private vim() {
    }

    public vim(vip vipVar) {
        this.c = vipVar;
    }

    public static final void a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new vir()}, null);
            SSLContext.setDefault(sSLContext);
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (KeyManagementException | NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final void b() {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("Default");
                Field declaredField = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
                declaredField.setAccessible(true);
                declaredField.set(null, sSLContext.getSocketFactory());
                Field declaredField2 = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
                declaredField2.setAccessible(true);
                declaredField2.set(null, sSLContext.getServerSocketFactory());
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
        Security.setProperty("ssl.SocketFactory.provider", d);
        Security.setProperty("ssl.ServerSocketFactory.provider", e);
    }
}
