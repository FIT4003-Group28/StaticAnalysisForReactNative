package defpackage;
/* compiled from: PG */
/* renamed from: cpmh  reason: default package */
/* loaded from: classes5.dex */
final class cpmh implements cpnn {
    final /* synthetic */ cpmk a;

    public cpmh(cpmk cpmkVar) {
        this.a = cpmkVar;
    }

    @Override // defpackage.cpnn
    public final void a(dgzv dgzvVar) {
        dhad dhadVar = dgzvVar.a;
        if (dhadVar == null) {
            dhadVar = dhad.c;
        }
        dhaj dhajVar = dhadVar.a;
        if (dhajVar == null) {
            dhajVar = dhaj.c;
        }
        this.a.c.setTextSilently(dhajVar.a.get(0));
        this.a.c.setAddressInputState(cpnd.SUGGESTION);
        this.a.c.b();
    }

    @Override // defpackage.cpnn
    public final void b(String str) {
        this.a.c.setAddressInputState(cpnd.USER_INPUT_KEEP_ORIGINAL);
        this.a.c.setTextSilently(str);
        this.a.c.b();
    }
}
