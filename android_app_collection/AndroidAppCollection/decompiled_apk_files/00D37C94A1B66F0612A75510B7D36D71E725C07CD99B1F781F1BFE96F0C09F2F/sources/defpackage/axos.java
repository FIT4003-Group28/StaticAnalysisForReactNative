package defpackage;
/* compiled from: PG */
/* renamed from: axos  reason: default package */
/* loaded from: classes2.dex */
public final class axos implements axou {
    private azqb a;

    public static void a(azqb azqbVar, azqb azqbVar2) {
        azqbVar2.getClass();
        axos axosVar = (axos) azqbVar;
        if (axosVar.a != null) {
            throw new IllegalStateException();
        }
        axosVar.a = azqbVar2;
    }

    @Override // defpackage.azqb
    public final Object get() {
        azqb azqbVar = this.a;
        if (azqbVar == null) {
            throw new IllegalStateException();
        }
        return azqbVar.get();
    }
}
