package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfs  reason: default package */
/* loaded from: classes7.dex */
public final class sfs implements degu<dopk> {
    final /* synthetic */ ckem a;
    final /* synthetic */ degu b;
    final /* synthetic */ sfy c;

    public sfs(sfy sfyVar, ckem ckemVar, degu deguVar) {
        this.c = sfyVar;
        this.a = ckemVar;
        this.b = deguVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        int i;
        if (th instanceof qdr) {
            ckos.b(this.c.g.findViewById(16908290), R.string.STATION_PICKER_STATION_NO_ROUTES_OR_NOT_FOUND, 0).c();
            i = 4;
        } else {
            i = th instanceof CancellationException ? 3 : 2;
        }
        ((ckco) this.c.f.a(ckeo.j)).a(ckel.a(i));
        degu deguVar = this.b;
        if (deguVar != null) {
            deguVar.a(th);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
        dopk dopkVar2 = dopkVar;
        ((ckco) this.c.f.a(ckeo.j)).a(ckel.a(1));
        if (dopkVar2 != null) {
            albv.f(this.c.e, dopkVar2);
            sfy sfyVar = this.c;
            sfyVar.a.add(0, sfyVar.A(dopkVar2, false, this.a));
            sfy sfyVar2 = this.c;
            sfyVar2.B(sfyVar2.a.get(0));
            this.c.w();
            this.c.C();
        }
        degu deguVar = this.b;
        if (deguVar != null) {
            deguVar.b(dopkVar2);
        }
    }
}
