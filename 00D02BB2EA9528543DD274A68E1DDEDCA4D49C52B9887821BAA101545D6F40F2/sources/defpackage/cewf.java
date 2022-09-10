package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cewf  reason: default package */
/* loaded from: classes4.dex */
public class cewf implements cesv {
    private final Resources a;
    private final bbut b;
    private final dixg c;
    private final dzsj<ckni> d;
    private final int e;
    private final boolean f;
    private final dkde g;
    private final gfw h;
    private final jic i;

    public cewf(Resources resources, bbut bbutVar, dixg dixgVar, dzsj<ckni> dzsjVar, int i, boolean z, dkde dkdeVar, gfw gfwVar) {
        this.a = resources;
        this.b = bbutVar;
        this.c = dixgVar;
        this.d = dzsjVar;
        this.e = i;
        this.f = z;
        this.g = dkdeVar;
        this.h = gfwVar;
        dwfl dwflVar = dixgVar.a;
        this.i = new jic((dwflVar == null ? dwfl.w : dwflVar).h, ckqc.FIFE_MERGE, (cqtd) null, 0);
    }

    @Override // defpackage.cesv
    public jic a() {
        return this.i;
    }

    @Override // defpackage.cesv
    public String b() {
        drkr drkrVar = this.c.b;
        if (drkrVar == null) {
            drkrVar = drkr.d;
        }
        drdg drdgVar = drkrVar.a;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        return drdgVar.g;
    }

    @Override // defpackage.cesv
    public String c() {
        dkde dkdeVar = dkde.UNKNOWN_KEY;
        int ordinal = this.g.ordinal();
        if (ordinal != 1 && ordinal == 2) {
            dwfl dwflVar = this.c.a;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dizp dizpVar = dizhVar.h;
            if (dizpVar == null) {
                dizpVar = dizp.c;
            }
            if ((dizpVar.a & 1) == 0) {
                return "";
            }
            int i = (int) dizpVar.b;
            return this.a.getQuantityString(R.plurals.PROFILE_ACTIVITY_NUMBER_OF_PHOTO_VIEWS, i, Integer.valueOf(i));
        }
        return this.c.c;
    }

    @Override // defpackage.cesv
    public cqkl d() {
        dbsg<bbtw> dbsgVar;
        bbtv v = bbty.v();
        if (this.f) {
            dbsgVar = dbsg.i(bbtw.SEND_TO_SERVER_IMMEDIATELY);
        } else {
            dbsgVar = dbpy.a;
        }
        v.c(dbsgVar);
        v.d(this.f);
        v.e(false);
        v.k(!this.f);
        v.o(true);
        v.j(bbtq.b);
        this.b.o(((cewi) this.d).a, this.e, v.a(), this.h);
        return cqkl.a;
    }
}
