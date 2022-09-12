package defpackage;

import android.content.Intent;
import android.os.Debug;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;
/* compiled from: PG */
/* renamed from: cwxd  reason: default package */
/* loaded from: classes5.dex */
final class cwxd implements Runnable {
    final /* synthetic */ cwxf a;
    private final File b;
    private final dzyy c;
    private final Float d;
    private final long e;
    private final long f;

    public cwxd(cwxf cwxfVar, File file, dzyy dzyyVar, Float f, long j, long j2) {
        this.a = cwxfVar;
        this.b = file;
        this.c = dzyyVar;
        this.d = f;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.set(false);
        Debug.stopMethodTracing();
        long b = this.a.f.b();
        if (b >= this.e + this.a.d.a().e()) {
            this.a.a(false);
            return;
        }
        cwxf cwxfVar = this.a;
        Intent registerReceiver = cwxfVar.b.registerReceiver(null, cwxfVar.e);
        dzyy dzyyVar = this.c;
        dsqp dsqpVar = (dsqp) dzyyVar.cu(5);
        dsqpVar.bC(dzyyVar);
        dzyx dzyxVar = (dzyx) dsqpVar;
        dzza c = this.a.c(registerReceiver);
        if (dzyxVar.c) {
            dzyxVar.bF();
            dzyxVar.c = false;
        }
        dzyy dzyyVar2 = (dzyy) dzyxVar.b;
        dzyy dzyyVar3 = dzyy.e;
        c.getClass();
        dzyyVar2.c = c;
        dzyyVar2.a |= 2;
        float floatValue = this.d.floatValue() - cwxf.f(registerReceiver);
        if (dzyxVar.c) {
            dzyxVar.bF();
            dzyxVar.c = false;
        }
        dzyy dzyyVar4 = (dzyy) dzyxVar.b;
        dzyyVar4.a |= 4;
        dzyyVar4.d = floatValue;
        dzyy bK = dzyxVar.bK();
        dzyv bZ = dzyw.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyw dzywVar = (dzyw) bZ.b;
        bK.getClass();
        dzywVar.c = bK;
        dzywVar.a |= 2;
        File file = this.b;
        if (file != null && file.exists()) {
            long length = this.b.length();
            if (length > 0 && length < this.a.d.a().c()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.b);
                    dspb K = dspd.K((int) length);
                    try {
                        byte[] bArr = new byte[1024];
                        DeflaterInputStream deflaterInputStream = new DeflaterInputStream(fileInputStream, new Deflater(9));
                        while (true) {
                            int read = deflaterInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            K.write(bArr, 0, read);
                        }
                        deflaterInputStream.close();
                        dspd a = K.a();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dzyw dzywVar2 = (dzyw) bZ.b;
                        a.getClass();
                        dzywVar2.a |= 1;
                        dzywVar2.b = a;
                        cwxf.d(this.b);
                        K.close();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            K.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                }
            }
        }
        double g = this.a.d.a().g();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyw dzywVar3 = (dzyw) bZ.b;
        dzywVar3.a |= 4;
        dzywVar3.d = g;
        int f = this.a.d.a().f();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyw dzywVar4 = (dzyw) bZ.b;
        int i = dzywVar4.a | 32;
        dzywVar4.a = i;
        dzywVar4.g = f;
        long j = b - this.f;
        if (j < 2147483647L) {
            dzywVar4.a = i | 16;
            dzywVar4.f = (int) j;
        } else {
            dzywVar4.a = i | 16;
            dzywVar4.f = -1;
        }
        int d = this.a.d.a().d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyw dzywVar5 = (dzyw) bZ.b;
        dzywVar5.a |= 8;
        dzywVar5.e = d;
        int c2 = this.a.d.a().c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzyw dzywVar6 = (dzyw) bZ.b;
        dzywVar6.a |= 64;
        dzywVar6.h = c2;
        if (dzywVar6.b.c() > 0) {
            eacc bZ2 = eacd.u.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eacd eacdVar = (eacd) bZ2.b;
            dzyw bK2 = bZ.bK();
            bK2.getClass();
            eacdVar.p = bK2;
            eacdVar.a |= 262144;
            cwwo cwwoVar = this.a.g;
            cwwi f2 = cwwj.f();
            f2.c(bZ2.bK());
            cwtl.a(cwwoVar.c(f2.a()));
        }
        this.a.a(false);
    }
}
