package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: bshi  reason: default package */
/* loaded from: classes4.dex */
public class bshi implements bsgr, bsha, bsgt {
    private final Activity a;
    private final gga b;
    private final brdi c;
    private final LinkedHashMap<String, brgp> d;
    private final boolean e;
    private boolean f;
    @dzsi
    private final bshh g;
    @dzsi
    private final Runnable h;

    public bshi(Activity activity, gga ggaVar, cqhn cqhnVar, brdi brdiVar) {
        this(activity, ggaVar, cqhnVar, brdiVar, null, null, false);
    }

    private final String i(int i, boolean z) {
        String string;
        if (z) {
            string = this.a.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.a.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        Activity activity = this.a;
        return activity.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, new Object[]{activity.getString(i), string});
    }

    @Override // defpackage.bsgr
    public cqkl a() {
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        this.b.D(brcr.g(null, this.e));
        return cqkl.a;
    }

    @Override // defpackage.bsgr
    public List<brgp> b() {
        return new ArrayList(this.d.values());
    }

    @Override // defpackage.bsgr
    public cqkl c(cjqm cjqmVar, @dzsi String str) {
        if (this.c.b().isEmpty()) {
            a();
        } else {
            brdi brdiVar = this.c;
            brdiVar.d(brdiVar.b().get(0).a());
            this.f = true;
        }
        cqkx.p(this);
        bshh bshhVar = this.g;
        if (bshhVar != null) {
            bshhVar.a(cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bsgr
    public cqkl d(cjqm cjqmVar) {
        brdi brdiVar = this.c;
        bvrj.UI_THREAD.c();
        if (brdiVar.a.k().a()) {
            brdiVar.a.l(dbpy.a);
            brdiVar.e(null);
        }
        this.f = false;
        cqkx.p(this);
        bshh bshhVar = this.g;
        if (bshhVar != null) {
            bshhVar.a(cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bsgr
    public Boolean e() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bsgr
    public String f() {
        return i(R.string.RESTRICTION_EV_PROFILE_YOUR_PLUGS, e().booleanValue());
    }

    @Override // defpackage.bsgr
    public String g() {
        return i(R.string.RESTRICTION_EV_PROFILE_ANY_PLUGS, !e().booleanValue());
    }

    @Override // defpackage.bsha
    public CharSequence h() {
        return "";
    }

    @Override // defpackage.bsha
    public void m(bsjm bsjmVar) {
        boolean z = false;
        if (bsjmVar.h(25, bsji.a) && this.c.c() != null) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.bsha
    public void n(bsjm bsjmVar) {
        if (e().booleanValue()) {
            bsjmVar.u(25, bsji.a, 2);
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        cqivVar.a(new bsbk(), this);
    }

    @Override // defpackage.bsha
    public String q() {
        if (e().booleanValue()) {
            return this.a.getString(R.string.RESTRICTION_EV_PROFILE_YOUR_PLUGS);
        }
        return this.a.getString(R.string.RESTRICTION_EV_PROFILE_ANY_PLUGS);
    }

    @Override // defpackage.bsha
    public String r() {
        if (e().booleanValue()) {
            return this.a.getString(R.string.RESTRICTION_EV_PROFILE_YOUR_PLUGS);
        }
        return this.a.getString(R.string.RESTRICTION_EV_PROFILE_ANY_PLUGS);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return e().booleanValue();
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        brye bryeVar;
        if (this.c.b().isEmpty()) {
            breu breuVar = new breu();
            Resources resources = this.b.getResources();
            Runnable runnable = new Runnable(this) { // from class: bshf
                private final bshi a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            };
            final Runnable runnable2 = this.h;
            if (runnable2 != null) {
                runnable2.getClass();
                bryeVar = new brye(runnable2) { // from class: bshg
                    private final Runnable a;

                    {
                        this.a = runnable2;
                    }

                    @Override // defpackage.brye
                    public final void a() {
                        this.a.run();
                    }
                };
            } else {
                bryeVar = null;
            }
            cqivVar.a(breuVar, new brgg(resources, runnable, bryeVar));
            return;
        }
        cqivVar.a(new bsbk(), this);
    }

    public bshi(Activity activity, gga ggaVar, cqhn cqhnVar, brdi brdiVar, @dzsi bshh bshhVar, @dzsi Runnable runnable, boolean z) {
        this.a = activity;
        this.b = ggaVar;
        this.c = brdiVar;
        this.g = bshhVar;
        this.h = runnable;
        this.e = z;
        this.d = new LinkedHashMap<>();
    }
}
