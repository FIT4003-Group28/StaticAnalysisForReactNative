package defpackage;

import android.net.Uri;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aaqj  reason: default package */
/* loaded from: classes.dex */
public final class aaqj {
    public final aadd a;
    public final yrl b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final afsm f;
    private final String g;
    private final String h;
    private final amqo i;
    private final boolean j;
    private final boolean k;
    private final zdz l;
    private final snc m;
    private final afvn n;
    private final boolean o;
    private final aapv p;
    private final azqb q;
    private final afvy r;
    private final boolean s;
    private final afzs t;

    public aaqj(afvy afvyVar, Set set, Set set2, Set set3, afsm afsmVar, afsn afsnVar, ampq ampqVar, amqo amqoVar, boolean z, aacz aaczVar, zdz zdzVar, snc sncVar, afvn afvnVar, aadd aaddVar, yrl yrlVar, aapv aapvVar, azqb azqbVar, afzs afzsVar) {
        this.r = afvyVar;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = afsmVar;
        this.i = amqoVar;
        this.g = afsnVar.a();
        this.h = (String) ampqVar.e("");
        this.j = z;
        atfw atfwVar = aaczVar.b().k;
        avff avffVar = (atfwVar == null ? atfw.a : atfwVar).x;
        avfd avfdVar = (avffVar == null ? avff.a : avffVar).e;
        this.k = (avfdVar == null ? avfd.a : avfdVar).j;
        this.l = zdzVar;
        this.m = sncVar;
        this.n = afvnVar;
        this.a = aaddVar;
        this.b = yrlVar;
        athd athdVar = aaczVar.b().o;
        this.o = (athdVar == null ? athd.a : athdVar).d;
        this.p = aapvVar;
        athd athdVar2 = aaczVar.b().o;
        this.s = (athdVar2 == null ? athd.a : athdVar2).f;
        this.q = azqbVar;
        this.t = afzsVar;
    }

    public final aaqk a(aaqs aaqsVar, aoqu aoquVar, afzf afzfVar, yjc yjcVar, yjb yjbVar) {
        aaqq a = aaqr.a(this.l);
        a.a = new zdt() { // from class: aaqh
            @Override // defpackage.zdt
            public final void a(Object obj) {
                Uri.Builder builder = (Uri.Builder) obj;
                athe atheVar = aaqj.this.a.a().f;
                if (atheVar == null) {
                    atheVar = athe.a;
                }
                if (atheVar.c) {
                    builder.appendQueryParameter("retry", "1");
                }
            }
        };
        return b(aaqsVar, aoquVar, afzfVar, yjcVar, yjbVar, a.a());
    }

    public final aaqk b(aaqs aaqsVar, aoqu aoquVar, afzf afzfVar, yjc yjcVar, yjb yjbVar, aaqr aaqrVar) {
        aaqsVar.getClass();
        aaqi aaqiVar = this.o ? new aaqi(this, afzfVar) : afzfVar;
        afvy afvyVar = this.r;
        Set set = this.c;
        Set set2 = this.d;
        Set set3 = this.e;
        afsm afsmVar = this.f;
        String str = this.g;
        String str2 = this.h;
        ytz ytzVar = aaqsVar.q;
        if (ytzVar == null) {
            ytzVar = (ytz) this.i.get();
        }
        aaqk aaqkVar = new aaqk(aaqsVar, aoquVar, aaqiVar, afvyVar, set, set2, set3, afsmVar, str, str2, ytzVar, this.j, this.k, this.m, this.n, this.a, this.p, this.s, this.q, yjcVar, yjbVar, this.t, aaqrVar);
        aaqkVar.h = aaqsVar.p();
        yre yreVar = aaqsVar.p;
        if (yreVar != null) {
            aaqkVar.r(yreVar);
        }
        return aaqkVar;
    }
}
