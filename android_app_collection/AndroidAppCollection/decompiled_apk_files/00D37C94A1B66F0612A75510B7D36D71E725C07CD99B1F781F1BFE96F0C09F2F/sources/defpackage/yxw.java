package defpackage;
/* compiled from: PG */
/* renamed from: yxw  reason: default package */
/* loaded from: classes4.dex */
public final class yxw extends ymp {
    public yxw(ymq ymqVar) {
        super(ymqVar, "ScheduledTaskProto");
    }

    @Override // defpackage.ymp
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        orz orzVar = (orz) obj;
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ymp
    public final /* bridge */ /* synthetic */ Object c(byte[] bArr) {
        try {
            return (orz) aopi.parseFrom(orz.a, bArr, aoos.b());
        } catch (aopx unused) {
            return null;
        }
    }

    @Override // defpackage.ymp
    protected final /* bridge */ /* synthetic */ byte[] m(Object obj) {
        return ((orz) obj).toByteArray();
    }
}
