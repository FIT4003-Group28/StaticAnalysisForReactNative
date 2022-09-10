package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbcp  reason: default package */
/* loaded from: classes4.dex */
public class cbcp implements cbre {
    private final ff a;
    private final Runnable b;
    private final int c;
    private final String d;
    private String e;
    @dzsi
    private String f;

    public cbcp(String str, String str2, Runnable runnable, cbdx cbdxVar, ff ffVar, btvo btvoVar) {
        this.d = str;
        this.e = str2;
        this.c = Math.max(btvoVar.getEventsUgcParameters().l, ((this.e.length() + 4) / 5) * 5);
        this.b = runnable;
        this.a = ffVar;
    }

    @Override // defpackage.jaj
    public cqtd Rc() {
        return cqrt.g(2131232317, ibm.p());
    }

    @Override // defpackage.jaj
    public Integer Rw() {
        return 8193;
    }

    @Override // defpackage.jaj
    public String a() {
        return this.e;
    }

    @Override // defpackage.jaj
    public void b(CharSequence charSequence) {
    }

    @Override // defpackage.jaj
    public void c(Editable editable) {
        cbdx.a(editable);
        String obj = editable.toString();
        this.e = obj;
        if (!obj.isEmpty()) {
            this.f = null;
        }
        this.b.run();
        cqkx.p(this);
    }

    @Override // defpackage.jaj
    public View.OnFocusChangeListener d() {
        return jag.a(this);
    }

    @Override // defpackage.jaj
    public void e(boolean z) {
    }

    @Override // defpackage.jaj
    public TextWatcher f() {
        return jag.b(this);
    }

    @Override // defpackage.cbrs
    public Boolean g() {
        if (!this.e.equals(this.d)) {
            this.e = this.e.trim();
        }
        String string = this.e.isEmpty() ? this.a.getString(R.string.UGC_EVENTS_ERROR_MISSING_EVENT_NAME) : null;
        if (string != null) {
            this.f = string;
            cqkx.p(this);
            return false;
        } else if (this.e.length() > this.c) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        boolean z = false;
        if (!this.e.isEmpty() && this.e.length() <= this.c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jaj
    public String i() {
        return this.a.getString(R.string.UGC_EVENTS_EVENT_NAME);
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        if (dbsj.d(this.d)) {
            return Boolean.valueOf(!dbsj.d(this.e.trim()));
        }
        return Boolean.valueOf(!this.d.equals(this.e.trim()));
    }

    @Override // defpackage.cbrn
    public Integer k() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.cbrn
    @dzsi
    public String l() {
        return this.f;
    }

    @Override // defpackage.cbrn
    public Integer m() {
        return 6;
    }
}
