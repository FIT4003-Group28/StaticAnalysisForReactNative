package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bgg  reason: default package */
/* loaded from: classes2.dex */
public class bgg extends bgj {
    public final Object j = new Object();
    Executor k;
    bga l;
    Collection m;
    bgr n;

    public final void k(bga bgaVar, Collection collection) {
        if (bgaVar != null) {
            synchronized (this.j) {
                Executor executor = this.k;
                if (executor != null) {
                    executor.execute(new bgd(this, this.n, bgaVar, collection));
                } else {
                    this.l = bgaVar;
                    this.m = new ArrayList(collection);
                }
            }
            return;
        }
        throw new NullPointerException("groupRoute must not be null");
    }
}
