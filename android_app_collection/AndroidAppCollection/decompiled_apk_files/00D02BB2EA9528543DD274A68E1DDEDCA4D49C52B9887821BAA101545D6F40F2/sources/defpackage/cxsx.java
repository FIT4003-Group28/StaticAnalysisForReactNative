package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResult;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cxsx  reason: default package */
/* loaded from: classes5.dex */
public final class cxsx {
    public final ViewGroup a;
    public final PeopleKitConfig b;
    public cxti c;
    public cxqo d;
    public PeopleKitVisualElementPath e;
    public final ajxu f;
    private final cxov g;
    private PeopleKitSelectionModel h;
    private PeopleKitDataLayer i;
    private final Context j;
    private final cxsz k;

    public cxsx(cxsw cxswVar) {
        dbsk.s(cxswVar.b);
        dbsk.s(cxswVar.f);
        if (!(cxswVar.a instanceof Activity)) {
            dbsk.s(cxswVar.h);
        }
        ViewGroup viewGroup = cxswVar.b;
        this.a = viewGroup;
        PeopleKitConfig peopleKitConfig = cxswVar.f;
        this.b = peopleKitConfig;
        Context context = cxswVar.a;
        this.j = context;
        this.g = cxswVar.g;
        this.f = cxswVar.j;
        cxsz cxszVar = cxswVar.i;
        if (cxszVar != null) {
            this.k = cxszVar;
        } else {
            this.k = cxsz.a().a();
        }
        cxrj cxrjVar = cxswVar.d;
        if (cxrjVar == null || TextUtils.isEmpty(peopleKitConfig.a())) {
            return;
        }
        ExecutorService executorService = cxswVar.e;
        cxqo cxqoVar = cxswVar.c;
        this.d = cxqoVar;
        cxqoVar.c();
        this.d.f(peopleKitConfig, 7);
        this.i = cxrjVar.a(context, executorService, peopleKitConfig, this.d);
        PeopleKitSelectionModel a = cxsn.a();
        this.h = a;
        a.a = this.i;
        Stopwatch a2 = this.d.a("TotalInitialize");
        a2.b();
        a2.c();
        int i = cxsk.a;
        dehp c = dehx.c(executorService == null ? cxrc.k() : executorService);
        int t = peopleKitConfig.t();
        int i2 = t - 1;
        if (t == 0) {
            throw null;
        }
        cxsk.b(context, c, Integer.toString(i2), peopleKitConfig.a(), this.i.u());
        cxsg.a(context);
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.s));
        peopleKitVisualElementPath.c(peopleKitConfig.d());
        this.e = peopleKitVisualElementPath;
        this.c = new cxti(context, this.i, this.h, this.d, peopleKitConfig, viewGroup, new cxsu(this), cxswVar.g, peopleKitConfig.d(), this.k.d);
        cxsf cxsfVar = cxswVar.h;
        if (cxsfVar != null) {
            this.c.k = cxsfVar;
        }
        this.c.g();
        this.c.d();
        this.c.i(this.k.a);
        this.c.h(this.k.e);
        int i3 = this.k.b;
        if (i3 != 0) {
            cxti cxtiVar = this.c;
            cxtiVar.x = i3;
            cxtiVar.s.s();
        }
        int i4 = this.k.c;
        if (i4 != 0) {
            cxti cxtiVar2 = this.c;
            cxtiVar2.y = i4;
            cxtiVar2.s.s();
        }
        this.h.i(new cxsv(this));
        Stopwatch a3 = this.d.a("InitToBindView");
        a3.b();
        a3.c();
        Stopwatch a4 = this.d.a("TimeToSend");
        a4.b();
        a4.c();
        Stopwatch a5 = this.d.a("TimeToFirstSelection");
        a5.b();
        a5.c();
    }

    public final void a(czha czhaVar) {
        Channel n = this.i.n(czhaVar);
        if (this.h.f(n)) {
            this.h.e(n);
            this.g.s(czhaVar, !this.h.h());
        }
    }

    public final void b(Channel channel) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(32);
        obtain.getText().add(this.j.getString(true != this.h.f(channel) ? R.string.peoplekit_contact_removed_description : R.string.peoplekit_contact_added_description, channel.i(this.j), !channel.i(this.j).equals(channel.b(this.j)) ? channel.b(this.j) : ""));
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.j.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        accessibilityManager.sendAccessibilityEvent(obtain);
    }

    public final SendKitPickerResult c() {
        List<czha> a = this.h.a(this.j);
        czgv bZ = czgw.d.bZ();
        bZ.a(a);
        return new PeopleKitPickerResult(this.i, bZ.bK(), this.h.b());
    }
}
