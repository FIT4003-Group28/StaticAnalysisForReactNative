package defpackage;

import android.content.SharedPreferences;
import java.security.Key;
/* compiled from: PG */
/* renamed from: ahac  reason: default package */
/* loaded from: classes.dex */
public final class ahac implements ahah {
    private final snc a;
    private final zey b;
    private final aanz c;
    private final ahai d;
    private final Key e;
    private final afjm f;
    private final agpt g;
    private final agvw h;
    private final afja i;
    private final ahdf j;
    private final aejc k;
    private final ahdd l;

    public ahac(snc sncVar, zey zeyVar, aanz aanzVar, ahai ahaiVar, zdu zduVar, SharedPreferences sharedPreferences, agpt agptVar, afjm afjmVar, agvw agvwVar, afja afjaVar, ahdf ahdfVar, aejc aejcVar, ahdd ahddVar) {
        this.a = sncVar;
        this.b = zeyVar;
        this.c = aanzVar;
        this.d = ahaiVar;
        this.e = zduVar.b(sharedPreferences);
        this.f = afjmVar;
        this.h = agvwVar;
        this.g = agptVar;
        this.i = afjaVar;
        this.j = ahdfVar;
        this.k = aejcVar;
        this.l = ahddVar;
    }

    @Override // defpackage.ahah
    public final agxp a(agqz agqzVar, agxo agxoVar, agzv agzvVar, agvx agvxVar) {
        agzvVar.b(this.e);
        agzvVar.b = this.f;
        return new ahad(agxoVar, agvxVar, this.c, this.a, this.b, agqzVar, new agzt(agzvVar), new agzt(new agzv(agzvVar)), this.d, this.h, this.g, this.i, this.j, this.k, this.l);
    }
}
