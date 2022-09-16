package defpackage;
/* compiled from: PG */
/* renamed from: eatj  reason: default package */
/* loaded from: classes6.dex */
public final class eatj extends easw {
    private static final long serialVersionUID = -5875876968979L;
    private final eaok b;
    private final transient int c;

    public eatj(eaok eaokVar, eaon eaonVar) {
        super(eaonVar);
        int i;
        this.b = eaokVar;
        int w = super.w();
        if (w < 0) {
            i = w + 1;
        } else if (w != 1) {
            this.c = w;
            return;
        } else {
            i = 0;
        }
        this.c = i;
    }

    private Object readResolve() {
        return this.a.c(this.b);
    }

    @Override // defpackage.easw, defpackage.eaon
    public final int d(long j) {
        int d = super.d(j);
        return d < 0 ? d + 1 : d;
    }

    @Override // defpackage.easw, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, this.c, A());
        if (i <= 0) {
            i--;
        }
        return super.p(j, i);
    }

    @Override // defpackage.easw, defpackage.eaon
    public final int w() {
        return this.c;
    }
}
