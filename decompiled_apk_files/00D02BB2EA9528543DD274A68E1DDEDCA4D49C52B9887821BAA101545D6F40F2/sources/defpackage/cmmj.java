package defpackage;

import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cmmj  reason: default package */
/* loaded from: classes5.dex */
public final class cmmj {
    private final TreeSet<cmly> a = new TreeSet<>(cmmi.a);
    private long b;

    public final void a(cmls cmlsVar, cmly cmlyVar) {
        this.a.add(cmlyVar);
        this.b += cmlyVar.c;
        c(cmlsVar, 0L);
    }

    public final void b(cmls cmlsVar, cmly cmlyVar, cmly cmlyVar2) {
        d(cmlyVar);
        a(cmlsVar, cmlyVar2);
    }

    public final void c(cmls cmlsVar, long j) {
        while (this.b + j > 10485760 && !this.a.isEmpty()) {
            cmlsVar.e(this.a.first());
        }
    }

    public final void d(cmly cmlyVar) {
        this.a.remove(cmlyVar);
        this.b -= cmlyVar.c;
    }
}
