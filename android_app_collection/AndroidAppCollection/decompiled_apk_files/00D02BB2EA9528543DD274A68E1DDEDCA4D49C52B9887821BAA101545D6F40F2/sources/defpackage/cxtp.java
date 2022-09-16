package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cxtp  reason: default package */
/* loaded from: classes5.dex */
public final class cxtp {
    public final ViewGroup a;
    public final Activity b;
    public final ViewGroup c;
    public PeopleKitSelectionModel d;
    public PeopleKitDataLayer e;
    public final cxqo f;
    public PeopleKitVisualElementPath g;
    public boolean h;
    public cxtv i;
    public cxwe j;
    public int k;
    private final PeopleKitConfig l;
    private final cxov m;
    private final cxsf n;
    private final cxtr o;

    public cxtp(cxto cxtoVar) {
        String str;
        dbsk.s(cxtoVar.b);
        dbsk.s(cxtoVar.g);
        Activity activity = cxtoVar.a;
        this.b = activity;
        ExecutorService executorService = cxtoVar.f;
        ViewGroup viewGroup = cxtoVar.b;
        this.a = viewGroup;
        PeopleKitConfig peopleKitConfig = cxtoVar.g;
        this.l = peopleKitConfig;
        ViewGroup viewGroup2 = cxtoVar.j;
        this.c = viewGroup2;
        this.m = cxtoVar.h;
        this.n = cxtoVar.i;
        cxtr cxtrVar = cxtoVar.k;
        if (cxtrVar != null) {
            this.o = cxtrVar;
        } else {
            cxtq b = cxtr.b();
            b.a = activity;
            this.o = b.a();
        }
        cxqo cxqoVar = cxtoVar.c;
        this.f = cxqoVar;
        cxqoVar.c();
        cxqoVar.f(peopleKitConfig, 2);
        cxqoVar.e(2);
        cxrj cxrjVar = cxtoVar.d;
        if (cxrjVar == null || TextUtils.isEmpty(((PeopleKitConfigImpl) peopleKitConfig).a)) {
            return;
        }
        PeopleKitDataLayer a = cxrjVar.a(activity, executorService, peopleKitConfig, cxqoVar);
        this.e = a;
        a.r(false);
        PeopleKitSelectionModel a2 = cxsn.a();
        this.d = a2;
        a2.a = this.e;
        Stopwatch a3 = cxqoVar.a("TotalInitialize");
        a3.b();
        a3.c();
        Stopwatch a4 = cxqoVar.a("TimeToSend");
        a4.b();
        a4.c();
        Stopwatch a5 = cxqoVar.a("TimeToFirstSelection");
        a5.b();
        a5.c();
        int i = cxsk.a;
        dehp c = dehx.c(executorService == null ? cxrc.k() : executorService);
        int i2 = ((PeopleKitConfigImpl) peopleKitConfig).c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        cxsk.b(activity, c, Integer.toString(i3), ((PeopleKitConfigImpl) peopleKitConfig).a, this.e.u());
        cxsg.a(activity);
        this.d.i(new cxtj(this));
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.t));
        peopleKitVisualElementPath.c(((PeopleKitConfigImpl) peopleKitConfig).b);
        this.g = peopleKitVisualElementPath;
        this.h = false;
        this.i = new cxtv(activity, this.e, this.d, cxqoVar, peopleKitConfig, cxtoVar.h, viewGroup, this.g, cxtoVar.l, cxtoVar.m);
        cxsf cxsfVar = cxtoVar.i;
        if (cxsfVar != null) {
            cxtv cxtvVar = this.i;
            cxtvVar.d.k = cxsfVar;
            cxtvVar.c.p = cxsfVar;
        }
        this.i.d.g();
        cxtv cxtvVar2 = this.i;
        cxtvVar2.d.B = true;
        cxtk cxtkVar = new cxtk(this);
        cxti cxtiVar = cxtvVar2.d;
        if (cxtiVar.j == null) {
            LinearLayout linearLayout = cxtiVar.q;
            View inflate = LayoutInflater.from(cxtiVar.a).inflate(R.layout.peoplekit_more_button, (ViewGroup) linearLayout, false);
            cxtiVar.f(inflate);
            linearLayout.addView(inflate);
            cxtiVar.s.b.e(cxtiVar.c(), 1);
        }
        cxtiVar.j = cxtkVar;
        this.i.c.o = new cxtl(this);
        this.i.c.q(false);
        cxtv cxtvVar3 = this.i;
        cxsq cxsqVar = this.o.c;
        cxtvVar3.e.c(cxsqVar);
        cxtvVar3.c.p(cxsqVar);
        cxtvVar3.d.h(cxsqVar);
        cxtvVar3.a.findViewById(R.id.peoplekit_fullflow_3p_divider).setBackgroundColor(akm.c(cxtvVar3.b, cxsqVar.l));
        cxtvVar3.a.findViewById(R.id.peoplekit_fullflow_facerows).setBackgroundColor(akm.c(cxtvVar3.b, cxsqVar.a));
        cxtvVar3.a.findViewById(R.id.peoplekit_fullflow_3p).setBackgroundColor(akm.c(cxtvVar3.b, cxsqVar.a));
        cxxb cxxbVar = cxtvVar3.g;
        if (cxxbVar != null && !cxxbVar.h.equals(cxsqVar)) {
            cxxbVar.h = cxsqVar;
            cxxbVar.a();
        }
        if (!TextUtils.isEmpty(null)) {
            str = null;
            this.i.e.b(null);
        } else {
            str = null;
        }
        if (this.o.a()) {
            this.i.e.a();
        }
        if (!TextUtils.isEmpty(str)) {
            this.i.c.o(str);
        }
        if (!TextUtils.isEmpty(str)) {
            this.i.e.e(str);
        }
        if (!TextUtils.isEmpty(str)) {
            this.i.e.f(str);
        }
        if (!TextUtils.isEmpty(str)) {
            this.i.e.g(str);
        }
        View view = this.o.b;
        if (view != null) {
            ViewGroup viewGroup3 = (ViewGroup) this.i.a.findViewById(R.id.peoplekit_fullflow_autocomplete_bar_footer);
            viewGroup3.addView(view);
            viewGroup3.setVisibility(0);
        }
        this.i.d.i(this.o.a);
        this.i.d.d();
        viewGroup2.setVisibility(8);
        Stopwatch a6 = cxqoVar.a("InitToBindView");
        a6.b();
        a6.c();
    }

    public final void a() {
        this.k = this.b.getWindow().getStatusBarColor();
        this.f.e(3);
        cxtv cxtvVar = this.i;
        cxpn cxpnVar = cxtvVar.c;
        cxpnVar.h.d(cxpnVar);
        cxui cxuiVar = cxpnVar.g;
        cxuiVar.e.d(cxuiVar);
        cxti cxtiVar = cxtvVar.d;
        cxtiVar.c.d(cxtiVar);
        if (this.j == null) {
            cxwe cxweVar = new cxwe(this.b, this.e, this.d, this.f, this.l, this.m, this.g, false, this.o.d.e);
            this.j = cxweVar;
            cxweVar.l = new cxtm(this);
            cxsf cxsfVar = this.n;
            if (cxsfVar != null) {
                cxwe cxweVar2 = this.j;
                cxweVar2.h.p = cxsfVar;
                cxweVar2.g.j = cxsfVar;
            }
            this.j.u();
            this.j.p(false);
            this.j.o(this.o.c);
            this.j.b();
            if (!this.i.a().isEmpty()) {
                this.j.d(this.i.a());
            }
            this.j.g(this.o.d.a);
            if (!TextUtils.isEmpty(null)) {
                this.j.h(null);
            }
            if (this.o.a()) {
                this.j.i();
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.j(null);
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.k(null);
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.l(null);
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.m(null);
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.r(null);
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.n(null);
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.s(null);
            }
            if (!TextUtils.isEmpty(null)) {
                this.j.t(null);
            }
            this.j.q(this.o.a);
            this.j.a();
            this.c.removeAllViews();
            this.c.addView(this.j.b);
        }
        this.j.c();
        cxwe cxweVar3 = this.j;
        cxweVar3.i.d(this.i.e.h());
        this.j.h.r();
        this.c.setVisibility(0);
        this.a.setImportantForAccessibility(4);
    }

    public final void b(Channel channel) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(32);
        obtain.getText().add(this.b.getString(true != this.d.f(channel) ? R.string.peoplekit_contact_removed_description : R.string.peoplekit_contact_added_description, new Object[]{channel.i(this.b), (channel.i(this.b) == null || !channel.i(this.b).equals(channel.b(this.b))) ? channel.b(this.b) : ""}));
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        accessibilityManager.sendAccessibilityEvent(obtain);
    }
}
