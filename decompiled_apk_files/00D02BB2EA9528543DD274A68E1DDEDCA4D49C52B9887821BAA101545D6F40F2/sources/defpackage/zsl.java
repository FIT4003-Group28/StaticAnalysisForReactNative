package defpackage;
/* compiled from: PG */
/* renamed from: zsl  reason: default package */
/* loaded from: classes7.dex */
class zsl extends zsh {
    final /* synthetic */ cjzt a;
    final /* synthetic */ dtqq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsl(zsf zsfVar, cjtd cjtdVar, cjzt cjztVar, dtqq dtqqVar) {
        super(zsfVar, cjtdVar);
        this.a = cjztVar;
        this.b = dtqqVar;
    }

    @Override // defpackage.zej
    public Boolean c() {
        return true;
    }

    @Override // defpackage.zej
    public cqkl d(cjqm cjqmVar) {
        cjyi cjyiVar = this.a.c;
        dthb dthbVar = this.b.b;
        if (dthbVar == null) {
            dthbVar = dthb.F;
        }
        cjzt cjztVar = this.a;
        cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        return cqkl.a;
    }
}
