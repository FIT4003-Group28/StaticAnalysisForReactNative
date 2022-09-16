package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: ufn  reason: default package */
/* loaded from: classes4.dex */
public final class ufn implements ufk {
    @Override // defpackage.ufk
    public final anwg a(Context context) {
        anwg anwgVar;
        synchronized (anwg.a) {
            anwgVar = null;
            if (!anwg.b.containsKey("[DEFAULT]")) {
                Resources resources = context.getResources();
                String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                String a = qnm.a("google_app_id", resources, resourcePackageName);
                anwk anwkVar = TextUtils.isEmpty(a) ? null : new anwk(a, qnm.a("google_api_key", resources, resourcePackageName), qnm.a("firebase_database_url", resources, resourcePackageName), qnm.a("ga_trackingId", resources, resourcePackageName), qnm.a("gcm_defaultSenderId", resources, resourcePackageName), qnm.a("google_storage_bucket", resources, resourcePackageName), qnm.a("project_id", resources, resourcePackageName));
                if (anwkVar == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                } else {
                    anwgVar = anwg.c(context, anwkVar);
                }
            } else {
                anwgVar = anwg.b();
            }
        }
        return anwgVar;
    }

    @Override // defpackage.ufk
    public final FirebaseInstanceId b(anwg anwgVar) {
        return FirebaseInstanceId.getInstance(anwgVar);
    }

    @Override // defpackage.ufk
    public final anwg c(Context context, anwk anwkVar) {
        String str;
        try {
            return anwg.d(context, anwkVar, "CHIME_ANDROID_SDK");
        } catch (IllegalStateException unused) {
            synchronized (anwg.a) {
                anwg anwgVar = (anwg) anwg.b.get("CHIME_ANDROID_SDK");
                if (anwgVar != null) {
                    return anwgVar;
                }
                ArrayList arrayList = new ArrayList();
                synchronized (anwg.a) {
                    for (anwg anwgVar2 : anwg.b.values()) {
                        arrayList.add(anwgVar2.g());
                    }
                    Collections.sort(arrayList);
                    if (!arrayList.isEmpty()) {
                        String valueOf = String.valueOf(TextUtils.join(", ", arrayList));
                        str = valueOf.length() != 0 ? "Available app names: ".concat(valueOf) : new String("Available app names: ");
                    } else {
                        str = "";
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                }
            }
        }
    }
}
