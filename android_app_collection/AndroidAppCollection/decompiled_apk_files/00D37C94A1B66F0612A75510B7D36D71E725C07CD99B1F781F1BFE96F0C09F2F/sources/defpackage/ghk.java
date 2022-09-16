package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ghk  reason: default package */
/* loaded from: classes3.dex */
public final class ghk {
    private final azqb a;
    private final azqb b;

    public ghk(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    public final ghj a(String str, long j, TimeUnit timeUnit) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
        sharedPreferences.getClass();
        snc sncVar = (snc) this.b.get();
        sncVar.getClass();
        timeUnit.getClass();
        return new ghj(sharedPreferences, sncVar, str, j, timeUnit);
    }
}
