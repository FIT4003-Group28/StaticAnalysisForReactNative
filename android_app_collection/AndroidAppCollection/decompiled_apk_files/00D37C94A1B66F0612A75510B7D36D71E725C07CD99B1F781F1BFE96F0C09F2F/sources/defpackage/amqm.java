package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amqm  reason: default package */
/* loaded from: classes.dex */
public final class amqm {
    final boolean[] a = new boolean[256];
    public final Set b;

    public amqm(Set set) {
        this.b = set;
        for (int i = 0; i < 256; i++) {
            this.a[i] = this.b.contains(Integer.valueOf(i));
        }
    }
}
