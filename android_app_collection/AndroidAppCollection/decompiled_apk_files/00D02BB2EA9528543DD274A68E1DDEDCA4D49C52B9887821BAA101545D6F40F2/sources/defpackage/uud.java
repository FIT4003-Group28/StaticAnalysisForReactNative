package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uud  reason: default package */
/* loaded from: classes7.dex */
public final class uud extends cqiw<zbz> {
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uud(Object[] objArr, boolean z) {
        super(objArr);
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zbz> a() {
        cqmp[] cqmpVarArr = new cqmp[4];
        cqmpVarArr[0] = cqgr.bi(Boolean.valueOf(this.a));
        cqmpVarArr[1] = cqgr.dr(1);
        cqmpVarArr[2] = this.a ? cqmp.e : iue.h(cqgr.aT(uuh.a));
        cqiw<qjf> a = qiy.a();
        cqlc cqlcVar = uuc.a;
        cqmpVarArr[3] = cqgr.fY(cqgr.x(vys.a), cqic.c(cqjv.x(cqlcVar), new cqmp[0]), cqgr.fP(a, cqlcVar, new cqmp[0]));
        return jgi.d(cqmpVarArr);
    }
}
