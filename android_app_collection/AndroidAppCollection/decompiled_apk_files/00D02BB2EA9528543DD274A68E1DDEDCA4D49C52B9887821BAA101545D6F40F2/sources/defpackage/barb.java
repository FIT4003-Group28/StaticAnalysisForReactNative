package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.apps.maps.R;
/* renamed from: barb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class barb {
    private final bare a;
    private final drdg b;

    public barb(bare bareVar, drdg drdgVar) {
        this.a = bareVar;
        this.b = drdgVar;
    }

    public final void a(final ilo iloVar, final dcdc dcdcVar) {
        final bare bareVar = this.a;
        final drdg drdgVar = this.b;
        bareVar.d.runOnUiThread(new Runnable(bareVar, iloVar, dcdcVar, drdgVar) { // from class: barc
            private final bare a;
            private final ilo b;
            private final dcdc c;
            private final drdg d;

            {
                this.a = bareVar;
                this.b = iloVar;
                this.c = dcdcVar;
                this.d = drdgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                bare bareVar2 = this.a;
                ilo iloVar2 = this.b;
                dcdc dcdcVar2 = this.c;
                drdg drdgVar2 = this.d;
                if (iloVar2 == null) {
                    bareVar2.m();
                } else if (dcdcVar2 == null || dcdcVar2.isEmpty()) {
                    gdf gdfVar = new gdf((Context) bareVar2.d, false);
                    cqkf e = bareVar2.f.e(new bamb());
                    e.e(new bard(bareVar2, iloVar2, gdfVar));
                    Window window = gdfVar.getWindow();
                    dbsk.s(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    gdfVar.setContentView(e.c());
                    gdfVar.show();
                } else {
                    axwo a = bareVar2.a.a();
                    bakv bakvVar = bareVar2.e;
                    String string = bareVar2.d.getString(R.string.TRIP_DESTINATION_SAVED_PLACES_IN_DESTINATION, drdgVar2.g);
                    if (drdgVar2.i.isEmpty()) {
                        str = null;
                    } else {
                        drcx drcxVar = drdgVar2.i.get(0).d;
                        if (drcxVar == null) {
                            drcxVar = drcx.d;
                        }
                        str = drcxVar.c;
                    }
                    baad a2 = bakvVar.a.a().a(string);
                    if (!dbsj.d(str)) {
                        dnwk bZ = dnwl.f.bZ();
                        dnwq bZ2 = dnwr.c.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dnwr dnwrVar = (dnwr) bZ2.b;
                        str.getClass();
                        dnwrVar.a = 1 | dnwrVar.a;
                        dnwrVar.b = str;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnwl dnwlVar = (dnwl) bZ.b;
                        dnwr bK = bZ2.bK();
                        bK.getClass();
                        dnwlVar.e = bK;
                        dnwlVar.a |= 8192;
                        a2.J(bZ.bK());
                    }
                    int size = dcdcVar2.size();
                    for (int i = 0; i < size; i++) {
                        baal baalVar = (baal) dcdcVar2.get(i);
                        baad b = baalVar.b();
                        if (b != null && !b.z()) {
                            a2.b(baalVar);
                        }
                    }
                    a.i(a2);
                }
                bareVar2.k(false);
            }
        });
    }
}
