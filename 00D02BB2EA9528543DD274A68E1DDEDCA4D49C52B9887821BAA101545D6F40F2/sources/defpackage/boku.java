package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: boku  reason: default package */
/* loaded from: classes3.dex */
public class boku implements bokt {
    private final Context a;
    private final bokn b;
    private dlfh c;
    private begg d;

    public boku(Context context, dlfh dlfhVar, @dzsi begg beggVar) {
        this.a = context;
        this.c = dlfhVar;
        if (beggVar != null) {
            this.d = beggVar;
        }
        this.b = new bokn(context.getResources());
    }

    private final void w(List<String> list, int i, boolean z) {
        if (z) {
            list.add(this.a.getString(i));
        }
    }

    private static boolean x(int i) {
        return i != 1;
    }

    private static boolean y(int i) {
        return i == 2;
    }

    @Override // defpackage.bokt
    public String a() {
        return this.c.b;
    }

    @Override // defpackage.bokt
    public String b() {
        return this.c.c;
    }

    @Override // defpackage.bokt
    public String c() {
        if (DateUtils.isToday(this.c.d)) {
            return bvtb.i(this.a, this.c.d / 1000);
        }
        return bvtb.m(this.a, this.c.d / 1000, TimeZone.getDefault(), 65560);
    }

    @Override // defpackage.bokt
    public Boolean d() {
        int a = dlfd.a(this.c.m);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }

    @Override // defpackage.bokt
    @dzsi
    public String e() {
        dlfh dlfhVar = this.c;
        if (dlfhVar.n) {
            return this.a.getString(R.string.EDIT_PUBLISHED_ACKNOWLEDGED_EDIT_TITLE);
        }
        int a = dlfd.a(dlfhVar.l);
        if (a != 0 && a == 2) {
            return this.a.getString(R.string.EDIT_PUBLISHED_PLACE_CLOSED_TITLE, this.c.b);
        }
        int a2 = dlfd.a(this.c.p);
        if (a2 != 0 && a2 == 2) {
            return this.a.getString(R.string.EDIT_PUBLISHED_PLACE_REOPENED_TITLE, this.c.b);
        }
        int a3 = dlfd.a(this.c.m);
        if (a3 != 0 && a3 == 2) {
            return this.a.getString(R.string.EDIT_PUBLISHED_PLACE_REMOVED_TITLE, this.c.b);
        }
        int a4 = dlfg.a(this.c.o);
        if (a4 == 0 || a4 != 3) {
            return null;
        }
        return this.a.getString(R.string.EDIT_PUBLISHED_PLACE_ADDED_TITLE, this.c.b);
    }

