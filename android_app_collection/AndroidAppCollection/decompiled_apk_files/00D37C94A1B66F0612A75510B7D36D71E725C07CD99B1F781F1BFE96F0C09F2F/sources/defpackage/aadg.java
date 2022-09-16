package defpackage;
/* compiled from: PG */
/* renamed from: aadg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aadg implements anir {
    public final /* synthetic */ aadh a;
    private final /* synthetic */ int b;

    public /* synthetic */ aadg(aadh aadhVar) {
        this.a = aadhVar;
    }

    public /* synthetic */ aadg(aadh aadhVar, int i) {
        this.b = i;
        this.a = aadhVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aade aadeVar = (aade) obj;
            return ((abfh) this.a.a.get()).g();
        } else if (i == 1) {
            aade aadeVar2 = (aade) obj;
            return ((abfh) this.a.a.get()).g();
        } else {
            aadh aadhVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                return anlz.q(aade.STAGING.i);
            }
            return anii.i(((abfh) aadhVar.a.get()).c(), new aadg(aadhVar), anjk.a);
        }
    }
}
