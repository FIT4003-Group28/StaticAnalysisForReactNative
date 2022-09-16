package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
/* compiled from: PG */
/* renamed from: akml  reason: default package */
/* loaded from: classes2.dex */
public final class akml extends itb implements akge {
    private final gga a;
    private final akmh b;

    public akml(akmh akmhVar, gga ggaVar) {
        this.b = akmhVar;
        this.a = ggaVar;
    }

    @Override // defpackage.akge
    public final void a(MajorEvent majorEvent) {
        akmh akmhVar = this.b;
        String a = majorEvent.a();
        fd K = akmhVar.a.K();
        if (!(K instanceof akmg) || !((akmg) K).af.a().equals(a)) {
            gga ggaVar = akmhVar.a;
            akmg akmgVar = new akmg();
            Bundle bundle = new Bundle();
            bundle.putParcelable("dw_disruptions_major_event_parcel_key", majorEvent);
            akmgVar.B(bundle);
            ggaVar.D(akmgVar);
        }
    }

    @Override // defpackage.akge
    public final void b(MajorEvent majorEvent, dnqb dnqbVar) {
        ditt b = majorEvent.b();
        dnps bZ = dnqe.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe bK = bZ.bK();
        gga ggaVar = this.a;
        bowu bowuVar = bowu.ROAD_CLOSURE;
        Bundle bundle = new Bundle();
        bundle.putString("RAP_FLOW_KEY", bowuVar.name());
        if ((bK.a & 1) != 0) {
            dnqb b2 = dnqb.b(bK.b);
            if (b2 == null) {
                b2 = dnqb.UNKNOWN_ENTRY_POINT;
            }
            bundle.putInt("rdp_entry point_type", b2.ah);
        }
        bvrs.l(bundle, bK);
        if (b != null) {
            bvrs.l(bundle, b);
        }
        bpax bpaxVar = new bpax();
        bpaxVar.B(bundle);
        ggaVar.D(bpaxVar);
    }
}
