package defpackage;
/* compiled from: PG */
/* renamed from: aicc  reason: default package */
/* loaded from: classes2.dex */
final class aicc implements btzi {
    final /* synthetic */ deig a;
    final /* synthetic */ Object b;

    public aicc(deig deigVar, Object obj) {
        this.a = deigVar;
        this.b = obj;
    }

    @Override // defpackage.btzi
    public final void QY(btzr btzrVar, btzy btzyVar) {
        if (this.a.isCancelled()) {
            return;
        }
        this.b.getClass();
        bttq bttqVar = btzyVar.p;
        this.a.j(null);
    }

    @Override // defpackage.btzi
    public final void QZ(btzr btzrVar, Object obj) {
        if (this.a.isCancelled()) {
            return;
        }
        this.a.j(obj);
    }
}
