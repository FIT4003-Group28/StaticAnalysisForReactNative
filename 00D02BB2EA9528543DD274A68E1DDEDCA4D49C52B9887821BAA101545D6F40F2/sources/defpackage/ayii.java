package defpackage;
/* renamed from: ayii  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class ayii {
    private final aymt a;

    public ayii(aymt aymtVar) {
        this.a = aymtVar;
    }

    public final boolean a(int i) {
        aymt aymtVar = this.a;
        cqjg cqjgVar = ayio.a;
        int i2 = (!aymtVar.u().booleanValue()) + 1;
        if (i <= i2) {
            return false;
        }
        return (i - i2) + 1 <= aymtVar.b().size() || aymtVar.c().booleanValue() || aymtVar.s().booleanValue();
    }
}
