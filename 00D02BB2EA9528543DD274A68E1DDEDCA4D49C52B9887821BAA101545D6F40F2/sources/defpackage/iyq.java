package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: iyq  reason: default package */
/* loaded from: classes7.dex */
public class iyq implements jbq {
    private final btpc a;
    private boolean b = false;
    private boolean c = false;

    public iyq(btpc btpcVar) {
        this.a = btpcVar;
    }

    public void a(boolean z) {
        this.b = z;
        cqkx.p(this);
    }

    public void b(boolean z) {
        this.c = z;
        cqkx.p(this);
    }

    @Override // defpackage.jbq
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.jbq
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.jbq
    public Boolean e() {
        return Boolean.valueOf(!this.a.i());
    }

    @Override // defpackage.jbq
    public View.OnTouchListener f() {
        return iyp.a;
    }
}
