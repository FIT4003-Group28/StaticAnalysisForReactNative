package defpackage;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: dywh  reason: default package */
/* loaded from: classes6.dex */
public final class dywh extends dykl<dywh> {
    static final dyxh b;
    public static final dyvf<Executor> c;
    public Executor d;
    public ScheduledExecutorService e;
    public SSLSocketFactory f;
    private final dysf n;
    public final dyvq a = dyvr.a;
    public final dyxh g = b;
    public int m = 1;
    public final long h = Long.MAX_VALUE;
    public final long i = dyow.i;
    public final int j = 65535;
    public final int k = 4194304;
    public final int l = Integer.MAX_VALUE;

    static {
        dyxg dyxgVar = new dyxg(dyxh.a);
        dyxgVar.b(dyxf.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, dyxf.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, dyxf.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, dyxf.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, dyxf.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, dyxf.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, dyxf.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, dyxf.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        dyxgVar.d(dyxu.TLS_1_2);
        dyxgVar.f();
        b = dyxgVar.a();
        TimeUnit.DAYS.toNanos(1000L);
        c = new dywc();
        EnumSet.noneOf(dyjk.class);
    }

    private dywh(String str) {
        this.n = new dysf(str, new dywe(this), new dywd(this));
    }

    public static dywh a(String str, int i) {
        return new dywh(dyow.f(str, i));
    }

    @Override // defpackage.dykl
    protected final dyhj<?> b() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final SSLSocketFactory s() {
        int i = this.m;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                try {
                    if (this.f == null) {
                        this.f = SSLContext.getInstance("Default", dyxs.b.c).getSocketFactory();
                    }
                    return this.f;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("TLS Provider failure", e);
                }
            }
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unknown negotiation type: ");
            sb.append("TLS");
            throw new RuntimeException(sb.toString());
        }
        throw null;
    }
}
