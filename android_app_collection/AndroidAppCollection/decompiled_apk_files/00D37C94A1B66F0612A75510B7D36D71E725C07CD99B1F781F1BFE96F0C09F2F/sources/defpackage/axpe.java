package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axpe  reason: default package */
/* loaded from: classes2.dex */
public final class axpe implements Iterable {
    private final HashMap b = new HashMap();
    public final ArrayList a = new ArrayList();

    public axpe(Map map) {
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] split = str2.trim().split("=");
                if (split.length == 2) {
                    this.b.put(split[0], split[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.keySet().iterator();
    }
}
