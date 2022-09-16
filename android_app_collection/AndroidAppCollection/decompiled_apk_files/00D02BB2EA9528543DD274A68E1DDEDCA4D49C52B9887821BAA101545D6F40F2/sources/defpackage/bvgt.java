package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bvgt  reason: default package */
/* loaded from: classes4.dex */
public final class bvgt {
    public static Map<String, Map<String, String>> a(List<String> list) {
        String[] split;
        String[] split2;
        HashMap hashMap = new HashMap();
        for (String str : list) {
            for (String str2 : str.trim().split("\\s*,\\s*", -1)) {
                HashMap hashMap2 = new HashMap();
                String str3 = "";
                for (String str4 : str2.split("\\s*;\\s*", -1)) {
                    if (str4.contains("=")) {
                        String[] split3 = str4.split("\\s*=\\s*", 2);
                        if (!hashMap2.containsKey(split3[0].toLowerCase(Locale.ROOT))) {
                            hashMap2.put(split3[0].toLowerCase(Locale.ROOT), split3[1].replaceAll("^\"|\"$", ""));
                        }
                    } else if (str3.isEmpty()) {
                        str3 = str4.toLowerCase(Locale.ROOT);
                    }
                }
                if (!str3.isEmpty()) {
                    if (hashMap.containsKey(str3)) {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.putAll(hashMap2);
                        hashMap3.putAll((Map) hashMap.get(str3));
                        hashMap.put(str3, hashMap3);
                    } else {
                        hashMap.put(str3, hashMap2);
                    }
                }
            }
        }
        return hashMap;
    }
}
