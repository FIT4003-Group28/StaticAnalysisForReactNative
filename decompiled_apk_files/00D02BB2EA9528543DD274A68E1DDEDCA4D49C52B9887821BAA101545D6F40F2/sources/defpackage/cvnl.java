package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvnl  reason: default package */
/* loaded from: classes5.dex */
public final class cvnl {
    private final cvjs a;
    private final cvmk b;
    private final cvmt c;
    private final cvmv d;
    private final cvkf e;
    private final cvnj f;
    private final cvpk g;
    private final cvlr h;

    public cvnl(cvjs cvjsVar, cvmk cvmkVar, cvmt cvmtVar, cvmv cvmvVar, cvnj cvnjVar, cvpk cvpkVar, cvkf cvkfVar, cvlr cvlrVar) {
        this.a = cvjsVar;
        this.b = cvmkVar;
        this.c = cvmtVar;
        this.d = cvmvVar;
        this.f = cvnjVar;
        this.g = cvpkVar;
        this.e = cvkfVar;
        this.h = cvlrVar;
    }

    public final drzu a(String str, int i) {
        dsaf bZ = dsai.c.bZ();
        try {
            dsag bZ2 = dsah.d.bZ();
            long parseLong = Long.parseLong(this.a.c());
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dsah dsahVar = (dsah) bZ2.b;
            dsahVar.a |= 1;
            dsahVar.b = parseLong;
            String a = this.b.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dsah dsahVar2 = (dsah) bZ2.b;
            a.getClass();
            dsahVar2.a |= 2;
            dsahVar2.c = a;
            dsah bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsai dsaiVar = (dsai) bZ.b;
            bK.getClass();
            dsaiVar.b = bK;
            dsaiVar.a |= 1;
            drzt bZ3 = drzu.i.bZ();
            String a2 = this.a.a();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drzu drzuVar = (drzu) bZ3.b;
            a2.getClass();
            drzuVar.a |= 2;
            drzuVar.c = a2;
            dsay a3 = this.d.a();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drzu drzuVar2 = (drzu) bZ3.b;
            a3.getClass();
            drzuVar2.d = a3;
            drzuVar2.a |= 4;
            dsau a4 = this.c.a();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drzu drzuVar3 = (drzu) bZ3.b;
            a4.getClass();
            drzuVar3.f = a4;
            int i2 = drzuVar3.a | 8;
            drzuVar3.a = i2;
            int i3 = i - 1;
            dryf dryfVar = null;
            if (i == 0) {
                throw null;
            }
            drzuVar3.b = i3;
            drzuVar3.a = i2 | 1;
            dsai bK2 = bZ.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drzu drzuVar4 = (drzu) bZ3.b;
            bK2.getClass();
            drzuVar4.g = bK2;
            drzuVar4.a |= 16;
            if (dxxt.b() || dxxt.c()) {
                drye bZ4 = dryf.d.bZ();
                if (dxxt.b()) {
                    try {
                        String a5 = this.g.a(str);
                        if (!TextUtils.isEmpty(a5)) {
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dryf dryfVar2 = (dryf) bZ4.b;
                            a5.getClass();
                            dryfVar2.a |= 1;
                            dryfVar2.b = a5;
                        }
                    } catch (Exception unused) {
                        cvlw.e("StoreTargetRequestBuilder", "Failed to get the GMSCore obfuscated account ID for [%s].", str);
                    }
                }
                if (dxxt.c()) {
                    try {
                        cvkc b = this.e.b(str);
                        if (!TextUtils.isEmpty(b.c())) {
                            String c = b.c();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dryf dryfVar3 = (dryf) bZ4.b;
                            c.getClass();
                            dryfVar3.a |= 2;
                            dryfVar3.c = c;
                        }
                    } catch (cvke unused2) {
                        cvlw.e("StoreTargetRequestBuilder", "Failed to get storage obfuscated account ID for [%s].", str);
                    }
                }
                dryfVar = bZ4.bK();
            }
            if (dryfVar != null) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                drzu drzuVar5 = (drzu) bZ3.b;
                dryfVar.getClass();
                drzuVar5.h = dryfVar;
                drzuVar5.a |= 32;
            }
            List<String> a6 = this.f.a();
            if (a6 != null) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                drzu drzuVar6 = (drzu) bZ3.b;
                dsrj<String> dsrjVar = drzuVar6.e;
                if (!dsrjVar.a()) {
                    drzuVar6.e = dsqw.cl(dsrjVar);
                }
                dsod.bv(a6, drzuVar6.e);
            }
            return bZ3.bK();
        } catch (cvml e) {
            cvlp b2 = this.h.b(24);
            b2.j(str);
            b2.a();
            throw e;
        }
    }
}
