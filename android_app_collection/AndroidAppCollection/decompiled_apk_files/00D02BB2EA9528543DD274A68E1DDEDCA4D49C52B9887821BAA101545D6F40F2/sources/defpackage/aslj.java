package defpackage;

import defpackage.aslj;
/* compiled from: PG */
/* renamed from: aslj  reason: default package */
/* loaded from: classes2.dex */
public final class aslj<T extends aslj<T>> extends asle<T> {
    @dzsi
    public amub e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;

    public aslj() {
        this.g = true;
        this.h = true;
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asle
    public final void b() {
        dbsk.s(this.e);
        if (this.a != asld.INSPECT_POINT_ON_ROUTE) {
            bvoo.h("CameraMode should be INSPECT_POINT_ON_ROUTE but was %s.", this.a);
            this.a = asld.INSPECT_POINT_ON_ROUTE;
        }
    }

    @Override // defpackage.asle
    /* renamed from: d */
    public final aslk a() {
        b();
        return new aslk(this);
    }

    public aslj(aslf aslfVar) {
        super(aslfVar);
        this.g = true;
        this.h = true;
        this.i = true;
        if (aslfVar instanceof aslk) {
            aslk aslkVar = (aslk) aslfVar;
            this.e = aslkVar.f;
            this.f = aslkVar.g;
            this.g = aslkVar.h;
            this.h = aslkVar.i;
            this.i = aslkVar.j;
        }
    }
}
