package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjgr  reason: default package */
/* loaded from: classes3.dex */
public final class bjgr {
    public static String a(Activity activity, ilo iloVar, djag djagVar) {
        return b(activity, iloVar.n(), djagVar);
    }

    public static String b(Activity activity, String str, djag djagVar) {
        if (!djagVar.c) {
            dhze dhzeVar = djagVar.a;
            if (dhzeVar == null) {
                dhzeVar = dhze.m;
            }
            if (dhzeVar.f.isEmpty()) {
                return activity.getString(R.string.PLACE_QA_FALLBACK_USER_NAME);
            }
            dhze dhzeVar2 = djagVar.a;
            if (dhzeVar2 == null) {
                dhzeVar2 = dhze.m;
            }
            return dhzeVar2.f;
        }
        return activity.getString(R.string.PLACE_QA_OWNER_LABEL, new Object[]{str});
    }

    @dzsi
    public static djam c(djao djaoVar) {
        if ((djaoVar.a & 16) != 0) {
            djam djamVar = djaoVar.g;
            return djamVar == null ? djam.m : djamVar;
        } else if (djaoVar.c.size() <= 0) {
            return null;
        } else {
            return djaoVar.c.get(0);
        }
    }

    public static cjta d(ilo iloVar) {
        return cjtd.c(iloVar.bZ());
    }

    public static Boolean f(djag djagVar) {
        boolean z = false;
        if (!djagVar.c) {
            dhze dhzeVar = djagVar.a;
            if (dhzeVar == null) {
                dhzeVar = dhze.m;
            }
            dhzb dhzbVar = dhzeVar.b;
            if (dhzbVar == null) {
                dhzbVar = dhzb.e;
            }
            if (dhzbVar.b > 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static String g(djag djagVar) {
        if (djagVar.c) {
            return "";
        }
        dhze dhzeVar = djagVar.a;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        return dhzeVar.i;
    }

    public static CharSequence h(List<dgly> list) {
        return TextUtils.concat((CharSequence[]) dchl.k(list, bjgq.a).toArray(new CharSequence[0]));
    }

    public static jic e(djag djagVar) {
        String str;
        boolean z = djagVar.c;
        if (z) {
            str = null;
        } else {
            dhze dhzeVar = djagVar.a;
            if (dhzeVar == null) {
                dhzeVar = dhze.m;
            }
            str = dhzeVar.e;
        }
        return new jic(str, ckqc.FIFE_MERGE, true != z ? 2131232998 : 2131231770);
    }
}
