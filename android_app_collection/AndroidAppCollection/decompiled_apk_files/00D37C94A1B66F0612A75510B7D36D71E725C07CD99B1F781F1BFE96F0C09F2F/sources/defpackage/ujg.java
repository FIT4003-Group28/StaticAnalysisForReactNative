package defpackage;
/* compiled from: PG */
/* renamed from: ujg  reason: default package */
/* loaded from: classes4.dex */
public final class ujg implements uje {
    public ujh a;

    @Override // defpackage.uje
    public final ujf a(String str, aokn aoknVar) {
        return this.a.a("/v1/batchupdatethreadstate", str, aoknVar, aoko.a);
    }

    @Override // defpackage.uje
    public final ujf b(String str, aokp aokpVar) {
        return this.a.a("/v1/createusersubscription", str, aokpVar, aokq.a);
    }

    @Override // defpackage.uje
    public final ujf c(String str, aokr aokrVar) {
        return this.a.a("/v1/deleteusersubscription", str, aokrVar, aoks.a);
    }

    @Override // defpackage.uje
    public final ujf d(String str, aokt aoktVar) {
        return this.a.a("/v1/fetchlatestthreads", str, aoktVar, aoku.a);
    }

    @Override // defpackage.uje
    public final ujf e(String str, aokv aokvVar) {
        return this.a.a("/v1/fetchupdatedthreads", str, aokvVar, aokw.a);
    }

    @Override // defpackage.uje
    public final ujf f(String str, aokx aokxVar) {
        return this.a.a("/v1/removetarget", str, aokxVar, aoky.a);
    }

    @Override // defpackage.uje
    public final ujf g(String str, aokz aokzVar) {
        return this.a.a("/v1/setuserpreference", str, aokzVar, aola.a);
    }

    @Override // defpackage.uje
    public final ujf h(String str, aolb aolbVar) {
        return this.a.a("/v1/storetarget", str, aolbVar, aolc.a);
    }

    @Override // defpackage.uje
    public final ujf i(aold aoldVar) {
        return this.a.a("/v1/updatethreadstatebytoken", null, aoldVar, aole.a);
    }
}
