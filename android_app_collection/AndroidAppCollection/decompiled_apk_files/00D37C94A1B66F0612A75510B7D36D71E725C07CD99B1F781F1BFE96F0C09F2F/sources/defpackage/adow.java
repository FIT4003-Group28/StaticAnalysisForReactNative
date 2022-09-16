package defpackage;
/* compiled from: PG */
/* renamed from: adow  reason: default package */
/* loaded from: classes.dex */
final class adow implements qtf {
    private final Runnable a;

    public adow(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.qtf
    public final /* bridge */ /* synthetic */ void a(qte qteVar) {
        if (!((qoe) qteVar).a().c()) {
            zep.h(adoz.a, "Command fallback to using cloud channel.");
            this.a.run();
        }
    }
}
