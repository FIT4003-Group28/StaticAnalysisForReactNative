package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkem  reason: default package */
/* loaded from: classes3.dex */
public class bkem implements bkdj {
    private static final cjtd m;
    public final Activity a;
    public final Executor b;
    public final bkdc c;
    public final jkf d;
    public final dgjm e;
    @dzsi
    AutoCompleteTextView f;
    public final busu j;
    private final cjqy k;
    public boolean h = false;
    public final HashMap<String, List<bkel>> i = new HashMap<>();
    private final View.OnAttachStateChangeListener n = new bkej(this);
    public String g = "";
    private final List<jbf> l = new ArrayList();

    static {
        cjta b = cjtd.b();
        b.d = dtxy.ox;
        m = b.a();
    }

    public bkem(dgjm dgjmVar, gga ggaVar, busu busuVar, Executor executor, bkdc bkdcVar, jkf jkfVar, cjqy cjqyVar) {
        this.a = ggaVar;
        this.j = busuVar;
        this.b = executor;
        this.c = bkdcVar;
        this.d = jkfVar;
        this.e = dgjmVar;
        this.k = cjqyVar;
    }

    public static dbsg<dgis> p(dgjl dgjlVar, String str) {
        dgis dgisVar = dgjlVar.c;
        if (dgisVar == null) {
            dgisVar = dgis.d;
        }
        if (!dgisVar.c.contains("{QUERY}")) {
            return dbpy.a;
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            dgip bZ = dgis.d.bZ();
            int a = dgir.a(dgisVar.b);
            if (a == 0) {
                a = 1;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgis dgisVar2 = (dgis) bZ.b;
            dgisVar2.b = a - 1;
            dgisVar2.a |= 1;
            String replace = dgisVar.c.replace("{QUERY}", encode);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgis dgisVar3 = (dgis) bZ.b;
            replace.getClass();
            dgisVar3.a |= 2;
            dgisVar3.c = replace;
            return dbsg.i(bZ.bK());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.bkdj
    public View.OnAttachStateChangeListener a() {
        return this.n;
    }

    @Override // defpackage.bkdj
    public Integer b() {
        return Integer.valueOf(this.g.length());
    }

    @Override // defpackage.bkdj
    public String c() {
        return this.a.getString(R.string.INSTORE_SEARCH_HINT_TEXT);
    }

    @Override // defpackage.bkdj
    public View.OnTouchListener d() {
        return new View.OnTouchListener(this) { // from class: bkee
            private final bkem a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                bkem bkemVar = this.a;
                if (motionEvent.getAction() == 1) {
                    bkemVar.m(deaf.TAP);
                    bkemVar.e();
                    return false;
                }
                return false;
            }
        };
    }

    @Override // defpackage.bkdj
    public cqkl e() {
        if (this.f != null && !this.g.isEmpty()) {
            this.f.showDropDown();
        }
        return cqkl.a;
    }

    @Override // defpackage.bkdj
    public View.OnFocusChangeListener f() {
        return new View.OnFocusChangeListener(this) { // from class: bkef
            private final bkem a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                bkem bkemVar = this.a;
                if (bkemVar.h != z) {
                    bkemVar.h = z;
                    cqkx.p(bkemVar);
                }
                if (z) {
                    View j = bkemVar.d.l().j();
                    dbsk.s(j);
                    RecyclerView recyclerView = (RecyclerView) cqkx.e(j, bfzt.a, RecyclerView.class);
                    dbsk.s(recyclerView);
                    View a = cqhu.a(recyclerView, bkde.a);
                    dbsk.s(a);
                    recyclerView.n(recyclerView.aa(a));
                    return;
                }
                jmw.d(bkemVar.a, null);
            }
        };
    }

    @Override // defpackage.bkdj
    public cqgl g() {
        return new cqgl(this) { // from class: bkeg
            private final bkem a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                bkem bkemVar = this.a;
                if (bkemVar.g.contentEquals(charSequence)) {
                    return;
                }
                bkemVar.g = charSequence.toString();
                if (bkemVar.g.isEmpty()) {
                    bkemVar.o();
                    return;
                }
                dgjm dgjmVar = bkemVar.e;
                if (dgjmVar.a == 1) {
                    dgjl dgjlVar = (dgjl) dgjmVar.b;
                    if (bkemVar.i.containsKey(bkemVar.g)) {
                        bkemVar.n(bkemVar.i.get(bkemVar.g));
                    } else {
                        diix bZ = dija.d.bZ();
                        String str = bkemVar.g;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dija dijaVar = (dija) bZ.b;
                        str.getClass();
                        dijaVar.a |= 1;
                        dijaVar.b = str;
                        diiy bZ2 = diiz.d.bZ();
                        String str2 = dgjlVar.a;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        diiz diizVar = (diiz) bZ2.b;
                        str2.getClass();
                        int i = 1 | diizVar.a;
                        diizVar.a = i;
                        diizVar.b = str2;
                        String str3 = dgjlVar.b;
                        str3.getClass();
                        diizVar.a = i | 2;
                        diizVar.c = str3;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dija dijaVar2 = (dija) bZ.b;
                        diiz bK = bZ2.bK();
                        bK.getClass();
                        dijaVar2.c = bK;
                        dijaVar2.a |= 2;
                        bkemVar.j.b(bZ.bK(), new bkek(bkemVar, dgjlVar), bkemVar.b);
                    }
                }
                bkemVar.m(deaf.KEY_PRESS);
            }
        };
    }

