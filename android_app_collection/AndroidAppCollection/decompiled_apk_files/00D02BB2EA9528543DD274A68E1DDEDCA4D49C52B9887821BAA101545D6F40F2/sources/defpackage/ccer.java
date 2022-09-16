package defpackage;
/* compiled from: PG */
/* renamed from: ccer  reason: default package */
/* loaded from: classes4.dex */
final class ccer implements akey {
    final /* synthetic */ String a;
    final /* synthetic */ ccey b;

    public ccer(ccey cceyVar, String str) {
        this.b = cceyVar;
        this.a = str;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        this.b.d.p(true);
        this.b.d(this.a);
    }

    @Override // defpackage.akey
    public final void b() {
        bvoo.h("Failed attempting to sign in as account: %s", this.a);
        this.b.e();
    }
}
