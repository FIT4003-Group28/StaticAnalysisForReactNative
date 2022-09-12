package defpackage;
/* compiled from: PG */
/* renamed from: dcyj  reason: default package */
/* loaded from: classes5.dex */
abstract class dcyj extends dcyk {
    private final int a;

    public dcyj(dcxj dcxjVar, dcxn dcxnVar) {
        super(dcxjVar);
        this.a = dcxnVar.a.b;
    }

    @Override // defpackage.dcyk
    public final int e() {
        return 1;
    }

    @Override // defpackage.dcyk
    public final int f(int i) {
        return this.a;
    }
}
