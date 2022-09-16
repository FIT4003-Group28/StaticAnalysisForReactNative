package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: agmv  reason: default package */
/* loaded from: classes.dex */
public final class agmv {
    public agqf a;
    public agqh b;
    public final /* synthetic */ agmz c;
    private final List d;
    private final attl e;
    private final long f;
    private final long g;
    private final int h;

    public agmv(agmz agmzVar, agqf agqfVar, List list, attl attlVar, long j, long j2, int i) {
        this.c = agmzVar;
        attl attlVar2 = attl.UNKNOWN_FORMAT_TYPE;
        this.a = agqfVar;
        this.d = list;
        this.e = attlVar;
        this.f = j;
        this.g = j2;
        this.h = i;
    }

    public final agqf a() {
        agqf agqfVar;
        synchronized (this.c.k) {
            agqfVar = this.a;
        }
        return agqfVar;
    }

    public final agqh b() {
        agqh agqhVar;
        int i;
        agqv e;
        synchronized (this.c.k) {
            if (this.b == null) {
                agqf agqfVar = this.a;
                List list = this.d;
                attl attlVar = this.e;
                synchronized (this.c.k) {
                    i = 0;
                    for (String str : zew.L(this.c.g, this.a.a)) {
                        agmx j = this.c.j(str);
                        if (j != null && (e = j.e()) != null && e.E()) {
                            i++;
                        }
                    }
                }
                this.b = new agqh(agqfVar, list, attlVar, i, this.f, this.g, this.h);
            }
            agqhVar = this.b;
        }
        return agqhVar;
    }
}
