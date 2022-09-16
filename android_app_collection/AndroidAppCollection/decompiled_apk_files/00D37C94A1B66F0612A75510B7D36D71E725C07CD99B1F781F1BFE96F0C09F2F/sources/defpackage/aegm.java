package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aegm  reason: default package */
/* loaded from: classes.dex */
public final class aegm {
    public final String a;
    public final List b;
    public final long c;
    public final long d;
    public final aegn e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final Runnable g = new aegl(this);
    public final aegi h;
    private aegk i;

    public aegm(aegi aegiVar, String str, List list, long j, long j2, aegn aegnVar) {
        this.h = aegiVar;
        this.a = str;
        this.b = list;
        this.c = j;
        this.d = j2;
        this.e = aegnVar;
    }

    public final void a() {
        this.f.set(true);
        synchronized (this) {
            aegk aegkVar = this.i;
            if (aegkVar != null) {
                aegkVar.a(false);
            }
        }
    }

    public final synchronized void b(aegk aegkVar) {
        this.i = aegkVar;
    }
}
