package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lya  reason: default package */
/* loaded from: classes7.dex */
public final class lya {
    public final lyd a;
    final /* synthetic */ lye b;

    public lya(lye lyeVar, lyd lydVar) {
        this.b = lyeVar;
        this.a = lydVar;
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        lyd lydVar = this.a;
        if (lydVar != this.b.k) {
            return;
        }
        dbsk.s(lydVar);
        lydVar.a();
    }
}
