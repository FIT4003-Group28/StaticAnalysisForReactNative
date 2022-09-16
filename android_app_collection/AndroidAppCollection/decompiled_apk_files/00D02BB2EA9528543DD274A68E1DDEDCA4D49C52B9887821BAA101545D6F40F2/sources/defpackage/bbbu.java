package defpackage;
/* compiled from: PG */
/* renamed from: bbbu  reason: default package */
/* loaded from: classes3.dex */
class bbbu extends bazj {
    final /* synthetic */ bbbv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbbu(bbbv bbbvVar, String str, String str2, ddho ddhoVar, cqtd cqtdVar) {
        super(str, str2, ddhoVar, cqtdVar);
        this.a = bbbvVar;
    }

    @Override // defpackage.bayn
    public Boolean a() {
        return Boolean.valueOf(!this.a.QI().isEmpty());
    }

    @Override // defpackage.bazj, defpackage.bayn
    public cqkl b() {
        this.a.e();
        return cqkl.a;
    }
}
