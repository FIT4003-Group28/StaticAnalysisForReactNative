package defpackage;
/* compiled from: PG */
/* renamed from: abba  reason: default package */
/* loaded from: classes2.dex */
public final class abba {
    private final cjqy a;
    private final cjqq b;
    private final akgd c;
    private final cqat d;

    public abba(cjqy cjqyVar, cjqq cjqqVar, akgd akgdVar, cqat cqatVar) {
        this.a = cjqyVar;
        this.b = cjqqVar;
        this.c = akgdVar;
        this.d = cqatVar;
    }

    private static cjtd c(boolean z, String str) {
        cjta b = cjtd.b();
        b.d = dtxo.aA;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = z ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        if (!dbsj.d(str)) {
            b.g(str);
        }
        return b.a();
    }

    public final void a(String str, String str2) {
        eapd d = this.c.d(str);
        eapd eapdVar = new eapd(this.d.b());
        if (d.e(this.c.f()).x(eapdVar)) {
            this.c.e(str, eapdVar);
            this.b.g().d(c(false, str2));
        }
    }

    public final cjqm b(String str) {
        return this.a.i(c(true, str));
    }
}
