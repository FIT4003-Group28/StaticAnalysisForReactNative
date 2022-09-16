package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bbp  reason: default package */
/* loaded from: classes2.dex */
final class bbp implements bbn {
    private final int a;
    private final int b;
    private final pwu c;

    public bbp(bbk bbkVar, Format format) {
        pwu pwuVar = bbkVar.a;
        this.c = pwuVar;
        pwuVar.G(12);
        int l = pwuVar.l();
        if ("audio/raw".equals(format.l)) {
            int h = pxi.h(format.A, format.y);
            if (l == 0 || l % h != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(h);
                sb.append(", stsz sample size: ");
                sb.append(l);
                Log.w("AtomParsers", sb.toString());
                l = h;
            }
        }
        this.a = l == 0 ? -1 : l;
        this.b = pwuVar.l();
    }

    @Override // defpackage.bbn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bbn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bbn
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.l() : i;
    }
}
