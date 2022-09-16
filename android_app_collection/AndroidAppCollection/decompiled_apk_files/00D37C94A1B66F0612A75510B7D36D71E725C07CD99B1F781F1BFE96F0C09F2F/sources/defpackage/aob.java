package defpackage;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aob  reason: default package */
/* loaded from: classes.dex */
public final class aob {
    public anq a;
    private final SparseArray b;

    private aob() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aob a(int i) {
        return (aob) this.b.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(anq anqVar, int i, int i2) {
        aob a = a(anqVar.a(i));
        if (a == null) {
            a = new aob(1);
            this.b.put(anqVar.a(i), a);
        }
        if (i2 > i) {
            a.b(anqVar, i + 1, i2);
        } else {
            a.a = anqVar;
        }
    }

    public aob(int i) {
        this.b = new SparseArray(i);
    }
}
