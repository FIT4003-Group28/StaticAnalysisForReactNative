package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: adxe  reason: default package */
/* loaded from: classes.dex */
public final class adxe implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public adxe(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public adxe(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public static adxe a(azqb azqbVar, azqb azqbVar2) {
        return new adxe(azqbVar, azqbVar2);
    }

    public static afjl c(final zdu zduVar, final SharedPreferences sharedPreferences) {
        return new afjl() { // from class: adxd
            @Override // defpackage.afjl
            public final asv a(asv asvVar) {
                return new ayk(zdu.this.b(sharedPreferences).getEncoded(), asvVar);
            }
        };
    }

    public static afjl d(ampq ampqVar, afjl afjlVar) {
        return (afjl) ampqVar.e(afjlVar);
    }

    public static adxe e(azqb azqbVar, azqb azqbVar2) {
        return new adxe(azqbVar, azqbVar2, 1);
    }

    public final afjl b() {
        if (this.c == 0) {
            return c(((zdv) this.a).get(), (SharedPreferences) this.b.get());
        }
        return d((ampq) ((axov) this.b).a, ((adxe) this.a).b());
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.c == 0) {
            return b();
        }
        return b();
    }
}
