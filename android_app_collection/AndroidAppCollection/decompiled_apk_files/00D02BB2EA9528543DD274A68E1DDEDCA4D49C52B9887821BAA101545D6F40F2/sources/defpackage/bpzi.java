package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpzi  reason: default package */
/* loaded from: classes4.dex */
public class bpzi extends ivw {
    final /* synthetic */ bpzj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpzi(bpzj bpzjVar) {
        super(bpzjVar.c, ivu.FIXED, jaq.DAY_NIGHT_BLUE_ON_WHITE, cqrt.f(2131232875), bpzjVar.c.getString(R.string.MISSING_ROAD_REMOVE_POINT_BUTTON_CONTENT_DESCRIPTION), cjtd.a(dtya.cE), true, 0, ivv.FULL);
        this.c = bpzjVar;
    }

    @Override // defpackage.ivw
    protected final boolean NE() {
        return false;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        if (o().booleanValue()) {
            bqgw bqgwVar = this.c.a;
            bqgwVar.h(bqgwVar.f().size() - 1);
            this.c.g.d();
            this.c.m();
        }
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        jaq jaqVar;
        if (o().booleanValue()) {
            jaqVar = jaq.DAY_NIGHT_BLUE_ON_WHITE;
        } else {
            jaqVar = jaq.DAY_NIGHT_GREY_ON_LIGHT_BLUE_GREY;
        }
        D(jaqVar);
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean o() {
        return Boolean.valueOf(!this.c.a.f().isEmpty());
    }
}
