package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: afah  reason: default package */
/* loaded from: classes.dex */
final class afah implements azh, bab, pew {
    final ajfw b;
    public final pev c;
    public int e;
    final /* synthetic */ afai i;
    private final orl j;
    private Format k;
    public long d = -1;
    long f = -9223372036854775807L;
    long g = -9223372036854775807L;
    long h = 0;

    public afah(afai afaiVar, ajfw ajfwVar, String str) {
        this.i = afaiVar;
        this.b = ajfwVar;
        if (aanp.e(str)) {
            pfe pfeVar = new pfe(0);
            pfeVar.f = this;
            this.c = pfeVar;
        } else if (aanp.b(str).endsWith("mp4")) {
            pfp pfpVar = new pfp(Collections.emptyList());
            pfpVar.a = this;
            this.c = pfpVar;
        } else {
            afgx afgxVar = new afgx(1);
            int i = ajfwVar.c;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Error choosing extractor for itag ");
            sb.append(i);
            afgxVar.b = sb.toString();
            afgxVar.b("c", "unkmime");
            afgxVar.c(ajfwVar.c);
            throw afgxVar.a();
        }
        if (aanp.d(str)) {
            this.j = orl.TRACK_TYPE_VIDEO;
        } else if (aanp.c(str)) {
            this.j = orl.TRACK_TYPE_AUDIO;
        } else {
            afgx afgxVar2 = new afgx(2);
            int i2 = ajfwVar.c;
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Error with track type of itag ");
            sb2.append(i2);
            afgxVar2.b = sb2.toString();
            afgxVar2.c(ajfwVar.c);
            throw afgxVar2.a();
        }
        this.c.e(this);
    }

    @Override // defpackage.bab
    public final /* synthetic */ int a(ast astVar, int i, boolean z) {
        return iy.d(this, astVar, i, z);
    }

    @Override // defpackage.azh
    public final void b() {
    }

    @Override // defpackage.bab
    public final /* synthetic */ void c(pwu pwuVar, int i) {
        iy.e(this, pwuVar, i);
    }

    @Override // defpackage.bab
    public final void d(pwu pwuVar, int i, int i2) {
        this.i.a.b(this.j, this.k).d(pwuVar, i, i2);
    }

    @Override // defpackage.bab
    public final void e(long j, int i, int i2, int i3, baa baaVar) {
        afal afalVar = this.i.a;
        Format format = this.k;
        orl orlVar = this.j;
        int i4 = this.e;
        prh b = afalVar.b(orlVar, format);
        b.e = i4;
        b.e(j, i, i2, i3, baaVar);
    }

    @Override // defpackage.bab
    public final int f(ast astVar, int i, boolean z) {
        return this.i.a.b(this.j, this.k).f(astVar, i, z);
    }

    @Override // defpackage.pew
    public final void g(long j, long j2) {
        int i;
        this.h += j2;
        long j3 = this.f;
        if (j3 == -9223372036854775807L || j < j3) {
            this.f = j;
        }
        long j4 = this.g;
        if (j4 == -9223372036854775807L || j > j4) {
            this.g = j;
        }
        afal afalVar = this.i.a;
        ajfw ajfwVar = this.b;
        orl orlVar = this.j;
        int i2 = this.e;
        afak c = afalVar.c(orlVar);
        afaj afajVar = c.c.isEmpty() ? null : (afaj) arey.s(c.c);
        boolean z = true;
        if (afajVar != null && i2 != (i = afajVar.b) && i2 != i + 1) {
            z = false;
        }
        aqxo.p(z);
        if (afajVar == null || afajVar.b != i2) {
            c.c.add(new afaj(ajfwVar, i2, j, j2));
            return;
        }
        afajVar.e += j2;
        if (j < afajVar.c) {
            afajVar.c = j;
        }
        if (j <= afajVar.d) {
            return;
        }
        afajVar.d = j;
    }

    @Override // defpackage.azh
    public final bab pT(int i, int i2) {
        return this;
    }

    @Override // defpackage.bab
    public final void rx(Format format) {
        ajfw ajfwVar = this.b;
        String b = ovm.b(ajfwVar.c, ajfwVar.e);
        pis b2 = format.b();
        b2.a = b;
        this.k = b2.a();
    }

    @Override // defpackage.azh
    public final void ry(azy azyVar) {
    }
}
