package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;
/* compiled from: PG */
/* renamed from: apnw  reason: default package */
/* loaded from: classes2.dex */
final class apnw implements clof {
    final /* synthetic */ apnx a;

    public apnw(apnx apnxVar) {
        this.a = apnxVar;
    }

    @Override // defpackage.clof
    public final void RK(clpb clpbVar, int i) {
        cloe.a(this, clpbVar);
    }

    @Override // defpackage.clof
    public final void RL(clno clnoVar, int i) {
    }

    @Override // defpackage.clof
    public final void RM(TrackGroupArray trackGroupArray, cmjn cmjnVar) {
    }

    @Override // defpackage.clof
    public final void RN(List list) {
    }

    @Override // defpackage.clof
    public final void RO(boolean z, int i) {
        boolean z2 = true;
        if (i == 1) {
            ckos.a(this.a.a.findViewById(16908290), this.a.a.getString(R.string.MERCHANT_PANEL_ERROR_MESSAGE_SNACKBAR), 0).c();
            this.a.j(false);
        }
        apnx apnxVar = this.a;
        if (!apnxVar.c) {
            apnxVar.d = z && i != 4;
            apnxVar.h = z && i == 3;
            apnxVar.g = z && i == 2;
        }
        if (i != 2 && i != 3) {
            z2 = false;
        }
        apnxVar.b = z2;
        cqkx.p(this.a);
    }

    @Override // defpackage.clof
    public final void f(boolean z) {
    }

    @Override // defpackage.clof
    public final void g(int i) {
    }

    @Override // defpackage.clof
    public final void h(boolean z, int i) {
    }

    @Override // defpackage.clof
    public final void i(int i) {
    }

    @Override // defpackage.clof
    public final void j(boolean z) {
    }

    @Override // defpackage.clof
    public final void k(cllz cllzVar) {
    }

    @Override // defpackage.clof
    public final void l(int i) {
    }

    @Override // defpackage.clof
    public final void m(clod clodVar) {
    }

    @Override // defpackage.clof
    public final void n() {
    }

    @Override // defpackage.clof
    public final void o() {
    }

    @Override // defpackage.clof
    public final void p() {
    }

    @Override // defpackage.clof
    public final void q() {
    }
}
