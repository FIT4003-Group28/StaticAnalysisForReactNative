package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cmfo  reason: default package */
/* loaded from: classes5.dex */
public final class cmfo extends clpb {
    private static final Object a = new Object();
    private final long b;
    private final long d;
    private final boolean e;
    private final boolean f;
    private final clno g;

    static {
        clnj clnjVar = new clnj();
        clnjVar.a = "com.google.android.exoplayer2.source.SinglePeriodTimeline";
        clnjVar.b = Uri.EMPTY;
        clnjVar.a();
    }

    public cmfo(long j, long j2, boolean z, boolean z2, clno clnoVar) {
        this.b = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = clnoVar;
    }

    @Override // defpackage.clpb
    public final clpa f(int i, clpa clpaVar, long j) {
        cmmn.g(i, 1);
        clpaVar.c(clpa.a, this.g, this.e, false, this.f, this.d);
        return clpaVar;
    }

    @Override // defpackage.clpb
    public final cloz h(int i, cloz clozVar, boolean z) {
        cmmn.g(i, 1);
        clozVar.i(null, z ? a : null, this.b, 0L);
        return clozVar;
    }

    @Override // defpackage.clpb
    public final int i(Object obj) {
        return a.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.clpb
    public final Object j(int i) {
        cmmn.g(i, 1);
        return a;
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
