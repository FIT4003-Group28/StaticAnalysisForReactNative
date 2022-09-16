package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azkr  reason: default package */
/* loaded from: classes2.dex */
public final class azkr implements ayot {
    final ayot a;
    final /* synthetic */ azks b;
    private final ayqm c;

    public azkr(azks azksVar, ayqm ayqmVar, ayot ayotVar) {
        this.b = azksVar;
        this.c = ayqmVar;
        this.a = ayotVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        ayqi.i(this.c, this.b.c.c(new azkp(this, th), 0L, this.b.b));
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        ayqi.i(this.c, this.b.c.c(new azkq(this, obj), 15L, this.b.b));
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.i(this.c, aypgVar);
    }
}
