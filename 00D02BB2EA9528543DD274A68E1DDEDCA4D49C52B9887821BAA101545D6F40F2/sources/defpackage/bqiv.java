package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqiv  reason: default package */
/* loaded from: classes4.dex */
public final class bqiv extends bqku {
    private bqkx a;
    private bqkz b;

    @Override // defpackage.bqku
    protected final bqla a() {
        if (this.a == null) {
            this.a = bqkx.k().h();
        }
        if (this.b == null) {
            this.b = bqkz.h().a();
        }
        return new bqiw(this.a, this.b);
    }

    @Override // defpackage.bqku
    public final void b(bqkx bqkxVar) {
        if (bqkxVar != null) {
            this.a = bqkxVar;
            return;
        }
        throw new NullPointerException("Null review");
    }

    @Override // defpackage.bqku
    public final void c(bqkz bqkzVar) {
        if (bqkzVar != null) {
            this.b = bqkzVar;
            return;
        }
        throw new NullPointerException("Null submitOptions");
    }
}
