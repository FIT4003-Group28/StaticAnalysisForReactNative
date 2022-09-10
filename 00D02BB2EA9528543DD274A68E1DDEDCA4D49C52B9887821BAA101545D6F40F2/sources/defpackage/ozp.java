package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ozp  reason: default package */
/* loaded from: classes7.dex */
public class ozp implements oxv {
    private final Context a;
    private final cjzt b;
    private final dton c;
    private final oxu d;

    public ozp(Context context, cjzt cjztVar, dton dtonVar) {
        this.a = context;
        this.b = cjztVar;
        this.c = dtonVar;
        dtkq dtkqVar = dtonVar.b;
        this.d = new ozn(owy.e(dtkqVar == null ? dtkq.f : dtkqVar, R.color.qu_google_blue_700), context);
    }

    private final String i(int i) {
        return this.a.getResources().getQuantityString(R.plurals.PROFILE_ACTIVITY_NUMBER_OF_REVIEWS, i, Integer.valueOf(i));
    }

    private final String j(int i) {
        return this.a.getResources().getQuantityString(R.plurals.PROFILE_ACTIVITY_NUMBER_OF_RATINGS, i, Integer.valueOf(i));
    }

    @Override // defpackage.oxv
    public oxu a() {
        return this.d;
    }

    @Override // defpackage.oxv
    public CharSequence b() {
        int i;
        int i2;
        dton dtonVar = this.c;
        if ((dtonVar.a & 4) != 0) {
            dthh dthhVar = dtonVar.c;
            if (dthhVar == null) {
                dthhVar = dthh.f;
            }
            i = dthhVar.b;
            dthh dthhVar2 = this.c.c;
            if (dthhVar2 == null) {
                dthhVar2 = dthh.f;
            }
            i2 = dthhVar2.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i <= 0 || i2 <= 0) {
            if (i2 > 0) {
                return j(i2);
            }
            return i(i);
        }
        return String.format("%s · %s", i(i), j(i2));
    }

    @Override // defpackage.oxv
    public Boolean c() {
        dthh dthhVar = this.c.c;
        if (dthhVar == null) {
            dthhVar = dthh.f;
        }
        boolean z = true;
        if ((dthhVar.a & 1) == 0) {
            dthh dthhVar2 = this.c.c;
            if (dthhVar2 == null) {
                dthhVar2 = dthh.f;
            }
            if ((dthhVar2.a & 2) == 0) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxv
    public cqkl d(cjqm cjqmVar) {
        dton dtonVar = this.c;
        if ((dtonVar.a & 16) != 0) {
            cjyi cjyiVar = this.b.c;
            dthb dthbVar = dtonVar.d;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.b;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.oxv
    public CharSequence e() {
        dton dtonVar = this.c;
        if ((dtonVar.a & 4) != 0) {
            dthh dthhVar = dtonVar.c;
            if (dthhVar == null) {
                dthhVar = dthh.f;
            }
            int i = dthhVar.a;
            if ((i & 1) != 0) {
                return Integer.toString(dthhVar.b);
            }
            if ((i & 4) != 0) {
                return Integer.toString(dthhVar.d);
            }
        }
        return "";
    }

    @Override // defpackage.oxv
    public CharSequence f() {
        dton dtonVar = this.c;
        if ((dtonVar.a & 4) != 0) {
            dthh dthhVar = dtonVar.c;
            if (dthhVar == null) {
                dthhVar = dthh.f;
            }
            int i = dthhVar.a;
            if ((i & 1) != 0) {
                return this.a.getResources().getQuantityString(R.plurals.PROFILE_ACTIVITY_REVIEWS, dthhVar.b);
            }
            if ((i & 4) != 0) {
                return this.a.getResources().getQuantityString(R.plurals.PROFILE_ACTIVITY_PHOTOS, dthhVar.d);
            }
        }
        return "";
    }

    @Override // defpackage.oxv
    public CharSequence g() {
        dton dtonVar = this.c;
        if ((dtonVar.a & 4) != 0) {
            dthh dthhVar = dtonVar.c;
            if (dthhVar == null) {
                dthhVar = dthh.f;
            }
            int i = dthhVar.a;
            if ((i & 2) != 0) {
                return Integer.toString(dthhVar.c);
            }
            if ((i & 8) != 0) {
                return Integer.toString(dthhVar.e);
            }
        }
        return "";
    }

    @Override // defpackage.oxv
    public CharSequence h() {
        dton dtonVar = this.c;
        if ((dtonVar.a & 4) != 0) {
            dthh dthhVar = dtonVar.c;
            if (dthhVar == null) {
                dthhVar = dthh.f;
            }
            int i = dthhVar.a;
            if ((i & 2) != 0) {
                return this.a.getResources().getString(R.string.RATINGS, Integer.valueOf(dthhVar.b));
            }
            if ((i & 8) != 0) {
                return this.a.getResources().getString(R.string.TOTAL_VIEWS, Integer.valueOf(dthhVar.e));
            }
        }
        return "";
    }
}