    @Override // defpackage.bokt
    public Boolean f() {
        int a;
        int a2 = dlfd.a(this.c.e);
        boolean z = true;
        if (a2 == 0) {
            a2 = 1;
        }
        if (!y(a2)) {
            int a3 = dlfd.a(this.c.g);
            if (a3 == 0) {
                a3 = 1;
            }
            if (!y(a3)) {
                int a4 = dlfd.a(this.c.h);
                if (a4 == 0) {
                    a4 = 1;
                }
                if (!y(a4)) {
                    int a5 = dlfd.a(this.c.f);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    if (!y(a5)) {
                        int a6 = dlfd.a(this.c.j);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        if (!y(a6)) {
                            int a7 = dlfd.a(this.c.i);
                            if (a7 == 0) {
                                a7 = 1;
                            }
                            if (!y(a7)) {
                                int a8 = dlfd.a(this.c.k);
                                if (a8 == 0) {
                                    a8 = 1;
                                }
                                if (!y(a8)) {
                                    int a9 = dlfd.a(this.c.l);
                                    if (a9 == 0) {
                                        a9 = 1;
                                    }
                                    if (!y(a9)) {
                                        int a10 = dlfd.a(this.c.m);
                                        if (a10 == 0) {
                                            a10 = 1;
                                        }
                                        if (!y(a10)) {
                                            int a11 = dlfd.a(this.c.p);
                                            if (a11 == 0) {
                                                a11 = 1;
                                            }
                                            if (!y(a11) && (((a = dlfg.a(this.c.o)) == 0 || a != 3) && !this.c.n)) {
                                                z = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bokt
    public String g() {
        if (!f().booleanValue()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(7);
        int a = dlfd.a(this.c.e);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_NAME, y(a));
        int a2 = dlfd.a(this.c.g);
        if (a2 == 0) {
            a2 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_PHONE, y(a2));
        int a3 = dlfd.a(this.c.h);
        if (a3 == 0) {
            a3 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_WEBSITE, y(a3));
        int a4 = dlfd.a(this.c.f);
        if (a4 == 0) {
            a4 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_ADDRESS, y(a4));
        int a5 = dlfd.a(this.c.j);
        if (a5 == 0) {
            a5 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_CATEGORY, y(a5));
        int a6 = dlfd.a(this.c.i);
        if (a6 == 0) {
            a6 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_HOURS, y(a6));
        int a7 = dlfd.a(this.c.k);
        if (a7 == 0) {
            a7 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_LOCATION, y(a7));
        int a8 = dlfd.a(this.c.l);
        if (a8 == 0) {
            a8 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_PERMANENTLY_CLOSED, y(a8));
        int a9 = dlfd.a(this.c.m);
        if (a9 == 0) {
            a9 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_PLACE_REMOVED, y(a9));
        int a10 = dlfd.a(this.c.p);
        if (a10 == 0) {
            a10 = 1;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_REOPENED, y(a10));
        int a11 = dlfg.a(this.c.o);
        if (a11 == 0 || a11 != 3) {
            z = false;
        }
        w(arrayList, R.string.EDIT_PUBLISHED_PLACE_ADDED, z);
        w(arrayList, R.string.EDIT_PUBLISHED_ACKNOWLEDGED_EDIT_TITLE, this.c.n);
        return this.b.a(arrayList);
    }

    @Override // defpackage.bokt
    public cqkl h() {
        ily ilyVar = new ily();
        ilyVar.k(this.c.a);
        ilo d = ilyVar.d();
        if (this.d != null) {
            begj begjVar = new begj();
            begjVar.b(d);
            begjVar.c = jjn.EXPANDED;
            begjVar.F = false;
            this.d.o(begjVar, false, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.bokt
    public Boolean i() {
        int a = dlfd.a(this.c.e);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(x(a));
    }

    @Override // defpackage.bokt
    public Boolean j() {
        int a = dlfd.a(this.c.e);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }

    @Override // defpackage.bokt
    public Boolean k() {
        int a = dlfd.a(this.c.f);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(x(a));
    }

    @Override // defpackage.bokt
    public Boolean l() {
        int a = dlfd.a(this.c.f);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }

    @Override // defpackage.bokt
    public Boolean m() {
        int a = dlfd.a(this.c.g);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(x(a));
    }

    @Override // defpackage.bokt
    public Boolean n() {
        int a = dlfd.a(this.c.g);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }

    @Override // defpackage.bokt
    public Boolean o() {
        int a = dlfd.a(this.c.h);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(x(a));
    }

    @Override // defpackage.bokt
    public Boolean p() {
        int a = dlfd.a(this.c.h);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }

    @Override // defpackage.bokt
    public Boolean q() {
        int a = dlfd.a(this.c.j);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(x(a));
    }

    @Override // defpackage.bokt
    public Boolean r() {
        int a = dlfd.a(this.c.j);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }

    @Override // defpackage.bokt
    public Boolean s() {
        int a = dlfd.a(this.c.i);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(x(a));
    }

    @Override // defpackage.bokt
    public Boolean t() {
        int a = dlfd.a(this.c.i);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }

    @Override // defpackage.bokt
    public Boolean u() {
        int a = dlfd.a(this.c.k);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(x(a));
    }

    @Override // defpackage.bokt
    public Boolean v() {
        int a = dlfd.a(this.c.k);
        if (a == 0) {
            a = 1;
        }
        return Boolean.valueOf(y(a));
    }
}
