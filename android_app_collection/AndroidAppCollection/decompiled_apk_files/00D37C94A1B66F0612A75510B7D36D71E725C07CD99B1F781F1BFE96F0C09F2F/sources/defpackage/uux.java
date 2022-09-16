package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: uux  reason: default package */
/* loaded from: classes4.dex */
final class uux {
    private static final amzy b = amzy.l("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer");
    private static final amqf c = amqf.b('/');
    private static final Pattern d = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List h = c.h(str);
        if (h.size() != 3) {
            ((amzw) ((amzw) b.c()).i("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 55, "HashingNameSanitizer.java")).s("malformed sync name: %s", str);
            return "MALFORMED";
        }
        return (String) h.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.azzi b(defpackage.uuw r17, defpackage.azzi r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uux.b(uuw, azzi):azzi");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final azzi c(azzi azziVar) {
        azzd azzdVar = azziVar.e;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        if ((azzdVar.b & 1) != 0) {
            azzd azzdVar2 = azziVar.e;
            if (azzdVar2 == null) {
                azzdVar2 = azzd.a;
            }
            aopa mo52toBuilder = azzdVar2.mo52toBuilder();
            Long l = (Long) this.a.get(Long.valueOf(((azzd) mo52toBuilder.instance).c));
            l.getClass();
            aopa mo52toBuilder2 = azziVar.mo52toBuilder();
            long longValue = l.longValue();
            mo52toBuilder.copyOnWrite();
            azzd azzdVar3 = (azzd) mo52toBuilder.instance;
            azzdVar3.b |= 1;
            azzdVar3.c = longValue;
            mo52toBuilder2.copyOnWrite();
            azzi azziVar2 = (azzi) mo52toBuilder2.instance;
            azzd azzdVar4 = (azzd) mo52toBuilder.mo39build();
            azzdVar4.getClass();
            azziVar2.e = azzdVar4;
            azziVar2.b |= 4;
            return (azzi) mo52toBuilder2.mo39build();
        }
        return azziVar;
    }
}
