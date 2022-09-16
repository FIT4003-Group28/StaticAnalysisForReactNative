package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaqa  reason: default package */
/* loaded from: classes.dex */
public final class aaqa implements Runnable {
    final /* synthetic */ azqb a;
    final /* synthetic */ azqb b;
    final /* synthetic */ aaqd c;

    public aaqa(aaqd aaqdVar, azqb azqbVar, azqb azqbVar2) {
        this.c = aaqdVar;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aaqd aaqdVar;
        azqb azqbVar;
        aacu aacuVar = (aacu) this.a.get();
        aaqd aaqdVar2 = this.c;
        arhd arhdVar = null;
        String string = aaqdVar2.d.getString("com.google.android.libraries.youtube.innertube.cold_config_group", null);
        aaqdVar2.f = aaqdVar2.d.getLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", -1L);
        apyy apyyVar = TextUtils.isEmpty(string) ? null : (apyy) abgb.d(string, apyy.a.getParserForType());
        if (apyyVar == null) {
            apyyVar = apyy.a;
            aaqdVar2.f = -1L;
        }
        aaqc aaqcVar = aaqdVar2.i;
        long j = aaqdVar2.f;
        aaqcVar.c = j;
        aaqcVar.b = j;
        aaqcVar.a = aaqdVar2.d.getString("com.google.android.libraries.youtube.innertube.cold_hash_data", "");
        try {
        } catch (InterruptedException | ExecutionException e) {
            aaqd.d("SP !failsafe", e);
        }
        if (((Boolean) aacuVar.b().get()).booleanValue()) {
            aaqd aaqdVar3 = this.c;
            aaqd.j("SP resetConfigs");
            SharedPreferences.Editor putString = aaqdVar3.d.edit().putString("com.google.android.libraries.youtube.innertube.cold_config_group", null).putString("com.google.android.libraries.youtube.innertube.hot_config_group", null).putString("com.google.android.libraries.youtube.innertube.hot_hash_data", null).putString("com.google.android.libraries.youtube.innertube.cold_hash_data", null);
            aaqdVar3.j = 0;
            ywk ywkVar = aaqdVar3.e;
            if (ywkVar != null) {
                ywkVar.e(putString);
            }
            putString.apply();
            this.c.c.sh(apej.a);
            this.c.b.sh(apyy.a);
            this.c.a.c(arhd.a);
            aaqd aaqdVar4 = this.c;
            aaqdVar4.i.d = (aopi) aaqdVar4.b.Z();
            aaqd aaqdVar5 = this.c;
            aaqdVar5.h.d = (aopi) aaqdVar5.a.aJ();
            aaqdVar = this.c;
            if ((aaqdVar.j & 4) != 0 || (azqbVar = this.b) == null) {
            }
            aaqdVar.g((yni) azqbVar.get());
            return;
        }
        this.c.c.sh(aaqd.b(apyyVar));
        this.c.b.sh(apyyVar);
        aaqd aaqdVar6 = this.c;
        azpm azpmVar = aaqdVar6.a;
        String string2 = aaqdVar6.d.getString("com.google.android.libraries.youtube.innertube.hot_config_group", null);
        aaqdVar6.g = aaqdVar6.d.getLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", -1L);
        if (!TextUtils.isEmpty(string2)) {
            arhdVar = (arhd) abgb.d(string2, arhd.a.getParserForType());
        }
        if (arhdVar == null) {
            arhdVar = arhd.a;
            aaqdVar6.g = -1L;
        }
        aaqc aaqcVar2 = aaqdVar6.h;
        aaqcVar2.b = aaqdVar6.g;
        aaqcVar2.a = aaqdVar6.d.getString("com.google.android.libraries.youtube.innertube.hot_hash_data", "");
        azpmVar.c(arhdVar);
        aaqd aaqdVar42 = this.c;
        aaqdVar42.i.d = (aopi) aaqdVar42.b.Z();
        aaqd aaqdVar52 = this.c;
        aaqdVar52.h.d = (aopi) aaqdVar52.a.aJ();
        aaqdVar = this.c;
        if ((aaqdVar.j & 4) != 0) {
        }
    }
}
