package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpgt  reason: default package */
/* loaded from: classes3.dex */
public class bpgt implements bpwn {
    public static final dcqe a = dcqe.c("bpgt");
    public final bpvb b;
    public final bptw c;
    public final bpsr d;
    public final gft e;
    public final bpuk f;
    public final dnqe g;
    public final ff h;
    public final jmx i;
    public final bpgj j;
    public final bptn k;
    public final bpsw l;
    public final cqhn m;
    public final bomp n;
    private final booa o;
    private final Resources p;

    public bpgt(bpvb bpvbVar, bptw bptwVar, gft gftVar, bpsr bpsrVar, bpuk bpukVar, dnqe dnqeVar, Activity activity, ff ffVar, jmx jmxVar, bpgk bpgkVar, booa booaVar, bpto bptoVar, bptg bptgVar, bpsw bpswVar, cqhn cqhnVar) {
        bomp bompVar = new bomp(new bpgs(this));
        this.n = bompVar;
        this.b = bpvbVar;
        this.c = bptwVar;
        this.d = bpsrVar;
        this.e = gftVar;
        this.f = bpukVar;
        this.g = dnqeVar;
        this.h = ffVar;
        this.i = jmxVar;
        ff ffVar2 = (ff) ((dxjd) bpgkVar.a).a;
        bpgk.a(ffVar2, 1);
        bpgk.a(bpgkVar.b.a(), 2);
        bpgj bpgjVar = new bpgj(ffVar2);
        this.j = bpgjVar;
        this.o = booaVar;
        this.l = bpswVar;
        this.m = cqhnVar;
        this.p = activity.getResources();
        this.k = bptoVar.a(bptgVar);
        cqkx.j(bpgjVar, bompVar);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a2 = jhz.a();
        a2.a = this.h.getString(R.string.RAP_ROAD_NAME_SUMMARY_TITLE);
        a2.o = cjtd.a(dtya.bo);
        boolean z = true;
        a2.x = true;
        a2.C = 2;
        a2.f(new View.OnClickListener(this) { // from class: bpgn
            private final bpgt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.b();
            }
        });
        String string = this.h.getString(R.string.REPORT_MAP_ISSUE_SUBMIT);
        jhm a3 = jhm.a();
        a3.a = string;
        a3.f = cjtd.a(dtya.bq);
        a3.b = string;
        a3.h = 2;
        a3.d(new View.OnClickListener(this) { // from class: bpgo
            private final bpgt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.a();
            }
        });
        if (this.j.c == boxh.UNKNOWN) {
            z = false;
        }
        a3.n = z;
        a2.c(a3.c());
        return a2.b();
    }

    @Override // defpackage.bpwn
    /* renamed from: b */
    public bpgj h() {
        return this.j;
    }

    @Override // defpackage.bpwn
    public CharSequence c() {
        return this.c.a().e;
    }

    @Override // defpackage.bpwn
    public CharSequence d() {
        return this.p.getString(R.string.ROAD_RAP_CURRENT_ROAD_NAME_ACCESSIBILITY_TEXT, this.c.a().e);
    }

    @Override // defpackage.bpwn
    public CharSequence e() {
        return this.c.a().c();
    }

    @Override // defpackage.bpwn
    public CharSequence f() {
        return this.h.getString(R.string.ROAD_RAP_NAME_SUMMARY_HELP_TEXT);
    }

    @Override // defpackage.bpwn
    public boqg g() {
        return this.o;
    }
}
