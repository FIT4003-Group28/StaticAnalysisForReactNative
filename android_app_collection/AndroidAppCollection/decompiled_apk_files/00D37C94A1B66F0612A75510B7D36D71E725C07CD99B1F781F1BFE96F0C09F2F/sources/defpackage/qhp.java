package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: qhp  reason: default package */
/* loaded from: classes4.dex */
public final class qhp {
    public static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static void b(List list, qdd qddVar) {
        String str = (String) qddVar.c();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }

    public static saz c(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(str);
        }
        sb.append("] ");
        return new saz(sb.toString());
    }
}
