package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: oed  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oed implements ayqb {
    public final /* synthetic */ oeg a;
    private final /* synthetic */ int b;

    public /* synthetic */ oed(oeg oegVar) {
        this.a = oegVar;
    }

    public /* synthetic */ oed(oeg oegVar, int i) {
        this.b = i;
        this.a = oegVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        boolean z = true;
        if (this.b == 0) {
            oeg oegVar = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            oef oefVar = (oef) oegVar.a.get(8);
            if (!oefVar.a || oefVar.b.c != 2) {
                return;
            }
            if (booleanValue) {
                oegVar.i(oegVar.f, true, null);
                return;
            } else {
                oegVar.i(oegVar.f, false, null);
                return;
            }
        }
        oeg oegVar2 = this.a;
        if (((nqq) obj) != nqq.PORTRAIT_WATCH_PANEL) {
            z = false;
        }
        oef oefVar2 = (oef) oegVar2.a.get(8);
        oefVar2.a = z;
        aypg aypgVar = oegVar2.e;
        if (aypgVar != null && !aypgVar.e()) {
            azof.f((AtomicReference) oegVar2.e);
        }
        if (!z) {
            oefVar2.b.j(oegVar2.b);
            return;
        }
        if (oefVar2.b.e()) {
            oegVar2.h(8);
        } else {
            oegVar2.e(8);
        }
        oegVar2.j(oegVar2.d);
    }
}
