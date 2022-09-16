package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: oyl  reason: default package */
/* loaded from: classes4.dex */
final class oyl extends oyk {
    private final pct c;
    private final pct d;
    private int e;
    private boolean f;
    private int g;

    public oyl(oyf oyfVar) {
        super(oyfVar);
        this.c = new pct(pcr.a);
        this.d = new pct(4);
    }

    @Override // defpackage.oyk
    protected final void a(pct pctVar, long j) {
        int i;
        int i2;
        float f;
        int h = pctVar.h();
        long i3 = j + (pctVar.i() * 1000);
        if (h != 0) {
            if (h != 1) {
                return;
            }
            byte[] bArr = this.d.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i4 = 4 - this.e;
            int i5 = 0;
            while (pctVar.a() > 0) {
                pctVar.u(this.d.a, i4, this.e);
                this.d.z(0);
                int j2 = this.d.j();
                this.c.z(0);
                this.a.f(this.c, 4);
                this.a.f(pctVar, j2);
                i5 = i5 + 4 + j2;
            }
            this.a.g(i3, this.g == 1 ? 1 : 0, i5, 0, null);
        } else if (!this.f) {
            pct pctVar2 = new pct(new byte[pctVar.a()]);
            pctVar.u(pctVar2.a, 0, pctVar.a());
            pctVar2.z(4);
            int h2 = (pctVar2.h() & 3) + 1;
            pce.d(h2 != 3);
            ArrayList arrayList = new ArrayList();
            int h3 = pctVar2.h() & 31;
            for (int i6 = 0; i6 < h3; i6++) {
                arrayList.add(pcr.e(pctVar2));
            }
            int h4 = pctVar2.h();
            for (int i7 = 0; i7 < h4; i7++) {
                arrayList.add(pcr.e(pctVar2));
            }
            if (h3 > 0) {
                pcs pcsVar = new pcs((byte[]) arrayList.get(0));
                pcsVar.d((h2 + 1) * 8);
                pcq c = pcr.c(pcsVar);
                int i8 = c.b;
                int i9 = c.c;
                f = c.d;
                i = i8;
                i2 = i9;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            this.e = h2;
            this.a.d(MediaFormat.k("video/avc", this.b, i, i2, arrayList, f));
            this.f = true;
        }
    }

    @Override // defpackage.oyk
    protected final boolean b(pct pctVar) {
        int h = pctVar.h();
        int i = h >> 4;
        int i2 = h & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new oyj(sb.toString());
    }
}
