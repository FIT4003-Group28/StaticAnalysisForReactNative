package defpackage;
/* renamed from: cwrw  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwrw implements dzsj {
    static final dzsj a = new cwrw();

    private cwrw() {
    }

    @Override // defpackage.dzsj
    public final Object a() {
        cwrf cwrfVar = new cwrf();
        cwww cwwwVar = new cwww();
        cwwwVar.a = 2097152;
        cwwwVar.b = 30000;
        cwwwVar.c = 5000;
        cwwwVar.d = 1000;
        cwwwVar.e = Double.valueOf(5.0d);
        cwwwVar.f = 2;
        String str = "";
        String concat = cwwwVar.a == null ? str.concat(" maxBufferSizeBytes") : str;
        if (cwwwVar.b == null) {
            concat = String.valueOf(concat).concat(" sampleDurationMs");
        }
        if (cwwwVar.c == null) {
            concat = String.valueOf(concat).concat(" sampleDurationSkewMs");
        }
        if (cwwwVar.d == null) {
            concat = String.valueOf(concat).concat(" sampleFrequencyMicro");
        }
        if (cwwwVar.e == null) {
            concat = String.valueOf(concat).concat(" samplesPerEpoch");
        }
        if (!concat.isEmpty()) {
            String valueOf = String.valueOf(concat);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        cwrfVar.a = new cwwx(cwwwVar.f, cwwwVar.a.intValue(), cwwwVar.b.intValue(), cwwwVar.c.intValue(), cwwwVar.d.intValue(), cwwwVar.e.doubleValue());
        if (cwrfVar.a == null) {
            str = " profilingConfigurations";
        }
        if (str.isEmpty()) {
            return new cwrg(cwrfVar.a, cwrfVar.b, cwrfVar.c, cwrfVar.d);
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }
}
