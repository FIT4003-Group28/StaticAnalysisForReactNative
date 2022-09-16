package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: apnf  reason: default package */
/* loaded from: classes2.dex */
public final class apnf {
    static final Map<File, cmml> a = new HashMap();

    public static synchronized cmml a(File file) {
        synchronized (apnf.class) {
            Map<File, cmml> map = a;
            if (map.containsKey(file)) {
                return map.get(file);
            }
            cmml cmmlVar = new cmml(file, new cmmj());
            map.put(file, cmmlVar);
            return cmmlVar;
        }
    }

    public static synchronized void b(File file) {
        synchronized (apnf.class) {
            cmml remove = a.remove(file);
            if (remove != null) {
                remove.i();
                bvog.m(file);
            }
        }
    }
}
