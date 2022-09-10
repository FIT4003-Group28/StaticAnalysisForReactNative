package defpackage;

import android.text.TextUtils;
import android.widget.TimePicker;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cbpg  reason: default package */
/* loaded from: classes4.dex */
public final class cbpg extends cqiw<cbrm> {
    public static final /* synthetic */ int b = 0;
    public WeakReference<TimePicker> a;
    private final int c;
    private final int d;

    public cbpg(int i, int i2) {
        super(Integer.valueOf(i), Integer.valueOf(i2));
        this.c = i;
        this.d = i2;
    }

    private static cqmn<cbrm> e() {
        return cqmn.a(cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), ibq.r(), cqgr.aJ(17));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cbrm> a() {
        return ijc.b(cqkz.a(ibn.l()), cqgr.aR(Integer.valueOf((int) R.id.event_time_picker_dialog_view)), cqgr.cd(-1), cqgr.dr(1), cqgr.gq(cqgr.dz(cqrp.d(24.0d), cqrp.d(12.0d), cqrp.d(24.0d), cqrp.d(dcyn.a)), cqgr.eN(4), ibq.f(), cqgr.z(ibm.w()), cqgr.eU(ibm.b()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(cbpd.a)), cqgr.gr(cqgr.bw(1), cqgr.aJ(1), cqgr.bn(cbow.a), cqjv.j(cqfe.CURRENT_HOUR, Integer.valueOf(this.c)), cqjv.j(cqfe.CURRENT_MINUTE, Integer.valueOf(this.d)), cqgr.dq(cbox.a), cqgr.fD(new cbpe(this))), cqgr.gd(cqgr.dr(0), cqjv.l(cboy.a, cqgr.dz(cqrp.d(24.0d), cqrp.d(dcyn.a), cqrp.d(24.0d), cqrp.d(20.0d)), cqgr.dz(cqrp.d(24.0d), cqrp.d(20.0d), cqrp.d(24.0d), cqrp.d(20.0d))), hyb.c(e(), cqgr.eU(ibm.x()), cqgr.eL(Integer.valueOf((int) R.string.UGC_EVENTS_TIME_PICKER_CANCEL_BUTTON)), cqgr.cW(cqgr.q(cboz.a)), cqgr.aI(cbpa.a), cqgr.bI(cbpb.a)), hyb.a(e(), cqgr.eU(ibm.b()), cqgr.eL(Integer.valueOf((int) R.string.UGC_EVENTS_TIME_PICKER_DONE_BUTTON)), cqgr.cV(new cbpf(this)), cqgr.bT(cbpc.a))));
    }
}
