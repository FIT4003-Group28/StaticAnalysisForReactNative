package defpackage;

import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cqvp  reason: default package */
/* loaded from: classes.dex */
public final class cqvp implements eavh {
    public static final dcep<String> a = dcep.M(TimeZone.getAvailableIDs());
    private static final TimeZone b = TimeZone.getTimeZone("UTC");
    private static final ConcurrentHashMap<String, eaou> c = new ConcurrentHashMap<>();

    @Override // defpackage.eavh
    public final eaou a(String str) {
        if (str == null) {
            return eaou.b;
        }
        ConcurrentHashMap<String, eaou> concurrentHashMap = c;
        eaou eaouVar = concurrentHashMap.get(str);
        if (eaouVar == null) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            if (timeZone == null || timeZone.hasSameRules(b)) {
                eaouVar = eaou.b;
            } else {
                eaouVar = new cqvo(timeZone);
            }
            eaou putIfAbsent = concurrentHashMap.putIfAbsent(str, eaouVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return eaouVar;
    }

    @Override // defpackage.eavh
    public final Set<String> b() {
        return a;
    }
}
