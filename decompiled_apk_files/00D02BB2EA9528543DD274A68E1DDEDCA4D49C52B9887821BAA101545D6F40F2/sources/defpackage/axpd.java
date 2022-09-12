package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: axpd  reason: default package */
/* loaded from: classes3.dex */
public class axpd extends ibd implements axom {
    public final dzsj<gga> g;
    public final axpm h;
    public final axpy i;
    public final int j;
    public final axpb k;
    public final axgi l;
    public dcdc<axot> m;
    public boolean n;
    public boolean o;
    private final cpv p;
    private final dcdc<axpc> q;

    public axpd(dzsj<gga> dzsjVar, axpm axpmVar, axpy axpyVar, cqhn cqhnVar, cjqy cjqyVar, cpv cpvVar, axgi axgiVar, axok axokVar) {
        super(cqhnVar, cjqyVar);
        this.k = new axpb(this);
        this.g = dzsjVar;
        this.h = axpmVar;
        this.i = axpyVar;
        this.p = cpvVar;
        this.l = axgiVar;
        this.q = dcdc.g(new axpc(dzsjVar.a().getString(R.string.FOLLOWERS_LABEL), dtxy.A), new axpc(dzsjVar.a().getString(R.string.FOLLOWING_LABEL), dtxy.C));
        axgg axggVar = axgg.IDLE;
        if (axokVar.ordinal() != 1) {
            this.j = 0;
        } else {
            this.j = 1;
        }
        this.m = dcdc.e();
        this.n = true;
    }

    private final axot l(int i) {
        if (this.m.isEmpty()) {
            return null;
        }
        return this.m.get(i);
    }

    @Override // defpackage.axom
    public List<? extends iao> d() {
        return this.q;
    }

    @Override // defpackage.axom
    public List<? extends axot> e() {
        return this.m;
    }

    @Override // defpackage.axom
    public Boolean f() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.axom
    public Boolean g() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.axom
    public jam h() {
        return this.k;
    }

    @Override // defpackage.axom
    public Boolean i() {
        return Boolean.valueOf(!this.p.e(this.g.a()));
    }

    public axot j() {
        return l(0);
    }

    public axot k() {
        return l(1);
    }
}
