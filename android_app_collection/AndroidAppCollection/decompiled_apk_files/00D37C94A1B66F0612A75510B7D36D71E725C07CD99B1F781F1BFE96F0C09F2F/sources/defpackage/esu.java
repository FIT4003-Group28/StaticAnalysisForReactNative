package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: esu  reason: default package */
/* loaded from: classes3.dex */
public final class esu extends etb {
    final /* synthetic */ etd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esu(etd etdVar, etc etcVar) {
        super(etdVar, etcVar);
        this.a = etdVar;
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        aaqp aaqpVar = this.a.f;
        if (bArr == null) {
            return null;
        }
        return new abcn((ascp) aaqpVar.a(bArr, ascp.a));
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((abcn) obj).a.toByteArray();
    }
}
