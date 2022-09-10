package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: czcz  reason: default package */
/* loaded from: classes5.dex */
public final class czcz {
    private static final String[] c = {"0", "1", "8", "01", "06", "02", "00", "011", "810", "010", "0011"};
    private final czdb a;
    private final boolean b;

    public czcz(czdb czdbVar, boolean z) {
        this.a = czdbVar;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<MatchInfo> a(String str, String str2, dudl dudlVar) {
        czcy czcyVar = new czcy(str);
        czcy czcyVar2 = new czcy(str2);
        czcy czcyVar3 = new czcy(dudlVar.c);
        czcyVar2.a();
        czcyVar3.a();
        while (true) {
            if (!czcyVar2.c() || !czcyVar3.c()) {
                break;
            } else if (czcyVar2.b == czcyVar3.b) {
                czcyVar2.h();
                czcyVar3.h();
            } else {
                czcyVar2.i();
                czcyVar3.i();
                break;
            }
        }
        boolean c2 = czcyVar3.c();
        boolean c3 = czcyVar2.c();
        if (c2 && !c3) {
            czcyVar2.b();
            czcyVar3.i();
        } else if (!c2 && c3) {
            czcyVar3.b();
            czcyVar2.i();
        } else if (!c2 && !c3) {
            czcyVar2.b();
            czcyVar3.b();
        }
        czcyVar.g(czcyVar3.a);
        while (czcyVar2.c() && czcyVar.c()) {
            if (czcyVar2.b == czcyVar.b) {
                if (czcyVar2.d) {
                    czcyVar2.f++;
                } else {
                    czcyVar2.d = true;
                    czcyVar2.e = czcyVar2.a;
                    czcyVar2.f = 1;
                }
                czcyVar2.e();
                czcyVar.e();
            } else {
                czcyVar2.f();
                czcyVar2.e();
            }
        }
        czcyVar2.f();
        return czcyVar2.c.f();
    }

    public static dcdc<dudl> c(String str) {
        dudl f = dudm.f(str);
        if (f == null) {
            return dcdc.e();
        }
        if (f.c.length() <= 2) {
            return dcdc.f(f);
        }
        dccx G = dcdc.G(12);
        G.g(f);
        String[] strArr = c;
        for (int i = 0; i < 11; i++) {
            String str2 = strArr[i];
            if (f.c.startsWith(str2) && !f.c.equals(str2)) {
                int length = str2.length();
                G.g(new dudl(f.c.substring(length), f.d + length, f.f, f.e));
            }
        }
        return G.f();
    }

    public final boolean b(String str, PersonFieldMetadata personFieldMetadata, dcdc<dudl> dcdcVar) {
        dcpd<dudl> it = this.a.a(str).iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                dudl next = it.next();
                int size = dcdcVar.size();
                while (i < size) {
                    dudl dudlVar = dcdcVar.get(i);
                    i++;
                    if (this.a.b(dudlVar, next, this.b)) {
                        personFieldMetadata.n = a(dudlVar.c, str, next);
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
    }
}
