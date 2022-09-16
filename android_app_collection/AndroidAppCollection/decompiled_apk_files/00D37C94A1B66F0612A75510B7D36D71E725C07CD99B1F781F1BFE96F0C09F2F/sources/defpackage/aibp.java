package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aibp  reason: default package */
/* loaded from: classes.dex */
public final class aibp {
    public final Set a = new HashSet();
    public boolean b = false;
    public aibo c;

    private static final boolean c(int i) {
        return i == 1 || i == 2;
    }

    public final void a(int i, long j) {
        b(c(i), i, j);
    }

    public final void b(boolean z, int i, long j) {
        if (z != c(i)) {
            return;
        }
        if (this.b != z) {
            this.b = z;
            aibo aiboVar = this.c;
            if (aiboVar != null) {
                aibs aibsVar = aiboVar.a;
                if (aibsVar.getParent() != null) {
                    aibsVar.getParent().requestDisallowInterceptTouchEvent(z);
                }
                aibsVar.B();
            }
        }
        for (aiby aibyVar : this.a) {
            aibyVar.nt(i, j);
        }
    }
}
