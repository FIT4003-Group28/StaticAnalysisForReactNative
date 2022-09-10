package defpackage;

import defpackage.aslh;
/* compiled from: PG */
/* renamed from: aslh  reason: default package */
/* loaded from: classes2.dex */
public final class aslh<T extends aslh<T>> extends asle<T> {
    @dzsi
    public aslf e;
    @dzsi
    public akra f;

    public aslh() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asle
    public final void b() {
        aslf aslfVar;
        if (this.a != asld.INSPECT_POINT_ON_MAP) {
            bvoo.h("CameraMode should be INSPECT_POINT_ON_MAP but was %s.", this.a);
            this.a = asld.INSPECT_POINT_ON_MAP;
        }
        if (this.f == null) {
            bvoo.h("Target should not be null.", new Object[0]);
        }
        while (true) {
            aslfVar = this.e;
            if (!(aslfVar instanceof asli)) {
                break;
            }
            this.e = ((asli) aslfVar).g;
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
    public final asli a() {
        b();
        return new asli(this);
    }

    public aslh(aslf aslfVar) {
        super(aslfVar);
        if (aslfVar instanceof asli) {
            asli asliVar = (asli) aslfVar;
            this.e = asliVar.g;
            this.f = asliVar.f;
        }
    }
}
