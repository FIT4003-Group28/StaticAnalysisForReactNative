package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: znc  reason: default package */
/* loaded from: classes7.dex */
public final class znc implements jng {
    final /* synthetic */ znd a;

    public znc(znd zndVar) {
        this.a = zndVar;
    }

    @Override // defpackage.jng
    public final void c(int i, jni jniVar, @dzsi cjql cjqlVar) {
        if (!((ges) this.a.a).aD) {
            return;
        }
        if (jniVar == jni.USER_SWIPE && cjqlVar != null) {
            this.a.c.n(cjqlVar, new cjte(deaf.SWIPE), cjtd.a(dtxw.e));
        }
        znd zndVar = this.a;
        if (zndVar.e == i) {
            return;
        }
        dbsk.z(i, zndVar.b.h());
        zndVar.e = i;
        this.a.d.run();
    }
}
