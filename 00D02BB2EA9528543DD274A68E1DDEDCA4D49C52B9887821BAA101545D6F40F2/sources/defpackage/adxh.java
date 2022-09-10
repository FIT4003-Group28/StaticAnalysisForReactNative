package defpackage;
/* compiled from: PG */
/* renamed from: adxh  reason: default package */
/* loaded from: classes2.dex */
public final class adxh {
    private final dzsj<adxf> a;
    private final dzsj<ahds> b;

    public adxh(dzsj<adxf> dzsjVar, dzsj<ahds> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final adxg a(absg absgVar, dspd dspdVar, dlcx dlcxVar, dlbw dlbwVar, cjtd cjtdVar) {
        adxf a = this.a.a();
        b(a, 1);
        ahds a2 = this.b.a();
        b(a2, 2);
        b(absgVar, 3);
        b(dspdVar, 4);
        b(dlcxVar, 5);
        b(dlbwVar, 6);
        b(cjtdVar, 7);
        return new adxg(a, a2, absgVar, dspdVar, dlcxVar, dlbwVar, cjtdVar);
    }
}
