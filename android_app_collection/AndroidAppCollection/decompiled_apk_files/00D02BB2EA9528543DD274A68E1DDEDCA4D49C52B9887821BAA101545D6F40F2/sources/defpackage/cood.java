package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
@Deprecated
/* renamed from: cood  reason: default package */
/* loaded from: classes5.dex */
public final class cood extends cntl<cooc> implements cnom {
    public final Status b;

    public cood(DataHolder dataHolder) {
        super(dataHolder);
        Bundle bundle;
        this.b = coor.a(dataHolder.e);
        if (dataHolder == null || (bundle = dataHolder.f) == null) {
            return;
        }
        bundle.getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.cntn
    /* renamed from: e */
    public final cooc d(int i) {
        return new copu(this.a, i);
    }
}
