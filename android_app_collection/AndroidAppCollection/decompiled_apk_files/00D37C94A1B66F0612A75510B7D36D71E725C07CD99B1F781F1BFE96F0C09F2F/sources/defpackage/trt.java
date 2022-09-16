package defpackage;
/* compiled from: PG */
/* renamed from: trt  reason: default package */
/* loaded from: classes4.dex */
final class trt implements ankb {
    final /* synthetic */ tqc a;
    final /* synthetic */ String b;
    final /* synthetic */ tru c;

    public trt(tru truVar, tqc tqcVar, String str) {
        this.c = truVar;
        this.a = tqcVar;
        this.b = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (!this.a.c.h() || !this.c.g.h()) {
            return;
        }
        ((tzo) this.c.g.c()).h(this.b);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tpp tppVar = (tpp) obj;
    }
}
