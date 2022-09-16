package defpackage;
/* compiled from: PG */
/* renamed from: bguc  reason: default package */
/* loaded from: classes3.dex */
public final class bguc extends befr<bhdw> {
    private final bhat b;

    public bguc(bhdx bhdxVar, bhat bhatVar) {
        super(bhdxVar, 2, 2);
        this.b = bhatVar;
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        if (((bhdw) this.a).e().booleanValue()) {
            if (this.b.b()) {
                cqivVar.a(new bgzp(), (bhdw) this.a);
            } else {
                cqivVar.a(new bgzz(), (bhdw) this.a);
            }
        }
    }
}
