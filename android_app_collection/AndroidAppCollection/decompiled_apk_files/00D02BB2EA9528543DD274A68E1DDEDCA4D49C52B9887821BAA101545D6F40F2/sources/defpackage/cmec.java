package defpackage;
/* compiled from: PG */
/* renamed from: cmec  reason: default package */
/* loaded from: classes5.dex */
public final class cmec extends clpb {
    private final clno a;

    public cmec(clno clnoVar) {
        this.a = clnoVar;
    }

    @Override // defpackage.clpb
    public final clpa f(int i, clpa clpaVar, long j) {
        clpaVar.c(clpa.a, this.a, false, true, false, -9223372036854775807L);
        clpaVar.k = true;
        return clpaVar;
    }

    @Override // defpackage.clpb
    public final cloz h(int i, cloz clozVar, boolean z) {
        Object obj = null;
        Integer num = z ? 0 : null;
        if (z) {
            obj = cmeb.b;
        }
        clozVar.i(num, obj, -9223372036854775807L, 0L);
        return clozVar;
    }

    @Override // defpackage.clpb
    public final int i(Object obj) {
        return obj == cmeb.b ? 0 : -1;
    }

    @Override // defpackage.clpb
    public final Object j(int i) {
        return cmeb.b;
    }

    @Override // defpackage.clpb
    public final int r() {
        return 1;
    }

    @Override // defpackage.clpb
    public final int s() {
        return 1;
    }
}
