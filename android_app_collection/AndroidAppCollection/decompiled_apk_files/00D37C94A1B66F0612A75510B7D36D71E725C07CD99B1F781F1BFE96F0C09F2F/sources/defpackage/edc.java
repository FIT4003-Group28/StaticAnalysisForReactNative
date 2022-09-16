package defpackage;
/* compiled from: PG */
/* renamed from: edc  reason: default package */
/* loaded from: classes3.dex */
public final class edc implements ecw {
    private final acti a;
    private final azqb b;
    private final azqb c;

    public edc(acti actiVar, azqb azqbVar, azqb azqbVar2) {
        this.a = actiVar;
        this.b = azqbVar;
        this.c = azqbVar2;
    }

    @Override // defpackage.ecw
    public final edb a() {
        return new edb((ajhl) this.b.get(), this.a, ((axoz) this.c).get());
    }
}
