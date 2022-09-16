package com.google.android.libraries.youtube.account.identity;

import android.os.Parcelable;
import java.io.Serializable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class AccountIdentity implements Parcelable, Serializable, afvm {
    public static AccountIdentity A(String str, String str2, String str3, boolean z, String str4) {
        return C(str, str2, str3, false, z, false, false, false, false, 2, str4);
    }

    public static AccountIdentity B(String str, String str2, String str3, int i, String str4) {
        return new AutoValue_AccountIdentity(str, str2, "", false, false, false, str3 == null ? "" : str3, false, false, false, i, str4);
    }

    private static AccountIdentity C(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, String str4) {
        return new AutoValue_AccountIdentity(str, str2, str3 == null ? "" : str3, z, z2, z3, str4 == null ? "" : str4, z4, z5, z6, i, "NO_DELEGATION_CONTEXT");
    }

    private static AccountIdentity D(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, String str3) {
        return C(str, str2, null, false, false, z, z2, z3, z4, i, str3);
    }

    public static AccountIdentity m(apwe apweVar) {
        if ((apweVar.c & 128) != 0) {
            String str = apweVar.h;
            String str2 = apweVar.i;
            aqkg aqkgVar = apweVar.j;
            if (aqkgVar == null) {
                aqkgVar = aqkg.a;
            }
            String str3 = aqkgVar.b;
            int c = apwt.c(apweVar.f);
            if (c == 0) {
                c = 1;
            }
            return B(str, str2, str3, c, apweVar.k);
        } else if (!new aops(apweVar.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT)) {
            if (!new aops(apweVar.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA)) {
                if (new aops(apweVar.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                    int c2 = apwt.c(apweVar.f);
                    if (c2 == 0 || c2 != 3) {
                        String str4 = apweVar.h;
                        String str5 = apweVar.i;
                        aqkg aqkgVar2 = apweVar.j;
                        if (aqkgVar2 == null) {
                            aqkgVar2 = aqkg.a;
                        }
                        return u(str4, str5, aqkgVar2.b, new aops(apweVar.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU));
                    }
                    String str6 = apweVar.d;
                    String str7 = apweVar.i;
                    aqkg aqkgVar3 = apweVar.j;
                    if (aqkgVar3 == null) {
                        aqkgVar3 = aqkg.a;
                    }
                    return p(str6, str7, aqkgVar3.b);
                } else if (!new aops(apweVar.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                    String str8 = apweVar.h;
                    String str9 = apweVar.i;
                    aqkg aqkgVar4 = apweVar.j;
                    if (aqkgVar4 == null) {
                        aqkgVar4 = aqkg.a;
                    }
                    return n(str8, str9, null, aqkgVar4.b);
                } else {
                    int c3 = apwt.c(apweVar.f);
                    if (c3 == 0 || c3 != 3) {
                        String str10 = apweVar.h;
                        String str11 = apweVar.i;
                        aqkg aqkgVar5 = apweVar.j;
                        if (aqkgVar5 == null) {
                            aqkgVar5 = aqkg.a;
                        }
                        return q(str10, str11, aqkgVar5.b, new aops(apweVar.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU));
                    }
                    String str12 = apweVar.d;
                    String str13 = apweVar.i;
                    aqkg aqkgVar6 = apweVar.j;
                    if (aqkgVar6 == null) {
                        aqkgVar6 = aqkg.a;
                    }
                    return o(str12, str13, aqkgVar6.b);
                }
            }
            String str14 = apweVar.d;
            String str15 = apweVar.i;
            aqkg aqkgVar7 = apweVar.j;
            if (aqkgVar7 == null) {
                aqkgVar7 = aqkg.a;
            }
            return s(str14, str15, aqkgVar7.b);
        } else {
            String str16 = apweVar.h;
            String str17 = apweVar.i;
            String str18 = apweVar.d;
            aqkg aqkgVar8 = apweVar.j;
            if (aqkgVar8 == null) {
                aqkgVar8 = aqkg.a;
            }
            return n(str16, str17, str18, aqkgVar8.b);
        }
    }

    public static AccountIdentity n(String str, String str2, String str3, String str4) {
        return A(str, str2, str3, false, str4);
    }

    public static AccountIdentity o(String str, String str2, String str3) {
        return D(str, str2, false, false, true, false, 3, str3);
    }

    public static AccountIdentity p(String str, String str2, String str3) {
        return D(str, str2, false, true, false, false, 3, str3);
    }

    public static AccountIdentity q(String str, String str2, String str3, boolean z) {
        return D(str, str2, false, false, true, z, 2, str3);
    }

    public static AccountIdentity r(String str, String str2) {
        return C(str, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, str2);
    }

    public static AccountIdentity s(String str, String str2, String str3) {
        return D(str, str2, true, false, false, false, 3, str3);
    }

    public static AccountIdentity t(String str) {
        String valueOf = String.valueOf(str);
        return A(valueOf.length() != 0 ? "PRIMORDIAL-".concat(valueOf) : new String("PRIMORDIAL-"), str, "", false, "");
    }

    public static AccountIdentity u(String str, String str2, String str3, boolean z) {
        return D(str, str2, false, true, false, z, 2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public final int hashCode() {
        return d().hashCode();
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l();

    @Override // defpackage.afvm
    public final boolean v() {
        return !"NO_DELEGATION_CONTEXT".equals(c());
    }

    @Override // defpackage.afvm
    public final boolean w() {
        return !e().equals("");
    }

    @Override // defpackage.afvm
    public final boolean x() {
        return w() || v() || h() || l() != 2;
    }

    @Override // defpackage.afvm
    public final boolean y() {
        return false;
    }

    @Override // defpackage.afvm
    public final boolean z() {
        return g();
    }
}
