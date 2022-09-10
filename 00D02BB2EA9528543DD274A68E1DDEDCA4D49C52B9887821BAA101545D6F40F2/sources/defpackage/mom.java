package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mom  reason: default package */
/* loaded from: classes7.dex */
public final class mom extends moo {
    final /* synthetic */ mor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mom(mor morVar) {
        super(morVar);
        this.a = morVar;
    }

    @Override // defpackage.moo
    @dzsi
    public final ddho c() {
        return null;
    }

    @Override // defpackage.moo
    public final void h() {
        Runnable runnable = this.a.k;
        if (runnable != null) {
            runnable.run();
        }
        this.a.s = 104;
    }
}
