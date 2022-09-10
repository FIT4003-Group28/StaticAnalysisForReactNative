package defpackage;
/* compiled from: PG */
/* renamed from: bujf  reason: default package */
/* loaded from: classes4.dex */
enum bujf {
    PAINT("proto"),
    GET_PARAMETERS("params");
    
    public final String c;

    bujf(String str) {
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bujf a(dssj dssjVar) {
        if (dssjVar instanceof dmxh) {
            return PAINT;
        }
        if (dssjVar instanceof dmxd) {
            return GET_PARAMETERS;
        }
        String valueOf = String.valueOf(dssjVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("No Paint protocol RequestType for ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
