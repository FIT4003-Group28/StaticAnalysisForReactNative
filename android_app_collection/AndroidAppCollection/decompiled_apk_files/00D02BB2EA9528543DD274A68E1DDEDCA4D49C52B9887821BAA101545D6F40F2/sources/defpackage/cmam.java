package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmam  reason: default package */
/* loaded from: classes5.dex */
final class cmam {
    private final List<Format> a;
    private final clvk[] b;

    public cmam(List<Format> list) {
        this.a = list;
        this.b = new clvk[list.size()];
    }

    public final void a(clup clupVar, cmaj cmajVar) {
        for (int i = 0; i < this.b.length; i++) {
            cmajVar.a();
            clvk RT = clupVar.RT(cmajVar.b());
            Format format = this.a.get(i);
            String str = format.l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            cmmn.b(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            clnf clnfVar = new clnf();
            clnfVar.a = cmajVar.c();
            clnfVar.k = str;
            clnfVar.d = format.d;
            clnfVar.c = format.c;
            clnfVar.C = format.D;
            clnfVar.m = format.n;
            RT.a(clnfVar.a());
            this.b[i] = RT;
        }
    }

    public final void b(long j, cmnk cmnkVar) {
        if (cmnkVar.d() < 9) {
            return;
        }
        int r = cmnkVar.r();
        int r2 = cmnkVar.r();
        int l = cmnkVar.l();
        if (r != 434 || r2 != 1195456820 || l != 3) {
            return;
        }
        cluh.b(j, cmnkVar, this.b);
    }
}
