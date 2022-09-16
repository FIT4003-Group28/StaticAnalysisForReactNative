package defpackage;
/* compiled from: PG */
/* renamed from: bwdl  reason: default package */
/* loaded from: classes4.dex */
final class bwdl implements cxsf {
    final /* synthetic */ bwdr a;

    public bwdl(bwdr bwdrVar) {
        this.a = bwdrVar;
    }

    @Override // defpackage.cxsf
    public final void a(String[] strArr) {
        this.a.aa(strArr, 1234);
    }

    @Override // defpackage.cxsf
    public final boolean b() {
        return this.a.ac("android.permission.READ_CONTACTS");
    }
}
