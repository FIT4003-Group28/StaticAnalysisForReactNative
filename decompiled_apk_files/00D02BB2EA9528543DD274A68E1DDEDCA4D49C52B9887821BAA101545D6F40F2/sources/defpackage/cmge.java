package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cmge  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmge extends clti implements cmga {
    private cmga a;
    private long b;

    @Override // defpackage.cmga
    public final int a(long j) {
        cmga cmgaVar = this.a;
        cmmn.f(cmgaVar);
        return cmgaVar.a(j - this.b);
    }

    @Override // defpackage.cmga
    public final int b() {
        cmga cmgaVar = this.a;
        cmmn.f(cmgaVar);
        return cmgaVar.b();
    }

    @Override // defpackage.cmga
    public final long c(int i) {
        cmga cmgaVar = this.a;
        cmmn.f(cmgaVar);
        return cmgaVar.c(i) + this.b;
    }

    @Override // defpackage.clta
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // defpackage.cmga
    public final List<cmfw> d(long j) {
        cmga cmgaVar = this.a;
        cmmn.f(cmgaVar);
        return cmgaVar.d(j - this.b);
    }

    public final void e(long j, cmga cmgaVar, long j2) {
        this.timeUs = j;
        this.a = cmgaVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.b = j;
    }
}
