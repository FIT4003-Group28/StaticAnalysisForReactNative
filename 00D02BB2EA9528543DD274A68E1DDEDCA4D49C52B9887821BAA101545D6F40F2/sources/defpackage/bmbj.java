package defpackage;
/* compiled from: PG */
/* renamed from: bmbj  reason: default package */
/* loaded from: classes3.dex */
public class bmbj implements bmbe {
    private final dglo a;

    public bmbj(dglo dgloVar) {
        this.a = dgloVar;
    }

    @Override // defpackage.bmbe
    public String a() {
        dgkw dgkwVar;
        dglu dgluVar = this.a.d;
        if (dgluVar == null) {
            dgluVar = dglu.e;
        }
        if (dgluVar.b == 3) {
            dgkwVar = (dgkw) dgluVar.c;
        } else {
            dgkwVar = dgkw.f;
        }
        return dgkwVar.d;
    }

    @Override // defpackage.bmbe
    public String b() {
        dgkw dgkwVar;
        dglu dgluVar = this.a.d;
        if (dgluVar == null) {
            dgluVar = dglu.e;
        }
        if (dgluVar.b == 3) {
            dgkwVar = (dgkw) dgluVar.c;
        } else {
            dgkwVar = dgkw.f;
        }
        return dgkwVar.e;
    }

    @Override // defpackage.bmbe
    public Boolean c() {
        dgkw dgkwVar;
        dglu dgluVar = this.a.d;
        if (dgluVar == null) {
            dgluVar = dglu.e;
        }
        if (dgluVar.b == 3) {
            dgkwVar = (dgkw) dgluVar.c;
        } else {
            dgkwVar = dgkw.f;
        }
        return Boolean.valueOf(dgkwVar.b);
    }

    @Override // defpackage.bmbe
    public Integer d() {
        return Integer.valueOf(true != c().booleanValue() ? 2131232205 : 2131232198);
    }
}
