package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tkc  reason: default package */
/* loaded from: classes7.dex */
public class tkc implements tjh, uhe {
    public final Runnable a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final cjtd h;

    public tkc(Activity activity, amvh amvhVar, dcdc<amvh> dcdcVar, Runnable runnable) {
        this.b = true;
        this.c = true;
        this.e = amvhVar.k();
        this.f = amvhVar.a();
        this.d = amvhVar.y;
        this.a = runnable;
        cjta b = cjtd.b();
        b.d = n(0, true);
        b.i(0);
        this.h = b.a();
        this.g = m(activity, true, true, dbsg.i(amvhVar), dcdcVar);
    }

    private static String m(Activity activity, boolean z, boolean z2, dbsg<amvh> dbsgVar, dcdc<amvh> dcdcVar) {
        if (!dbsgVar.a() || dbsgVar.b().a()) {
            if (!dcdcVar.isEmpty()) {
                int size = dcdcVar.size();
                StringBuilder sb = new StringBuilder(17);
                sb.append(size);
                sb.append(" stops");
                return sb.toString();
            } else if (z) {
                return activity.getString(R.string.DIRECTIONS_CHOOSE_START_POINT);
            } else {
                if (z2) {
                    return activity.getString(R.string.DIRECTIONS_CHOOSE_END_POINT);
                }
                return activity.getString(R.string.DIRECTIONS_CHOOSE_VIA_POINT);
            }
        } else if (dcdcVar.isEmpty()) {
            return dbsgVar.b().p();
        } else {
            String p = dbsgVar.b().p();
            int size2 = dcdcVar.size();
            StringBuilder sb2 = new StringBuilder(String.valueOf(p).length() + 20);
            sb2.append(p);
            sb2.append(" + ");
            sb2.append(size2);
            sb2.append(" stops");
            return sb2.toString();
        }
    }

    private static ddho n(int i, boolean z) {
        return i == 0 ? dtxn.cC : !z ? dtxn.cN : dtxn.co;
    }

    @Override // defpackage.tjh
    public uhe a() {
        return this;
    }

    @Override // defpackage.tjh
    public cqss b() {
        if (i().booleanValue()) {
            return ibm.x();
        }
        return k().booleanValue() ? ibm.n() : ibm.p();
    }

    @Override // defpackage.tjh
    public String c() {
        return this.g;
    }

    @Override // defpackage.tjh
    public cjtd d() {
        return this.h;
    }

    @Override // defpackage.tjh
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: tkb
            private final tkc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.run();
            }
        };
    }

    @Override // defpackage.uhe
    public Integer f() {
        return 0;
    }

    @Override // defpackage.uhe
    public Boolean g() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.uhe
    public Boolean h() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.uhe
    public Boolean i() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.uhe
    public Boolean j() {
        return false;
    }

    @Override // defpackage.uhe
    public Boolean k() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.uhe
    public Boolean l() {
        return Boolean.valueOf(this.d);
    }

    public tkc(Activity activity, boolean z, boolean z2, int i, dbsg<amvh> dbsgVar, dcdc<amvh> dcdcVar, Runnable runnable) {
        boolean isEmpty;
        this.b = z;
        this.c = z2;
        boolean z3 = true;
        this.e = dbsgVar.a() && dbsgVar.b().k();
        if (dbsgVar.a()) {
            isEmpty = dbsgVar.b().a();
        } else {
            isEmpty = dcdcVar.isEmpty();
        }
        this.f = isEmpty;
        this.d = (!dbsgVar.a() || !dbsgVar.b().y) ? false : z3;
        this.a = runnable;
        cjta b = cjtd.b();
        b.d = n(i, z2);
        b.i(i);
        this.h = b.a();
        this.g = m(activity, z, z2, dbsgVar, dcdcVar);
    }
}
