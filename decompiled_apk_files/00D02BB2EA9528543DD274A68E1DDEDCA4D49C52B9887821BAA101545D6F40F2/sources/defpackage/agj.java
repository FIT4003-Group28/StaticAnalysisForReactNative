package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: agj  reason: default package */
/* loaded from: classes.dex */
public abstract class agj {
    public final CopyOnWriteArrayList<agc> c = new CopyOnWriteArrayList<>();
    public boolean b = false;

    public abstract void a();

    public final void b(agc agcVar) {
        this.c.add(agcVar);
    }

    public final void c(agc agcVar) {
        this.c.remove(agcVar);
    }
}
