package defpackage;

import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
/* compiled from: PG */
/* renamed from: tfs  reason: default package */
/* loaded from: classes7.dex */
public class tfs implements tfn {
    private final TripDetailsContext a;

    public tfs(TripDetailsContext tripDetailsContext) {
        this.a = tripDetailsContext;
    }

    @Override // defpackage.tfn
    public dcdc<cqix<?>> a() {
        if (this.a.d().a()) {
            return dcdc.g(cqgr.fT(new tej(), this), cqgr.fT(new tei(), this));
        }
        return dcdc.g(cqgr.fT(new teh(), this), cqgr.fT(new tel(), this));
    }

    @Override // defpackage.tfn
    public dcdc<cqix<?>> b() {
        if (this.a.d().a()) {
            return dcdc.f(cqgr.fT(new tep(), this));
        }
        return dcdc.f(cqgr.fT(new teo(), this));
    }
}
