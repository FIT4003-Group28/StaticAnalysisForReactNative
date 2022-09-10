package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: twj  reason: default package */
/* loaded from: classes7.dex */
public class twj implements sun {
    private final suu a;
    private final boolean b;
    private final String c;
    private final String d;
    private final cqtd e;
    @dzsi
    private final cjtd f;
    private final tlv g;
    private final amve h;

    public twj(Activity activity, suu suuVar, tlv tlvVar, amve amveVar, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, boolean z) {
        String string;
        cqtd f;
        this.g = tlvVar;
        this.h = amveVar;
        this.b = z;
        this.a = suuVar;
        boolean b = suuVar.b(tlvVar, amveVar);
        if (b) {
            string = activity.getString(R.string.PERSISTENT_FOOTER_START_BUTTON);
        } else {
            string = activity.getString(R.string.NAVIGATION_FAB_LABEL_PREVIEW);
        }
        this.c = string;
        this.d = h(activity, b, amveVar, string);
        if (b) {
            f = cqrt.f(2131232359);
        } else {
            f = cqrt.f(2131231594);
        }
        this.e = f;
        ddhoVar = true != b ? ddhoVar2 : ddhoVar;
        this.f = ddhoVar == null ? null : vyb.u(amveVar, ddhoVar);
    }

    private static String h(Activity activity, boolean z, amve amveVar, String str) {
        dqvj b = vyb.b(amveVar);
        if (b == null) {
            return str;
        }
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            if (z) {
                return activity.getString(ssv.ACCESSIBILITY_START_DRIVING_NAVIGATION);
            }
            return activity.getString(ssv.ACCESSIBILITY_PREVIEW_DRIVING_NAVIGATION);
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (z) {
                    return activity.getString(ssv.ACCESSIBILITY_START_WALKING_NAVIGATION);
                }
                return activity.getString(ssv.ACCESSIBILITY_PREVIEW_WALKING_NAVIGATION);
            } else if (ordinal == 3) {
                if (z) {
                    return activity.getString(ssv.ACCESSIBILITY_START_TRANSIT_NAVIGATION);
                }
                return activity.getString(ssv.ACCESSIBILITY_PREVIEW_TRANSIT_NAVIGATION);
            } else if (ordinal == 5) {
                if (z) {
                    return activity.getString(ssv.ACCESSIBILITY_START_TWO_WHEELER_NAVIGATION);
                }
                return activity.getString(ssv.ACCESSIBILITY_PREVIEW_TWO_WHEELER_NAVIGATION);
            } else if (ordinal != 8) {
                return str;
            }
        }
        if (z) {
            return activity.getString(ssv.ACCESSIBILITY_START_CYCLING_NAVIGATION);
        }
        return activity.getString(ssv.ACCESSIBILITY_PREVIEW_CYCLING_NAVIGATION);
    }

    @Override // defpackage.sun
    public cqtd a() {
        return this.e;
    }

    @Override // defpackage.sun
    public String b() {
        return this.c;
    }

    @Override // defpackage.sun
    public String c() {
        return this.d;
    }

    @Override // defpackage.sun
    @dzsi
    public cjtd d() {
        return this.f;
    }

    @Override // defpackage.sun
    public cqkl e() {
        this.a.a(this.g, this.h);
        return cqkl.a;
    }

    @Override // defpackage.sun
    public Boolean f() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.sun
    public Boolean g() {
        return sum.b();
    }
}
