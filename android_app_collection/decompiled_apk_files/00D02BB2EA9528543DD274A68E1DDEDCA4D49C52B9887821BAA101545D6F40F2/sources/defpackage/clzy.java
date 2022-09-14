package defpackage;

import com.google.android.exoplayer2.Format;
import java.util.List;
/* compiled from: PG */
/* renamed from: clzy  reason: default package */
/* loaded from: classes5.dex */
public final class clzy {
    private final List<Format> a;
    private final clvk[] b;

    public clzy(List<Format> list) {
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
            String str2 = format.a;
            if (str2 == null) {
                str2 = cmajVar.c();
            }
            clnf clnfVar = new clnf();
            clnfVar.a = str2;
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
        cluh.a(j, cmnkVar, this.b);
    }
}
