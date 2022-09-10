package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crsy  reason: default package */
/* loaded from: classes5.dex */
public class crsy extends atcy implements crsu {
    private final bvqu A;
    private final cjqq a;
    private final bvsl c;
    private final atoi d;
    @dzsi
    private atxz e;
    private boolean f;
    @dzsi
    private String g;
    public final btrm h;
    public final Context i;
    protected final bvsx j;
    protected final atmr k;
    protected final atmt l;
    protected final cqat m;
    @dzsi
    public final atmz n;
    public atlq o;
    public int p;
    @dzsi
    protected CharSequence q;
    @dzsi
    protected CharSequence r;
    @dzsi
    protected String s;
    @dzsi
    protected String t;
    protected boolean u;
    protected boolean v;
    @dzsi
    private String w;
    @dzsi
    private String x;
    private final List<Runnable> y;
    private final btwd z;

    public crsy(atcu atcuVar, atcw atcwVar, Context context, cjqq cjqqVar, btrm btrmVar, bvsl bvslVar, cqat cqatVar, @dzsi atmz atmzVar, crsx crsxVar, atmr atmrVar, atoi atoiVar, @dzsi crst crstVar, Executor executor, btwd btwdVar) {
        super(atcuVar, atcwVar);
        this.p = -1;
        this.y = new ArrayList();
        this.i = context;
        this.a = cjqqVar;
        this.c = bvslVar;
        this.m = cqatVar;
        bvsx bvsxVar = new bvsx(context.getResources());
        this.j = bvsxVar;
        this.n = atmzVar;
        this.h = btrmVar;
        this.k = atmrVar;
        atmrVar.z(new Runnable(this) { // from class: crsv
            private final crsy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.au();
            }
        });
        this.d = atoiVar;
        this.z = btwdVar;
        this.l = new atmt(context, btrmVar, cqatVar, context.getResources(), bvsxVar, crsxVar.a);
        this.A = new bvqu(executor);
    }

    private final synchronized void h() {
        for (Runnable runnable : this.y) {
            this.A.execute(runnable);
        }
    }

    private final synchronized void i() {
        for (Runnable runnable : this.y) {
            runnable.run();
        }
    }

    @dzsi
    private static CharSequence n(@dzsi CharSequence charSequence, @dzsi CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null || !charSequence.toString().contentEquals(charSequence2)) {
            return charSequence2;
        }
        if ((charSequence instanceof Spanned) && (charSequence2 instanceof Spanned)) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), CharacterStyle.class);
            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), CharacterStyle.class);
            if (characterStyleArr.length != characterStyleArr2.length) {
                return charSequence2;
            }
            for (int i = 0; i < characterStyleArr.length; i++) {
                if ((characterStyleArr[i].getUnderlying() instanceof ForegroundColorSpan) && (characterStyleArr2[i].getUnderlying() instanceof ForegroundColorSpan) && ((ForegroundColorSpan) characterStyleArr[i].getUnderlying()).getForegroundColor() != ((ForegroundColorSpan) characterStyleArr2[i].getUnderlying()).getForegroundColor()) {
                    return charSequence2;
                }
            }
        }
        return charSequence;
    }

    @Override // defpackage.crsu
    @dzsi
    public String A() {
        return this.w;
    }

    @Override // defpackage.atcy, defpackage.asmo
    public void NZ(@dzsi Bundle bundle) {
        btrm btrmVar = this.h;
        dceq a = dcet.a();
        a.b(btar.class, new crsz(btar.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    public void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        az(atlqVar, true);
    }

    @Override // defpackage.atcy, defpackage.asmo
    public void Qo(Configuration configuration) {
        au();
    }

    @Override // defpackage.atcy, defpackage.asmo
    public void Qp() {
        this.h.a(this);
    }

    @Override // defpackage.crsu
    @dzsi
    public CharSequence am() {
        return this.q;
    }

    @Override // defpackage.crsu
    @dzsi
    public String an() {
        return this.x;
    }

    @Override // defpackage.crsu
    @dzsi
    public CharSequence ao() {
        return this.r;
    }

    @Override // defpackage.crsu
    public atng ap() {
        return this.k;
    }

    @Override // defpackage.crsu
    public atnh ar() {
        return this.l;
    }

    public synchronized void as(Runnable runnable) {
        this.y.add(runnable);
    }

    public synchronized void at(Runnable runnable) {
        this.y.remove(runnable);
    }

    public void au() {
        if (this.z.T()) {
            h();
        } else {
            i();
        }
    }

    @Override // defpackage.crsu
    @dzsi
    /* renamed from: av */
    public String aq() {
        atmz atmzVar = this.n;
        if (atmzVar == null) {
            return null;
        }
        return atmzVar.d().booleanValue() ? this.s : this.t;
    }

    public Boolean aw() {
        return Boolean.valueOf(this.e != null);
    }

    public void ax(btar btarVar) {
        ay();
    }

    public void ay() {
        this.k.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void az(atlq atlqVar, boolean z) {
        crqf crqfVar = atlqVar.m;
        if (crqfVar == null) {
            this.k.o();
            return;
        }
        this.o = atlqVar;
        asld asldVar = atlqVar.c.a;
        this.f = atlqVar.n;
        this.v = crqfVar.e();
        this.u = crqfVar.j;
        this.k.i(atlqVar);
        atmt atmtVar = this.l;
        List<? extends atnf> m = this.k.m();
        atmz atmzVar = this.n;
        boolean z2 = false;
        atmtVar.c(atlqVar, m, atmzVar == null || atmzVar.e().floatValue() == 1.0f, this);
        CharSequence n = n(this.q, this.l.a().c());
        cray g = crqfVar.g();
        int b = g.b();
        this.p = b;
        int i = g.h;
        if (b == -1 || i == -1 || n == null) {
            this.g = null;
            this.w = null;
            this.x = null;
            this.r = null;
        } else {
            this.g = this.c.c(i, g.a.I, true, true);
            bvta a = bvta.a(this.i, this.p + (this.m.b() / 1000), g.a.m(), g.a.az());
            if (!a.b) {
                this.a.g().d(cjtd.a(dtxw.aB));
            }
            String charSequence = a.a.toString();
            this.w = charSequence;
            String str = this.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(charSequence).length());
            sb.append(str);
            sb.append("  •  ");
            sb.append(charSequence);
            String sb2 = sb.toString();
            this.x = sb2;
            this.r = n(this.r, TextUtils.concat(n, "  •  ", sb2));
            this.q = n;
        }
        CharSequence f = this.l.f();
        bvsi bvsiVar = new bvsi(this.i);
        bvsiVar.c(f);
        bvsiVar.c(this.i.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_CLOSE_STEP_LIST));
        this.s = bvsiVar.toString();
        bvsi bvsiVar2 = new bvsi(this.i);
        bvsiVar2.c(f);
        bvsiVar2.c(this.i.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_OPEN_STEP_LIST));
        this.t = bvsiVar2.toString();
        crqw crqwVar = atlqVar.b;
        atxz atxzVar = this.e;
        if ((atxzVar == null ? null : atxzVar.n()) != crqwVar) {
            atmr atmrVar = this.k;
            if (crqwVar != null) {
                z2 = true;
            }
            atmrVar.G(z2);
            if (crqwVar == null) {
                this.e = null;
            } else {
                this.e = this.d.c(crqwVar, new atxu(this) { // from class: crsw
                    private final crsy a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.atxu
                    public final int a() {
                        return this.a.p;
                    }
                });
            }
            Qq().r();
        }
        if (!z) {
            return;
        }
        au();
    }

    @Override // defpackage.atcy, defpackage.asmo
    public void b() {
        astr ab = this.k.ab();
        if (ab != null) {
            ab.a();
        }
        asho D = this.k.D();
        if (D != null) {
            D.a();
        }
        asuk u = this.k.ac().u();
        if (u != null) {
            u.b();
        }
    }

    @Override // defpackage.atcy, defpackage.asmo
    public void c() {
        astr ab = this.k.ab();
        if (ab != null) {
            ab.b();
        }
        asho D = this.k.D();
        if (D != null) {
            D.b();
        }
        asuk u = this.k.ac().u();
        if (u != null) {
            u.c();
        }
    }

    @Override // defpackage.crsu
    @dzsi
    public String d() {
        return this.g;
    }

    @Override // defpackage.asul
    public Boolean j() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.asul
    public cqkl l() {
        Qq().Qk();
        return cqkl.a;
    }

    @Override // defpackage.asul
    @dzsi
    public atxz m() {
        return this.e;
    }

    @Override // defpackage.asul
    public cqkl k() {
        if (!this.v || this.u) {
            Qq().k();
            Qq().Qa();
        } else {
            Qq().d();
        }
        return cqkl.a;
    }
}
