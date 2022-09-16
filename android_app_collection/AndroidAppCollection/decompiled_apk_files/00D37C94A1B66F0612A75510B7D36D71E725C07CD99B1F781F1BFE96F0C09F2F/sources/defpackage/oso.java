package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oso  reason: default package */
/* loaded from: classes4.dex */
public final class oso {
    private final qqh a;
    private final String b;
    private final osm c;

    public oso(Context context, String str, osm osmVar) {
        qqh b = qqh.b(context, null);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", str, Integer.valueOf(Integer.parseInt(str))));
        } catch (NumberFormatException unused) {
            this.a = b;
            this.b = str;
            this.c = osmVar;
        }
    }

    public final void a(osk oskVar) {
        qqe a = this.a.a((byte[]) this.c.a(oskVar.c()));
        a.i = this.b;
        osl a2 = oskVar.a();
        osl oslVar = osl.DEFAULT;
        int ordinal = a2.ordinal();
        int i = 3;
        char c = ordinal != 1 ? ordinal != 2 ? (char) 0 : (char) 3 : (char) 1;
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 2;
        } else if (c != 2) {
            i = 4;
        }
        a.k = i;
        if (oskVar.b() != null) {
            a.c(oskVar.b().intValue());
        }
        a.b().g(new qtg(1));
    }
}
