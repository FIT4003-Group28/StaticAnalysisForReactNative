package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axre  reason: default package */
/* loaded from: classes3.dex */
public class axre implements axrd {
    private final axqx a;
    private final Context b;
    private final axrw c;
    private final String d;

    public axre(Context context, axrw axrwVar, axqx axqxVar, String str) {
        this.b = context;
        this.c = axrwVar;
        this.a = axqxVar;
        this.d = str;
    }

    @Override // defpackage.axrd
    public CharSequence a() {
        String str = this.d;
        if (((str.hashCode() == -1888586689 && str.equals("android.permission.ACCESS_FINE_LOCATION")) ? (char) 0 : (char) 65535) != 0) {
            return null;
        }
        return this.b.getString(R.string.LOCATION_PERMISSION_DENIED_IMPACT);
    }

    @Override // defpackage.axrd
    public cqkl b() {
        this.a.aT();
        this.c.a(-1);
        return cqkl.a;
    }

    @Override // defpackage.axrd
    public cqkl c() {
        this.a.aT();
        this.c.a(-100);
        return cqkl.a;
    }
}
