package defpackage;
/* compiled from: PG */
/* renamed from: anpo  reason: default package */
/* loaded from: classes.dex */
final class anpo implements anmv {
    private final anmy a;
    private final byte[] b = {0};

    public anpo(anmy anmyVar) {
        this.a = anmyVar;
    }

    @Override // defpackage.anmv
    public final byte[] a(byte[] bArr) {
        anmw anmwVar = this.a.b;
        if (anmwVar.c == 4) {
            return antz.o(anmwVar.a(), ((anmv) this.a.b.a).a(antz.o(bArr, this.b)));
        }
        return antz.o(anmwVar.a(), ((anmv) this.a.b.a).a(bArr));
    }
}
