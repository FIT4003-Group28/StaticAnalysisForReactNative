package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: vgb  reason: default package */
/* loaded from: classes4.dex */
public final class vgb {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static int b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(vfz vfzVar) {
        if (uwp.j()) {
            a.add(vfzVar);
            int i = b;
            if (i == -1) {
                return;
            }
            vfzVar.b(i);
            return;
        }
        uwp.h(new vga(vfzVar));
    }

    public static void b() {
        uwp.f();
    }

    public static void c(int i) {
        uwp.f();
        b = i;
        for (vfz vfzVar : a) {
            vfzVar.b(i);
        }
    }
}
