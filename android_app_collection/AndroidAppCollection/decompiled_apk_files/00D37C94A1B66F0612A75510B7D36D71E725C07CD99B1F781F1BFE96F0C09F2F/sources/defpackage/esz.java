package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: esz  reason: default package */
/* loaded from: classes3.dex */
public final class esz extends etb {
    final /* synthetic */ etd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esz(etd etdVar, etc etcVar) {
        super(etdVar, etcVar);
        this.a = etdVar;
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return (arlt) this.a.f.a(bArr, arlt.a);
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((arlt) obj).toByteArray();
    }
}
