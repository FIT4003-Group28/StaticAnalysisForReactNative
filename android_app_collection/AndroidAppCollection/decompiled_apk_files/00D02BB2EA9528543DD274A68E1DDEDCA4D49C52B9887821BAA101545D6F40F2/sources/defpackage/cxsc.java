package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cxsc  reason: default package */
/* loaded from: classes5.dex */
public final class cxsc implements cxre {
    public static final String[] a;
    public static final String b = String.format("(mimetype='%s' OR mimetype='%s')", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2");
    public static final String c = String.format("(mimetype='%s')", "vnd.android.cursor.item/email_v2");
    public static final Map<String, Integer> d;
    public final Context e;
    public final dehp f;
    public final cybo g;
    public final List<cxrd> h = new ArrayList();
    public final PeopleKitConfig i;
    public final boolean j;
    public int k;

    static {
        String[] strArr = {"_id", "data1", "mimetype", "display_name", "sort_key", "photo_thumb_uri", "contact_id", "starred", "data4", "display_name_source"};
        a = strArr;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
            hashMap.put(strArr[i], Integer.valueOf(i));
        }
        d = hashMap;
    }

    public cxsc(Context context, ExecutorService executorService, cybo cyboVar, PeopleKitConfig peopleKitConfig, boolean z) {
        this.e = context;
        this.f = dehx.c(executorService);
        this.g = cyboVar;
        this.i = peopleKitConfig;
        this.j = z;
    }

    public static String b(Cursor cursor, String str) {
        return cursor.getString(d.get(str).intValue());
    }

    @Override // defpackage.cxre
    public final void a(cxrd cxrdVar) {
        this.h.add(cxrdVar);
    }
}
