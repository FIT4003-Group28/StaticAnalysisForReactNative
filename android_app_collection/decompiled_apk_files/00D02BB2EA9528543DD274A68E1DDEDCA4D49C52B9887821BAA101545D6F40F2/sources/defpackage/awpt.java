package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awpt  reason: default package */
/* loaded from: classes3.dex */
public final class awpt implements ilg {
    private final akqq a;
    private final String b;

    public awpt(Context context, awtn awtnVar) {
        this.a = awtnVar.c();
        this.b = context.getString(R.string.PARKING_LOCATION_DESTINATION_WAYPOINT);
    }

    @Override // defpackage.ilg
    @dzsi
    public final cjtd a() {
        return null;
    }

    @Override // defpackage.ilg
    @dzsi
    public final Intent b() {
        return null;
    }

    @Override // defpackage.ilg
    @dzsi
    public final Integer c() {
        return null;
    }

    @Override // defpackage.ilg
    public final amvh d() {
        amvg P = amvh.P();
        P.b = this.b;
        P.k = true;
        P.d = this.a;
        return P.a();
    }

    @Override // defpackage.ilg
    public final boolean e() {
        return false;
    }
}
