package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bzbi  reason: default package */
/* loaded from: classes4.dex */
public final class bzbi {
    static final dspd a = dgmr.d(58);
    static final dspd b = dgmr.f(56);
    static final dspd c = dgmr.f(57);
    static final dspd d = dgmr.f(58);
    static final dspd e = dgmr.f(59);
    static final dspd f = dgmr.f(60);
    static final dspd g = dgmr.f(61);
    public final Application h;

    public bzbi(Application application) {
        this.h = application;
    }

    public static String a(Resources resources, bzdg bzdgVar) {
        String lowerCase;
        Object[] objArr = new Object[1];
        dpce dpceVar = bzdgVar.d().i;
        if (dpceVar == null) {
            dpceVar = dpce.f;
        }
        douj doujVar = dpceVar.d;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        String str = doujVar.e;
        if (str == null) {
            lowerCase = resources.getString(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_VEHICLE_TYPE_DEFAULT);
        } else {
            lowerCase = str.toLowerCase(Locale.getDefault());
        }
        objArr[0] = lowerCase;
        return resources.getString(R.string.TRANSIT_GUIDANCE_QUESTIONS_CROWDEDNESS_NOTIFICATION_TITLE, objArr);
    }

    public final String b(int i, Object... objArr) {
        return this.h.getResources().getString(i, objArr);
    }
}
