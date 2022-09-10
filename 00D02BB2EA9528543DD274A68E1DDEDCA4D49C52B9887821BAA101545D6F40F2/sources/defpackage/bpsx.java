package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: bpsx  reason: default package */
/* loaded from: classes4.dex */
public final class bpsx {
    public final aif<akqi, ilo> a = new aif<>();

    public final boolean a(ilo iloVar) {
        return this.a.containsKey(bpsy.i(iloVar.ai()));
    }

    public final Collection<ilo> b() {
        return this.a.values();
    }

    public final int c() {
        return this.a.j;
    }

    public final void d(ilo iloVar) {
        this.a.put(bpsy.i(iloVar.ai()), iloVar);
    }
}
