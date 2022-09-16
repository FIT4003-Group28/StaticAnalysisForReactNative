package defpackage;

import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adlg  reason: default package */
/* loaded from: classes.dex */
public final class adlg implements ynl {
    final /* synthetic */ adlh a;

    public adlg(adlh adlhVar) {
        this.a = adlhVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        afwb afwbVar = (afwb) obj;
                        this.a.e = true;
                        return null;
                    }
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
                adob adobVar = (adob) obj;
                airr f = this.a.f();
                f.getClass();
                adnt a = adobVar.a();
                if (a == null) {
                    this.a.b.b();
                    this.a.d(adobVar.b());
                    return null;
                }
                int a2 = a.a();
                if (a2 == 0) {
                    f.a();
                    return null;
                } else if (a2 != 1) {
                    this.a.b.b();
                    this.a.d(adobVar.b());
                    return null;
                } else {
                    this.a.b.b();
                    this.a.b();
                    return null;
                }
            }
            adnj adnjVar = (adnj) obj;
            this.a.f().getClass();
            adnt e = this.a.c.e();
            if (e == null) {
                return null;
            }
            adlh adlhVar = this.a;
            if (adlhVar.e) {
                adlhVar.e = false;
                return null;
            }
            adnl b = adnjVar.b();
            if (b.f()) {
                int a3 = adnjVar.a();
                if (a3 == 1) {
                    this.a.c(b);
                    return null;
                } else if (a3 != 2) {
                    return null;
                } else {
                    this.a.a(b);
                    return null;
                }
            } else if (!b.h(e.w()) || TextUtils.isEmpty(e.v())) {
                if (!e.aa() || !e.Z()) {
                    adlh adlhVar2 = this.a;
                    airr f2 = adlhVar2.f();
                    f2.getClass();
                    f2.s();
                    adlhVar2.a.d(adlj.CONNECTED_ONLY);
                    return null;
                }
                String.valueOf(String.valueOf(adnjVar)).length();
                return null;
            } else {
                this.a.a(b);
                return null;
            }
        }
        return new Class[]{adnj.class, adob.class, afwb.class};
    }
}
