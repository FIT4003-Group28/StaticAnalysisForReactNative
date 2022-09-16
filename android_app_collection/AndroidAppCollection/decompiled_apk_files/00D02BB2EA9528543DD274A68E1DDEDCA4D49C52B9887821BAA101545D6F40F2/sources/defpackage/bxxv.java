package defpackage;
/* compiled from: PG */
/* renamed from: bxxv  reason: default package */
/* loaded from: classes4.dex */
final class bxxv extends bxyl {
    public dbsz<dpte> a;
    private Integer b;
    private dpte c;
    private bxym d;

    @Override // defpackage.bxyl
    public final void b(dpte dpteVar) {
        if (dpteVar != null) {
            this.c = dpteVar;
            return;
        }
        throw new NullPointerException("Null historyItem");
    }

    @Override // defpackage.bxyl
    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.bxyl
    public final void d(bxym bxymVar) {
        if (bxymVar != null) {
            this.d = bxymVar;
            return;
        }
        throw new NullPointerException("Null pageType");
    }

    @Override // defpackage.bxyl
    public final bxyn a() {
        String str = this.b == null ? " index" : "";
        if (this.c == null) {
            str = str.concat(" historyItem");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" pageType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bxxw(this.b.intValue(), this.c, this.a, this.d);
    }
}
