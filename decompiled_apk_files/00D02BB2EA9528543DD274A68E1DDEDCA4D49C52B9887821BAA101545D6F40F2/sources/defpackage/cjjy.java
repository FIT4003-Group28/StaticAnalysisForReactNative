package defpackage;
/* compiled from: PG */
/* renamed from: cjjy  reason: default package */
/* loaded from: classes4.dex */
final class cjjy extends dzvy implements dzvk<cjjr, cjiz, Integer, Integer, Integer> {
    public static final cjjy a = new cjjy();

    @Override // defpackage.dzvk
    public final /* bridge */ /* synthetic */ Integer a(cjjr cjjrVar, cjiz cjizVar, Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        dzvx.c(cjjrVar, "layout");
        dzvx.c(cjizVar, "beakAlignment");
        cjjr cjjrVar2 = cjjrVar;
        int i = (cjjrVar2.f / 2) + cjjrVar2.a;
        if (cjizVar == cjiz.RIGHT) {
            i = intValue2 - i;
        }
        return Integer.valueOf(intValue - i);
    }
}