    @Override // defpackage.bkdj
    public TextView.OnEditorActionListener h() {
        return new TextView.OnEditorActionListener(this) { // from class: bkeh
            private final bkem a;

            {
                this.a = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                dgjl dgjlVar;
                bkem bkemVar = this.a;
                if (i == 3) {
                    if (bkemVar.g.isEmpty()) {
                        return true;
                    }
                    dgjm dgjmVar = bkemVar.e;
                    if (dgjmVar.a == 1) {
                        dgjlVar = (dgjl) dgjmVar.b;
                    } else {
                        dgjlVar = dgjl.d;
                    }
                    dbsg<dgis> p = bkem.p(dgjlVar, bkemVar.g);
                    if (!p.a() || !bkdc.a(p.b())) {
                        return true;
                    }
                    bkemVar.c.b(p.b());
                    return true;
                }
                return false;
            }
        };
    }

    @Override // defpackage.bkdj
    public List<jbf> i() {
        return this.l;
    }

    @Override // defpackage.bkdj
    public String j() {
        return this.g;
    }

    @Override // defpackage.bkdj
    public Boolean k() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.bkdj
    public cqkl l() {
        if (!this.g.isEmpty()) {
            this.g = "";
            o();
        } else {
            AutoCompleteTextView autoCompleteTextView = this.f;
            dbsk.s(autoCompleteTextView);
            autoCompleteTextView.clearFocus();
            jmw.d(this.a, null);
        }
        return cqkl.a;
    }

    public final void m(deaf deafVar) {
        dbsk.s(this.f);
        cjql e = cjqg.e(this.f);
        if (e == null) {
            bvoo.d(new IllegalStateException("Impression for interaction not found."));
        } else {
            this.k.n(e, new cjte(deafVar), m);
        }
    }

    public final void n(List<bkel> list) {
        this.l.clear();
        for (final bkel bkelVar : list) {
            ixw ixwVar = new ixw();
            ixwVar.a = bkelVar.a();
            ixwVar.d = this;
            ixwVar.c = true;
            ixwVar.e = new Runnable(this, bkelVar) { // from class: bkei
                private final bkem a;
                private final bkel b;

                {
                    this.a = this;
                    this.b = bkelVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bkem bkemVar = this.a;
                    dgis b = this.b.b();
                    if (bkdc.a(b)) {
                        bkemVar.c.b(b);
                    }
                }
            };
            this.l.add(ixwVar.a());
        }
        cqkx.p(this);
    }

    public final void o() {
        this.l.clear();
        cqkx.p(this);
    }
}
