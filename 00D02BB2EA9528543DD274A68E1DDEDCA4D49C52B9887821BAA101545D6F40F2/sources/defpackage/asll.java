package defpackage;

import defpackage.asll;
import java.util.List;
/* compiled from: PG */
/* renamed from: asll  reason: default package */
/* loaded from: classes2.dex */
public final class asll<T extends asll<T>> extends asle<T> {
    @dzsi
    public aslf e;
    @dzsi
    public dcdc<akra> f;
    public boolean g;
    public int h;

    public asll() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asle
    public final void b() {
        aslf aslfVar;
        if (this.a != asld.INSPECT_RESULTS_ON_MAP_WITH_LOCATION && this.a != asld.INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION) {
            bvoo.h("CameraMode should be INSPECT_RESULTS_ON_MAP_WITH(OUT)_LOCATION but was %s.", this.a);
            this.a = asld.INSPECT_RESULTS_ON_MAP_WITH_LOCATION;
        }
        if (this.f == null) {
            this.f = dcdc.e();
        }
        while (true) {
            aslfVar = this.e;
            if (!(aslfVar instanceof aslm)) {
                break;
            }
            this.e = ((aslm) aslfVar).h;
        }
        if (aslfVar == null) {
            this.e = new asle().a();
        } else if (aslfVar.a == asld.FOLLOWING || this.e.a == asld.OVERVIEW) {
        } else {
            asle asleVar = new asle(this.e);
            asleVar.a = asld.FOLLOWING;
            this.e = asleVar.a();
        }
    }

    @Override // defpackage.asle
    /* renamed from: d */
    public final aslm a() {
        b();
        return new aslm(this);
    }

    public final void e(List<akra> list) {
        this.f = dcdc.r(list);
    }

    public asll(aslf aslfVar) {
        super(aslfVar);
        if (aslfVar instanceof aslm) {
            aslm aslmVar = (aslm) aslfVar;
            this.g = aslmVar.g;
            this.e = aslmVar.h;
            this.f = aslmVar.f;
            this.h = aslmVar.i;
        }
    }
}
