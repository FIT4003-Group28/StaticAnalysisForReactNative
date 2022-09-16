package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atsf  reason: default package */
/* loaded from: classes2.dex */
final class atsf implements atsn {
    final /* synthetic */ atsh a;

    public atsf(atsh atshVar) {
        this.a = atshVar;
    }

    @Override // defpackage.atsn
    public final void a(boolean z) {
        atsh atshVar = this.a;
        View o = cqkx.o(atshVar);
        if (o != null) {
            cpv.a.f(o, atshVar.d.getString(R.string.POI_PROMPT_ADD_STOP_ACTION_WITH_NAME, atshVar.b.a()));
        }
        if (this.a.c.a()) {
            this.a.c.b().G();
            this.a.c.b().j();
        }
        dbsk.l(((crqr) this.a.e).j());
        atsh atshVar2 = this.a;
        btrm btrmVar = atshVar2.g;
        amuh amuhVar = ((crqr) atshVar2.e).e;
        dbsk.s(amuhVar);
        btrmVar.b(new crig(amuhVar));
    }
}
