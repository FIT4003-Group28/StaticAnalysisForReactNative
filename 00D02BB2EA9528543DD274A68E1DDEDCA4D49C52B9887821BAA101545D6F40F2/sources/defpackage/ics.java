package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: ics  reason: default package */
/* loaded from: classes6.dex */
public final class ics<T extends cqkp> extends cqiw<T> {
    private final cqtv a;
    private final cqmp<T>[] b;

    @SafeVarargs
    public ics(cqtv cqtvVar, cqmp<T>... cqmpVarArr) {
        super(cqtvVar, cqmpVarArr);
        this.a = cqtvVar;
        this.b = cqmpVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<T> a() {
        return ict.k(this.a, this.b);
    }

    @SafeVarargs
    public ics(Boolean bool, cqmp<T>... cqmpVarArr) {
        super(bool, cqmpVarArr);
        this.b = cqmpVarArr;
        this.a = bool.booleanValue() ? ibn.t() : cqrp.d(dcyn.a);
    }
}
