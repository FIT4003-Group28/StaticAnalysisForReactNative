package defpackage;
/* compiled from: PG */
/* renamed from: aiti  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiti implements ayob {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiti(int i) {
        this.a = i;
    }

    public /* synthetic */ aiti(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ayob
    public final bamd a(aynx aynxVar) {
        if (this.b != 0) {
            return this.a != 1 ? aynxVar : aynxVar.G(aypa.a());
        }
        int i = this.a;
        if (i == 1) {
            return aynxVar.N(aypa.a());
        }
        return i != 2 ? aynxVar : aynxVar.N(azpj.a());
    }
}
