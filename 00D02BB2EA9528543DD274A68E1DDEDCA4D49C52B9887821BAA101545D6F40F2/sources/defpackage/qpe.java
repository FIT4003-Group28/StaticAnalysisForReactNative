package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: qpe  reason: default package */
/* loaded from: classes7.dex */
public final class qpe extends cqqw {
    private final cjqy c;
    private final cqat d;
    private long e = 0;
    public boolean a = true;
    public boolean b = false;

    public qpe(cjqy cjqyVar, cqat cqatVar) {
        this.c = cjqyVar;
        this.d = cqatVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!this.a || this.b || i2 == 0 || this.d.e() < this.e) {
            return;
        }
        this.c.m(new cjte(deaf.DRAG, i2 > 0 ? dead.DOWN : dead.UP), cjtd.a(dtyc.cu));
        this.e = this.d.e() + 500;
    }
}
