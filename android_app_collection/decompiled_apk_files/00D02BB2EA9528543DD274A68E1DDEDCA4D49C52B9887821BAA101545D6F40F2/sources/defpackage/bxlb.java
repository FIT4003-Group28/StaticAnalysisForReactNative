package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxlb  reason: default package */
/* loaded from: classes4.dex */
public final class bxlb implements btzi<dvvu, dvvw> {
    final /* synthetic */ bxld a;

    public bxlb(bxld bxldVar) {
        this.a = bxldVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvvu> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.a.a(btzyVar.p);
            this.a.b.a(null, btzyVar.p);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvvu> btzrVar, dvvw dvvwVar) {
        dvvw dvvwVar2 = dvvwVar;
        synchronized (this.a) {
            this.a.b.a(dvvwVar2, null);
        }
    }
}
