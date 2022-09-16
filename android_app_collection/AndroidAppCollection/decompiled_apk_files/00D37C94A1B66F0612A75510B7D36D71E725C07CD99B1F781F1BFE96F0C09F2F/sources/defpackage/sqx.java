package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: sqx  reason: default package */
/* loaded from: classes4.dex */
public final class sqx {
    public final spt a;
    private final sqb b;

    public sqx(Context context, sqb sqbVar) {
        Boolean bool;
        Throwable th = new Throwable();
        sps spsVar = new sps(null);
        spsVar.a();
        if (context != null) {
            spsVar.a = context;
            spsVar.c = ampq.j(th);
            spsVar.a();
            Context context2 = spsVar.a;
            if (context2 == null || (bool = spsVar.d) == null) {
                StringBuilder sb = new StringBuilder();
                if (spsVar.a == null) {
                    sb.append(" context");
                }
                if (spsVar.d == null) {
                    sb.append(" googlerOverridesCheckbox");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            this.a = new spt(context2, spsVar.b, spsVar.c, bool.booleanValue());
            this.b = sqbVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
