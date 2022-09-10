package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cvtt  reason: default package */
/* loaded from: classes5.dex */
public final class cvtt implements cvnq {
    private final cvkf a;
    private final cqat b;
    private final dbsg<cvtl> c;
    private final cvpk d;

    public cvtt(cvkf cvkfVar, cvpk cvpkVar, cqat cqatVar, dbsg dbsgVar) {
        this.a = cvkfVar;
        this.b = cqatVar;
        this.c = dbsgVar;
        this.d = cvpkVar;
    }

    @Override // defpackage.cvnq
    public final void a(String str, dssj dssjVar, dssj dssjVar2) {
        cvlw.a("StoreTargetCallback", "Registration finished for account: %s (SUCCESS).", str);
        drzu drzuVar = (drzu) dssjVar;
        drzw drzwVar = (drzw) dssjVar2;
        try {
            cvkc b = this.a.b(str);
            cvju j = b.j();
            int i = drzuVar.bC;
            if (i == 0) {
                i = dsst.a.b(drzuVar).c(drzuVar);
                drzuVar.bC = i;
            }
            j.c(i);
            j.d(cviv.REGISTERED);
            j.e = Long.valueOf(System.currentTimeMillis());
            if (drzwVar.c != 0 && b.h() == 0 && b.i().longValue() == 0) {
                j.f = Long.valueOf(drzwVar.c);
            }
            if ((drzwVar.a & 4) != 0) {
                j.b = drzwVar.b;
            } else if (TextUtils.isEmpty(b.c())) {
                try {
                    j.b = this.d.a(str);
                } catch (Exception unused) {
                    cvlw.e("StoreTargetCallback", "Failed to get the obfuscated account ID for: %s", str);
                }
            }
            this.a.e(j.a());
            if (!this.c.a()) {
                return;
            }
            this.c.b().b();
        } catch (cvke unused2) {
        }
    }

    @Override // defpackage.cvnq
    public final void b(String str, @dzsi dssj dssjVar) {
        cvlw.f("StoreTargetCallback", "Registration finished for account: %s (FAILURE).", str);
        try {
            cvju j = this.a.b(str).j();
            j.d(cviv.FAILED_REGISTRATION);
            this.a.e(j.a());
            if (!this.c.a()) {
                return;
            }
            this.c.b().a();
        } catch (cvke unused) {
        }
    }
}
