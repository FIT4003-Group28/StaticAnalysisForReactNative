package defpackage;

import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
/* compiled from: PG */
/* renamed from: ych  reason: default package */
/* loaded from: classes4.dex */
final class ych implements afzf {
    private final yzj a;
    private final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint b;
    private final acrr c;
    private final aafo d;
    private final ydq e;
    private final yat f;
    private final abmn g;

    public ych(yzj yzjVar, acrr acrrVar, aafo aafoVar, abmn abmnVar, YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, ydq ydqVar, yat yatVar) {
        this.a = yzjVar;
        this.c = acrrVar;
        this.d = aafoVar;
        this.g = abmnVar;
        this.b = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
        this.e = ydqVar;
        this.f = yatVar;
    }

    private final void d(boolean z) {
        arrh b;
        aoob aoobVar = this.b.e;
        if (!aoobVar.H()) {
            ybr ybrVar = new ybr();
            ybrVar.a = aoobVar;
            acrr acrrVar = this.c;
            if (z) {
                b = ybrVar.f();
            } else {
                ybrVar.b = 4;
                b = ybrVar.b();
            }
            acrrVar.c(b);
        }
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.f.a();
        yzj yzjVar = this.a;
        yzjVar.d(yzjVar.b(cffVar));
        abmn abmnVar = this.g;
        if (abmnVar != null) {
            abmnVar.a.i(cffVar.getLocalizedMessage());
        }
        d(false);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction;
        asqo asqoVar;
        ashe asheVar = (ashe) obj;
        this.f.a();
        abmn abmnVar = this.g;
        if (abmnVar != null) {
            if (asheVar.c == 2) {
                completeTransactionActionOuterClass$CompleteTransactionAction = (CompleteTransactionActionOuterClass$CompleteTransactionAction) asheVar.d;
            } else {
                completeTransactionActionOuterClass$CompleteTransactionAction = CompleteTransactionActionOuterClass$CompleteTransactionAction.a;
            }
            ashu ashuVar = completeTransactionActionOuterClass$CompleteTransactionAction.d;
            if (ashuVar == null) {
                ashuVar = ashu.a;
            }
            if (ashuVar.b != 136403337) {
                abmnVar.a.j();
            } else {
                abmo abmoVar = abmnVar.a;
                ashu ashuVar2 = completeTransactionActionOuterClass$CompleteTransactionAction.d;
                if (ashuVar2 == null) {
                    ashuVar2 = ashu.a;
                }
                if (ashuVar2.b == 136403337) {
                    asqoVar = (asqo) ashuVar2.c;
                } else {
                    asqoVar = asqo.a;
                }
                arag aragVar = asqoVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                abmoVar.i(ajgl.b(aragVar));
            }
        }
        if (asheVar.c == 2) {
            CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction2 = (CompleteTransactionActionOuterClass$CompleteTransactionAction) asheVar.d;
            this.d.b(completeTransactionActionOuterClass$CompleteTransactionAction2.e);
            if (completeTransactionActionOuterClass$CompleteTransactionAction2.f && (completeTransactionActionOuterClass$CompleteTransactionAction2.b & 1) != 0) {
                aopa createBuilder = ashn.a.createBuilder();
                ashf ashfVar = completeTransactionActionOuterClass$CompleteTransactionAction2.c;
                if (ashfVar == null) {
                    ashfVar = ashf.a;
                }
                createBuilder.copyOnWrite();
                ashn ashnVar = (ashn) createBuilder.instance;
                ashfVar.getClass();
                ashnVar.d = ashfVar;
                ashnVar.b |= 2;
                this.e.c((ashn) createBuilder.mo39build());
            }
        } else if ((asheVar.b & 8) == 0) {
            this.e.b();
        } else {
            aafo aafoVar = this.d;
            apzg apzgVar = asheVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
        d(true);
    }
}
