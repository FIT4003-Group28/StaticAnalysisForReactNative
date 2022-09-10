package defpackage;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqvw  reason: default package */
/* loaded from: classes4.dex */
public class bqvw extends bquc<String> implements jaj {
    private final jbc a;
    private final String[] b;
    private final Runnable c;
    private final String d;
    private String e;
    private String f;

    public bqvw(Activity activity, jbc jbcVar, Runnable runnable) {
        super("");
        this.e = "";
        this.f = "";
        this.b = activity.getResources().getStringArray(R.array.WRITE_REVIEW_HINTS_FOR_RATING_STARS);
        this.d = activity.getString(R.string.WRITE_REVIEW_HINT);
        this.a = jbcVar;
        this.c = runnable;
    }

    @Override // defpackage.jaj
    public cqtd Rc() {
        throw null;
    }

    @Override // defpackage.jaj
    public Integer Rw() {
        throw null;
    }

    @Override // defpackage.jaj
    public String a() {
        return this.f;
    }

    @Override // defpackage.jaj
    public void b(CharSequence charSequence) {
        this.f = charSequence.toString();
        String s = dbra.b.s(charSequence);
        if (!s.equals(k())) {
            o(s);
            this.c.run();
        }
    }

    @Override // defpackage.jaj
    public void c(Editable editable) {
    }

    @Override // defpackage.jaj
    public View.OnFocusChangeListener d() {
        throw null;
    }

    @Override // defpackage.jaj
    public void e(boolean z) {
    }

    @Override // defpackage.jaj
    public TextWatcher f() {
        return jag.b(this);
    }

    @Override // defpackage.bquc
    protected final dbsg<String> h(docg docgVar) {
        return (docgVar.a & 1024) != 0 ? dbsg.i(docgVar.r) : dbpy.a;
    }

    @Override // defpackage.jaj
    public String i() {
        if (!dbsj.d(this.e)) {
            return this.e;
        }
        int intValue = this.a.a().intValue() - 1;
        if (intValue >= 0) {
            String[] strArr = this.b;
            if (intValue < strArr.length) {
                return strArr[intValue];
            }
        }
        return this.d;
    }

    @Override // defpackage.bquc
    public void j(ilo iloVar) {
        super.j(iloVar);
        this.e = iloVar.bv().e;
        this.f = k();
    }

    @Override // defpackage.bquc
    protected final /* bridge */ /* synthetic */ String l(String str) {
        return String.format("%s\n%s", str, k());
    }
}
