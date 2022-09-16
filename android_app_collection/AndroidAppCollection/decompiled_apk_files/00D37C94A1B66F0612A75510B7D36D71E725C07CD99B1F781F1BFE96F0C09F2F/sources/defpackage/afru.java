package defpackage;
/* compiled from: PG */
/* renamed from: afru  reason: default package */
/* loaded from: classes.dex */
public final class afru extends ymp {
    public afru(ymq ymqVar) {
        super(ymqVar, "OfflineHttpRequestProto");
    }

    @Override // defpackage.ymp
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        ort ortVar = (ort) obj;
        aqxo.q((ortVar.b & 32) != 0, "Must have stored time set");
        return ortVar.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ymp
    public final /* bridge */ /* synthetic */ Object c(byte[] bArr) {
        try {
            return (ort) aopi.parseFrom(ort.a, bArr, aoos.b());
        } catch (aopx unused) {
            return ort.a;
        }
    }

    @Override // defpackage.ymp
    protected final /* bridge */ /* synthetic */ byte[] m(Object obj) {
        return ((ort) obj).toByteArray();
    }
}
