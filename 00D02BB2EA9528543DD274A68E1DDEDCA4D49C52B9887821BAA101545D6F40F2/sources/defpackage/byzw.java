package defpackage;

import android.app.Service;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byzw  reason: default package */
/* loaded from: classes4.dex */
public final class byzw extends bzal {
    public byzw(vyl vylVar, Service service, vtn vtnVar, ckoq ckoqVar, btvo btvoVar) {
        super(vylVar, service, vtnVar, btvoVar);
    }

    @Override // defpackage.bzal
    protected final String b(String str) {
        return f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_GET_OFF, str);
    }

    @Override // defpackage.byzq
    protected final boolean h() {
        return true;
    }
}
