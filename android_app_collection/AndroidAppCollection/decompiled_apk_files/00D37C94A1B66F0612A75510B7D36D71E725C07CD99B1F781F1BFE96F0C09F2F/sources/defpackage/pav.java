package defpackage;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: pav  reason: default package */
/* loaded from: classes4.dex */
public final class pav implements oxq, oye {
    private oxr a;
    private oyf b;
    private paw c;
    private int d;
    private int e;

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        this.a = oxrVar;
        this.b = oxrVar.pP(0);
        this.c = null;
        oxrVar.pR();
    }

    @Override // defpackage.oye
    public final long b(long j) {
        paw pawVar = this.c;
        int i = pawVar.c;
        long j2 = pawVar.d;
        return ((((j * i) / 1000000) / j2) * j2) + pawVar.g;
    }

    @Override // defpackage.oye
    public final boolean c() {
        return true;
    }

    @Override // defpackage.oxq
    public final void d() {
        this.e = 0;
    }

    @Override // defpackage.oxq
    public final int e(oxn oxnVar, oxz oxzVar) {
        paw pawVar = this.c;
        if (pawVar == null) {
            pawVar = pce.g(oxnVar);
            this.c = pawVar;
            if (pawVar != null) {
                this.d = pawVar.d;
            } else {
                throw new ouf("Error initializing WavHeader. Did you sniff first?");
            }
        }
        if (pawVar.g == 0 || pawVar.h == 0) {
            pce.a(pawVar);
            oxnVar.i();
            pct pctVar = new pct(8);
            aeuq b = aeuq.b(oxnVar, pctVar);
            while (b.b != pcx.c("data")) {
                int i = b.b;
                StringBuilder sb = new StringBuilder(39);
                sb.append("Ignoring unknown WAV chunk: ");
                sb.append(i);
                Log.w("WavHeaderReader", sb.toString());
                long j = b.a + 8;
                if (b.b == pcx.c("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    oxnVar.j((int) j);
                    b = aeuq.b(oxnVar, pctVar);
                } else {
                    int i2 = b.b;
                    StringBuilder sb2 = new StringBuilder(51);
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(i2);
                    throw new ouf(sb2.toString());
                }
            }
            oxnVar.j(8);
            long j2 = oxnVar.c;
            long j3 = b.a;
            pawVar.g = j2;
            pawVar.h = j3;
            oyf oyfVar = this.b;
            paw pawVar2 = this.c;
            int i3 = pawVar2.b;
            int i4 = pawVar2.e;
            int i5 = pawVar2.a;
            oyfVar.d(MediaFormat.c(null, "audio/raw", i4 * i3 * i5, 32768, ((pawVar2.h / pawVar2.d) * 1000000) / i3, i5, i3, null, null, pawVar2.f));
            this.a.pS(this);
        }
        int j4 = this.b.j(oxnVar, 32768 - this.e, true);
        if (j4 != -1) {
            this.e += j4;
        }
        int i6 = this.e;
        int i7 = this.d;
        int i8 = (i6 / i7) * i7;
        if (i8 > 0) {
            long j5 = oxnVar.c;
            int i9 = i6 - i8;
            this.e = i9;
            this.b.g(((j5 - i6) * 1000000) / this.c.c, 1, i8, i9, null);
        }
        return j4 == -1 ? -1 : 0;
    }

    @Override // defpackage.oxq
    public final boolean f(oxn oxnVar) {
        return pce.g(oxnVar) != null;
    }
}
