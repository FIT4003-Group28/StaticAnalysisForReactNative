package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bqvc  reason: default package */
/* loaded from: classes4.dex */
public class bqvc implements bqsz {
    private static final cqtd d = irg.e();
    public final bqvb a;
    public bbtm b;
    public String c;
    private final int e = cqir.a();
    private final int f = cqir.a();
    private final ges g;
    private final Activity h;
    private final bqse i;
    private jic j;
    private int k;
    private int l;
    private boolean m;
    private final String n;
    private View.OnTouchListener o;
    private final boolean p;

    public bqvc(bqvb bqvbVar, ges gesVar, Activity activity, cqkj cqkjVar, btvo btvoVar, bqse bqseVar, cqhn cqhnVar) {
        this.g = gesVar;
        this.h = activity;
        this.i = bqseVar;
        this.a = bqvbVar;
        int a = dkxy.a(btvoVar.getUgcParameters().M().a);
        this.p = a != 0 && a == 4;
        String string = gesVar.J().getString(R.string.CAPTION_HINT_DEFAULT);
        this.n = string;
        this.c = string;
    }

    @Override // defpackage.bqsz
    public Boolean a() {
        return true;
    }

    @Override // defpackage.bqsz
    public View.OnTouchListener b() {
        if (this.o == null) {
            this.o = new View.OnTouchListener(this) { // from class: bquy
                private final bqvc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    bqvc bqvcVar = this.a;
                    if (motionEvent.getAction() == 1) {
                        bqvcVar.c();
                        return false;
                    }
                    return false;
                }
            };
        }
        return this.o;
    }

    @Override // defpackage.bqsz
    public cqkl d() {
        View findViewById;
        cqkf<?> a;
        if (this.b == null) {
            return cqkl.a;
        }
        View view = this.g.P;
        if (view != null && (findViewById = view.findViewById(this.e)) != null && (a = cqke.a(findViewById)) != null) {
            a.e(null);
        }
        bqvb bqvbVar = this.a;
        bbtm bbtmVar = this.b;
        bqks bqksVar = ((bqvg) bqvbVar).b;
        bqkr b = bqksVar.b();
        final bqkl i = bqkl.i(bbtmVar);
        bqksVar.e(b.c().o(new dbsl(i) { // from class: bqko
            private final bqkl a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return !((bqkl) obj).a().equals(((bqiq) this.a).a);
            }
        }));
        return cqkl.a;
    }

    @Override // defpackage.bqsz
    public Integer e() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.bqsz
    public Integer f() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.bqsz
    @dzsi
    public jic g() {
        return this.j;
    }

    @Override // defpackage.bqsz
    public void h(bbtm bbtmVar, int i, int i2, boolean z) {
        final deho<String> dehoVar;
        this.b = bbtmVar;
        String uri = bbtmVar.z().toString();
        this.j = new jic(uri, jfv.a(uri), d, 0);
        this.k = i + 1;
        this.l = i2;
        this.m = z;
        if (z) {
            this.c = this.n;
            final bqse bqseVar = this.i;
            final bqux bquxVar = new bqux(this);
            final Uri z2 = bbtmVar.z();
            if (bqseVar.f.a.isEmpty()) {
                bqseVar.a(bquxVar, z2, bqseVar.g);
                return;
            }
            synchronized (bqseVar.h) {
                dehoVar = bqseVar.h.get(z2);
                if (dehoVar == null) {
                    dehoVar = deho.b(new Callable(bqseVar, z2) { // from class: bqsb
                        private final bqse a;
                        private final Uri b;

                        {
                            this.a = bqseVar;
                            this.b = z2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SparseArray<cpfx> b;
                            bqse bqseVar2 = this.a;
                            try {
                                Bitmap c = bqseVar2.c.c(this.b, Bitmap.Config.ARGB_8888, 1280);
                                cpfg cpfgVar = new cpfg();
                                cpfe.b(c, cpfgVar);
                                cpfg a = cpfe.a(cpfgVar);
                                synchronized (bqseVar2.d) {
                                    b = bqseVar2.e.a().b(a, bqse.a);
                                }
                                bqsh bqshVar = bqseVar2.f;
                                String str = null;
                                bqsg bqsgVar = null;
                                for (int i3 = 0; i3 < b.size(); i3++) {
                                    cpfx valueAt = b.valueAt(i3);
                                    bqsg bqsgVar2 = bqshVar.a.get(valueAt.a);
                                    if (bqsgVar2 != null && bqsgVar2.b() <= valueAt.b && (bqsgVar == null || bqsgVar.d() >= bqsgVar2.d())) {
                                        bqsgVar = bqsgVar2;
                                    }
                                }
                                if (bqsgVar != null) {
                                    str = bqsgVar.c();
                                }
                                return str == null ? bqseVar2.g : str;
                            } catch (IOException unused) {
                                return bqseVar2.g;
                            }
                        }
                    });
                    bqseVar.h.put(z2, dehoVar);
                    bqseVar.b.execute(dehoVar);
                }
            }
            dehoVar.Pk(new Runnable(bqseVar, bquxVar, z2, dehoVar) { // from class: bqsc
                private final bqse a;
                private final Uri b;
                private final deho c;
                private final bqux d;

                {
                    this.a = bqseVar;
                    this.d = bquxVar;
                    this.b = z2;
                    this.c = dehoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bqse bqseVar2 = this.a;
                    bqux bquxVar2 = this.d;
                    Uri uri2 = this.b;
                    try {
                        bqseVar2.a(bquxVar2, uri2, (String) deha.r(this.c));
                    } catch (ExecutionException unused) {
                        bqseVar2.a(bquxVar2, uri2, bqseVar2.g);
                    }
                }
            }, bqseVar.b);
            return;
        }
        this.c = "";
    }

    @Override // defpackage.bqsz
    public Boolean i() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.bqsz
    public cqgl j() {
        return new cqgl(this) { // from class: bquz
            private final bqvc a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                bqvc bqvcVar = this.a;
                bbtm bbtmVar = bqvcVar.b;
                if (bbtmVar != null) {
                    bqvb bqvbVar = bqvcVar.a;
                    String charSequence2 = charSequence.toString();
                    bqks bqksVar = ((bqvg) bqvbVar).b;
                    bbtm F = bbtmVar.F(charSequence2);
                    bqksVar.e(bqksVar.b().c().s(new dbrn(bqkl.i(F)) { // from class: bqkp
                        private final bqkl a;

                        {
                            this.a = r1;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            bqkl bqklVar = this.a;
                            bqkl bqklVar2 = (bqkl) obj;
                            return bqklVar2.a().equals(((bqiq) bqklVar).a) ? bqklVar : bqklVar2;
                        }
                    }));
                }
            }
        };
    }

    @Override // defpackage.bqsz
    public String k() {
        bbtm bbtmVar = this.b;
        return bbtmVar == null ? "" : bbtmVar.e();
    }

    @Override // defpackage.bqsz
    public Integer m() {
        return Integer.valueOf(this.k);
    }

    @Override // defpackage.bqsz
    public Integer n() {
        return Integer.valueOf(this.l);
    }

    @Override // defpackage.bqsz
    public String o() {
        return this.c;
    }

    @Override // defpackage.bqsz
    public Boolean p() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.bqsz
    public Float l() {
        bbtm bbtmVar = this.b;
        Float valueOf = Float.valueOf(0.75f);
        return bbtmVar == null ? valueOf : (Float) bbtmVar.E().h(bqva.a).c(valueOf);
    }

    @Override // defpackage.bqsz
    public cqkl c() {
        if (this.p) {
            View view = this.g.P;
            EditText editText = view == null ? null : (EditText) view.findViewById(this.f);
            if (editText == null) {
                return cqkl.a;
            }
            editText.requestFocus();
            ((InputMethodManager) this.h.getSystemService("input_method")).showSoftInput(editText, 1);
        }
        bbtm bbtmVar = this.b;
        if (bbtmVar != null) {
            this.a.b(bbtmVar);
        }
        return cqkl.a;
    }
}
