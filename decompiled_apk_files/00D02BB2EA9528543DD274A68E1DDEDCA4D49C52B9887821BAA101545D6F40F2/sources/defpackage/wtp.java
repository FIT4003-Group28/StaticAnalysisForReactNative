package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: wtp  reason: default package */
/* loaded from: classes7.dex */
public final class wtp implements degu<dlzp> {
    final /* synthetic */ String a;
    final /* synthetic */ deig b;
    final /* synthetic */ wtq c;

    public wtp(wtq wtqVar, String str, deig deigVar) {
        this.c = wtqVar;
        this.a = str;
        this.b = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        this.c.b.remove(this.a);
        this.b.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dlzp dlzpVar) {
        this.c.b.remove(this.a);
        this.b.j(dlzpVar.a);
    }
}
