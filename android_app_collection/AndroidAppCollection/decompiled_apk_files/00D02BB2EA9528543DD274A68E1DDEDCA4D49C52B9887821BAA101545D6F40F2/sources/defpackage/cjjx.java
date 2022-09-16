package defpackage;
/* compiled from: PG */
/* renamed from: cjjx  reason: default package */
/* loaded from: classes4.dex */
final class cjjx extends dzvy implements dzvk<cjjr, cjiz, Integer, Integer, Integer> {
    public static final cjjx a = new cjjx();

    @Override // defpackage.dzvk
    public final /* bridge */ /* synthetic */ Integer a(cjjr cjjrVar, cjiz cjizVar, Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        dzvx.c(cjjrVar, "<anonymous parameter 0>");
        dzvx.c(cjizVar, "<anonymous parameter 1>");
        return Integer.valueOf(intValue - (intValue2 / 2));
    }
}
