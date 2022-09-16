package defpackage;
/* compiled from: PG */
/* renamed from: dcxz  reason: default package */
/* loaded from: classes5.dex */
abstract class dcxz extends dcyk {
    private final int a;
    private final int c;

    public dcxz(dcxj dcxjVar, int i, int i2) {
        super(dcxjVar);
        this.a = i;
        this.c = i2;
    }

    @Override // defpackage.dcyk
    public final int e() {
        return this.c;
    }

    @Override // defpackage.dcyk
    public final int f(int i) {
        return this.a + i;
    }
}
