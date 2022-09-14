package defpackage;

import com.google.android.apps.maps.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bfgw  reason: default package */
/* loaded from: classes3.dex */
public class bfgw implements bfgs {
    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private boolean b;
    private int c;
    private int d;
    @dzsi
    private String e;
    @dzsi
    private String f;
    @dzsi
    private String g;
    private final bvsx h;

    public bfgw(bvsx bvsxVar, @dzsi dpml dpmlVar) {
        this.d = -1;
        this.h = bvsxVar;
        if (dpmlVar != null) {
            dpmk dpmkVar = dpmlVar.b;
            dpmkVar = dpmkVar == null ? dpmk.f : dpmkVar;
            if ((dpmkVar.a & 2) != 0) {
                Matcher matcher = a.matcher(dpmkVar.c);
                if (matcher.matches()) {
                    try {
                        String group = matcher.group(1);
                        dbsk.s(group);
                        this.c = Integer.parseInt(group);
                        String group2 = matcher.group(2);
                        if (group2 != null) {
                            this.d = Integer.parseInt(group2);
                        }
                        this.b = true;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
            }
            int i = dpmkVar.a;
            if ((i & 4) != 0) {
                this.e = dpmkVar.d;
            }
            if ((i & 1) != 0) {
                this.f = dpmkVar.b;
            }
            dpyt dpytVar = dpmkVar.e;
            if (((dpytVar == null ? dpyt.c : dpytVar).a & 1) == 0) {
                return;
            }
            dpyt dpytVar2 = dpmkVar.e;
            this.g = (dpytVar2 == null ? dpyt.c : dpytVar2).b;
        }
    }

    @Override // defpackage.bfgs
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bfgs
    @dzsi
    public CharSequence b() {
        if (this.b) {
            return Integer.toString(this.c);
        }
        return null;
    }

    @Override // defpackage.bfgs
    @dzsi
    public CharSequence c() {
        int i = this.d;
        if (i >= 0) {
            StringBuilder sb = new StringBuilder(12);
            sb.append("/");
            sb.append(i);
            return sb.toString();
        }
        return null;
    }

    @Override // defpackage.bfgs
    public Boolean d() {
        return Boolean.valueOf(this.g != null);
    }

    @Override // defpackage.bfgs
    public Boolean e() {
        boolean z = true;
        if (this.f == null && this.g == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgs
    @dzsi
    public CharSequence f() {
        String str = this.f;
        if (str == null && this.g == null) {
            return null;
        }
        String str2 = this.g;
        if (str2 == null) {
            return str;
        }
        bvsv a2 = this.h.a(str2);
        a2.m(R.color.qu_daynight_google_red_500);
        String str3 = this.f;
        if (str3 != null) {
            a2.g(this.h.a(str3.length() != 0 ? " · ".concat(str3) : new String(" · ")).c());
        }
        return a2.c();
    }

    @Override // defpackage.bfgs
    @dzsi
    public String g() {
        return this.e;
    }

    @Override // defpackage.bfgs
    @dzsi
    public String h() {
        if (this.g == null && this.e == null) {
            return null;
        }
        return dbrz.e("\n").j().i(this.g, this.e, new Object[0]);
    }
}
