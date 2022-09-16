package defpackage;
/* compiled from: PG */
/* renamed from: ulv  reason: default package */
/* loaded from: classes4.dex */
abstract class ulv implements ampg {
    public abstract void a(uqc uqcVar, ulw ulwVar);

    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        uqc uqcVar = (uqc) obj;
        ulw ulwVar = new ulw();
        ulwVar.c(true);
        ulwVar.b(false);
        ulwVar.a(false);
        ulwVar.j = 1;
        ulwVar.c(uqcVar.b);
        ulwVar.b = uqcVar.c;
        String str = uqcVar.a;
        if (str != null) {
            ulwVar.c = str;
            ulwVar.d = uqcVar.d;
            ulwVar.e = uqcVar.e;
            ulwVar.b(uqcVar.g);
            ulwVar.a(uqcVar.h);
            ulwVar.h = uqcVar.f;
            ulwVar.i = uqcVar.i;
            a(uqcVar, ulwVar);
            Boolean bool = ulwVar.a;
            if (bool == null || ulwVar.c == null || ulwVar.f == null || ulwVar.g == null || ulwVar.j == 0) {
                StringBuilder sb = new StringBuilder();
                if (ulwVar.a == null) {
                    sb.append(" isMetadataAvailable");
                }
                if (ulwVar.c == null) {
                    sb.append(" accountName");
                }
                if (ulwVar.f == null) {
                    sb.append(" isG1User");
                }
                if (ulwVar.g == null) {
                    sb.append(" isDasherUser");
                }
                if (ulwVar.j == 0) {
                    sb.append(" isUnicornUser");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new ulx(bool.booleanValue(), ulwVar.b, ulwVar.c, ulwVar.d, ulwVar.e, ulwVar.f.booleanValue(), ulwVar.g.booleanValue(), ulwVar.h, ulwVar.i, ulwVar.j);
        }
        throw new NullPointerException("Null accountName");
    }
}
