package defpackage;

import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgoh  reason: default package */
/* loaded from: classes3.dex */
public final class bgoh extends cqqw {
    final acli a = acli.a(dtxy.jt);
    int b = 0;
    boolean c = false;
    final /* synthetic */ bgoi d;

    public bgoh(bgoi bgoiVar) {
        this.d = bgoiVar;
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.c) {
            return;
        }
        int i3 = this.b + i;
        this.b = i3;
        if (Math.abs(i3) <= 50) {
            return;
        }
        cjtd a = aclj.a(this.a);
        this.d.e.P(this.d.f.f(recyclerView).d(a), a, this.b > 0 ? dead.LEFT : dead.RIGHT);
        this.c = true;
    }
}
