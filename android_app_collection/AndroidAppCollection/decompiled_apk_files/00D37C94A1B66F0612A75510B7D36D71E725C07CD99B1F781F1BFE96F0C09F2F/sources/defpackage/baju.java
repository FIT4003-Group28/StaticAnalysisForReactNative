package defpackage;
/* compiled from: PG */
/* renamed from: baju  reason: default package */
/* loaded from: classes2.dex */
public class baju extends bajs {
    private static final long serialVersionUID = 8019982251647420015L;
    public final bahv a;

    public baju(bahv bahvVar, bahx bahxVar) {
        super(bahxVar);
        if (bahvVar.h()) {
            this.a = bahvVar;
            return;
        }
        throw new IllegalArgumentException("The field must be supported");
    }

    @Override // defpackage.bahv
    public long b(long j, int i) {
        return this.a.b(j, i);
    }

    @Override // defpackage.bahv
    public long c(long j, long j2) {
        return this.a.c(j, j2);
    }

    @Override // defpackage.bahv
    public long d(long j, long j2) {
        return this.a.d(j, j2);
    }

    @Override // defpackage.bahv
    public long e() {
        return this.a.e();
    }

    @Override // defpackage.bahv
    public final boolean g() {
        return this.a.g();
    }
}
