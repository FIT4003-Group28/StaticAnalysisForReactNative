package defpackage;
/* compiled from: PG */
/* renamed from: bmbs  reason: default package */
/* loaded from: classes3.dex */
public class bmbs implements bmbi {
    private final dglo a;

    public bmbs(dglo dgloVar) {
        this.a = dgloVar;
    }

    @Override // defpackage.bmbi
    public String a() {
        return this.a.c;
    }

    @Override // defpackage.bmbi
    public Boolean b() {
        int a = dgky.a(this.a.e);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmbi
    @dzsi
    public String c() {
        dgkw dgkwVar;
        dglu dgluVar = this.a.d;
        if (dgluVar == null) {
            dgluVar = dglu.e;
        }
        if (dgluVar.b == 3) {
            dglu dgluVar2 = this.a.d;
            if (dgluVar2 == null) {
                dgluVar2 = dglu.e;
            }
            if (dgluVar2.b == 3) {
                dgkwVar = (dgkw) dgluVar2.c;
            } else {
                dgkwVar = dgkw.f;
            }
            if ((dgkwVar.a & 8) != 0) {
                dglu dgluVar3 = this.a.d;
                if (dgluVar3 == null) {
                    dgluVar3 = dglu.e;
                }
                return (dgluVar3.b == 3 ? (dgkw) dgluVar3.c : dgkw.f).e;
            }
            dglu dgluVar4 = this.a.d;
            if (dgluVar4 == null) {
                dgluVar4 = dglu.e;
            }
            return (dgluVar4.b == 3 ? (dgkw) dgluVar4.c : dgkw.f).c;
        }
        return null;
    }

    @Override // defpackage.bmbi
    public Integer d() {
        int a;
        if (b().booleanValue()) {
            return 2131232205;
        }
        dglg dglgVar = this.a.f;
        if (dglgVar == null) {
            dglgVar = dglg.c;
        }
        int i = 1;
        if (dglgVar.a == 1 && (a = dglf.a(((Integer) dglgVar.b).intValue())) != 0) {
            i = a;
        }
        return i + (-1) != 2 ? 2131232559 : 2131232205;
    }
}
