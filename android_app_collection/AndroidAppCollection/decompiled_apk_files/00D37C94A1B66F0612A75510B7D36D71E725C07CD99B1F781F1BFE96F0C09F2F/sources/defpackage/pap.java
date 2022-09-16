package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: pap  reason: default package */
/* loaded from: classes4.dex */
final class pap {
    private final oyf a;

    public pap(oyf oyfVar) {
        this.a = oyfVar;
        oyfVar.d(MediaFormat.e(null, "application/eia-608", -1, -1L, null));
    }

    public final void a(long j, pct pctVar) {
        int h;
        int i;
        while (pctVar.a() > 1) {
            int i2 = 0;
            int i3 = 0;
            do {
                h = pctVar.h();
                i3 += h;
            } while (h == 255);
            while (true) {
                int h2 = pctVar.h();
                i = i2 + h2;
                if (h2 != 255) {
                    break;
                }
                i2 = i;
            }
            if (i3 == 4 && i >= 8) {
                int i4 = pctVar.b;
                int h3 = pctVar.h();
                int k = pctVar.k();
                int c = pctVar.c();
                int h4 = pctVar.h();
                pctVar.z(i4);
                if (h3 == 181 && k == 49 && c == 1195456820 && h4 == 3) {
                    this.a.f(pctVar, i);
                    this.a.g(j, 1, i, 0, null);
                }
            }
            pctVar.A(i);
        }
    }
}
