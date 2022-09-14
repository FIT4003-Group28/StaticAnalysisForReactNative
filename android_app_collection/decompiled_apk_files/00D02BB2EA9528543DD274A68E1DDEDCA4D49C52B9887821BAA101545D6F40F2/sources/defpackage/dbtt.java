package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbtt  reason: default package */
/* loaded from: classes.dex */
final class dbtt {
    private int b = -1;
    private final Map<Character, String> a = new HashMap();

    public final void a(char c, String str) {
        this.a.put(Character.valueOf(c), str);
        if (c > this.b) {
            this.b = c;
        }
    }

    public final void b() {
        int i = dbts.a;
        char[][] cArr = new char[this.b + 1];
        for (Map.Entry<Character, String> entry : this.a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
    }
}
