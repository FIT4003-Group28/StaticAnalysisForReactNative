package defpackage;

import java.io.IOException;
import java.nio.channels.FileLock;
/* compiled from: PG */
/* renamed from: ahka  reason: default package */
/* loaded from: classes2.dex */
public final class ahka {
    public static ahka a;
    public akra b;
    public akra c;
    public int d;
    public int e;
    public final long[] f = new long[6];
    public final bwsa g;
    public final buqb h;
    public int i;

    public ahka(bwsa bwsaVar, buqb buqbVar) {
        this.g = bwsaVar;
        this.h = buqbVar;
        e();
    }

    public static synchronized void b(bwsa bwsaVar, buqb buqbVar) {
        synchronized (ahka.class) {
            a = new ahka(bwsaVar, buqbVar);
        }
    }

    @dzsi
    public static bwrv c(bwsa bwsaVar) {
        if (bwsaVar instanceof bwsb) {
            return ((bwsb) bwsaVar).c();
        }
        return null;
    }

    public static void d(@dzsi bwrv bwrvVar) {
        if (bwrvVar != null) {
            bwrvVar.d.a.remove(bwrvVar.c);
            try {
                FileLock fileLock = bwrvVar.b;
                if (fileLock != null) {
                    fileLock.release();
                }
                bwrw.e(bwrvVar.a);
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    private final synchronized void e() {
        boolean z;
        dxaa dxaaVar;
        bwrv c = c(this.g);
        try {
            byte[] a2 = this.g.a("savedLocationShiftCoefficients");
            if (a2 == null || (dxaaVar = (dxaa) bvrs.j((dssr) dxaa.g.cu(7), a2, a2.length, dsqa.b())) == null) {
                z = false;
            } else {
                a(dxaaVar);
                z = true;
            }
            d(c);
            if (z) {
                return;
            }
        } catch (IOException unused) {
            this.g.b("savedLocationShiftCoefficients");
            d(c);
        }
        long[] jArr = this.f;
        jArr[0] = 0;
        jArr[1] = 1000000;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 1000000;
        this.d = 0;
        this.e = 0;
        this.i = 2;
    }

    public final void a(dxaa dxaaVar) {
        int a2 = dwzz.a(dxaaVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        this.i = a2;
        for (int i = 0; i < 6; i++) {
            this.f[i] = dxaaVar.c.c(i);
        }
        this.e = dxaaVar.e;
        this.d = dxaaVar.f;
        dwzq dwzqVar = dxaaVar.d;
        if (dwzqVar == null) {
            dwzqVar = dwzq.d;
        }
        int i2 = dwzqVar.b;
        dwzq dwzqVar2 = dxaaVar.d;
        if (dwzqVar2 == null) {
            dwzqVar2 = dwzq.d;
        }
        this.b = akra.c(i2, dwzqVar2.c);
    }
}
