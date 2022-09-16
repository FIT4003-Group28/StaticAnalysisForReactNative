package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zms  reason: default package */
/* loaded from: classes7.dex */
public class zms implements zck {
    final /* synthetic */ vnk a;
    final /* synthetic */ zmu b;

    public zms(zmu zmuVar, vnk vnkVar) {
        this.b = zmuVar;
        this.a = vnkVar;
    }

    @Override // defpackage.zck
    public CharSequence a() {
        return this.b.b.getString(R.string.VIEW_MORE_ROUTES);
    }

    @Override // defpackage.zck
    public cqkl b() {
        qcx a;
        zmu zmuVar = this.b;
        vnk vnkVar = this.a;
        synchronized (vnkVar) {
            dcdc<amvh> aw = vnkVar.aw();
            dbsk.l(aw.size() >= 2);
            qcw x = qcx.x();
            x.s(vnkVar.g());
            x.r(aw.get(0));
            x.u(aw.get(aw.size() - 1));
            a = x.a();
        }
        zmuVar.e.m(a);
        return cqkl.a;
    }

    @Override // defpackage.zck
    @dzsi
    public cjtd c() {
        return cjtd.a(dtxn.Z);
    }

    @Override // defpackage.zck
    public cqkl d() {
        this.a.bk(false);
        zmu zmuVar = this.b;
        zmuVar.f = null;
        cqkx.p(zmuVar);
        return cqkl.a;
    }

    @Override // defpackage.zck
    @dzsi
    public cjtd e() {
        return cjtd.a(dtxn.Y);
    }
}
