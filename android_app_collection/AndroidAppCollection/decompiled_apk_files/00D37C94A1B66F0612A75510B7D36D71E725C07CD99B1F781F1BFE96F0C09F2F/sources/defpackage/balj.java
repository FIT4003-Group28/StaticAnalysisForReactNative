package defpackage;
/* compiled from: PG */
/* renamed from: balj  reason: default package */
/* loaded from: classes2.dex */
final class balj implements balm {
    private final balm a;
    private final balm b;

    public balj(balm balmVar, balm balmVar2) {
        this.a = balmVar;
        this.b = balmVar2;
    }

    @Override // defpackage.balm
    public final int a(int i) {
        return this.a.a(i) + this.b.a(i);
    }

    @Override // defpackage.balm
    public final void b(StringBuffer stringBuffer, int i) {
        this.a.b(stringBuffer, i);
        this.b.b(stringBuffer, i);
    }
}
