package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: buhf  reason: default package */
/* loaded from: classes4.dex */
public final class buhf implements btzh<dssj, dssj> {
    public final crzp<btvo> a = new buhe(this);
    public final Executor b;
    public final bvjj c;
    public final afec d;
    public final akfa e;
    @dzsi
    public final bvgq f;
    public final btnd<String, String> g;
    public String h;
    public final btxc i;
    private final ckcw j;
    private final btvo k;
    private final dxio<aehr> l;

    public buhf(ckcw ckcwVar, btvo btvoVar, btxc btxcVar, Executor executor, bvjj bvjjVar, dxio dxioVar, afec afecVar, akfa akfaVar, btmv btmvVar, Context context, cqat cqatVar) {
        this.j = ckcwVar;
        this.k = btvoVar;
        this.i = btxcVar;
        this.b = executor;
        this.c = bvjjVar;
        this.l = dxioVar;
        this.d = afecVar;
        this.e = akfaVar;
        this.h = h(akfaVar.j());
        File dir = context.getDir("place_details_response_cache", 0);
        long millis = TimeUnit.SECONDS.toMillis(btvoVar.getPlaceSheetParameters().K());
        bvgq bvgqVar = null;
        if ((dir.exists() || dir.mkdir()) && dir.canWrite()) {
            bvgqVar = new bvgq(context, dir, cqatVar, millis);
        }
        this.f = bvgqVar;
        this.g = new btnd<>(25, btmvVar, eaow.d(btvoVar.getPlaceSheetParameters().K()), cqatVar);
    }

    public static String h(@dzsi btlu btluVar) {
        String h = btlu.h(btluVar);
        return h != null ? h : "NO_ACCOUNT";
    }

    private final long j() {
        return this.g.k();
    }

    private final void k(ckha ckhaVar, long j) {
        ((ckcp) this.j.a(ckhaVar)).a(j);
    }

    @Override // defpackage.btzh
    public final synchronized btzg<dssj> a(dssj dssjVar) {
        long j;
        dvzl dvzlVar;
        dvzl dvzlVar2;
        if (g() && (dssjVar instanceof dvzj)) {
            if (this.d.a()) {
                return btzg.b();
            }
            String f = f((dvzj) dssjVar);
            String a = this.g.a(f);
            if (!dbsj.d(a) && (dvzlVar2 = (dvzl) bvrs.i(a, (dssr) dvzl.g.cu(7))) != null) {
                k(ckip.ad, j());
                return btzg.a(dvzlVar2);
            }
            k(ckip.ae, j());
            if (this.f != null) {
                try {
                    String str = d(f).get(25L, TimeUnit.MILLISECONDS);
                    try {
                        j = this.f.b().c();
                    } catch (IOException unused) {
                        j = 0;
                    }
                    long j2 = j / 200000;
                    if (!dbsj.d(str) && (dvzlVar = (dvzl) bvrs.i(str, (dssr) dvzl.g.cu(7))) != null) {
                        k(ckip.af, j2);
                        return btzg.a(dvzlVar);
                    }
                    k(ckip.ag, j2);
                } catch (Exception unused2) {
                }
            }
            return btzg.b();
        }
        return btzg.b();
    }

