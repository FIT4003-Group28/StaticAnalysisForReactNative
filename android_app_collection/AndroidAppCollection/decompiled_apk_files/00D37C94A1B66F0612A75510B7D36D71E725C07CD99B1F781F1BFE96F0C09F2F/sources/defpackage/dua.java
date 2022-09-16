package defpackage;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.SettableFuture;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dua  reason: default package */
/* loaded from: classes3.dex */
public final class dua extends dux {
    private static final duy h = new duy();
    private final Context i;
    private final dnq j;

    public dua(dtq dtqVar, aopa aopaVar, int i, Context context, dnq dnqVar) {
        super(dtqVar, "JIe8kIj3R382ivBBuQtMEsg4EGgVW1pnVVx1053uETSK+LqBvlt6HYm9Qd3bhtgC", "QD9dQ8yEk6iHamm5KPxnCPuxMXZqh6R9GdhVEqW1meI=", aopaVar, i, 27);
        this.i = context;
        this.j = dnqVar;
    }

    public static String c(dnq dnqVar) {
        if (dnqVar == null || (dnqVar.b & 2) == 0) {
            return null;
        }
        dns dnsVar = dnqVar.d;
        if (dnsVar == null) {
            dnsVar = dns.a;
        }
        if (dts.g(dnsVar.b)) {
            return null;
        }
        dns dnsVar2 = dnqVar.d;
        if (dnsVar2 == null) {
            dnsVar2 = dns.a;
        }
        return dnsVar2.b;
    }

    private final String d() {
        try {
            Future future = this.a.j;
            if (future != null) {
                future.get();
            }
            dnw dnwVar = this.a.i;
            if (dnwVar != null && (dnwVar.b & 4194304) != 0) {
                return dnwVar.s;
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    private final boolean e() {
        return this.a.m;
    }

    @Override // defpackage.dux
    protected final void a() {
        boolean z;
        Boolean valueOf;
        int i;
        drt drtVar;
        AtomicReference a = h.a(this.i.getPackageName());
        synchronized (a) {
            drt drtVar2 = (drt) a.get();
            if (drtVar2 == null || dts.g(drtVar2.a) || drtVar2.a.equals("E") || drtVar2.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!dts.g(c(this.j))) {
                    i = 5;
                } else {
                    dnq dnqVar = this.j;
                    if (!dts.g(c(dnqVar))) {
                        valueOf = false;
                    } else {
                        if (dnqVar != null && (dnqVar.b & 1) != 0) {
                            dnr dnrVar = dnqVar.c;
                            if (dnrVar == null) {
                                dnrVar = dnr.a;
                            }
                            int b = dnt.b(dnrVar.c);
                            if (b != 0 && b == 4) {
                                z = true;
                                valueOf = Boolean.valueOf(z);
                            }
                        }
                        z = false;
                        valueOf = Boolean.valueOf(z);
                    }
                    i = (!valueOf.booleanValue() || !e()) ? 3 : 4;
                }
                Boolean valueOf2 = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) qdb.f.e();
                String b2 = ((Boolean) qdb.e.e()).booleanValue() ? b() : null;
                if (bool.booleanValue() && e() && dts.g(b2)) {
                    b2 = d();
                }
                drt drtVar3 = new drt((String) this.d.invoke(null, this.i, valueOf2, b2));
                if (dts.g(drtVar3.a) || drtVar3.a.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = d();
                        if (!dts.g(d)) {
                            drtVar3.a = d;
                        }
                    } else if (i2 == 4) {
                        dns dnsVar = this.j.d;
                        if (dnsVar == null) {
                            dnsVar = dns.a;
                        }
                        drtVar3.a = dnsVar.b;
                    }
                }
                a.set(drtVar3);
            }
            drtVar = (drt) a.get();
        }
        synchronized (this.g) {
            if (drtVar != null) {
                aopa aopaVar = this.g;
                String str = drtVar.a;
                aopaVar.copyOnWrite();
                dnw dnwVar = (dnw) aopaVar.instance;
                dnw dnwVar2 = dnw.a;
                str.getClass();
                dnwVar.b |= 4194304;
                dnwVar.s = str;
                aopa aopaVar2 = this.g;
                long j = drtVar.b;
                aopaVar2.copyOnWrite();
                dnw dnwVar3 = (dnw) aopaVar2.instance;
                dnwVar3.b |= 536870912;
                dnwVar3.y = j;
                aopa aopaVar3 = this.g;
                String str2 = drtVar.c;
                aopaVar3.copyOnWrite();
                dnw dnwVar4 = (dnw) aopaVar3.instance;
                str2.getClass();
                dnwVar4.b |= 268435456;
                dnwVar4.x = str2;
                aopa aopaVar4 = this.g;
                String str3 = drtVar.d;
                aopaVar4.copyOnWrite();
                dnw dnwVar5 = (dnw) aopaVar4.instance;
                str3.getClass();
                dnwVar5.c |= 128;
                dnwVar5.H = str3;
                aopa aopaVar5 = this.g;
                String str4 = drtVar.e;
                aopaVar5.copyOnWrite();
                dnw dnwVar6 = (dnw) aopaVar5.instance;
                str4.getClass();
                dnwVar6.c |= 256;
                dnwVar6.I = str4;
            }
        }
    }

    protected final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] i = dts.i((String) qdb.g.e());
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(dts.i((String) qdb.h.e()))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.a.b;
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final SettableFuture f = SettableFuture.f();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: duz
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    SettableFuture settableFuture = SettableFuture.this;
                    if (list == null) {
                        settableFuture.o(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i2);
                            if (apkChecksum.getType() == 8) {
                                settableFuture.o(dts.c(apkChecksum.getValue()));
                                return;
                            }
                        }
                        settableFuture.o(null);
                    } catch (Throwable unused) {
                        settableFuture.o(null);
                    }
                }
            });
            return (String) f.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
