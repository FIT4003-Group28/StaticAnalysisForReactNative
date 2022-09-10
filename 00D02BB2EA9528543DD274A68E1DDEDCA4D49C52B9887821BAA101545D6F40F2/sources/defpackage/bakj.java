package defpackage;
/* compiled from: PG */
/* renamed from: bakj  reason: default package */
/* loaded from: classes3.dex */
final class bakj implements jkh {
    final /* synthetic */ bakk a;

    public bakj(bakk bakkVar) {
        this.a = bakkVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        bakk bakkVar = this.a;
        if (!bakkVar.aD) {
            return;
        }
        bakkVar.af = jjnVar2;
        balb balbVar = bakkVar.ah;
        if (balbVar == null) {
            return;
        }
        balbVar.a(jjnVar2);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        baky bakyVar = this.a.ag;
        if (bakyVar != null) {
            bakyVar.P(jkjVar, jjnVar, f);
        }
        balb balbVar = this.a.ah;
        if (balbVar != null) {
            balbVar.P(jkjVar, jjnVar, f);
        }
    }
}
