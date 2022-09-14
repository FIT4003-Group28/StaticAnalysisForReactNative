package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: dxeq  reason: default package */
/* loaded from: classes6.dex */
final class dxeq {
    HashMap<String, String> a = new HashMap<>();

    public dxeq(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.a.put(split[0], split[1]);
            }
        }
    }

    public final String a(String str) {
        return this.a.get(str);
    }
}
