package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayht  reason: default package */
/* loaded from: classes2.dex */
public final class ayht extends aygy {
    public final ayee a;
    private final ayez b;

    public ayht(ayez ayezVar, ayee ayeeVar) {
        this.b = ayezVar;
        this.a = ayeeVar;
    }

    @Override // defpackage.aygy
    protected final ayez a() {
        return this.b;
    }

    @Override // defpackage.aygy, defpackage.ayer
    public final ayeo l(ayax ayaxVar, ayat ayatVar, axyd axydVar, azqj[] azqjVarArr) {
        return new ayhs(this, this.b.l(ayaxVar, ayatVar, axydVar, azqjVarArr));
    }
}
