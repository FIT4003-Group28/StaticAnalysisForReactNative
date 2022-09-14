package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btxl  reason: default package */
/* loaded from: classes4.dex */
public final class btxl implements btzi<dunb, dund> {
    final /* synthetic */ ckcq a;
    final /* synthetic */ Locale b;
    final /* synthetic */ btwm c;
    final /* synthetic */ btzi d;
    final /* synthetic */ btxm e;

    public btxl(btxm btxmVar, ckcq ckcqVar, Locale locale, btwm btwmVar, btzi btziVar) {
        this.e = btxmVar;
        this.a = ckcqVar;
        this.b = locale;
        this.c = btwmVar;
        this.d = btziVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dunb> btzrVar, btzy btzyVar) {
        this.a.b();
        ((ckco) this.e.e.a().a(ckfn.j)).a(btzyVar.d().y);
        btzi btziVar = this.d;
        if (btziVar != null) {
            btziVar.QY(btzrVar, btzyVar);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dunb> btzrVar, dund dundVar) {
        dund dundVar2 = dundVar;
        this.a.b();
        ((ckco) this.e.e.a().a(ckfn.j)).a(ckjk.SUCCESS.y);
        ((ckco) this.e.e.a().a(ckfn.l)).a(!this.c.h(this.b, this.e.b.b(), dundVar2));
        btzi btziVar = this.d;
        if (btziVar != null) {
            btziVar.QZ(btzrVar, dundVar2);
        }
    }
}
