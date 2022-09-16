package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: lhp  reason: default package */
/* loaded from: classes3.dex */
public class lhp extends bjr {
    public SettingsDataAccess ae;
    public yrj af;
    public aafo ag;
    public lgm ah;
    public gfu ai;
    public acwn aj;
    public lhq ak;
    public ayor al;
    public CharSequence am;
    public boolean an;
    public Preference ao;
    public aacz ap;
    public vzc aq;
    private aypg ar;
    private lho as;
    private aypg at;
    public afvn c;
    public aadd d;
    public acti e;

    public static final void aP(String str, List list, Preference preference) {
        if (preference == null) {
            return;
        }
        if (str == null) {
            list.add(preference);
        } else {
            preference.M(str);
        }
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        ayqi.c((AtomicReference) this.at);
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        mJ().setTitle(R.string.settings);
    }

    @Override // defpackage.bjr, defpackage.bka
    public final boolean aF(Preference preference) {
        boolean aF = super.aF(preference);
        if (((SettingsActivity) mJ()).g().i()) {
            this.am = preference.q;
            lho lhoVar = this.as;
            if (lhoVar != null) {
                lhoVar.d.mr();
                lhoVar.mr();
            }
        }
        return aF;
    }

    @Override // defpackage.bjr
    public final void aG() {
    }

