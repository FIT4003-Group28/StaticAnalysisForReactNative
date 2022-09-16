package defpackage;
/* compiled from: PG */
/* renamed from: auir  reason: default package */
/* loaded from: classes.dex */
public abstract class auir {
    public static final auir a = c().d();

    public static auiq c() {
        auic auicVar = new auic();
        auicVar.c(new auiu[0]);
        return auicVar;
    }

    public abstract dcdc<auiu> a();

    @dzsi
    public final String b(int i) {
        dcdc<auiu> a2 = a();
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        int i2 = 2;
        if (i == -2) {
            i2 = 1;
        } else if (i != -1) {
            i2 = (i == 1 || i == 2) ? 4 : 3;
        }
        int size = a2.size();
        int i3 = 0;
        while (i3 < size) {
            auiu auiuVar = a2.get(i3);
            i3++;
            if (auiuVar.b() == i2) {
                return auiuVar.a();
            }
        }
        return a2.get(0).a();
    }
}
