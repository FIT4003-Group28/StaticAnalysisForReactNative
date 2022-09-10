package defpackage;
/* compiled from: PG */
/* renamed from: ajey  reason: default package */
/* loaded from: classes2.dex */
public final class ajey implements btzi<dwdg, dwdi> {
    final /* synthetic */ deig a;

    public ajey(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwdg> btzrVar, btzy btzyVar) {
        if (this.a.isCancelled()) {
            return;
        }
        this.a.k(new ajfb(btzyVar.p));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwdg> btzrVar, dwdi dwdiVar) {
        dwdi dwdiVar2 = dwdiVar;
        if (this.a.isCancelled()) {
            return;
        }
        this.a.j(dwdiVar2);
    }
}
