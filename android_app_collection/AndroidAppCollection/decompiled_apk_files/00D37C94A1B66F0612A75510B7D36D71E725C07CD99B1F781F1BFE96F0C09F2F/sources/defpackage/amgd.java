package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
/* compiled from: PG */
/* renamed from: amgd  reason: default package */
/* loaded from: classes.dex */
public final class amgd implements axou {
    private final azqb a;

    public amgd(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static ConnectivityManager b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        axzl.o(connectivityManager);
        return connectivityManager;
    }

    public static amgd c(azqb azqbVar) {
        return new amgd(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final ConnectivityManager get() {
        return b((Context) ((axov) this.a).a);
    }
}
