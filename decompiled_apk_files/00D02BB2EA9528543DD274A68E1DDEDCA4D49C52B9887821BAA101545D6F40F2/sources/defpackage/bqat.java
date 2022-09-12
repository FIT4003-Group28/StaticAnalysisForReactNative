package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqat  reason: default package */
/* loaded from: classes4.dex */
public class bqat implements bqil {
    public dbsg<bqar> a = dbpy.a;
    private bqcl b;
    private final bqas c;
    private final bqas d;
    private final bqas e;
    private final bqar f;

    public bqat(cqhn cqhnVar, Activity activity) {
        final bqaq bqaqVar = new bqaq(this);
        this.f = bqaqVar;
        this.b = bqcl.d(false, false, false);
        this.c = new bqas(activity, jaq.DAY_NIGHT_BLUE_ON_WHITE, jaq.DAY_NIGHT_GREY_ON_LIGHT_BLUE_GREY, cqtt.i(cqrt.f(2131232486), cqrp.d(36.0d), cqrp.d(36.0d)), activity.getString(R.string.MISSING_ROAD_ADD_POINT_BUTTON_CONTENT_DESCRIPTION), cjtd.a(dtya.cy), new Runnable(bqaqVar) { // from class: bqan
            private final bqar a;

            {
                this.a = bqaqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
        this.d = new bqas(activity, jaq.DAY_NIGHT_BLUE_ON_WHITE, jaq.DAY_NIGHT_GREY_ON_LIGHT_BLUE_GREY, cqtt.i(cqrt.f(2131232875), cqrp.d(36.0d), cqrp.d(36.0d)), activity.getString(R.string.MISSING_ROAD_REMOVE_POINT_BUTTON_CONTENT_DESCRIPTION), cjtd.a(dtya.cE), new Runnable(bqaqVar) { // from class: bqao
            private final bqar a;

            {
                this.a = bqaqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
        this.e = new bqas(activity, jaq.DAY_NIGHT_WHITE_ON_BLUE, jaq.DAY_NIGHT_GREY_ON_LIGHT_BLUE_GREY, cqrt.f(2131232637), activity.getString(R.string.MISSING_ROAD_FINISH_ROAD_BUTTON_CONTENT_DESCRIPTION), cjtd.a(dtya.cv), new Runnable(bqaqVar) { // from class: bqap
            private final bqar a;

            {
                this.a = bqaqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        });
    }

    public void a(bqar bqarVar) {
        this.a = dbsg.i(bqarVar);
    }

    public void b(bqcl bqclVar) {
        if (this.b.equals(bqclVar)) {
            return;
        }
        this.b = bqclVar;
        this.c.c = bqclVar.a();
        this.d.c = bqclVar.b();
        this.e.c = bqclVar.c();
        this.c.g();
        this.d.g();
        this.e.g();
        cqkx.p(this);
    }

    @Override // defpackage.bqil
    /* renamed from: c */
    public bqas k() {
        return this.d;
    }

    @Override // defpackage.bqil
    /* renamed from: d */
    public bqas j() {
        return this.c;
    }

    @Override // defpackage.bqil
    /* renamed from: e */
    public bqas i() {
        return this.e;
    }

    @Override // defpackage.bqil
    public Boolean f() {
        bqas bqasVar = this.d;
        boolean z = false;
        if (bqasVar != null && bqasVar.o().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bqil
    public Boolean g() {
        bqas bqasVar = this.c;
        boolean z = false;
        if (bqasVar != null && bqasVar.o().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bqil
    public Boolean h() {
        bqas bqasVar = this.e;
        boolean z = false;
        if (bqasVar != null && bqasVar.o().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
