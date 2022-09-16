package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anab  reason: default package */
/* loaded from: classes.dex */
final class anab extends anas {
    public anab(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.anas
    public final /* bridge */ /* synthetic */ void b(Object obj, anar anarVar) {
        for (Map.Entry entry : ((andd) obj).c.d) {
            if (!((Set) entry.getValue()).isEmpty()) {
                for (Object obj2 : (Set) entry.getValue()) {
                    anarVar.a((String) entry.getKey(), obj2);
                }
            } else {
                anarVar.a((String) entry.getKey(), null);
            }
        }
    }
}
