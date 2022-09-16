package defpackage;
/* compiled from: PG */
/* renamed from: zht  reason: default package */
/* loaded from: classes4.dex */
final class zht implements ankb {
    final /* synthetic */ azkm a;

    public zht(azkm azkmVar) {
        this.a = azkmVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (!this.a.e()) {
            this.a.a(th);
        }
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        if (!this.a.e()) {
            if (obj != null) {
                this.a.c(obj);
            } else {
                this.a.a(new IllegalStateException("The value returned from the future was null. This is not allowed. Use Maybe instead if you intend to return null."));
            }
        }
    }
}
