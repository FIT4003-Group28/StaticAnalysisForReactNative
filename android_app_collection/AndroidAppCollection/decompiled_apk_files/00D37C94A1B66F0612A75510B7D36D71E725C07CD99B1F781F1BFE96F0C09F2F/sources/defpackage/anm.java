package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anm  reason: default package */
/* loaded from: classes.dex */
public final class anm implements Runnable {
    private final List a;
    private final int b;

    public anm(Collection collection, int i) {
        hz.h(collection, "initCallbacks cannot be null");
        this.a = new ArrayList(collection);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.a.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((hz) this.a.get(i)).j();
                i++;
            }
            return;
        }
        while (i < size) {
            ((hz) this.a.get(i)).i();
            i++;
        }
    }
}
