package defpackage;

import android.content.SharedPreferences;
import java.security.Key;
/* compiled from: PG */
/* renamed from: agzy  reason: default package */
/* loaded from: classes.dex */
public final class agzy implements ahah {
    private final snc a;
    private final zey b;
    private final ahai c;
    private final Key d;
    private final afjm e;
    private final agvw f;

    public agzy(snc sncVar, zey zeyVar, ahai ahaiVar, zdu zduVar, SharedPreferences sharedPreferences, afjm afjmVar, agvw agvwVar) {
        this.a = sncVar;
        this.b = zeyVar;
        this.c = ahaiVar;
        this.d = zduVar.b(sharedPreferences);
        this.e = afjmVar;
        this.f = agvwVar;
    }

    @Override // defpackage.ahah
    public final agxp a(agqz agqzVar, agxo agxoVar, agzv agzvVar, agvx agvxVar) {
        agzvVar.b(this.d);
        agzvVar.b = this.e;
        return new agzs(agxoVar, this.a, this.b, agqzVar, agzvVar, this.c, agvxVar, this.f);
    }
}
