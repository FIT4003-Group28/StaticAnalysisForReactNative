package defpackage;
/* renamed from: cwsc  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwsc implements dzsj {
    static final dzsj a = new cwsc();

    private cwsc() {
    }

    @Override // defpackage.dzsj
    public final Object a() {
        cxdr cxdrVar = new cxdr();
        cxdrVar.a = 10;
        cxdrVar.b = true;
        cxdrVar.d = new cxeb();
        cxdrVar.c = 2;
        String str = "";
        if (cxdrVar.a == null) {
            str = str.concat(" rateLimitPerSecond");
        }
        if (cxdrVar.d == null) {
            str = String.valueOf(str).concat(" dynamicSampler");
        }
        if (cxdrVar.b == null) {
            str = String.valueOf(str).concat(" recordTimerDuration");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cxds(cxdrVar.c, cxdrVar.a.intValue(), cxdrVar.d, cxdrVar.b.booleanValue());
    }
}
