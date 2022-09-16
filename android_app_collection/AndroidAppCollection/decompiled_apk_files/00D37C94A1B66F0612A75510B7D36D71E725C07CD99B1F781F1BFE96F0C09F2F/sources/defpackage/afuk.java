package defpackage;
/* compiled from: PG */
/* renamed from: afuk  reason: default package */
/* loaded from: classes.dex */
final class afuk extends ymp {
    public afuk(ymq ymqVar) {
        super(ymqVar, "DelayedEventProto");
    }

    @Override // defpackage.ymp
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        aopa aopaVar = (aopa) obj;
        aqxo.q((((oro) aopaVar.instance).b & 8) != 0, "Must have stored time set");
        return ((oro) aopaVar.instance).f;
    }

    @Override // defpackage.ymp
    protected final /* bridge */ /* synthetic */ Object c(byte[] bArr) {
        try {
            return ((oro) aopi.parseFrom(oro.a, bArr, aoos.b())).mo52toBuilder();
        } catch (aopx unused) {
            return oro.a.createBuilder();
        }
    }

    @Override // defpackage.ymp
    protected final /* bridge */ /* synthetic */ byte[] m(Object obj) {
        return ((oro) ((aopa) obj).mo39build()).toByteArray();
    }
}
