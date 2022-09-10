package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpzh  reason: default package */
/* loaded from: classes4.dex */
public class bpzh extends ivw {
    final /* synthetic */ bpzj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpzh(bpzj bpzjVar) {
        super(bpzjVar.c, ivu.FIXED, jaq.DAY_NIGHT_WHITE_ON_BLUE, cqrt.f(2131231580), bpzjVar.c.getString(R.string.MISSING_ROAD_ADD_POINT_BUTTON_CONTENT_DESCRIPTION), cjtd.a(dtya.cy), true, 0);
        this.c = bpzjVar;
    }

    @Override // defpackage.ivw
    protected final boolean NE() {
        return false;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        bpzj bpzjVar = this.c;
        if (bpzjVar.h) {
            if (bpzjVar.a.f().size() >= 100) {
                cztq a = cztt.a(bpzjVar.f);
                a.d(cztr.LONG);
                a.e(R.string.MISSING_ROAD_POLYLINE_MAX_POINTS_REACHED, new Object[0]);
                a.c();
            } else {
                akqq b = this.c.g.b();
                if (b != null) {
                    this.c.a.g(bqhj.e(b));
                    this.c.g.d();
                    bpzj bpzjVar2 = this.c;
                    bpzjVar2.h = false;
                    bpzjVar2.m();
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean o() {
        return Boolean.valueOf(this.c.h);
    }
}
