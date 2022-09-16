package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqsi  reason: default package */
/* loaded from: classes2.dex */
public class aqsi implements aqsh {
    public aqcj a = aqcj.ENABLED;
    private final Activity b;
    private final auhi c;
    private final aqrk d;
    private final aqrp e;
    private final apyx f;
    private final aujb g;
    private final Runnable h;
    private final String i;

    public aqsi(Activity activity, cqhn cqhnVar, auhi auhiVar, apyx apyxVar, auur auurVar, aqrl aqrlVar, aqrp aqrpVar, aqcl aqclVar, Runnable runnable, String str) {
        this.b = activity;
        this.c = auhiVar;
        this.f = apyxVar;
        this.g = auurVar;
        this.d = aqrlVar.a(auurVar);
        this.e = aqrpVar;
        aqclVar.a(auurVar);
        this.i = str;
        this.h = runnable;
    }

    private final boolean i() {
        return this.a == aqcj.DISABLED_IN_APP || (aqck.c() && this.a != aqcj.ENABLED);
    }

    @Override // defpackage.aqsh
    public String a() {
        return this.f.b() ? this.b.getString(R.string.MESSAGING_TURN_ON_SUCCESS_DIALOG_TITLE) : "";
    }

    @Override // defpackage.aqsh
    public String b() {
        return this.f.b() ? this.b.getString(R.string.MESSAGING_TURN_ON_SUCCESS_DIALOG_TEXT) : "";
    }

    @Override // defpackage.aqsh
    public String c() {
        if (!this.f.b()) {
            return "";
        }
        if (i()) {
            return this.b.getString(R.string.MERCHANT_MESSAGING_ENABLE_NOTIFICATIONS_BUTTON_TEXT);
        }
        return this.b.getString(R.string.DONE);
    }

    @Override // defpackage.aqsh
    public cqkl d() {
        if (i()) {
            this.c.e(this.g.a, aufs.ENABLED);
            this.d.d();
            this.e.b();
        }
        this.h.run();
        return cqkl.a;
    }

    @Override // defpackage.aqsh
    public cjtd e() {
        if (i()) {
            return aqdb.a(dtxv.cb, this.i).a();
        }
        return aqdb.a(dtxv.ca, this.i).a();
    }

    @Override // defpackage.aqsh
    public cqkl f() {
        this.h.run();
        return cqkl.a;
    }

    @Override // defpackage.aqsh
    public String g() {
        return (!this.f.b() || !i()) ? "" : this.b.getString(17039370);
    }

    @Override // defpackage.aqsh
    @dzsi
    public cjtd h() {
        if (i()) {
            return aqdb.a(dtxv.cc, this.i).a();
        }
        return null;
    }
}