    @Override // defpackage.btzh
    public final synchronized void b(dssj dssjVar, btzg<dssj> btzgVar) {
        if (g() && (dssjVar instanceof dvzj)) {
            if (this.d.a()) {
                return;
            }
            if (!btzgVar.c()) {
                return;
            }
            dvzj dvzjVar = (dvzj) dssjVar;
            dvzl dvzlVar = (dvzl) btzgVar.d();
            dvus dvusVar = dvzlVar.d;
            if (dvusVar == null) {
                dvusVar = dvus.c;
            }
            dvva dvvaVar = dvusVar.a;
            if (dvvaVar == null) {
                dvvaVar = dvva.b;
            }
            if (dvvaVar.a.size() > 0) {
                ((ckco) this.j.a(ckip.ah)).a(ckin.a(1));
                return;
            }
            dvyw dvywVar = dvzlVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            drck drckVar = dvywVar.bt;
            if (drckVar == null) {
                drckVar = drck.b;
            }
            if (!drckVar.a) {
                dpml dpmlVar = dvywVar.O;
                if (dpmlVar == null) {
                    dpmlVar = dpml.c;
                }
                if ((dpmlVar.a & 1) == 0 && (dvywVar.d & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0 && !dvywVar.M && !dvywVar.N) {
                    if (this.l.a().i()) {
                        dnzj dnzjVar = dvzjVar.m;
                        if (dnzjVar == null) {
                            dnzjVar = dnzj.Z;
                        }
                        dnnn dnnnVar = dnzjVar.d;
                        if (dnnnVar == null) {
                            dnnnVar = dnnn.l;
                        }
                        if (!aehr.c(dnnnVar)) {
                            dnng dnngVar = dvywVar.X;
                            if (dnngVar == null) {
                                dnngVar = dnng.r;
                            }
                            dnnn dnnnVar2 = dnngVar.b;
                            if (dnnnVar2 == null) {
                                dnnnVar2 = dnnn.l;
                            }
                            if (aehr.c(dnnnVar2)) {
                                ((ckco) this.j.a(ckip.ah)).a(ckin.a(3));
                                return;
                            }
                        }
                    }
                    String f = f(dvzjVar);
                    String encodeToString = Base64.encodeToString(btzgVar.d().bS(), 0);
                    this.g.Pz(f, encodeToString);
                    e(f, encodeToString);
                    return;
                }
                ((ckco) this.j.a(ckip.ah)).a(ckin.a(2));
                return;
            }
            ((ckco) this.j.a(ckip.ah)).a(ckin.a(4));
        }
    }

    public final synchronized void c() {
        if (!g()) {
            return;
        }
        if (this.d.a()) {
            return;
        }
        this.g.e();
        bvgq bvgqVar = this.f;
        if (bvgqVar == null) {
            return;
        }
        bvgqVar.a();
    }

    public final Future<String> d(final String str) {
        final deig d = deig.d();
        this.b.execute(new Runnable(this, str, d) { // from class: buhc
            private final buhf a;
            private final String b;
            private final deig c;

            {
                this.a = this;
                this.b = str;
                this.c = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                buhf buhfVar = this.a;
                String str2 = this.b;
                deig deigVar = this.c;
                bvgq bvgqVar = buhfVar.f;
                if (bvgqVar != null) {
                    try {
                        dxdy b = bvgqVar.b.a(str2) ? bvgqVar.b().b(str2) : null;
                        if (b != null) {
                            deigVar.j(dxec.a(new InputStreamReader(b.a(), dxec.b)));
                            return;
                        }
                    } catch (IOException | IllegalStateException unused) {
                    }
                }
                deigVar.j(null);
            }
        });
        return d;
    }

    public final synchronized void e(final String str, final String str2) {
        if (this.f == null) {
            return;
        }
        this.b.execute(new Runnable(this, str, str2) { // from class: buhd
            private final buhf a;
            private final String b;
            private final String c;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(this.b, this.c);
            }
        });
    }

