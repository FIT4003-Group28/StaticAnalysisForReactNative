package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: aaau  reason: default package */
/* loaded from: classes.dex */
public final class aaau {
    public final SharedPreferences a;
    public final snc b;
    public final azqb c;
    public final ywk d;
    public final Context e;
    private final amqo f = aqxo.i(new aaat(this));
    private final amqo g = aqxo.i(new aaat(this, 2));
    private final amqo h = aqxo.i(new aaat(this, 1));

    public aaau(SharedPreferences sharedPreferences, snc sncVar, azqb azqbVar, ywk ywkVar, Context context) {
        this.a = sharedPreferences;
        this.b = sncVar;
        this.c = azqbVar;
        this.d = ywkVar;
        this.e = context;
    }

    public final aadd a() {
        return (aadd) this.g.get();
    }

    public final aaqd b() {
        return (aaqd) this.f.get();
    }

    public final aacz c() {
        return (aacz) this.h.get();
    }
}
