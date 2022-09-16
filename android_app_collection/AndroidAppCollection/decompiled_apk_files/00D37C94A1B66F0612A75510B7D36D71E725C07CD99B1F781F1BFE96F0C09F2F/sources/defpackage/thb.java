package defpackage;
/* compiled from: PG */
/* renamed from: thb  reason: default package */
/* loaded from: classes4.dex */
public final class thb implements czp {
    private final teb a;

    public thb(teb tebVar) {
        this.a = tebVar;
    }

    @Override // defpackage.czp
    public final void a(int i, String str, String str2) {
        int i2 = i - 1;
        this.a.b((i2 == 1 || i2 == 2) ? 28 : 12, str2);
    }

    @Override // defpackage.czp
    public final void b(int i, String str, String str2) {
        a(2, str, str2);
    }
}
