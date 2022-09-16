package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bzgj  reason: default package */
/* loaded from: classes4.dex */
public final class bzgj {
    private final ArrayList<bzgi> a = new ArrayList<>();

    public final void a(bzgi bzgiVar) {
        synchronized (this) {
            this.a.add(bzgiVar);
        }
    }

    public final void b() {
        synchronized (this) {
            while (!this.a.isEmpty()) {
                ArrayList<bzgi> arrayList = this.a;
                arrayList.remove(arrayList.size() - 1).Rr();
            }
        }
    }

    public final boolean c() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.a.isEmpty();
        }
        return isEmpty;
    }

    protected final void finalize() {
        this.a.isEmpty();
        super.finalize();
    }
}
