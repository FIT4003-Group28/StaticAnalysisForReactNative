package defpackage;
/* compiled from: PG */
/* renamed from: cwfo  reason: default package */
/* loaded from: classes5.dex */
public final class cwfo extends cwfi {
    public static final dbrn<cwls, cwfm> a = new cwfo();

    @Override // defpackage.cwfi
    public final void b(cwls cwlsVar, cwfl cwflVar) {
        int j = cwlsVar.j();
        int i = j - 1;
        if (j != 0) {
            int i2 = 2;
            if (i == 0) {
                i2 = 1;
            } else if (i != 1) {
                if (i != 2) {
                    String a2 = cwlr.a(j);
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 20);
                    sb.append("unknown enum value: ");
                    sb.append(a2);
                    throw new IllegalArgumentException(sb.toString());
                }
                i2 = 3;
            }
            cwflVar.c(i2);
            return;
        }
        throw null;
    }
}