    final String f(dvzj dvzjVar) {
        dvzi dvziVar = (dvzi) dvzj.y.ca(dvzjVar);
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar2 = (dvzj) dvziVar.b;
        dvzjVar2.a &= -3;
        dvzjVar2.c = dvzj.y.c;
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar3 = (dvzj) dvziVar.b;
        dvzjVar3.e = null;
        dvzjVar3.a &= -9;
        dvzjVar3.f = dvzj.cf();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar4 = (dvzj) dvziVar.b;
        dvzjVar4.g = null;
        int i = dvzjVar4.a & (-17);
        dvzjVar4.a = i;
        int i2 = i & (-33);
        dvzjVar4.a = i2;
        dvzjVar4.h = true;
        int i3 = i2 & (-65);
        dvzjVar4.a = i3;
        dvzjVar4.i = false;
        dvzjVar4.j = null;
        int i4 = i3 & (-129);
        dvzjVar4.a = i4;
        dvzjVar4.l = null;
        int i5 = i4 & (-4097);
        dvzjVar4.a = i5;
        dvzjVar4.m = null;
        int i6 = i5 & (-16385);
        dvzjVar4.a = i6;
        dvzjVar4.q = null;
        int i7 = (-1048577) & i6;
        dvzjVar4.a = i7;
        dvzjVar4.a = i7 & (-2097153);
        dvzjVar4.r = false;
        dnnh bZ = dnnn.l.bZ();
        dnzj dnzjVar = dvzjVar.m;
        if (dnzjVar == null) {
            dnzjVar = dnzj.Z;
        }
        dnnn dnnnVar = dnzjVar.d;
        if (dnnnVar == null) {
            dnnnVar = dnnn.l;
        }
        int a = dnnm.a(dnnnVar.f);
        if (a == 0) {
            a = 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnnn dnnnVar2 = (dnnn) bZ.b;
        dnnnVar2.f = a - 1;
        dnnnVar2.a |= 16;
        dnzj dnzjVar2 = dvzjVar.m;
        if (dnzjVar2 == null) {
            dnzjVar2 = dnzj.Z;
        }
        dnnn dnnnVar3 = dnzjVar2.d;
        if (dnnnVar3 == null) {
            dnnnVar3 = dnnn.l;
        }
        if ((dnnnVar3.a & 4) != 0 && this.l.a().i()) {
            dnzj dnzjVar3 = dvzjVar.m;
            if (dnzjVar3 == null) {
                dnzjVar3 = dnzj.Z;
            }
            dnnn dnnnVar4 = dnzjVar3.d;
            if (dnnnVar4 == null) {
                dnnnVar4 = dnnn.l;
            }
            dqxa dqxaVar = dnnnVar4.d;
            if (dqxaVar == null) {
                dqxaVar = dqxa.f;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnnn dnnnVar5 = (dnnn) bZ.b;
            dqxaVar.getClass();
            dnnnVar5.d = dqxaVar;
            dnnnVar5.a |= 4;
        }
        dnyc bZ2 = dnzj.Z.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnzj dnzjVar4 = (dnzj) bZ2.b;
        dnnn bK = bZ.bK();
        bK.getClass();
        dnzjVar4.d = bK;
        dnzjVar4.a |= 1;
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar5 = (dvzj) dvziVar.b;
        dnzj bK2 = bZ2.bK();
        bK2.getClass();
        dvzjVar5.m = bK2;
        dvzjVar5.a |= 16384;
        if ((dvzjVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            dqht dqhtVar = dvzjVar.n;
            if (dqhtVar == null) {
                dqhtVar = dqht.b;
            }
            dqhs ca = dqht.b.ca(dqhtVar);
            for (int i8 = 0; i8 < dqhtVar.a.size(); i8++) {
                dqhu ca2 = dqhw.g.ca(dqhtVar.a.get(i8));
                if (ca2.c) {
                    ca2.bF();
                    ca2.c = false;
                }
                dqhw dqhwVar = (dqhw) ca2.b;
                dqhwVar.a &= -5;
                dqhwVar.d = 0;
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dqht dqhtVar2 = (dqht) ca.b;
                dqhw bK3 = ca2.bK();
                bK3.getClass();
                dqhtVar2.b();
                dqhtVar2.a.set(i8, bK3);
            }
            if (dvziVar.c) {
                dvziVar.bF();
                dvziVar.c = false;
            }
            dvzj dvzjVar6 = (dvzj) dvziVar.b;
            dqht bK4 = ca.bK();
            bK4.getClass();
            dvzjVar6.n = bK4;
            dvzjVar6.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        return String.valueOf(((dvzj) dvziVar.bK()).bR().hashCode());
    }

    public final boolean g() {
        return this.k.getPlaceSheetParameters().J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str, String str2) {
        dxdw dxdwVar;
        try {
            bvgq bvgqVar = this.f;
            if (bvgqVar == null) {
                return;
            }
            OutputStreamWriter outputStreamWriter = null;
            try {
                bvgqVar.b.b(str, bvgqVar.c.b() + bvgqVar.d);
                dxdwVar = bvgqVar.b().j(str);
            } catch (btmx unused) {
                bvgqVar.a();
                dxdwVar = null;
            }
            if (dxdwVar == null) {
                return;
            }
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(dxdwVar.d(), dxec.b);
                try {
                    outputStreamWriter2.write(str2);
                    dxec.c(outputStreamWriter2);
                    dxdwVar.a();
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    dxec.c(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | IllegalStateException unused2) {
        }
    }
}
