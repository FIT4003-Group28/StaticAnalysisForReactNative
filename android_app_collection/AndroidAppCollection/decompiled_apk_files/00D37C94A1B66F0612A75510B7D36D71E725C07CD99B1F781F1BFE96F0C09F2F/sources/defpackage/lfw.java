package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.DigestNotificationPreference;
import com.google.android.apps.youtube.app.settings.QuietHoursNotificationPreference;
import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;
/* compiled from: PG */
/* renamed from: lfw  reason: default package */
/* loaded from: classes3.dex */
public final class lfw extends wds {
    private final lez i;
    private final lgr j;
    private final zyv k;

    public lfw(Context context, aafo aafoVar, acti actiVar, lfv lfvVar, akjm akjmVar, lez lezVar, lgr lgrVar, zyv zyvVar, wcy wcyVar, wdv wdvVar, afvn afvnVar) {
        super(context, aafoVar, actiVar, lfvVar, akjmVar, wcyVar, wdvVar, afvnVar);
        this.i = lezVar;
        this.j = lgrVar;
        this.k = zyvVar;
    }

    @Override // defpackage.wds, defpackage.akjl
    public final Preference a(auri auriVar, String str) {
        Spanned b;
        Spanned b2;
        aurg aurgVar = auriVar.e;
        if (aurgVar == null) {
            aurgVar = aurg.a;
        }
        int bf = awwc.bf(aurgVar.c);
        arag aragVar = null;
        if (bf == 0 || bf != 271) {
            int bf2 = awwc.bf(aurgVar.c);
            if (bf2 == 0 || bf2 != 274) {
                if ((auriVar.b & 1024) == 0) {
                    return super.a(auriVar, str);
                }
                zyv zyvVar = this.k;
                arct arctVar = auriVar.n;
                if (arctVar == null) {
                    arctVar = arct.a;
                }
                arct arctVar2 = arctVar;
                Activity activity = (Activity) zyvVar.a.get();
                activity.getClass();
                aafo aafoVar = (aafo) zyvVar.b.get();
                aafoVar.getClass();
                ajmy ajmyVar = (ajmy) zyvVar.c.get();
                ajmyVar.getClass();
                aagi aagiVar = (aagi) zyvVar.d.get();
                aagiVar.getClass();
                arctVar2.getClass();
                ThirdPartyAccountPreference thirdPartyAccountPreference = new ThirdPartyAccountPreference(activity, aafoVar, ajmyVar, aagiVar, arctVar2);
                thirdPartyAccountPreference.Z();
                return thirdPartyAccountPreference;
            }
            lgr lgrVar = this.j;
            Context context = (Context) lgrVar.a.get();
            context.getClass();
            lkt lktVar = (lkt) lgrVar.b.get();
            lktVar.getClass();
            acth acthVar = (acth) lgrVar.c.get();
            acthVar.getClass();
            aurgVar.getClass();
            QuietHoursNotificationPreference quietHoursNotificationPreference = new QuietHoursNotificationPreference(context, lktVar, acthVar, aurgVar);
            if ((aurgVar.b & 16) != 0) {
                arag aragVar2 = aurgVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                quietHoursNotificationPreference.M(ajgl.b(aragVar2));
            }
            if (aurgVar.g && (aurgVar.b & 4096) != 0) {
                arag aragVar3 = aurgVar.k;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                b = ajgl.b(aragVar3);
            } else if (aurgVar.f || (aurgVar.b & 2048) == 0) {
                if ((aurgVar.b & 32) != 0 && (aragVar = aurgVar.e) == null) {
                    aragVar = arag.a;
                }
                b = ajgl.b(aragVar);
            } else {
                arag aragVar4 = aurgVar.j;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
                b = ajgl.b(aragVar4);
            }
            quietHoursNotificationPreference.n(b);
            quietHoursNotificationPreference.Z();
            return quietHoursNotificationPreference;
        }
        lez lezVar = this.i;
        Context context2 = (Context) lezVar.a.get();
        context2.getClass();
        lkn lknVar = (lkn) lezVar.b.get();
        lknVar.getClass();
        acth acthVar2 = (acth) lezVar.c.get();
        acthVar2.getClass();
        aurgVar.getClass();
        DigestNotificationPreference digestNotificationPreference = new DigestNotificationPreference(context2, lknVar, acthVar2, aurgVar);
        if ((aurgVar.b & 16) != 0) {
            arag aragVar5 = aurgVar.d;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            digestNotificationPreference.M(ajgl.b(aragVar5));
        }
        if (aurgVar.g && (aurgVar.b & 4096) != 0) {
            arag aragVar6 = aurgVar.k;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            b2 = ajgl.b(aragVar6);
        } else if (aurgVar.f || (aurgVar.b & 2048) == 0) {
            if ((aurgVar.b & 32) != 0 && (aragVar = aurgVar.e) == null) {
                aragVar = arag.a;
            }
            b2 = ajgl.b(aragVar);
        } else {
            arag aragVar7 = aurgVar.j;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            b2 = ajgl.b(aragVar7);
        }
        digestNotificationPreference.n(b2);
        digestNotificationPreference.Z();
        return digestNotificationPreference;
    }
}
