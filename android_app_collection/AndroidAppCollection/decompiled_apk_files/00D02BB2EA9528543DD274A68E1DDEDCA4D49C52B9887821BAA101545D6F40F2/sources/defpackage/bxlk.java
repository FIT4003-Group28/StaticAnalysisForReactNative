package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxlk  reason: default package */
/* loaded from: classes4.dex */
public final class bxlk implements btzi<dwjn, dwjp> {
    final /* synthetic */ bxlr a;

    public bxlk(bxlr bxlrVar) {
        this.a = bxlrVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjn> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bxlr bxlrVar = this.a;
            if (!bxlrVar.k) {
                bxlrVar.p = btzyVar;
                if (bxlrVar.q != null || bxlrVar.r != null) {
                    bxlrVar.d();
                }
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjn> btzrVar, dwjp dwjpVar) {
        dwjp dwjpVar2 = dwjpVar;
        synchronized (this.a) {
            bxlr bxlrVar = this.a;
            bxes bxesVar = bxlrVar.i;
            dwjn dwjnVar = bxlrVar.l;
            dbsk.s(dwjnVar);
            bxesVar.a(dwjnVar, dwjpVar2);
            if (this.a.h()) {
                long e = this.a.a.e();
                bxlr bxlrVar2 = this.a;
                if ((e - bxlrVar2.j) - bxlrVar2.e.getSuggestParameters().y > this.a.e.getSuggestParameters().z && this.a.k) {
                    return;
                }
            } else if (this.a.k) {
                return;
            }
            bxlr bxlrVar3 = this.a;
            bxlrVar3.o = dwjpVar2;
            bxlrVar3.d();
        }
    }
}
