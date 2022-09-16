package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agfo  reason: default package */
/* loaded from: classes.dex */
public final class agfo implements agfh {
    public final asky a;
    public final String b;
    public final Set c;
    public final Executor d;
    public final agfn e;
    public agfj f;
    public String g;
    public int h;
    private final agfk i;
    private final int j;

    public agfo(agfk agfkVar, Executor executor, String str, asky askyVar, agfn agfnVar, int i) {
        this.g = str;
        this.a = askyVar;
        aqxo.y((askyVar.b & 4) != 0);
        String str2 = askyVar.e;
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("/topics/")) {
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/");
        }
        str2.getClass();
        this.b = str2;
        this.e = agfnVar;
        this.c = new HashSet();
        this.h = 4;
        this.d = executor;
        this.i = agfkVar;
        this.j = i;
    }

    private final agfj c(int i) {
        askx askxVar;
        agfk agfkVar = this.i;
        String str = this.g;
        String str2 = this.b;
        asky askyVar = this.a;
        if ((askyVar.b & 32) != 0) {
            askxVar = askyVar.f;
            if (askxVar == null) {
                askxVar = askx.a;
            }
        } else {
            askxVar = null;
        }
        askx askxVar2 = askxVar;
        int i2 = this.j;
        azqb azqbVar = agfkVar.a;
        yjs yjsVar = (yjs) agfkVar.b.get();
        yjsVar.getClass();
        yrj yrjVar = (yrj) agfkVar.c.get();
        yrjVar.getClass();
        yni yniVar = (yni) agfkVar.d.get();
        yniVar.getClass();
        Executor executor = (Executor) agfkVar.e.get();
        executor.getClass();
        aadd aaddVar = (aadd) agfkVar.f.get();
        aaddVar.getClass();
        agff agffVar = (agff) agfkVar.g.get();
        agffVar.getClass();
        azqb azqbVar2 = agfkVar.h;
        str.getClass();
        return new agfj(azqbVar, yjsVar, yrjVar, yniVar, executor, aaddVar, agffVar, azqbVar2, this, str, str2, i, askxVar2, i2);
    }

    public final void a() {
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        this.h = 1;
        agfj c = c(1);
        this.f = c;
        c.g();
    }

    public final void b() {
        this.h = 3;
        agfj c = c(2);
        this.f = c;
        c.g();
    }
}
