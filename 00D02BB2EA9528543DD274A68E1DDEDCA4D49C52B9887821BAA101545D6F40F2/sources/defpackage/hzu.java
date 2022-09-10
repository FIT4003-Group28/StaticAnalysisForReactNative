package defpackage;
/* compiled from: PG */
/* renamed from: hzu  reason: default package */
/* loaded from: classes6.dex */
public final class hzu {
    public static void a(dagg daggVar, int i, int i2) {
        while (i2 >= i) {
            cqkf<?> a = cqke.a(daggVar.j(i2).e);
            if (a != null) {
                a.i();
            }
            dagb dagbVar = daggVar.b;
            int i3 = dagbVar != null ? dagbVar.d : 0;
            daggVar.n(i2);
            dagb remove = daggVar.a.remove(i2);
            if (remove != null) {
                remove.c();
                daggVar.r(remove);
            }
            int size = daggVar.a.size();
            for (int i4 = i2; i4 < size; i4++) {
                daggVar.a.get(i4).d = i4;
            }
            if (i3 == i2) {
                daggVar.o(daggVar.a.isEmpty() ? null : daggVar.a.get(Math.max(0, i2 - 1)));
            }
            i2--;
        }
    }
}
