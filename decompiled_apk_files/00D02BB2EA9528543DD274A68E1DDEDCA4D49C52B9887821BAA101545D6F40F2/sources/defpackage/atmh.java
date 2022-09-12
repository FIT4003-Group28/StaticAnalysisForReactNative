package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atmh  reason: default package */
/* loaded from: classes2.dex */
public final class atmh implements btxt {
    final /* synthetic */ afwm a;
    final /* synthetic */ atmi b;

    public atmh(atmi atmiVar, afwm afwmVar) {
        this.b = atmiVar;
        this.a = afwmVar;
    }

    @Override // defpackage.btxt
    public final void a(int i) {
        if (i == 1 || !this.b.a.d(this.a)) {
            return;
        }
        this.b.h.b(new alhb(this.a));
    }
}
