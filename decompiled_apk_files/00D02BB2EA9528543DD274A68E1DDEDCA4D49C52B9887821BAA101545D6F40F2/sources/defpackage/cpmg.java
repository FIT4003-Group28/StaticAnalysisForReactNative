package defpackage;
/* compiled from: PG */
/* renamed from: cpmg  reason: default package */
/* loaded from: classes5.dex */
final class cpmg implements cpne {
    final /* synthetic */ cpmk a;

    public cpmg(cpmk cpmkVar) {
        this.a = cpmkVar;
    }

    @Override // defpackage.cpne
    public final void a(cpnd cpndVar) {
        this.a.c.b();
        if (!this.a.f() || cpndVar != cpnd.USER_INPUT_NOT_VERIFIED) {
            return;
        }
        this.a.h.b().k();
    }
}
