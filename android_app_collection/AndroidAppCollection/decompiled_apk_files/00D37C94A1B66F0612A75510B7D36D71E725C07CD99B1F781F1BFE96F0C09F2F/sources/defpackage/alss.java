package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alss  reason: default package */
/* loaded from: classes.dex */
public final class alss extends also {
    final /* synthetic */ alsy a;

    public alss(alsy alsyVar) {
        this.a = alsyVar;
    }

    @Override // defpackage.also
    public final void a() {
        alsy alsyVar = this.a;
        if (alsyVar.l != null) {
            alsyVar.a.unbindService(alsyVar.k);
            this.a.f = false;
            alsy alsyVar2 = this.a;
            alsyVar2.l = null;
            alsyVar2.k = null;
        }
        this.a.c();
    }
}
