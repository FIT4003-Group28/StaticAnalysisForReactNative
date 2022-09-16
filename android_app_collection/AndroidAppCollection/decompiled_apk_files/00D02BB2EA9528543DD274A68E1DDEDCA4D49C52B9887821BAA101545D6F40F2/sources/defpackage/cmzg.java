package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cmzg  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmzg {
    public static cmzf c() {
        return new cmvo();
    }

    public abstract ConnectionResult a();

    public abstract int b();

    public final String toString() {
        String str;
        if (b() == 2) {
            ConnectionResult a = a();
            dbsk.s(a);
            return String.format(Locale.US, "%s(%d)", a.e, Integer.valueOf(a.c));
        }
        int b = b();
        switch (b) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "LEGACY_GMSCORE_FAILURE";
                break;
            case 3:
                str = "GEARHEAD_BINDING_FAILURE";
                break;
            case 4:
                str = "GEARHEAD_BINDING_INTERRUPTED";
                break;
            case 5:
                str = "GEARHEAD_CAR_SERVICE_FAILURE";
                break;
            case 6:
                str = "GEARHEAD_BINDING_DIED";
                break;
            default:
                str = "null";
                break;
        }
        if (b == 0) {
            throw null;
        }
        return str;
    }
}
