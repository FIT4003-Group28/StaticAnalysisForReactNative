package defpackage;
/* compiled from: PG */
/* renamed from: uly  reason: default package */
/* loaded from: classes4.dex */
public final class uly extends ulv {
    public static final ampg a = new uly();

    @Override // defpackage.ulv
    public final void a(uqc uqcVar, ulw ulwVar) {
        int i = uqcVar.j;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 2;
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 != 1) {
                if (i2 != 2) {
                    String a2 = uqb.a(i);
                    StringBuilder sb = new StringBuilder(a2.length() + 20);
                    sb.append("unknown enum value: ");
                    sb.append(a2);
                    throw new IllegalArgumentException(sb.toString());
                }
                i3 = 3;
            }
            ulwVar.j = i3;
            return;
        }
        throw null;
    }
}
