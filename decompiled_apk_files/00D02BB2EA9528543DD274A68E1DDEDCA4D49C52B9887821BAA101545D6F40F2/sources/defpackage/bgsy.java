package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgsy  reason: default package */
/* loaded from: classes3.dex */
public class bgsy implements bnik, bgsj {
    public final Activity a;
    public final begg b;
    @dzsi
    public EditText c;
    @dzsi
    public bnij d;
    private final jkf g;
    private cjtd h = cjtd.b;
    private final View.OnAttachStateChangeListener i = new bgsw(this);
    private final View.OnFocusChangeListener j = new bgsx(this);
    public String e = "";
    public boolean f = false;

    public bgsy(Activity activity, begg beggVar, jkf jkfVar) {
        this.a = activity;
        this.b = beggVar;
        this.g = jkfVar;
    }

    @Override // defpackage.bnik
    public View.OnAttachStateChangeListener a() {
        return this.i;
    }

    @Override // defpackage.bnik
    public View.OnFocusChangeListener b() {
        return this.j;
    }

    @Override // defpackage.bnik
    public Integer c() {
        return Integer.valueOf(this.e.length());
    }

    @Override // defpackage.bnik
    public String d() {
        return this.a.getString(R.string.MALLS_DIRECTORY_SEARCH_HINT);
    }

    @Override // defpackage.bnik
    public cqkl e() {
        this.b.m(jjn.FULLY_EXPANDED);
        EditText editText = this.c;
        if (editText != null && editText.hasFocus()) {
            r();
        }
        return cqkl.a;
    }

    @Override // defpackage.bnik
    public cqgl f() {
        return new cqgl(this) { // from class: bgsu
            private final bgsy a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                bgsy bgsyVar = this.a;
                if (bgsyVar.e.contentEquals(charSequence)) {
                    return;
                }
                bgsyVar.e = charSequence.toString();
                bnij bnijVar = bgsyVar.d;
                if (bnijVar == null) {
                    return;
                }
                bnijVar.a(bgsyVar.e, false);
            }
        };
    }

    @Override // defpackage.bnik
    public String g() {
        return this.e;
    }

    @Override // defpackage.bnik
    public Boolean h() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bgsj
    public boolean i() {
        return true;
    }

    @Override // defpackage.bgsj
    public void j(bwrs<ilo> bwrsVar) {
        this.e = "";
    }

    @Override // defpackage.bgsj
    public void k() {
        this.e = "";
    }

    @Override // defpackage.bnik
    public cqkl l() {
        if (!this.e.isEmpty()) {
            this.e = "";
            cqkx.p(this);
        } else {
            EditText editText = this.c;
            if (editText != null) {
                editText.clearFocus();
            }
            jmw.d(this.a, null);
        }
        bnij bnijVar = this.d;
        if (bnijVar != null) {
            bnijVar.a("", false);
        }
        return cqkl.a;
    }

    @Override // defpackage.bnik
    public TextView.OnEditorActionListener m() {
        return new TextView.OnEditorActionListener(this) { // from class: bgsv
            private final bgsy a;

            {
                this.a = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                bgsy bgsyVar = this.a;
                if (i == 3) {
                    if (btpf.c(bgsyVar.a).f) {
                        ((InputMethodManager) bgsyVar.a.getSystemService("input_method")).hideSoftInputFromWindow(bgsyVar.a.getWindow().getDecorView().getWindowToken(), 0);
                    }
                    if (bgsyVar.d != null && !bgsyVar.e.isEmpty()) {
                        jmw.d(bgsyVar.a, null);
                        bnij bnijVar = bgsyVar.d;
                        if (bnijVar != null) {
                            bnijVar.a(bgsyVar.e, true);
                            return true;
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }

    public void n(bnij bnijVar) {
        this.d = bnijVar;
    }

    @Override // defpackage.bnik
    public cjtd o() {
        return this.h;
    }

    public void p(cjtd cjtdVar) {
        this.h = cjtdVar;
    }

    public void q(String str) {
        this.e = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        RecyclerView recyclerView;
        View a;
        aag aagVar;
        View j = this.g.l().j();
        if (j == null || (recyclerView = (RecyclerView) cqkx.e(j, bfzt.a, RecyclerView.class)) == null || (a = cqhu.a(recyclerView, bgsl.a)) == null) {
            return;
        }
        int aa = recyclerView.aa(a);
        int i = ((int) this.a.getResources().getDisplayMetrics().density) * (-275);
        abs absVar = recyclerView.l;
        if (!(absVar instanceof aag) || (aagVar = (aag) absVar) == null) {
            return;
        }
        aagVar.P(aa, i);
    }
}
