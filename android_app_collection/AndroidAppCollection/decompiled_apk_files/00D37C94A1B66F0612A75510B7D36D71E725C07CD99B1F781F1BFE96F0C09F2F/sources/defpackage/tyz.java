package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tyz  reason: default package */
/* loaded from: classes4.dex */
public final class tyz {
    public final tul a;
    public final twv b;
    public final vjb c;
    public final tyk d;
    public final Context e;
    public final trv f;
    public final ampq g;
    public final Executor h;
    public final tqe i;

    public tyz(Context context, tul tulVar, twv twvVar, vjb vjbVar, tyk tykVar, trv trvVar, ampq ampqVar, Executor executor, tqe tqeVar) {
        this.e = context;
        this.a = tulVar;
        this.b = twvVar;
        this.c = vjbVar;
        this.d = tykVar;
        this.f = trvVar;
        this.g = ampqVar;
        this.h = executor;
        this.i = tqeVar;
    }

    public static final String a(tqv tqvVar) {
        return tqvVar.c + "|" + tqvVar.d;
    }

    public static final Set b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set == null) {
            map.put(str, new HashSet());
            return (Set) map.get(str);
        }
        return set;
    }
}
