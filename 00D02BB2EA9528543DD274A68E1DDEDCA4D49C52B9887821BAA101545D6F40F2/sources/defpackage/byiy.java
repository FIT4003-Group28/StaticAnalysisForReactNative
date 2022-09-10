package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byiy  reason: default package */
/* loaded from: classes4.dex */
public class byiy extends byiw {
    private final dxio<akfa> e;

    public byiy(Activity activity, dxio<ros> dxioVar, dxio<afwt> dxioVar2, dxio<akfa> dxioVar3, acyp acypVar) {
        super(activity, dxioVar, dxioVar2, acypVar);
        this.e = dxioVar3;
    }

    @Override // defpackage.qvm
    public final CharSequence Ox() {
        return this.a.getText(R.string.TRAFFIC_HUB_AS_ZERO_STATE_COMMUTE_HUB_PAGE_HEADER);
    }

    @Override // defpackage.qvm
    public cjtd Oz() {
        return cjtd.a(dtxl.bq);
    }

    @Override // defpackage.byiw
    protected final boolean b() {
        return !this.e.a().d();
    }
}
