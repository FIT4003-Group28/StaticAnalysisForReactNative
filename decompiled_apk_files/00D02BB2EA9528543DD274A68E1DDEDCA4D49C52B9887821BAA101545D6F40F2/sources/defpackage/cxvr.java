package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChipInfo;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cxvr  reason: default package */
/* loaded from: classes5.dex */
public final class cxvr {
    public final ViewGroup a;
    public final Activity b;
    public cxwe c;
    public final cxvq d;
    public PeopleKitSelectionModel e;
    public PeopleKitDataLayer f;
    public final cxqo g;
    public final PeopleKitVisualElementPath h;
    public boolean i;
    public final cxvt j;
    public List<ChipInfo> k;
    private final PeopleKitConfig l;

    public cxvr(cxvp cxvpVar) {
        dbsk.s(cxvpVar.b);
        dbsk.s(cxvpVar.g);
        dbsk.s(cxvpVar.c);
        this.a = cxvpVar.b;
        PeopleKitConfig peopleKitConfig = cxvpVar.g;
        this.l = peopleKitConfig;
        this.d = cxvpVar.i;
        Activity activity = cxvpVar.a;
        this.b = activity;
        ExecutorService executorService = cxvpVar.f;
        cxov cxovVar = cxvpVar.j;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.z));
        peopleKitVisualElementPath.c(peopleKitConfig.d());
        this.h = peopleKitVisualElementPath;
        this.i = false;
        cxvt cxvtVar = cxvpVar.k;
        if (cxvtVar != null) {
            this.j = cxvtVar;
        } else {
            cxvs a = cxvt.a();
            a.a = activity;
            this.j = a.a();
        }
        cxqo cxqoVar = cxvpVar.c;
        this.g = cxqoVar;
        cxqoVar.c();
        cxqoVar.f(peopleKitConfig, 3);
        cxqoVar.e(3);
        cxrj cxrjVar = cxvpVar.d;
        Bundle bundle = cxvpVar.h;
        if (bundle == null) {
            if (cxrjVar == null || TextUtils.isEmpty(peopleKitConfig.a())) {
                return;
            }
            PeopleKitDataLayer a2 = cxrjVar.a(activity, executorService, peopleKitConfig, cxqoVar);
            this.f = a2;
            a2.r(false);
            PeopleKitSelectionModel a3 = cxsn.a();
            this.e = a3;
            a3.a = this.f;
            Stopwatch a4 = cxqoVar.a("TotalInitialize");
            a4.b();
            a4.c();
            Stopwatch a5 = cxqoVar.a("TimeToSend");
            a5.b();
            a5.c();
            Stopwatch a6 = cxqoVar.a("TimeToFirstSelection");
            a6.b();
            a6.c();
        } else {
            this.k = bundle.getParcelableArrayList("PeopleKitChipInfos");
            PeopleKitSelectionModel peopleKitSelectionModel = (PeopleKitSelectionModel) bundle.getParcelable("PeopleKitSelectionModel");
            this.e = peopleKitSelectionModel;
            if (peopleKitSelectionModel == null) {
                this.e = cxsn.a();
            }
            PeopleKitDataLayer peopleKitDataLayer = (PeopleKitDataLayer) bundle.getParcelable("PeopleKitDataLayer");
            this.f = peopleKitDataLayer;
            if (peopleKitDataLayer == null) {
                this.f = cxrjVar.a(activity, executorService, peopleKitConfig, cxqoVar);
            }
            this.f.s(activity, executorService, cxqoVar, cxrjVar);
            this.e.a = this.f;
            cxqoVar.a("TotalInitialize").b();
        }
        int i = cxsk.a;
        dehp c = dehx.c(executorService == null ? cxrc.k() : executorService);
        int t = peopleKitConfig.t();
        int i2 = t - 1;
        if (t == 0) {
            throw null;
        }
        cxsk.b(activity, c, Integer.toString(i2), peopleKitConfig.a(), this.f.u());
        cxsg.a(activity);
        cxwe cxweVar = new cxwe(activity, this.f, this.e, cxqoVar, peopleKitConfig, new cxvl(this, cxovVar), peopleKitConfig.d(), true, this.j.e);
        this.c = cxweVar;
        cxweVar.u();
        this.c.p(false);
        this.c.o(this.j.f);
        if (!TextUtils.isEmpty(null)) {
            cxwe cxweVar2 = this.c;
            cxuo cxuoVar = cxweVar2.g.d;
            cxuoVar.l = true;
            cxuoVar.m = null;
            cxuoVar.s();
            cxpn cxpnVar = cxweVar2.h;
            cxpnVar.s = true;
            cxvi cxviVar = cxpnVar.g.c;
            cxviVar.o = true;
            cxviVar.s();
        }
        this.c.h.g.c.s();
        if (peopleKitConfig.s()) {
            this.c.o = true;
        }
        this.c.a();
        Stopwatch a7 = cxqoVar.a("InitToBindView");
        a7.b();
        a7.c();
        this.e.i(new cxvm(this));
    }

    public final void a(Channel channel) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(32);
        obtain.getText().add(this.b.getString(true != this.e.f(channel) ? R.string.peoplekit_contact_removed_description : R.string.peoplekit_contact_added_description, new Object[]{channel.i(this.b), !channel.i(this.b).equals(channel.b(this.b)) ? channel.b(this.b) : ""}));
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        accessibilityManager.sendAccessibilityEvent(obtain);
    }

    public final void b(czha czhaVar) {
        this.e.e(this.f.n(czhaVar));
    }
}
