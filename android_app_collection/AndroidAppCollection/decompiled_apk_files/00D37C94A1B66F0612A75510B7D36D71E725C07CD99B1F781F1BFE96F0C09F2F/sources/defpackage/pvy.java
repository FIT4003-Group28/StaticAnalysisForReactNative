package defpackage;

import android.util.SparseBooleanArray;
/* compiled from: PG */
/* renamed from: pvy  reason: default package */
/* loaded from: classes4.dex */
public final class pvy {
    private final SparseBooleanArray a = new SparseBooleanArray();
    private boolean b;

    public final pvz a() {
        ptx.e(!this.b);
        this.b = true;
        return new pvz(this.a);
    }

    public final void b(int i) {
        ptx.e(!this.b);
        this.a.append(i, true);
    }
}
