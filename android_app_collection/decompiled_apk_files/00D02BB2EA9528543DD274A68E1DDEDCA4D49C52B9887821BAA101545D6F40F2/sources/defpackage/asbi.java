package defpackage;
/* compiled from: PG */
/* renamed from: asbi  reason: default package */
/* loaded from: classes2.dex */
final class asbi implements cree {
    final /* synthetic */ pnu a;
    final /* synthetic */ asbj b;

    public asbi(asbj asbjVar, pnu pnuVar) {
        this.b = asbjVar;
        this.a = pnuVar;
    }

    @Override // defpackage.cree
    public final void a(cred credVar) {
        dbsg<ddho> a = pnu.a(this.a);
        if (!a.a() || credVar != cred.FINISHED_AUDIO) {
            return;
        }
        cjta b = cjtd.b();
        b.d = a.b();
        this.b.b.g().d(b.a());
    }

    @Override // defpackage.cree
    public final void b(long j) {
    }
}
