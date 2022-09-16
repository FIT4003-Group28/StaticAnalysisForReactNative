package defpackage;
/* compiled from: PG */
/* renamed from: aisd  reason: default package */
/* loaded from: classes.dex */
public final class aisd implements axou {
    private final azqb a;

    public aisd(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static aisd a(azqb azqbVar) {
        return new aisd(azqbVar);
    }

    public static ahey c(ahez ahezVar) {
        ahey aheyVar = ahezVar.i;
        axzl.o(aheyVar);
        return aheyVar;
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final ahey get() {
        return c((ahez) this.a.get());
    }
}
