package defpackage;

import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: mqa  reason: default package */
/* loaded from: classes3.dex */
final class mqa {
    public final ViewGroup a;
    public final Deque b;
    private final mpx c;

    public mqa(ViewGroup viewGroup, mpx mpxVar) {
        this.a = viewGroup;
        mpxVar.getClass();
        this.c = mpxVar;
        this.b = new ArrayDeque();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mpy a() {
        mpy mpyVar = (mpy) this.b.pollLast();
        if (mpyVar != null && mpyVar.oN().getParent() != null) {
            this.b.offerFirst(mpyVar);
            mpyVar = null;
        }
        return mpyVar == null ? this.c.a(this.a) : mpyVar;
    }
}
