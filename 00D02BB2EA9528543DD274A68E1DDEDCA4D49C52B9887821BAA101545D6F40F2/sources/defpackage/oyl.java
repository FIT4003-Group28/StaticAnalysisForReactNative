package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: oyl  reason: default package */
/* loaded from: classes7.dex */
class oyl implements oxl {
    private static final dcdn<drkp, Integer> a = dcdn.m(drkp.PENDING_MODERATION, Integer.valueOf((int) R.string.EDIT_STATE_PENDING_MODERATION), drkp.ACCEPTED, Integer.valueOf((int) R.string.EDIT_STATE_POSTED), drkp.REJECTED, Integer.valueOf((int) R.string.EDIT_STATE_REJECTED));
    private final cjzt b;
    private final dtlh c;
    private final String d;
    private final dcdc<jbi> e;
    private final jic f;
    @dzsi
    private final String g;
    private final cqss h;
    private final String i;
    private final Boolean j;
    @dzsi
    private final cjtd k;

    public oyl(Context context, cjzt cjztVar, dtlh dtlhVar) {
        String str;
        cqss r;
        this.b = cjztVar;
        this.c = dtlhVar;
        this.d = dtlhVar.b;
        dccx dccxVar = new dccx();
        for (String str2 : dtlhVar.c) {
            if (!dbsj.d(str2)) {
                dccxVar.g(new iyb(str2));
            }
        }
        this.e = dccxVar.f();
        this.f = new jic(dtlhVar.d, ckqc.FULLY_QUALIFIED, (cqtd) null, 250);
        drkp drkpVar = drkp.UNKNOWN_STATE;
        if ((dtlhVar.a & 4) != 0 && (drkpVar = drkp.b(dtlhVar.e)) == null) {
            drkpVar = drkp.UNKNOWN_STATE;
        }
        if (drkpVar != drkp.UNKNOWN_STATE) {
            dcdn<drkp, Integer> dcdnVar = a;
            drkp b = drkp.b(dtlhVar.e);
            str = context.getString(dcdnVar.get(b == null ? drkp.UNKNOWN_STATE : b).intValue());
        } else {
            str = null;
        }
        this.g = str;
        drkp b2 = drkp.b(dtlhVar.e);
        if ((b2 == null ? drkp.UNKNOWN_STATE : b2) == drkp.PENDING_MODERATION) {
            r = ibl.an();
        } else {
            r = ibl.r();
        }
        this.h = r;
        this.i = dbrz.e(" · ").g(dtlhVar.f);
        this.j = Boolean.valueOf((dtlhVar.a & 8) != 0);
        this.k = oyf.b(cjztVar.b, dtlhVar.h, dtxl.b, cjztVar.e, null);
    }

    @Override // defpackage.oxe
    @dzsi
    public cjtd a() {
        return this.k;
    }

    @Override // defpackage.oxl
    public String b() {
        return this.d;
    }

    @Override // defpackage.oxl
    public List<jbi> c() {
        return this.e;
    }

    @Override // defpackage.oxl
    public jic d() {
        return this.f;
    }

    @Override // defpackage.oxl
    @dzsi
    public String e() {
        return this.g;
    }

    @Override // defpackage.oxl
    public cqss f() {
        return this.h;
    }

    @Override // defpackage.oxl
    public String g() {
        return this.i;
    }

    @Override // defpackage.oxl
    public Boolean h() {
        return this.j;
    }

    @Override // defpackage.oxl
    public cqkl i(cjqm cjqmVar) {
        if (h().booleanValue()) {
            cjyi cjyiVar = this.b.c;
            dthb dthbVar = this.c.g;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.b;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }
}