    public final String aK() {
        arag aragVar;
        Object next;
        Iterator it = aL().iterator();
        do {
            aragVar = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
        } while (!(next instanceof apwr));
        apwr apwrVar = (apwr) next;
        if ((apwrVar.b & 2) != 0 && (aragVar = apwrVar.d) == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List aL() {
        return this.ae.i();
    }

    public final void aM() {
        for (Object obj : aL()) {
            if (obj instanceof apwr) {
                this.e.u(new acte(((apwr) obj).f), null);
                return;
            }
        }
    }

    public final void aN(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            if (preference != null) {
                o().af(preference);
            }
        }
        list.clear();
    }

    public final boolean aO() {
        return eog.F(this.d) && hve.l(aL(), apwk.class);
    }

    public final String aQ(int i) {
        arag aragVar;
        aurh aurhVar;
        Iterator it = aL().iterator();
        while (true) {
            aragVar = null;
            if (!it.hasNext()) {
                aurhVar = null;
                break;
            }
            Object next = it.next();
            if (next instanceof aurh) {
                aurhVar = (aurh) next;
                int bh = awwc.bh(aurhVar.e);
                if (bh == 0) {
                    bh = 1;
                }
                if (bh == i) {
                    break;
                }
            }
        }
        if (aurhVar != null) {
            if ((aurhVar.b & 1) != 0 && (aragVar = aurhVar.c) == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar).toString();
        }
        return null;
    }

    @Override // defpackage.bjr
    protected final xo d(PreferenceScreen preferenceScreen) {
        if (!((SettingsActivity) mJ()).g().i()) {
            return super.d(preferenceScreen);
        }
        lho lhoVar = new lho(this, super.d(preferenceScreen));
        this.as = lhoVar;
        return lhoVar;
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.at = this.aj.j().X(this.al).as(new ayqb() { // from class: lhm
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Preference preference;
                lhp lhpVar = lhp.this;
                Boolean bool = (Boolean) obj;
                lhpVar.an = bool.booleanValue();
                if (lhpVar.a == null || lhpVar.o() == null) {
                    return;
                }
                PreferenceScreen o = lhpVar.o();
                Preference l = o.l(lhpVar.N(R.string.pair_with_tv_key));
                if (l != null) {
                    lhpVar.ao = l;
                }
                if (!bool.booleanValue()) {
                    if (l == null) {
                        return;
                    }
                    o.af(l);
                } else if (l != null || (preference = lhpVar.ao) == null) {
                } else {
                    o.ae(preference);
                }
            }
        });
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void mS() {
        super.mS();
        this.ar = this.ae.g(new Runnable() { // from class: lhn
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                arag aragVar;
                String str3;
                arag aragVar2;
                String str4;
                arag aragVar3;
                String str5;
                arag aragVar4;
                aurd aurdVar;
                final lhp lhpVar = lhp.this;
                if (lhpVar.b == null) {
                    return;
                }
                if (lhpVar.o() != null) {
                    lhpVar.o().ab();
                }
                lhpVar.p(R.xml.settings_fragment);
                ArrayList arrayList = new ArrayList();
                Preference ov = lhpVar.ov(lhpVar.N(R.string.yt_unlimited_pre_purchase_key));
                Preference ov2 = lhpVar.ov(lhpVar.N(R.string.yt_unlimited_post_purchase_key));
                if (!lhpVar.af.o() || !hve.l(lhpVar.aL(), apwr.class)) {
                    arrayList.add(ov2);
                    arrayList.add(ov);
                } else {
                    Iterator it = lhpVar.aL().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (next instanceof apwr) {
                            if (((apwr) next).e) {
                                arrayList.add(ov2);
                                lhp.aP(lhpVar.aK(), arrayList, ov);
                                lhpVar.aM();
                            }
                        }
                    }
                    arrayList.add(ov);
                    lhp.aP(lhpVar.aK(), arrayList, ov2);
                    lhpVar.aM();
                    Preference ov3 = lhpVar.ov(lhpVar.N(R.string.offline_key));
                    int i = ov2.p;
                    int i2 = ov3.p;
                    if (i >= 0 && i2 >= 0) {
                        ov3.J(i + 1);
                    }
                }
                lhpVar.aN(arrayList);
                int i3 = 0;
                while (true) {
                    str = null;
                    r9 = null;
                    String str6 = null;
                    arag aragVar5 = null;
                    String str7 = null;
                    str = null;
                    if (i3 >= lhpVar.o().k()) {
                        break;
                    }
                    Preference o = lhpVar.o().o(i3);
                    o.Z();
                    Object obj = o.s;
                    if (lhpVar.N(R.string.privacy_key).equals(obj)) {
                        if (lhpVar.c.c().g()) {
                            arrayList.add(o);
                        } else if (lhpVar.aO()) {
                            lhp.aP(lhpVar.aQ(10003), arrayList, o);
                        } else {
                            lhp.aP(lhpVar.aQ(10029), arrayList, o);
                        }
                    } else if (lhpVar.N(R.string.notification_key).equals(obj)) {
                        Iterator it2 = lhpVar.aL().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                aurdVar = null;
                                break;
                            }
                            Object next2 = it2.next();
                            if (next2 instanceof aurd) {
                                aurdVar = (aurd) next2;
                                break;
                            }
                        }
                        if (aurdVar != null && (aurdVar.b & 1) != 0) {
                            arag aragVar6 = aurdVar.c;
                            if (aragVar6 == null) {
                                aragVar6 = arag.a;
                            }
                            str6 = ajgl.b(aragVar6).toString();
                        }
                        lhp.aP(str6, arrayList, o);
                    } else if (lhpVar.N(R.string.auto_play_key).equals(obj)) {
                        lhp.aP(lhpVar.aQ(10058), arrayList, o);
                    } else if (lhpVar.N(R.string.offline_key).equals(obj)) {
                        lhp.aP(lhpVar.ah.b(), arrayList, o);
                    } else if (lhpVar.N(R.string.live_chat_key).equals(obj)) {
                        lhp.aP(lhpVar.aQ(10034), arrayList, o);
                    } else if (lhpVar.N(R.string.billing_and_payment_key).equals(obj)) {
                        lhp.aP(lhpVar.aQ(10048), arrayList, o);
                    } else if (lhpVar.N(R.string.third_party_key).equals(obj)) {
                        lhp.aP(lhpVar.aQ(10039), arrayList, o);
                    } else if (lhpVar.N(R.string.developer_settings_key).equals(obj)) {
                        arrayList.add(o);
                    } else if (lhpVar.N(R.string.dogfood_settings_key).equals(obj)) {
                        arrayList.add(o);
                    } else {
                        asxp asxpVar = lhpVar.d.a().e;
                        if (asxpVar == null) {
                            asxpVar = asxp.a;
                        }
                        if (asxpVar.i || !lhpVar.N(R.string.refresh_config_key).equals(obj)) {
                            if (lhpVar.N(R.string.video_quality_settings_key).equals(obj)) {
                                if (!eog.J(lhpVar.d)) {
                                    arrayList.add(o);
                                } else if (eog.U(lhpVar.d)) {
                                    lhp.aP(lhpVar.N(R.string.pref_settings_video_quality_nonbeta), arrayList, o);
                                }
                            } else if (lhpVar.N(R.string.parent_tools_key).equals(obj)) {
                                Iterator it3 = lhpVar.aL().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof aurj) {
                                        aurj aurjVar = (aurj) next3;
                                        int bh = awwc.bh(aurjVar.d);
                                        if (bh != 0 && bh == 10091) {
                                            if ((aurjVar.b & 2) != 0 && (aragVar5 = aurjVar.c) == null) {
                                                aragVar5 = arag.a;
                                            }
                                            str7 = ajgl.b(aragVar5).toString();
                                        }
                                    }
                                }
                                lhp.aP(str7, arrayList, o);
                                if (!arrayList.contains(o)) {
                                    o.o = new bjg() { // from class: lhl
                                        @Override // defpackage.bjg
                                        public final boolean b(Preference preference) {
                                            lhp lhpVar2 = lhp.this;
                                            if (lhpVar2.mJ() != null) {
                                                dt mJ = lhpVar2.mJ();
                                                afvn afvnVar = lhpVar2.c;
                                                vzc vzcVar = lhpVar2.aq;
                                                aadd aaddVar = lhpVar2.d;
                                                try {
                                                    Account a = vzcVar.a(afvnVar.c());
                                                    if (a == null) {
                                                        return true;
                                                    }
                                                    asxp asxpVar2 = aaddVar.a().e;
                                                    if (asxpVar2 == null) {
                                                        asxpVar2 = asxp.a;
                                                    }
                                                    boolean z = asxpVar2.bl;
                                                    ush a2 = ParentToolsActivity.a(mJ);
                                                    a2.d = a.name;
                                                    a2.b = "HOST_CLIENT_NAME_MAIN_ANDROID";
                                                    a2.c = zfm.c(mJ);
                                                    a2.g = mJ.getString(R.string.parent_tools_tool_bar_title);
                                                    a2.j = usk.PARENT_SETTINGS;
                                                    a2.k = z;
                                                    mJ.startActivity(a2.a());
                                                    return true;
                                                } catch (RemoteException | qsc | qsd e) {
                                                    zep.d("Couldn't start parent tools!", e);
                                                    return true;
                                                }
                                            }
                                            return true;
                                        }
                                    };
                                }
                            } else if (lhpVar.N(R.string.pair_with_tv_key).equals(obj)) {
                                lhpVar.ao = o;
                                if (!lhpVar.an) {
                                    arrayList.add(o);
                                }
                            } else if (lhpVar.N(R.string.data_saving_settings_key).equals(obj) && !eog.az(lhpVar.ap)) {
                                arrayList.add(o);
                            }
                        } else {
                            arrayList.add(o);
                        }
                    }
                    i3++;
                }
                String str8 = "";
                boolean z = false;
                for (Object obj2 : lhpVar.aL()) {
                    if (obj2 instanceof apws) {
                        arag aragVar7 = ((apws) obj2).d;
                        if (aragVar7 == null) {
                            aragVar7 = arag.a;
                        }
                        str8 = ajgl.b(aragVar7).toString();
                        z = true;
                    }
                }
                Preference l = lhpVar.o().l(lhpVar.N(R.string.yt_unplugged_pref_key));
                Preference l2 = lhpVar.o().l(lhpVar.N(R.string.yt_unlimited_post_purchase_key));
                Preference l3 = lhpVar.o().l(lhpVar.N(R.string.yt_unlimited_pre_purchase_key));
                if (z) {
                    int i4 = l3 != null ? l3.p : -1;
                    if (i4 < 0) {
                        i4 = l2 != null ? l2.p : -1;
                    }
                    if (i4 > 0) {
                        l.J(i4 - 1);
                    }
                    lhp.aP(str8, arrayList, l);
                    Iterator it4 = lhpVar.aL().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next4 = it4.next();
                        if (next4 instanceof apws) {
                            lhpVar.e.u(new acte(((apws) next4).e), null);
                            break;
                        }
                    }
                } else {
                    arrayList.add(l);
                }
                Preference ov4 = lhpVar.ov(lhpVar.N(R.string.history_key));
                if (lhpVar.aO()) {
                    Iterator it5 = lhpVar.aL().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            str5 = null;
                            break;
                        }
                        Object next5 = it5.next();
                        if (next5 instanceof apwk) {
                            apwk apwkVar = (apwk) next5;
                            if ((apwkVar.b & 1) != 0) {
                                aragVar4 = apwkVar.c;
                                if (aragVar4 == null) {
                                    aragVar4 = arag.a;
                                }
                            } else {
                                aragVar4 = null;
                            }
                            str5 = ajgl.b(aragVar4).toString();
                        }
                    }
                    lhp.aP(str5, arrayList, ov4);
                    Iterator it6 = lhpVar.aL().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        Object next6 = it6.next();
                        if (next6 instanceof apwk) {
                            lhpVar.e.u(new acte(((apwk) next6).e), null);
                            break;
                        }
                    }
                } else {
                    arrayList.add(ov4);
                }
                Preference ov5 = lhpVar.ov(lhpVar.N(R.string.subscription_product_setting_key));
                if (!lhpVar.af.o() || hve.l(lhpVar.aL(), apwq.class)) {
                    Iterator it7 = lhpVar.aL().iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            str2 = null;
                            break;
                        }
                        Object next7 = it7.next();
                        if (apwq.class.isInstance(next7)) {
                            apwq apwqVar = (apwq) next7;
                            if ((apwqVar.b & 2) != 0) {
                                aragVar = apwqVar.d;
                                if (aragVar == null) {
                                    aragVar = arag.a;
                                }
                            } else {
                                aragVar = null;
                            }
                            str2 = ajgl.b(aragVar).toString();
                        }
                    }
                    lhp.aP(str2, arrayList, ov5);
                    Iterator it8 = lhpVar.aL().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next8 = it8.next();
                        if (next8 instanceof apwq) {
                            lhpVar.e.u(new acte(((apwq) next8).e), null);
                            break;
                        }
                    }
                } else {
                    arrayList.add(ov5);
                }
                Preference ov6 = lhpVar.ov(lhpVar.N(R.string.connected_accounts_browse_page_key));
                if (!lhpVar.af.o() || !hve.l(lhpVar.aL(), apwj.class)) {
                    arrayList.add(ov6);
                } else {
                    Iterator it9 = lhpVar.aL().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            str4 = null;
                            break;
                        }
                        Object next9 = it9.next();
                        if (next9 instanceof apwj) {
                            apwj apwjVar = (apwj) next9;
                            if ((apwjVar.b & 2) != 0) {
                                aragVar3 = apwjVar.d;
                                if (aragVar3 == null) {
                                    aragVar3 = arag.a;
                                }
                            } else {
                                aragVar3 = null;
                            }
                            str4 = ajgl.b(aragVar3).toString();
                        }
                    }
                    lhp.aP(str4, arrayList, ov6);
                }
                Preference ov7 = lhpVar.ov(lhpVar.N(R.string.premium_early_access_browse_page_key));
                if (!lhpVar.af.p() || !hve.l(lhpVar.aL(), apwp.class)) {
                    arrayList.add(ov7);
                } else {
                    Iterator it10 = lhpVar.aL().iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            str3 = null;
                            break;
                        }
                        Object next10 = it10.next();
                        if (next10 instanceof apwp) {
                            apwp apwpVar = (apwp) next10;
                            if ((apwpVar.b & 2) != 0) {
                                aragVar2 = apwpVar.d;
                                if (aragVar2 == null) {
                                    aragVar2 = arag.a;
                                }
                            } else {
                                aragVar2 = null;
                            }
                            str3 = ajgl.b(aragVar2).toString();
                        }
                    }
                    lhp.aP(str3, arrayList, ov7);
                }
                lhpVar.aN(arrayList);
                lhe g = ((SettingsActivity) lhpVar.mJ()).g();
                Intent intent = g.a.getIntent();
                if (!g.i()) {
                    if (intent != null) {
                        g.j(intent.getStringExtra(":android:show_fragment"));
                    }
                } else if (!TextUtils.isEmpty(g.q)) {
                    str = g.q;
                } else {
                    str = intent.getStringExtra(":android:show_fragment");
                    if (TextUtils.isEmpty(str)) {
                        str = GeneralPrefsFragment.class.getName();
                    }
                }
                if (str == null) {
                    return;
                }
                String charSequence = str.toString();
                for (int i5 = 0; i5 < lhpVar.o().k(); i5++) {
                    Preference o2 = lhpVar.o().o(i5);
                    if (charSequence.equals(o2.u)) {
                        lhpVar.a.c.aF(o2);
                    }
                }
            }
        });
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void my() {
        super.my();
        azof.f((AtomicReference) this.ar);
        this.ar = null;
    }

    @Override // defpackage.bjr
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.af(null);
        return n;
    }
}
