package defpackage;
/* compiled from: PG */
/* renamed from: abin  reason: default package */
/* loaded from: classes.dex */
public final class abin extends abij {
    public final /* synthetic */ abiq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abin(abiq abiqVar, aayw aaywVar, yni yniVar, yzj yzjVar, acti actiVar) {
        super(abiqVar, aaywVar, yniVar, yzjVar, actiVar);
        this.d = abiqVar;
    }

    @Override // defpackage.ajxh
    public final void lr(ajfz ajfzVar) {
        aayq d = this.d.j.d();
        d.t(ajfzVar);
        m(d, ajfzVar.a(), null);
    }

    public final void m(aaqs aaqsVar, ajfy ajfyVar, Runnable runnable) {
        this.d.j.b(aaqsVar, new abik(), new abim(this, runnable, ajfyVar, aaqsVar));
    }
}
