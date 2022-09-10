package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: blkt  reason: default package */
/* loaded from: classes3.dex */
public abstract class blkt extends cqqw {
    private boolean a = false;

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.a = true;
            c();
        } else if (!this.a || i != 0) {
        } else {
            this.a = false;
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (!this.a) {
            return;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        d(i2);
    }

    public void c() {
    }

    public abstract void d(int i);
}
