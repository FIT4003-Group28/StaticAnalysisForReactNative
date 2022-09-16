package defpackage;

import java.util.Observable;
/* compiled from: PG */
/* renamed from: zah  reason: default package */
/* loaded from: classes4.dex */
public final class zah extends Observable {
    private long a = -1;
    private final snc b;

    public zah(snc sncVar) {
        this.b = sncVar;
    }

    public final long a() {
        if (this.a == -1) {
            return -1L;
        }
        return this.b.d() - this.a;
    }

    public final void b() {
        this.a = this.b.d();
        setChanged();
        notifyObservers(Long.valueOf(this.a));
    }
}
