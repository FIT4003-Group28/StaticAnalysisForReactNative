package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cxcj  reason: default package */
/* loaded from: classes5.dex */
final class cxcj extends cxch implements cwqx, cwwr {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final cwwo b;
    public final Application c;
    public final dxio<cxcg> d;
    public final cxet e;
    private final cwrb f;
    private final dehq g;

    public cxcj(cwwp cwwpVar, Context context, cwrb cwrbVar, dehq dehqVar, dxio<cxcg> dxioVar, cxet cxetVar, dzsj<cxfg> dzsjVar) {
        this.b = cwwpVar.a(dehqVar, dxioVar, dzsjVar);
        this.g = dehqVar;
        this.c = (Application) context;
        this.d = dxioVar;
        this.e = cxetVar;
        this.f = cwrbVar;
    }

    @Override // defpackage.cwud
    public final void Sz() {
        this.f.b(this);
    }

    @Override // defpackage.cwqx
    public final void b(Activity activity) {
        this.f.b(this);
        cwtl.a(deha.f(new deff(this) { // from class: cxci
            private final cxcj a;

            {
                this.a = this;
            }

            @Override // defpackage.deff
            public final dehn a() {
                File parentFile;
                dcdc e;
                cxcj cxcjVar = this.a;
                if (cxcjVar.d.a().c()) {
                    return dehk.a;
                }
                if (!cqvm.c(cxcjVar.c)) {
                    return dehk.a;
                }
                czhz.c();
                cxet cxetVar = cxcjVar.e;
                long j = cxcj.a;
                czhz.c();
                if (cqvm.c(cxetVar.a)) {
                    long j2 = cqvm.c(cxetVar.a) ? cxetVar.c.a().getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime < j2) {
                        cxetVar.c.a().edit().remove("primes.packageMetric.lastSendTime").commit();
                        j2 = -1;
                    }
                    if (j2 != -1 && elapsedRealtime <= j2 + j) {
                        return dehk.a;
                    }
                }
                PackageStats a2 = cxby.a(cxcjVar.c);
                if (a2 == null) {
                    return deha.b(new IllegalStateException("PackageStats capture failed."));
                }
                eacc bZ = eacd.u.bZ();
                eabm bZ2 = eabp.k.bZ();
                long j3 = a2.cacheSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar = (eabp) bZ2.b;
                eabpVar.a |= 1;
                eabpVar.b = j3;
                long j4 = a2.codeSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar2 = (eabp) bZ2.b;
                eabpVar2.a |= 2;
                eabpVar2.c = j4;
                long j5 = a2.dataSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar3 = (eabp) bZ2.b;
                eabpVar3.a |= 4;
                eabpVar3.d = j5;
                long j6 = a2.externalCacheSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar4 = (eabp) bZ2.b;
                eabpVar4.a |= 8;
                eabpVar4.e = j6;
                long j7 = a2.externalCodeSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar5 = (eabp) bZ2.b;
                eabpVar5.a |= 16;
                eabpVar5.f = j7;
                long j8 = a2.externalDataSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar6 = (eabp) bZ2.b;
                eabpVar6.a |= 32;
                eabpVar6.g = j8;
                long j9 = a2.externalMediaSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar7 = (eabp) bZ2.b;
                eabpVar7.a |= 64;
                eabpVar7.h = j9;
                long j10 = a2.externalObbSize;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                eabp eabpVar8 = (eabp) bZ2.b;
                eabpVar8.a |= 128;
                eabpVar8.i = j10;
                eabp bK = bZ2.bK();
                dsqp dsqpVar = (dsqp) bK.cu(5);
                dsqpVar.bC(bK);
                eabm eabmVar = (eabm) dsqpVar;
                dbsg<cxbw> d = cxcjVar.d.a().d();
                if (d.a() && d.b().b() == 3 && cxcjVar.b.a()) {
                    cxbw b = d.b();
                    if (eabmVar.c) {
                        eabmVar.bF();
                        eabmVar.c = false;
                    }
                    ((eabp) eabmVar.b).j = eabp.ck();
                    Application application = cxcjVar.c;
                    int c = b.c();
                    dcdc<Pattern> d2 = b.d();
                    czhz.c();
                    ArrayList arrayList = new ArrayList();
                    try {
                        try {
                            parentFile = new File(application.getPackageManager().getApplicationInfo(application.getPackageName(), 0).dataDir);
                        } catch (PackageManager.NameNotFoundException unused) {
                            File filesDir = application.getFilesDir();
                            parentFile = filesDir != null ? filesDir.getParentFile() : null;
                        }
                        if (parentFile == null) {
                            e = dcdc.e();
                        } else {
                            cxbt cxbtVar = new cxbt(parentFile, arrayList, c, d2);
                            cxbs cxbsVar = new cxbs(cxbtVar);
                            cxbtVar.a(cxbsVar);
                            cxbtVar.b(cxbsVar);
                            cxbs poll = cxbtVar.c.poll();
                            Pair<File, String> poll2 = cxbtVar.d.poll();
                            int length = poll2 != null ? ((String) poll2.second).split("/").length : Integer.MAX_VALUE;
                            while (cxbtVar.e.size() < 512 && (poll != null || poll2 != null)) {
                                if (poll2 != null && (poll == null || poll.b > length)) {
                                    File file = (File) poll2.first;
                                    String str = (String) poll2.second;
                                    Iterator<Pattern> it = cxbtVar.b.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        } else if (it.next().matcher(str).matches()) {
                                            eabn bZ3 = eabo.e.bZ();
                                            if (bZ3.c) {
                                                bZ3.bF();
                                                bZ3.c = false;
                                            }
                                            eabo eaboVar = (eabo) bZ3.b;
                                            str.getClass();
                                            eaboVar.a |= 1;
                                            eaboVar.b = str;
                                            long length2 = file.length();
                                            if (bZ3.c) {
                                                bZ3.bF();
                                                bZ3.c = false;
                                            }
                                            eabo eaboVar2 = (eabo) bZ3.b;
                                            eaboVar2.a |= 2;
                                            eaboVar2.d = length2;
                                            cxbtVar.e.add(bZ3.bK());
                                        }
                                    }
                                    poll2 = cxbtVar.d.poll();
                                    if (poll2 != null) {
                                        length = ((String) poll2.second).split("/").length;
                                    }
                                }
                                cxbtVar.b(poll);
                                cxbtVar.a(poll);
                                poll = cxbtVar.c.poll();
                                if (poll2 == null && !cxbtVar.d.isEmpty()) {
                                    poll2 = cxbtVar.d.poll();
                                    length = ((String) poll2.second).split("/").length;
                                }
                            }
                            e = dcdc.r(arrayList);
                        }
                    } catch (Exception unused2) {
                        e = dcdc.e();
                    }
                    if (eabmVar.c) {
                        eabmVar.bF();
                        eabmVar.c = false;
                    }
                    eabp eabpVar9 = (eabp) eabmVar.b;
                    eabpVar9.c();
                    dsod.bv(e, eabpVar9.j);
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eacd eacdVar = (eacd) bZ.b;
                eabp bK2 = eabmVar.bK();
                bK2.getClass();
                eacdVar.j = bK2;
                eacdVar.a |= 256;
                cxet cxetVar2 = cxcjVar.e;
                if (cqvm.c(cxetVar2.a)) {
                    cxetVar2.c.a().edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit();
                }
                cwwo cwwoVar = cxcjVar.b;
                cwwi f = cwwj.f();
                f.c(bZ.bK());
                return cwwoVar.c(f.a());
            }
        }, this.g));
    }

    @Override // defpackage.cwwr
    public final void g() {
        this.f.a(this);
    }
}
