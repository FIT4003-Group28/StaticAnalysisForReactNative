package defpackage;
/* compiled from: PG */
/* renamed from: sgv  reason: default package */
/* loaded from: classes4.dex */
public final class sgv implements sgp {
    private final /* synthetic */ int a;

    public sgv() {
    }

    public sgv(int i) {
        this.a = i;
    }

    @Override // defpackage.sgp
    public final /* bridge */ /* synthetic */ Object a(Object obj, int i, sgt sgtVar) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return ((sgw) obj).a();
            }
            if (i2 == 2) {
                sgx sgxVar = (sgx) obj;
                return (String) sgxVar.b.get(sgxVar.c);
            }
            sgx sgxVar2 = (sgx) obj;
            return (Double) sgxVar2.a.get(sgxVar2.c);
        }
        return ((sgw) obj).b();
    }
}
