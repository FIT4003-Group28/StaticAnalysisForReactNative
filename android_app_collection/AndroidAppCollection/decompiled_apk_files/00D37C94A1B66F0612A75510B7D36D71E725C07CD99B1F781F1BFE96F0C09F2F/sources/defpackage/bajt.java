package defpackage;
/* compiled from: PG */
/* renamed from: bajt  reason: default package */
/* loaded from: classes2.dex */
public class bajt extends bajr {
    public final bahn b;

    /* JADX INFO: Access modifiers changed from: protected */
    public bajt(bahn bahnVar, bahp bahpVar) {
        super(bahpVar);
        if (bahnVar != null) {
            if (bahnVar.t()) {
                this.b = bahnVar;
                return;
            }
            throw new IllegalArgumentException("The field must be supported");
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.bajr, defpackage.bahn
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public int c() {
        throw null;
    }

    @Override // defpackage.bahn
    public int d() {
        throw null;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public bahv p() {
        return this.b.p();
    }

    @Override // defpackage.bahn
    public bahv r() {
        return this.b.r();
    }
}
