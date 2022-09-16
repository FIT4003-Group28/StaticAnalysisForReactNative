package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: esv  reason: default package */
/* loaded from: classes3.dex */
public final class esv extends etb {
    final /* synthetic */ etd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esv(etd etdVar, etc etcVar) {
        super(etdVar, etcVar);
        this.a = etdVar;
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        aaqp aaqpVar = this.a.f;
        if (bArr == null) {
            return null;
        }
        return new aawr((aruk) aaqpVar.a(bArr, aruk.a));
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((aawr) obj).a.toByteArray();
    }
}
