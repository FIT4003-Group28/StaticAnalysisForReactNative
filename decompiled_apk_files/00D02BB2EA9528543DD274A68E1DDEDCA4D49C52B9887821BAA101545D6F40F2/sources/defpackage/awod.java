package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: awod  reason: default package */
/* loaded from: classes3.dex */
public final class awod {
    public static cowu a(cowu cowuVar) {
        return new awoc(cowuVar);
    }

    public static List<cowu> b(Iterable<cowu> iterable) {
        ArrayList a = dchl.a();
        for (cowu cowuVar : iterable) {
            if (cowuVar.F()) {
                a.add(a(cowuVar));
            }
        }
        return a;
    }
}
