package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akly  reason: default package */
/* loaded from: classes.dex */
public final class akly implements awwn {
    final /* synthetic */ aklz a;

    public akly(aklz aklzVar) {
        this.a = aklzVar;
    }

    @Override // defpackage.awwn
    @dzsi
    public final awwt a() {
        egu c = this.a.c.a().c();
        if (c == null || c.d().u) {
            awws u = awwt.u();
            u.t(dcdc.f("dynamic_world_basemap"));
            u.e(awvv.e);
            return u.a();
        }
        return null;
    }

    @Override // defpackage.awwn
    public final void b(awwb awwbVar, awwp awwpVar) {
    }
}
