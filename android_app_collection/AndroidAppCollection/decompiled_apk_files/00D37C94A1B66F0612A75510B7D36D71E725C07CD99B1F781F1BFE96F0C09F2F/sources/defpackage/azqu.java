package defpackage;
/* compiled from: PG */
/* renamed from: azqu  reason: default package */
/* loaded from: classes2.dex */
public final class azqu implements azrb {
    private final azrb a;
    private final azsc b;

    public azqu(azrb azrbVar, azsc azscVar) {
        this.b = azscVar;
        this.a = azrbVar instanceof azqu ? ((azqu) azrbVar).a : azrbVar;
    }

    public final azra a(azra azraVar) {
        return (azra) this.b.a(azraVar);
    }

    public final boolean b(azrb azrbVar) {
        azrbVar.getClass();
        return azrbVar == this || this.a == azrbVar;
    }

    public azqu() {
        throw null;
    }
}
