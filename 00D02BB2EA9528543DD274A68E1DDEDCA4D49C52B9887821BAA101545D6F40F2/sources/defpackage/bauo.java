package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bauo  reason: default package */
/* loaded from: classes3.dex */
final class bauo implements btzi<dwxn, dwxp> {
    final /* synthetic */ baup a;

    public bauo(baup baupVar) {
        this.a = baupVar;
    }

    private final void c() {
        bbbv bbbvVar = this.a.aw;
        if (bbbvVar != null) {
            bbbvVar.g(false);
        }
        this.a.au.e(false);
    }

    private final void d() {
        bbbv bbbvVar = this.a.aw;
        if (bbbvVar != null) {
            cqkx.p(bbbvVar);
        }
        cqkx.p(this.a.au);
        cqkx.p(this.a.av);
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwxn> btzrVar, btzy btzyVar) {
        if (!this.a.aD) {
            return;
        }
        c();
        if (!btzyVar.equals(btzy.d)) {
            Toast.makeText(this.a.J(), this.a.J().getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY), 1).show();
        }
        d();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwxn> btzrVar, dwxp dwxpVar) {
        dwxp dwxpVar2 = dwxpVar;
        if (!this.a.aD) {
            return;
        }
        bvrj.UI_THREAD.c();
        c();
        bbbv bbbvVar = this.a.aw;
        if (bbbvVar != null && (dwxpVar2.a & 1) != 0) {
            dwxl dwxlVar = dwxpVar2.b;
            if (dwxlVar == null) {
                dwxlVar = dwxl.d;
            }
            bbbvVar.f(dwxlVar.b);
            dwxl dwxlVar2 = dwxpVar2.b;
            if (dwxlVar2 == null) {
                dwxlVar2 = dwxl.d;
            }
            if ((dwxlVar2.a & 1) != 0) {
                dwxl dwxlVar3 = dwxpVar2.b;
                if (dwxlVar3 == null) {
                    dwxlVar3 = dwxl.d;
                }
                final String str = dwxlVar3.c;
                bbbvVar.j(new Runnable(this, str) { // from class: baun
                    private final bauo a;
                    private final String b;

                    {
                        this.a = this;
                        this.b = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        btzc btzcVar;
                        bauo bauoVar = this.a;
                        String str2 = this.b;
                        baup baupVar = bauoVar.a;
                        bbbv bbbvVar2 = baupVar.aw;
                        if (bbbvVar2 == null || (btzcVar = baupVar.a) == null) {
                            return;
                        }
                        btzcVar.a();
                        bbbvVar2.g(true);
                        baup baupVar2 = bauoVar.a;
                        bvbi bvbiVar = baupVar2.aC;
                        dwxm bZ = dwxn.e.bZ();
                        dwww bZ2 = dwwx.c.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dwwx.c((dwwx) bZ2.b);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dwwx dwwxVar = (dwwx) bZ2.b;
                        str2.getClass();
                        dwwxVar.a |= 2;
                        dwwxVar.b = str2;
                        dwwx.e(dwwxVar);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dwxn dwxnVar = (dwxn) bZ.b;
                        dwwx bK = bZ2.bK();
                        bK.getClass();
                        dwxnVar.b = bK;
                        dwxnVar.a |= 8;
                        baupVar2.a = bvbiVar.a(bZ.bK(), new bauo(bauoVar.a), bvrj.UI_THREAD);
                    }
                });
            }
        }
        if (dwxpVar2.c.size() != 0) {
            this.a.au.f(dwxpVar2.c);
        }
        d();
    }
}
