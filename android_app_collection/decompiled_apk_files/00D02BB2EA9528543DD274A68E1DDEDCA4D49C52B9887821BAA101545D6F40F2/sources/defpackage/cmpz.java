package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmpz  reason: default package */
/* loaded from: classes5.dex */
public final class cmpz {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map<String, Integer> b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            int length = strArr.length;
            if (i < 10) {
                b.put(strArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    public static String a(int i) {
        if (i >= 0) {
            String[] strArr = a;
            int length = strArr.length;
            if (i < 10) {
                return strArr[i];
            }
            return null;
        }
        return null;
    }
}
