package defpackage;

import java.util.concurrent.TimeUnit;
/* renamed from: cwsf  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwsf implements dzsj {
    static final dzsj a = new cwsf();

    private cwsf() {
    }

    @Override // defpackage.dzsj
    public final Object a() {
        cwyv cwyvVar = new cwyv();
        cwyvVar.c = 1;
        cwyvVar.a = Long.valueOf(TimeUnit.MINUTES.toMillis(5L) + TimeUnit.SECONDS.toMillis(20L));
        cwyvVar.c = 2;
        if (cwyvVar.b == null) {
            cwyvVar.b = dcmr.a;
        }
        String str = cwyvVar.c == 0 ? " enablement" : "";
        if (cwyvVar.a == null) {
            str = str.concat(" debugMemoryServiceThrottleMs");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwyw(cwyvVar.c, cwyvVar.a.longValue(), cwyvVar.b);
    }
}
