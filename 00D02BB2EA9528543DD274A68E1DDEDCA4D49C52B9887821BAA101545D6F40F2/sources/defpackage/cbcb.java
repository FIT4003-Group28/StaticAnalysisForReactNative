package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbcb  reason: default package */
/* loaded from: classes4.dex */
public class cbcb implements cbrb {
    private final ff a;
    private final Runnable b;
    private final int c;
    private final String d;
    private String e;

    public cbcb(String str, String str2, Runnable runnable, cbdx cbdxVar, ff ffVar, cqhn cqhnVar, btvo btvoVar) {
        this.d = str;
        this.e = str2;
        this.c = btvoVar.getEventsUgcParameters().m;
        this.b = runnable;
        this.a = ffVar;
    }

    private final boolean n(boolean z) {
        if (z && !this.e.equals(this.d)) {
            this.e = this.e.trim();
        }
        return this.e.length() <= this.c;
    }

    @Override // defpackage.jaj
    public cqtd Rc() {
        throw null;
    }

    @Override // defpackage.jaj
    public Integer Rw() {
        return 16385;
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
        this.e = editable.toString();
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
        return Boolean.valueOf(n(true));
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        return Boolean.valueOf(n(false));
    }

    @Override // defpackage.jaj
    public String i() {
        return this.a.getString(R.string.EVENT_CREATION_EVENT_DESCRIBE_EVENT_HINT);
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
        throw null;
    }

    @Override // defpackage.cbrn
    @dzsi
    public String l() {
        if (this.e.length() > this.c) {
            return this.a.getResources().getString(R.string.UGC_EVENTS_ERROR_DESCRIPTION_TOO_LONG);
        }
        return null;
    }

    @Override // defpackage.cbrn
    public Integer m() {
        return 262144;
    }
}
