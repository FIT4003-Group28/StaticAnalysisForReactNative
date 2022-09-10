package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: PG */
/* renamed from: eajg  reason: default package */
/* loaded from: classes6.dex */
public final class eajg implements eajy {
    private final eajb b;
    private final Inflater c;
    private final eajh d;
    private int a = 0;
    private final CRC32 e = new CRC32();

    public eajg(eajy eajyVar) {
        if (eajyVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        eajb a = eajl.a(eajyVar);
        this.b = a;
        this.d = new eajh(a, inflater);
    }

    private final void c(eaiz eaizVar, long j, long j2) {
        int i;
        eaju eajuVar = eaizVar.a;
        while (true) {
            long j3 = eajuVar.c - eajuVar.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            eajuVar = eajuVar.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(eajuVar.c - i, j2);
            this.e.update(eajuVar.a, (int) (eajuVar.b + j), min);
            j2 -= min;
            eajuVar = eajuVar.f;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012e, code lost:
        if (r0 == 2) goto L45;
     */
    @Override // defpackage.eajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Te(defpackage.eaiz r20, long r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eajg.Te(eaiz, long):long");
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.b.b();
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
