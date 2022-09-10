package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccht  reason: default package */
/* loaded from: classes4.dex */
final class ccht implements cgrd<duvx> {
    private final cchj a;
    private final cafi b;
    private final ccif c;
    private final chhr d;
    private final anhk e;

    public ccht(cchj cchjVar, cafi cafiVar, ccif ccifVar, chhr chhrVar, anhk anhkVar) {
        this.a = cchjVar;
        this.b = cafiVar;
        this.c = ccifVar;
        this.d = chhrVar;
        this.e = anhkVar;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        this.a.g();
    }

    @Override // defpackage.cgrd
    public final void b() {
        this.a.g();
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(duvx duvxVar) {
        duvx duvxVar2 = duvxVar;
        int i = duvxVar2.a;
        if ((i & 128) != 0) {
            cchj cchjVar = this.a;
            cchjVar.g.o(false);
            Toast.makeText(cchjVar.J(), (int) R.string.UNKNOWN_ERROR, 1).show();
            if (!cchjVar.bg()) {
                return;
            }
            cchjVar.A.e();
            return;
        }
        if ((i & 32) != 0) {
            this.e.f(duvxVar2.g);
        }
        this.b.s(1);
        this.a.A.f();
        if ((duvxVar2.a & 4) == 0) {
            this.c.d();
            return;
        }
        chhr chhrVar = this.d;
        djgl djglVar = duvxVar2.d;
        if (djglVar == null) {
            djglVar = djgl.g;
        }
        chhrVar.a(djglVar, dtyc.R, dtyc.S);
    }
}
