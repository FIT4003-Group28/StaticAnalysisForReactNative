package defpackage;

import android.util.LongSparseArray;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avhd  reason: default package */
/* loaded from: classes2.dex */
public final class avhd {
    private final LongSparseArray<avii> a = new LongSparseArray<>();
    private final Executor b;

    public avhd(Executor executor) {
        this.b = executor;
    }

    public final synchronized void a(long j, avii aviiVar) {
        this.a.put(j, aviiVar);
    }

    public final synchronized void b() {
        for (int i = 0; i < this.a.size(); i++) {
            final avii valueAt = this.a.valueAt(i);
            this.b.execute(new Runnable(valueAt) { // from class: avha
                private final avii a;

                {
                    this.a = valueAt;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
        }
        this.a.clear();
    }

    public final synchronized void c(long j, final avih avihVar) {
        int indexOfKey = this.a.indexOfKey(j);
        if (indexOfKey >= 0) {
            final avii valueAt = this.a.valueAt(indexOfKey);
            this.a.removeAt(indexOfKey);
            this.b.execute(new Runnable(valueAt, avihVar) { // from class: avhb
                private final avii a;
                private final avih b;

                {
                    this.a = valueAt;
                    this.b = avihVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b);
                }
            });
        }
    }

    public final synchronized void d() {
        for (int i = 0; i < this.a.size(); i++) {
            final avii valueAt = this.a.valueAt(i);
            this.b.execute(new Runnable(valueAt) { // from class: avhc
                private final avii a;

                {
                    this.a = valueAt;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        }
        this.a.clear();
    }
}
