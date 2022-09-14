package defpackage;
/* compiled from: PG */
/* renamed from: annj  reason: default package */
/* loaded from: classes2.dex */
final class annj implements akey {
    final /* synthetic */ dnsc a;
    final /* synthetic */ String b;
    final /* synthetic */ annl c;

    public annj(annl annlVar, dnsc dnscVar, String str) {
        this.c = annlVar;
        this.a = dnscVar;
        this.b = str;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        this.c.d(this.a, anhu.FORCE, this.b);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
