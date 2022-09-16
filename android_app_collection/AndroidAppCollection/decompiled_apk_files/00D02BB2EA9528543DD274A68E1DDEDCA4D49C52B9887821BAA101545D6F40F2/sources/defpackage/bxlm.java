package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxlm  reason: default package */
/* loaded from: classes4.dex */
public final class bxlm implements btzi<dwjn, dwjp> {
    final /* synthetic */ bxlr a;

    public bxlm(bxlr bxlrVar) {
        this.a = bxlrVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwjn> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bxlr bxlrVar = this.a;
            if (!bxlrVar.k) {
                bxlrVar.r = btzyVar;
                if (bxlrVar.o != null || bxlrVar.p != null) {
                    bxlrVar.d();
                }
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwjn> btzrVar, dwjp dwjpVar) {
        bxlr bxlrVar;
        GmmLocation gmmLocation;
        dwjp dwjpVar2 = dwjpVar;
        synchronized (this.a) {
            bxlr bxlrVar2 = this.a;
            if (bxlrVar2.k) {
                return;
            }
            bxlrVar2.q = dwjpVar2;
            if (bxlrVar2.o == null && bxlrVar2.p == null) {
                if (bxlr.g(bxlrVar2.q)) {
                    return;
                }
                bxlr bxlrVar3 = this.a;
                GmmLocation gmmLocation2 = bxlrVar3.c;
                long j = ((gmmLocation2 == null || !bxlt.d(bxlrVar3.q, gmmLocation2)) && ((gmmLocation = (bxlrVar = this.a).d) == null || !bxlt.d(bxlrVar.q, gmmLocation))) ? this.a.g : this.a.f;
                bxlr bxlrVar4 = this.a;
                long f = bxlr.f(bxlrVar4.a, bxlrVar4.j, j);
                bxlr bxlrVar5 = this.a;
                if (bxlr.f(bxlrVar5.a, bxlrVar5.j, bxlrVar5.h) == 0) {
                    this.a.d();
                } else {
                    this.a.b.a(new bxll(this), this.a.m, f);
                }
                return;
            }
            bxlrVar2.d();
        }
    }
}
