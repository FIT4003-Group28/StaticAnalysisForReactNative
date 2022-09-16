package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;
/* compiled from: PG */
/* renamed from: beh  reason: default package */
/* loaded from: classes2.dex */
public final class beh {
    private final List a;
    private final bab[] b;

    public beh(List list) {
        this.a = list;
        this.b = new bab[list.size()];
    }

    public final void a(long j, pwu pwuVar) {
        if (pwuVar.a() < 9) {
            return;
        }
        int d = pwuVar.d();
        int d2 = pwuVar.d();
        int i = pwuVar.i();
        if (d != 434 || d2 != 1195456820 || i != 3) {
            return;
        }
        asf.g(j, pwuVar, this.b);
    }

    public final void b(azh azhVar, bef befVar) {
        for (int i = 0; i < this.b.length; i++) {
            befVar.c();
            bab pT = azhVar.pT(befVar.a(), 3);
            Format format = (Format) this.a.get(i);
            String str = format.l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            ptx.d(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            pis pisVar = new pis();
            pisVar.a = befVar.b();
            pisVar.k = str;
            pisVar.d = format.d;
            pisVar.c = format.c;
            pisVar.C = format.D;
            pisVar.m = format.n;
            pT.rx(pisVar.a());
            this.b[i] = pT;
        }
    }
}
