package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: oaj  reason: default package */
/* loaded from: classes3.dex */
public final class oaj implements ajqm {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public oan c;

    @Override // defpackage.ajqm
    public final int a() {
        return this.c != null ? 1 : 0;
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        return 0L;
    }

    @Override // defpackage.ajqm
    public final Object c(int i) {
        oan oanVar = this.c;
        if (i == (oanVar != null ? 0 : -1)) {
            return oanVar;
        }
        return null;
    }

    @Override // defpackage.ajqm
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajqm
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.ajqm
    public final void lT(ajql ajqlVar) {
        this.a.add(ajqlVar);
    }

    @Override // defpackage.ajqm
    public final void mG(ajrt ajrtVar) {
    }

    @Override // defpackage.ajqm
    public final void mH(ajrs ajrsVar, int i) {
    }

    @Override // defpackage.ajqm
    public final void pl(ajql ajqlVar) {
        this.a.remove(ajqlVar);
    }
}
