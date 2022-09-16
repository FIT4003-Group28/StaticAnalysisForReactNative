package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: own  reason: default package */
/* loaded from: classes4.dex */
public abstract class own extends ows {
    final int a;
    final long b;
    final List c;

    public own(owj owjVar, long j, long j2, int i, long j3, List list) {
        super(owjVar, j, j2);
        this.a = i;
        this.b = j3;
        this.c = list;
    }

    public abstract int a(long j);

    public final long b(int i) {
        long j;
        List list = this.c;
        if (list != null) {
            j = ((owq) list.get(i - this.a)).a - this.h;
        } else {
            j = (i - this.a) * this.b;
        }
        return pcx.i(j, 1000000L, this.g);
    }

    public abstract owj c(owm owmVar, int i);

    public boolean d() {
        return this.c != null;
    }
}
