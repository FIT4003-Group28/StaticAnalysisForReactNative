package defpackage;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: cbcs  reason: default package */
/* loaded from: classes4.dex */
public class cbcs implements cbrg {
    private final Activity a;
    private final String b;
    private String c;
    @dzsi
    private String d;
    private final Runnable e;

    public cbcs(String str, String str2, Activity activity, cbdx cbdxVar, Runnable runnable) {
        this.b = str;
        this.c = str2;
        this.a = activity;
        this.e = runnable;
    }

    private static String p(String str) {
        String trim = str.trim();
        if (trim.isEmpty() || trim.contains("://")) {
            return trim;
        }
        String valueOf = String.valueOf(trim);
        return valueOf.length() != 0 ? "http://".concat(valueOf) : new String("http://");
    }

    @Override // defpackage.jaj
    public cqtd Rc() {
        throw null;
    }

    @Override // defpackage.jaj
    public Integer Rw() {
        return 208;
    }

    @Override // defpackage.jaj
    public String a() {
        return this.c;
    }

    @Override // defpackage.jaj
    public void b(CharSequence charSequence) {
    }

    @Override // defpackage.jaj
    public void c(Editable editable) {
        cbdx.a(editable);
        this.c = editable.toString();
        this.d = null;
        this.e.run();
        cqkx.p(this);
    }

    @Override // defpackage.jaj
    public View.OnFocusChangeListener d() {
        return jag.a(this);
    }

    @Override // defpackage.jaj
    public void e(boolean z) {
        String str = null;
        if (!z && !h().booleanValue()) {
            str = this.a.getString(R.string.UGC_EVENTS_ERROR_INVALID_WEBSITE_ADDRESS);
        }
        this.d = str;
        cqkx.p(this);
    }

    @Override // defpackage.jaj
    public TextWatcher f() {
        return jag.b(this);
    }

    @Override // defpackage.cbrs
    public Boolean g() {
        if (!h().booleanValue()) {
            this.d = this.a.getString(R.string.UGC_EVENTS_ERROR_INVALID_WEBSITE_ADDRESS);
            cqkx.p(this);
            return false;
        }
        return true;
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        String p = p(this.c);
        boolean z = true;
        if (p.isEmpty()) {
            return true;
        }
        if (Patterns.WEB_URL.matcher(p).matches()) {
            try {
                debu a = debu.a(p);
                dbsk.p(!dbsj.d(a.c), "Uri has no authority: %s", a);
                Matcher matcher = debt.a.matcher(a.c);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    try {
                        dbsk.s(group);
                        if (new debq(group).a <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } catch (IllegalArgumentException e) {
                        throw new IllegalStateException(String.format("Invalid domain '%s' found in URI '%s'", group, a), e);
                    }
                }
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Authority doesn't match web pattern: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } catch (IllegalStateException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.jaj
    public String i() {
        return this.a.getString(R.string.EVENT_CREATION_EVENT_WEBSITE_HINT);
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        if (dbsj.d(this.b)) {
            return Boolean.valueOf(!dbsj.d(this.c.trim()));
        }
        return Boolean.valueOf(!this.b.equals(this.c.trim()));
    }

    @Override // defpackage.cbrn
    @dzsi
    public Integer k() {
        throw null;
    }

    @Override // defpackage.cbrn
    @dzsi
    public String l() {
        return this.d;
    }

    @Override // defpackage.cbrn
    public Integer m() {
        return 6;
    }

    @Override // defpackage.cbrg
    public String n() {
        return this.c.equals(this.b) ? this.c : p(this.c);
    }

    @Override // defpackage.cbrg
    public cqkl o() {
        this.c = "";
        this.e.run();
        cqkx.p(this);
        return cqkl.a;
    }
}
