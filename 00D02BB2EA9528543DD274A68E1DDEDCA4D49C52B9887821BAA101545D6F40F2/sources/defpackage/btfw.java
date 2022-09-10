package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gmm.settings.notification.ManageNotificationsPreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btfw  reason: default package */
/* loaded from: classes4.dex */
public final class btfw extends bszv implements auc {
    private static final dcqe al = dcqe.c("btfw");
    public Context ad;
    public auhi ae;
    public btwr af;
    public cjqy ag;
    public cqkj ah;
    public auom ai;
    public dxio<afha> aj;
    public auf ak;
    private in am;

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        if (this.aX) {
            try {
                auin a = auin.a(preference.q);
                ddho ddhoVar = a.k;
                if (ddhoVar == null) {
                    bvoo.h("Null Geo Visual Element for notification category: %s", a);
                } else {
                    this.ag.i(cjtd.a(ddhoVar));
                }
                ba(bb(), btgc.aS(a));
            } catch (IllegalArgumentException unused) {
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.NOTIFICATIONS_SETTINGS_TITLE);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        auin[] values;
        super.s();
        btvo a = this.af.a();
        avb avbVar = this.b;
        avbVar.b = this.ak;
        PreferenceScreen b = avbVar.b(J());
        e(b);
        this.am = in.a(this.ad);
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 26 && !this.am.f()) {
            ManageNotificationsPreference manageNotificationsPreference = new ManageNotificationsPreference(this.ad, this.ah, this.aj);
            manageNotificationsPreference.C("MANAGE_NOTIFICATIONS");
            manageNotificationsPreference.A(false);
            b.aj(manageNotificationsPreference);
            if (!this.ai.b) {
                z = false;
            }
        }
        for (auin auinVar : auin.values()) {
            dcpd<aujb> it = ((aufl) this.ae).a().values().iterator();
            while (true) {
                if (it.hasNext()) {
                    aujb next = it.next();
                    if (next.w() == auinVar && aufl.i(next, a)) {
                        Preference preference = new Preference(this.ad);
                        preference.s(this.ad.getString(auinVar.i));
                        Drawable drawable = this.ad.getDrawable(auinVar.j);
                        if (z) {
                            drawable.setColorFilter(ibm.x().b(this.ad), PorterDuff.Mode.SRC_ATOP);
                        } else {
                            drawable.setColorFilter(ibm.r().b(this.ad), PorterDuff.Mode.SRC_IN);
                            preference.y(false);
                        }
                        preference.v(drawable);
                        preference.C(auinVar.name());
                        preference.o = this;
                        b.aj(preference);
                    }
                }
            }
        }
    }
}
