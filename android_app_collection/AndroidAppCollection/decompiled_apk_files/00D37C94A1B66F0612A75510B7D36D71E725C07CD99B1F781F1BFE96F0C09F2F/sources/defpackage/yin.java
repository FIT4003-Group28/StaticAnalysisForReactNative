package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: yin  reason: default package */
/* loaded from: classes4.dex */
public final class yin implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public yin(azqb azqbVar) {
        this.a = azqbVar;
    }

    public yin(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static yin a(azqb azqbVar) {
        return new yin(azqbVar);
    }

    public static String c(Context context) {
        String A = zew.A(context);
        axzl.o(A);
        return A;
    }

    public static String d(String str) {
        return str != null ? str : "youtube";
    }

    public static yin e(azqb azqbVar) {
        return new yin(azqbVar, 1);
    }

    public final String b() {
        if (this.b == 0) {
            return c((Context) ((axov) this.a).a);
        }
        return d((String) ((axov) this.a).a);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.b == 0) {
            return b();
        }
        return b();
    }
}
