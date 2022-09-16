package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dqn  reason: default package */
/* loaded from: classes3.dex */
public final class dqn implements Iterator {
    final /* synthetic */ dqo a;
    private int b = 0;

    public dqn(dqo dqoVar) {
        this.a = dqoVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final dqz next() {
        if (this.b < this.a.c()) {
            dqo dqoVar = this.a;
            int i = this.b;
            this.b = i + 1;
            return dqoVar.e(i);
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
