package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bpfq  reason: default package */
/* loaded from: classes3.dex */
public class bpfq implements bpwk {
    public final bpws a;
    public final boxg b;
    public final boxs c;
    public final bpvb d;
    public final bpsr e;
    public final int f;
    public final bpef g;
    public final bpef h;
    public final bnyc i;
    public final bomp j;
    private final ff k;
    private final bpvz l;
    private final boqg m;
    private final bomp n;

    public bpfq(bpeb bpebVar, bpeg bpegVar, booa booaVar, ff ffVar, bnyd bnydVar, int i, boxg boxgVar, bpws bpwsVar, bokk bokkVar, bpvb bpvbVar, bpsr bpsrVar) {
        bomp bompVar = new bomp(new bpfo(this));
        this.n = bompVar;
        bomp bompVar2 = new bomp(new bpfp(this));
        this.j = bompVar2;
        this.k = ffVar;
        this.f = i;
        this.b = boxgVar;
        this.a = bpwsVar;
        this.d = bpvbVar;
        this.e = bpsrVar;
        this.i = bnydVar.a(ffVar.g(), dtya.V, dtya.bH);
        this.c = new boxs(bokkVar, ffVar.getString(R.string.ADD_OPTIONAL_NOTE_HINT), bpfl.a, null);
        this.l = bpebVar.a(boxgVar.c);
        ArrayList b = dchl.b(boxf.h);
        b.remove(boxgVar.c);
        bpef a = bpegVar.a(boxgVar, dcdc.r(b));
        this.g = a;
        bpef a2 = bpegVar.a(boxgVar, dcdc.g(boxf.TWO_WAY_END_POINTS_UNLABELED, boxf.ONE_WAY_END_POINTS_UNLABELED));
        this.h = a2;
        this.m = booaVar;
        cqkx.j(bpwsVar, bompVar);
        cqkx.j(a, bompVar2);
        cqkx.j(a2, bompVar2);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.a = this.k.getString(R.string.RAP_ROAD_DIRECTIONALITY_ATTRIBUTE_TITLE);
        a.o = cjtd.a(dtya.aI);
        a.x = true;
        a.C = 2;
        a.f(new View.OnClickListener(this) { // from class: bpfm
            private final bpfq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e.b();
            }
        });
        String string = this.k.getString(R.string.REPORT_MAP_ISSUE_SUBMIT);
        jhm a2 = jhm.a();
        a2.a = string;
        a2.f = cjtd.a(dtya.aO);
        a2.b = string;
        a2.h = 2;
        a2.d(new View.OnClickListener(this) { // from class: bpfn
            private final bpfq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e.a();
            }
        });
        a2.n = b();
        a.c(a2.c());
        return a.b();
    }

    public final boolean b() {
        if (d().booleanValue()) {
            return this.g.c();
        }
        return this.h.c();
    }

    @Override // defpackage.bpwk
    public bpws c() {
        return this.a;
    }

    @Override // defpackage.bpwk
    public Boolean d() {
        return Boolean.valueOf(this.b.a != boxf.DIRECTIONALITY_HINT);
    }

    @Override // defpackage.bpwk
    public bpvz e() {
        return this.l;
    }

    @Override // defpackage.bpwk
    public bpwb f() {
        return this.g;
    }

    @Override // defpackage.bpwk
    public bpwb g() {
        return this.h;
    }

    @Override // defpackage.bpwk
    public bpvn h() {
        return this.c;
    }

    @Override // defpackage.bpwk
    public boqg i() {
        return this.m;
    }
}
