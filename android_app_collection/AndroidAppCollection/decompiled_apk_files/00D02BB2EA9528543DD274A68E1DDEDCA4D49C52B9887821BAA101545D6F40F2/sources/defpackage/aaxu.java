package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aaxu  reason: default package */
/* loaded from: classes2.dex */
public class aaxu implements aawv {
    private static final dcqe a = dcqe.c("aaxu");
    private final cjtd b;
    private final dnpq c;
    private final String d;
    private final String e;
    private final dxio<afha> f;
    private final Activity g;

    public aaxu(dxio<afha> dxioVar, Activity activity, dpyk dpykVar) {
        this.f = dxioVar;
        this.g = activity;
        this.d = dpykVar.b;
        this.e = (dpykVar.a & 16) != 0 ? dpykVar.d : "";
        dnpq dnpqVar = dpykVar.c;
        dnpqVar = dnpqVar == null ? dnpq.g : dnpqVar;
        this.c = dnpqVar;
        cjta b = cjtd.b();
        b.d = dtxo.bF;
        if (dnpqVar.b.isEmpty()) {
            bvoo.h("The loggedlink of song doesn't have VED.", new Object[0]);
        } else {
            b.g(dnpqVar.b);
        }
        this.b = b.a();
    }

    @Override // defpackage.aawv
    public Boolean a() {
        return Boolean.valueOf(!this.d.isEmpty());
    }

    @Override // defpackage.aawv
    public cqkl b() {
        if (this.c == null) {
            bvoo.h("Participant's loggedlink is null.", new Object[0]);
        } else {
            this.f.a().m(this.c.c, 4);
        }
        return cqkl.a;
    }

    @Override // defpackage.aawv
    public cjtd c() {
        return this.b;
    }

    @Override // defpackage.aawv
    public String d() {
        return this.d;
    }

    @Override // defpackage.aawv
    public String e() {
        return this.e;
    }

    @Override // defpackage.aawv
    public CharSequence f() {
        return this.g.getString(aaai.EXPERIENCE_SHEET_SONG_ACCESSIBILITY, new Object[]{this.d});
    }
}
