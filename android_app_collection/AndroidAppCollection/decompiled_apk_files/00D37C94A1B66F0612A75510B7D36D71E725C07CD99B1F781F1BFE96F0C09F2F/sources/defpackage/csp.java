package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: csp  reason: default package */
/* loaded from: classes3.dex */
public final class csp implements cse {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.cse
    public final void k() {
        for (ctz ctzVar : cvd.g(this.a)) {
            ctzVar.k();
        }
    }

    @Override // defpackage.cse
    public final void l() {
        for (ctz ctzVar : cvd.g(this.a)) {
            ctzVar.l();
        }
    }

    @Override // defpackage.cse
    public final void m() {
        for (ctz ctzVar : cvd.g(this.a)) {
            ctzVar.m();
        }
    }
}
