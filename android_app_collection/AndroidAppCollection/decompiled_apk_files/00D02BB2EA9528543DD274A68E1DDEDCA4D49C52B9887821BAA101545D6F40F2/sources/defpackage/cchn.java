package defpackage;
/* compiled from: PG */
/* renamed from: cchn  reason: default package */
/* loaded from: classes4.dex */
final class cchn implements akey {
    final /* synthetic */ ddho a;
    final /* synthetic */ String b;
    final /* synthetic */ cchr c;

    public cchn(cchr cchrVar, ddho ddhoVar, String str) {
        this.c = cchrVar;
        this.a = ddhoVar;
        this.b = str;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        if (this.c.a.a().j().l()) {
            this.c.e(this.a, this.b);
        }
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
