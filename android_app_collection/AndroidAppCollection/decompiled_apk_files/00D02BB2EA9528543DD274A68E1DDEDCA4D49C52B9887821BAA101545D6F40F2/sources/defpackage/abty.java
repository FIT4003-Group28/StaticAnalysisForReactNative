package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abty  reason: default package */
/* loaded from: classes.dex */
public class abty implements abkm {
    private final Activity a;
    private final abur b;
    private final ddho c;
    private final boolean d;
    private CharSequence e;
    private cjtd f;
    private boolean g = false;
    private boolean h;

    public abty(Activity activity, abfa abfaVar, abus abusVar, boolean z, ddho ddhoVar, @dzsi acwt acwtVar, absg absgVar) {
        this.e = "";
        this.a = activity;
        this.c = ddhoVar;
        boolean v = abfaVar.v();
        this.d = v;
        CharSequence j = j(activity, null, v);
        this.e = j;
        this.f = k(ddhoVar, j, null);
        this.h = z;
        Activity activity2 = (Activity) ((dxjd) abusVar.a).a;
        abus.a(activity2, 1);
        abfb a = abusVar.b.a();
        abus.a(a, 2);
        akpm a2 = abusVar.c.a();
        abus.a(a2, 3);
        abus.a(absgVar, 5);
        this.b = new abur(activity2, a, a2, acwtVar, absgVar);
    }

    private static CharSequence j(Activity activity, @dzsi CharSequence charSequence, boolean z) {
        if (z) {
            if (charSequence == null || charSequence.length() <= 0) {
                return activity.getString(R.string.EXPLORE_FEED_LATEST_NEARBY);
            }
            return activity.getString(R.string.EXPLORE_FEED_LATEST_IN_AREA, new Object[]{charSequence});
        } else if (charSequence == null || charSequence.length() <= 0) {
            return activity.getString(R.string.EXPLORE_EXPLORE_NEARBY);
        } else {
            return activity.getString(R.string.EXPLORE_EXPLORE_AREA, new Object[]{charSequence});
        }
    }

    private static cjtd k(ddho ddhoVar, CharSequence charSequence, @dzsi akqi akqiVar) {
        ddcr bZ = ddcs.d.bZ();
        String charSequence2 = charSequence.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddcs ddcsVar = (ddcs) bZ.b;
        charSequence2.getClass();
        ddcsVar.a |= 2;
        ddcsVar.c = charSequence2;
        if (akqiVar != null) {
            dtbk g = akqiVar.g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddcs ddcsVar2 = (ddcs) bZ.b;
            g.getClass();
            ddcsVar2.b = g;
            ddcsVar2.a |= 1;
        }
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ddes bZ2 = ddet.D.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddet ddetVar = (ddet) bZ2.b;
        ddcs bK = bZ.bK();
        bK.getClass();
        ddetVar.i = bK;
        ddetVar.a |= 64;
        b.s(bZ2.bK());
        return b.a();
    }

    @Override // defpackage.abkm
    public void a(@dzsi CharSequence charSequence, @dzsi akqi akqiVar) {
        if (this.g) {
            return;
        }
        CharSequence j = j(this.a, charSequence, this.d);
        if (this.e.length() != 0 && this.e.toString().equals(j.toString())) {
            return;
        }
        this.e = j;
        this.f = k(this.c, j, akqiVar);
        cqkx.p(this);
    }

    @Override // defpackage.abkm
    public CharSequence b() {
        return this.e;
    }

    @Override // defpackage.abkm
    public void c(boolean z) {
        if (this.h != z) {
            this.h = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.abkm
    public Boolean d() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.abkm
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.abkm
    public abiu f() {
        return this.b;
    }

    @Override // defpackage.abkm
    public cjtd g() {
        return this.f;
    }

    @Override // defpackage.abkm
    public void h(boolean z) {
        this.g = z;
        cqkx.p(this);
    }

    @Override // defpackage.abkm
    public Boolean i() {
        return Boolean.valueOf(this.g);
    }
}
