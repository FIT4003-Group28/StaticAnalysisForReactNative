package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdz  reason: default package */
/* loaded from: classes2.dex */
public final class bdz {
    private final List a;
    private final bab[] b;

    public bdz(List list) {
        this.a = list;
        this.b = new bab[list.size()];
    }

    public final void a(long j, pwu pwuVar) {
        asf.f(j, pwuVar, this.b);
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
            String str2 = format.a;
            if (str2 == null) {
                str2 = befVar.b();
            }
            pis pisVar = new pis();
            pisVar.a = str2;
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
