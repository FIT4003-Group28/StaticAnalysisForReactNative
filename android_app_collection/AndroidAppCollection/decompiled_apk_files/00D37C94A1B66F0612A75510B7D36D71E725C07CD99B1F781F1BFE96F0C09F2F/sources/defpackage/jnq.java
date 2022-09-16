package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: jnq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jnq implements Runnable {
    public final /* synthetic */ yiw a;
    public final /* synthetic */ Collection b;
    private final /* synthetic */ int c;

    public /* synthetic */ jnq(yiw yiwVar, Collection collection) {
        this.a = yiwVar;
        this.b = collection;
    }

    public /* synthetic */ jnq(yiw yiwVar, Collection collection, int i) {
        this.c = i;
        this.a = yiwVar;
        this.b = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.b(null, this.b);
        } else {
            this.a.b(null, this.b);
        }
    }
}
