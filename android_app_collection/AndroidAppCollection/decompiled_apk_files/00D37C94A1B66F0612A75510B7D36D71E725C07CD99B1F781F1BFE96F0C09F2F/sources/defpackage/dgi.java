package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgi  reason: default package */
/* loaded from: classes3.dex */
public final class dgi {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public static void a(dgp dgpVar, dgp dgpVar2, String str) {
        if (dgpVar.b.remove(dgpVar2)) {
            Map map = dgpVar2.a;
            if (map != null && map.remove(str) != null) {
                return;
            }
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Tried to remove non-existent input with name: ".concat(valueOf) : new String("Tried to remove non-existent input with name: "));
        }
        throw new RuntimeException("Tried to remove non-existent input!");
    }
}
