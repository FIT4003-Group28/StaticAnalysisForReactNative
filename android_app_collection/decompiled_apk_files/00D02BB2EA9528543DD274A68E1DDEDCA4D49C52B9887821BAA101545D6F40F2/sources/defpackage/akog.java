package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: akog  reason: default package */
/* loaded from: classes2.dex */
class akog implements akod {
    private final String a;
    private final String b;

    @Override // defpackage.akod
    public String a() {
        return this.a;
    }

    @Override // defpackage.akod
    public String b() {
        return this.b;
    }

    public akog(Activity activity, diut diutVar) {
        String string;
        this.a = diutVar.b;
        int i = diutVar.a;
        int i2 = i & 4;
        if (i2 != 0 && (i & 8) != 0) {
            string = activity.getResources().getString(R.string.ROAD_CLOSURE_TO_AND_FROM_EXTENT, diutVar.c, diutVar.d);
        } else if (i2 == 0 || (i & 8) != 0) {
            string = (i2 == 0 && (i & 8) != 0) ? activity.getResources().getString(R.string.ROAD_CLOSURE_TO_EXTENT, diutVar.d) : "";
        } else {
            string = activity.getResources().getString(R.string.ROAD_CLOSURE_FROM_EXTENT, diutVar.c);
        }
        this.b = string;
    }
}
