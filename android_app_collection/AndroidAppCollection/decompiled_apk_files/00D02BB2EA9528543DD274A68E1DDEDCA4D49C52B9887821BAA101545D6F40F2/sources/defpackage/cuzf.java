package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuzf  reason: default package */
/* loaded from: classes5.dex */
public final class cuzf implements cusr<cufj> {
    final /* synthetic */ cuzo a;

    public cuzf(cuzo cuzoVar) {
        this.a = cuzoVar;
    }

    @Override // defpackage.cusr
    public final /* bridge */ /* synthetic */ void a(cufj cufjVar) {
        cuzo cuzoVar;
        ViewT viewt;
        cufj cufjVar2 = cufjVar;
        if (this.a.J || !cufjVar2.b().a() || (viewt = (cuzoVar = this.a).a) == 0) {
            return;
        }
        if (cuzoVar.K == null) {
            cuzoVar.K = new cvfl(viewt.getContext());
            cuzo cuzoVar2 = this.a;
            cuzoVar2.L = new cuvd(cuzoVar2.K.a, cufjVar2);
            this.a.L.z();
        } else {
            cuvd cuvdVar = cuzoVar.L;
            if (cuvdVar != null) {
                cuvdVar.b = cufjVar2;
                cuvdVar.a.a(cufjVar2);
            }
        }
        cuzo cuzoVar3 = this.a;
        cuzoVar3.K.setContentText(cuzoVar3.a.getResources().getString(R.string.sending_as_format, cufjVar2.b().b()));
        cuzo cuzoVar4 = this.a;
        if (cuzoVar4.F || cuzoVar4.a.h()) {
            return;
        }
        cuzo cuzoVar5 = this.a;
        cuzoVar5.a.C(cuzoVar5.K);
    }
}
