package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: clzo  reason: default package */
/* loaded from: classes5.dex */
public final class clzo implements clzw {
    private Format a;
    private cmnv b;
    private clvk c;

    public clzo(String str) {
        clnf clnfVar = new clnf();
        clnfVar.k = str;
        this.a = clnfVar.a();
    }

    @Override // defpackage.clzw
    public final void a(cmnv cmnvVar, clup clupVar, cmaj cmajVar) {
        this.b = cmnvVar;
        cmajVar.a();
        clvk RT = clupVar.RT(cmajVar.b());
        this.c = RT;
        RT.a(this.a);
    }

    @Override // defpackage.clzw
    public final void b(cmnk cmnkVar) {
        long j;
        cmmn.e(this.b);
        int i = cmny.a;
        long b = this.b.b();
        long j2 = -9223372036854775807L;
        if (b == -9223372036854775807L) {
            return;
        }
        Format format = this.a;
        if (b != format.p) {
            clnf a = format.a();
            a.o = b;
            Format a2 = a.a();
            this.a = a2;
            this.c.a(a2);
        }
        int d = cmnkVar.d();
        this.c.d(cmnkVar, d);
        clvk clvkVar = this.c;
        cmnv cmnvVar = this.b;
        if (cmnvVar.c != -9223372036854775807L) {
            j2 = cmnvVar.b + cmnvVar.c;
        } else {
            long j3 = cmnvVar.a;
            if (j3 != Long.MAX_VALUE) {
                j = j3;
                clvkVar.b(j, 1, d, 0, null);
            }
        }
        j = j2;
        clvkVar.b(j, 1, d, 0, null);
    }
}
