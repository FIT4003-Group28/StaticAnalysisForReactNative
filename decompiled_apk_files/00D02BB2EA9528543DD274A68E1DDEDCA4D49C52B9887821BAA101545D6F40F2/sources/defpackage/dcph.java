package defpackage;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcph  reason: default package */
/* loaded from: classes.dex */
public final class dcph {
    private static final char[][] b = (char[][]) Array.newInstance(char.class, 0, 0);
    public final char[][] a;

    private dcph(char[][] cArr) {
        this.a = cArr;
    }

    public static dcph a(Map<Character, String> map) {
        char[][] cArr;
        if (map.isEmpty()) {
            cArr = b;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1];
            for (Character ch : map.keySet()) {
                char charValue = ch.charValue();
                cArr2[charValue] = map.get(Character.valueOf(charValue)).toCharArray();
            }
            cArr = cArr2;
        }
        return new dcph(cArr);
    }
}
