package defpackage;
/* compiled from: PG */
/* renamed from: inf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class inf implements ayqb {
    public final /* synthetic */ iou a;
    private final /* synthetic */ int b;

    public /* synthetic */ inf(iou iouVar) {
        this.a = iouVar;
    }

    public /* synthetic */ inf(iou iouVar, int i) {
        this.b = i;
        this.a = iouVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            fhf fhfVar = (fhf) obj;
            this.a.bR.g(true);
        } else if (i == 1) {
            fhf fhfVar2 = (fhf) obj;
            this.a.bm.p();
        } else if (i == 2) {
            iou iouVar = this.a;
            iot iotVar = (iot) obj;
            ins insVar = new ins(iouVar, 5);
            ins insVar2 = new ins(iouVar);
            iotVar.a.ifPresent(insVar);
            iotVar.b.ifPresent(insVar2);
        } else if (i == 3) {
            this.a.bg((apzg) ((ampr) obj).b);
        } else if (i == 4) {
            this.a.bp((apzg) ((ampr) obj).b);
        } else if (i == 5) {
            final iou iouVar2 = this.a;
            final arln arlnVar = (arln) obj;
            mbt q = iouVar2.q();
            if (q == null) {
                return;
            }
            q.li(aumx.a, new zdt() { // from class: ini
                @Override // defpackage.zdt
                public final void a(Object obj2) {
                    iou iouVar3 = iou.this;
                    arln arlnVar2 = arlnVar;
                    aapd aapdVar = (aapd) obj2;
                    if (aapdVar instanceof aatf) {
                        aatf aatfVar = (aatf) aapdVar;
                        aatfVar.t = arlnVar2;
                        aatfVar.t(aaji.c(iouVar3.ai));
                        aatfVar.q(1);
                    }
                }
            }, new ioj(), null);
        } else {
            Boolean bool = (Boolean) obj;
            this.a.bj();
        }
    }
}
