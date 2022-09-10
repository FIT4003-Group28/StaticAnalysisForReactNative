package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arjd  reason: default package */
/* loaded from: classes2.dex */
public class arjd implements arjh {
    private final bwqv a;
    private final Activity b;
    private final fd c;
    private final gfq d;
    private final arfm e;
    private final bwrs<arfk> f;
    private final bwrr<arfk> g = new arjc(this);
    private boolean h = false;

    public arjd(Activity activity, fd fdVar, bwqv bwqvVar, gfq gfqVar, arfm arfmVar) {
        this.b = activity;
        this.c = fdVar;
        this.d = gfqVar;
        this.a = bwqvVar;
        this.e = arfmVar;
        this.f = arfmVar.C();
    }

    private final dvcr l() {
        dvcr dvcrVar = this.f.c().e().b;
        return dvcrVar == null ? dvcr.h : dvcrVar;
    }

    private final boolean m() {
        return this.f.c().c == arfj.MAP_LOADED;
    }

    private final boolean n() {
        return this.f.c().c == arfj.FAILED_TO_LOAD;
    }

    public void a() {
        this.h = true;
        this.a.g(this.f, this.g);
        cqkx.p(this);
    }

    public void b() {
        bwqv.t(this.f, this.g);
        this.h = false;
    }

    @Override // defpackage.arjh
    public Boolean c() {
        return Boolean.valueOf(this.f.c().c == arfj.MAP_LOADING);
    }

    @Override // defpackage.arjh
    public CharSequence d() {
        if (m()) {
            Activity activity = this.b;
            Object[] objArr = new Object[1];
            donu donuVar = l().f;
            if (donuVar == null) {
                donuVar = donu.b;
            }
            objArr[0] = donuVar.a;
            return activity.getString(R.string.MY_MAPS_CREATED_DATE_LABEL, objArr);
        }
        return "";
    }

    @Override // defpackage.arjh
    public CharSequence e() {
        if (m()) {
            return l().b;
        }
        return n() ? this.b.getString(R.string.MY_MAPS_ERROR_LOADING_MAP_TITLE) : "";
    }

    @Override // defpackage.arjh
    public CharSequence f() {
        Integer e;
        if (m()) {
            return l().c;
        }
        return (!n() || (e = this.f.c().e.e()) == null) ? "" : this.b.getString(e.intValue());
    }

    @Override // defpackage.arjh
    public cqtd g() {
        return cqrt.f(R.drawable.ic_qu_mymaps_icon);
    }

    @Override // defpackage.arjh
    @dzsi
    public CharSequence h() {
        if (m()) {
            return this.b.getString(R.string.MY_MAPS_VIEW_MAP_LEGEND_TEXT);
        }
        if (n() && this.f.c().e.c()) {
            return this.b.getString(R.string.TRY_AGAIN);
        }
        return null;
    }

    @Override // defpackage.arjh
    public cqkl i() {
        if (!this.h) {
            return cqkl.a;
        }
        if (m()) {
            gfq.l((ggg) this.c);
            this.e.r();
        } else if (n()) {
            this.e.f(this.f.c().d);
        }
        return cqkl.a;
    }

    @Override // defpackage.arjh
    public cjtd j() {
        if (m()) {
            return cjtd.a(dtxv.eK);
        }
        return null;
    }

    @Override // defpackage.arjh
    public cjtd k() {
        return cjtd.a(dtxv.eJ);
    }
}
