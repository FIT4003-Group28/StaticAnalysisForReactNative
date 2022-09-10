package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: btgc  reason: default package */
/* loaded from: classes4.dex */
public final class btgc extends bszv {
    public Context ad;
    public auhi ae;
    public btwr af;
    public auf ag;
    public btlc ah;
    public auom ai;
    public cqhn aj;
    public cjqy ak;
    public ausy al;
    @dzsi
    public auin am;
    private final Map<String, aujb> an = new HashMap();

    public static btgc aS(@dzsi auin auinVar) {
        btgc btgcVar = new btgc();
        Bundle bundle = new Bundle();
        if (auinVar != null) {
            bundle.putInt("notificationCategoryKey", auinVar.ordinal());
        }
        btgcVar.B(bundle);
        return btgcVar;
    }

    private final String aU(int i) {
        aufs t = this.ae.t(i);
        aufs aufsVar = aufs.UNKNOWN_STATE;
        int ordinal = t.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return Rp(R.string.NOTIFICATION_SETTING_INBOX_ONLY);
            }
            return ordinal != 3 ? "" : Rp(R.string.NOTIFICATION_SETTING_OFF);
        }
        return Rp(R.string.NOTIFICATION_SETTING_ON);
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        auin auinVar = this.am;
        return Rp(auinVar != null ? auinVar.i : R.string.NOTIFICATIONS_SETTINGS_TITLE);
    }

    public final void aT() {
        for (String str : this.an.keySet()) {
            Preference ah = d().ah(str);
            if (ah != null) {
                ah.k(aU(this.an.get(str).a));
            }
        }
    }

    @Override // defpackage.aup, defpackage.fd
    public final void ah(View view, Bundle bundle) {
        super.ah(view, bundle);
        if (this.ai.b) {
            aT();
            RecyclerView recyclerView = this.c;
            recyclerView.g(new btgz(recyclerView.getContext()));
        }
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        dccr<aujb> values;
        int i;
        avb avbVar = this.b;
        avbVar.b = this.ag;
        PreferenceScreen b = avbVar.b(J());
        e(b);
        Bundle bundle2 = this.o;
        if (bundle2 != null && bundle2.containsKey("notificationCategoryKey") && (i = bundle2.getInt("notificationCategoryKey")) >= 0 && i < auin.values().length) {
            this.am = auin.values()[i];
        }
        auin auinVar = this.am;
        if (auinVar != null) {
            values = this.ae.c(auinVar).values();
        } else {
            values = this.ae.b().values();
        }
        if (this.ai.b) {
            Preference preference = new Preference(this.ad);
            preference.s(Rp(R.string.NOTIFICATION_SET_FOR_CATEGORY));
            preference.o = new auc(this) { // from class: btfx
                private final btgc a;

                {
                    this.a = this;
                }

                @Override // defpackage.auc
                public final boolean a(Preference preference2) {
                    final btgc btgcVar = this.a;
                    if (!btgcVar.aX) {
                        return false;
                    }
                    final btgy btgyVar = new btgy(btgcVar.ae, btgcVar.am, btgcVar.ai, btgcVar.aj, new Runnable(btgcVar) { // from class: btfz
                        private final btgc a;

                        {
                            this.a = btgcVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.aT();
                        }
                    }, btgcVar.ak, btgcVar.J(), btgcVar.al);
                    cjkp B = cjkr.B();
                    B.t(btgcVar.J().getString(R.string.NOTIFICATION_SETTINGS_TITLE));
                    cjke cjkeVar = (cjke) B;
                    cjkeVar.f = cqgr.fT(new btgt(), btgyVar.c());
                    B.y(btgcVar.J().getString(R.string.CANCEL_BUTTON), new View.OnClickListener(btgyVar) { // from class: btga
                        private final btgy a;

                        {
                            this.a = btgyVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.a();
                        }
                    }, cjtd.a(dtxw.dV));
                    B.z(btgcVar.J().getString(R.string.OK_BUTTON), new View.OnClickListener(btgyVar) { // from class: btgb
                        private final btgy a;

                        {
                            this.a = btgyVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.b();
                        }
                    }, cjtd.a(dtxw.dW));
                    cjkeVar.a = ibn.l();
                    B.u(btgcVar.J()).q().show();
                    return true;
                }
            };
            preference.G(false);
            b.aj(preference);
        }
        btvo a = this.af.a();
        HashSet c = dcnm.c();
        for (final aujb aujbVar : values) {
            boolean e = aujbVar.e(a);
            boolean z = true;
            if (!aujbVar.o(a) && !aujbVar.p(a)) {
                z = false;
            }
            if (e && !z) {
                auix b2 = aujbVar.b();
                dcdc<Preference> c2 = aujbVar.c(J(), this.ad, a);
                int i2 = aujbVar.a;
                auio v = aujbVar.v();
                if (b2 != null && v != null && !c.contains(v)) {
                    if (this.ai.b) {
                        Preference a2 = bvjo.a(this.ad);
                        a2.s(Rp(b2.b));
                        a2.C(String.valueOf(i2));
                        this.an.put(String.valueOf(i2), aujbVar);
                        a2.k(aU(i2));
                        a2.o = new auc(this, aujbVar) { // from class: btfy
                            private final btgc a;
                            private final aujb b;

                            {
                                this.a = this;
                                this.b = aujbVar;
                            }

                            @Override // defpackage.auc
                            public final boolean a(Preference preference2) {
                                btgc btgcVar = this.a;
                                aujb aujbVar2 = this.b;
                                if (!btgcVar.aX) {
                                    return false;
                                }
                                btgc.ba(btgcVar.bb(), btgd.g(aujbVar2));
                                return true;
                            }
                        };
                        a2.G(false);
                        b.aj(a2);
                        int size = c2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            c2.get(i3).G(false);
                        }
                    } else {
                        b.aj(this.ah.a(this.ad, aujbVar));
                    }
                    c.add(v);
                }
                int size2 = c2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    b.aj(c2.get(i4));
                }
            }
        }
    }
}
