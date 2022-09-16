package defpackage;

import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czfh  reason: default package */
/* loaded from: classes5.dex */
public final class czfh extends czfj {
    private final czdb b;
    private final cyph c;
    private final czfd d;

    public czfh(czdb czdbVar, cyph cyphVar, czfd czfdVar) {
        this.b = czdbVar;
        this.c = cyphVar;
        this.d = czfdVar;
    }

    private final void d(String str, @dzsi String str2, cywi cywiVar, dcka<Character, cywi> dckaVar) {
        f(this.b.a(str), cywiVar, dckaVar);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                Character c = this.d.c(String.valueOf(charAt));
                if (!dckaVar.F(c, cywiVar)) {
                    dckaVar.n(c, cywiVar);
                }
            }
        }
        if (!str.equals(str2)) {
            f(this.b.a(str), cywiVar, dckaVar);
        }
    }

    private final void e(String str, @dzsi String str2, cywi cywiVar, dcka<Character, cywi> dckaVar) {
        f(dudm.c(str, true), cywiVar, dckaVar);
        if (!str.equals(str2)) {
            f(dudm.c(str2, true), cywiVar, dckaVar);
        }
    }

    private final void f(Iterable<dudl> iterable, cywi cywiVar, dcka<Character, cywi> dckaVar) {
        for (dudl dudlVar : iterable) {
            Character c = this.d.c(dudlVar.c);
            if (!dckaVar.F(c, cywiVar)) {
                dckaVar.n(c, cywiVar);
            }
        }
    }

    @Override // defpackage.czfj
    public final czfi a(dcdc<cywi> dcdcVar) {
        if (dcdcVar.size() <= 50) {
            return new czff(dcdcVar);
        }
        dbtp b = this.c.b();
        dbyv N = dbyv.N();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cywi cywiVar = dcdcVar.get(i);
            dcdc<cywh> b2 = cywiVar.b();
            int size2 = b2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                f(dudm.c(b2.get(i2).a(), false), cywiVar, N);
            }
            for (cyvy cyvyVar : cywiVar.p()) {
                cyep cyepVar = cyep.EMAIL;
                cyfj cyfjVar = cyfj.EMAIL;
                int ordinal = cyvyVar.a().ordinal();
                if (ordinal == 0) {
                    e(cyvyVar.b(), cyvyVar.d(), cywiVar, N);
                } else if (ordinal == 1) {
                    d(cyvyVar.b(), cyvyVar.d(), cywiVar, N);
                }
            }
            for (InAppNotificationTarget inAppNotificationTarget : cywiVar.q()) {
                Iterable<ContactMethodField> d = inAppNotificationTarget.d();
                if (inAppNotificationTarget.SA() != cyep.IN_APP_GAIA && inAppNotificationTarget.g() != 3) {
                    d = dcbg.d(dcdc.f(inAppNotificationTarget), d);
                }
                for (ContactMethodField contactMethodField : d) {
                    cyfj cyfjVar2 = cyfj.EMAIL;
                    int ordinal2 = contactMethodField.SA().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 != 4) {
                                        if (ordinal2 != 5) {
                                        }
                                    }
                                }
                            }
                            f(dudm.c(contactMethodField.a().toString(), false), cywiVar, N);
                        }
                        d(contactMethodField.a().toString(), null, cywiVar, N);
                    }
                    e(contactMethodField.a().toString(), null, cywiVar, N);
                }
            }
        }
        dcde b3 = dcde.b(N);
        cypg.a(this.c, 15, b, cyor.a);
        this.c.d(22, (int) ((b3.h(czfd.a).size() * 100.0f) / dcdcVar.size()), cyor.a);
        return new czfg(this.c, this.d, dcdcVar, b3);
    }
}
