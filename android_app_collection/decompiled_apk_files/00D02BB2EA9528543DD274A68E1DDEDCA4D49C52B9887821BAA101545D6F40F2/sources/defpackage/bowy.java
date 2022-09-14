package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bowy  reason: default package */
/* loaded from: classes3.dex */
public class bowy implements Serializable {
    public Integer b = -1;
    public final bowz a = new bowz();

    public final boolean a() {
        return this.b.intValue() != -1;
    }

    public final dqgh b() {
        if (this.b.intValue() < 0 || this.b.intValue() >= bowx.h) {
            throw new IllegalStateException();
        }
        return bowx.g[this.b.intValue()].j;
    }
}
