package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asvm  reason: default package */
/* loaded from: classes2.dex */
public final class asvm implements asvp {
    final /* synthetic */ asvr a;
    final /* synthetic */ asvq b;

    public asvm(asvq asvqVar, asvr asvrVar) {
        this.b = asvqVar;
        this.a = asvrVar;
    }

    @Override // defpackage.asvp
    public final void a(cren crenVar, String str) {
        this.a.c.a(crenVar, str);
        asvq asvqVar = this.b;
        asvqVar.e = crenVar;
        asvqVar.g(str);
    }
}
