package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: aloc  reason: default package */
/* loaded from: classes.dex */
final class aloc {
    private final SparseArray<allu> a = new SparseArray<>();
    private final SparseIntArray b = new SparseIntArray();

    private final synchronized void e(int i) {
        if (this.b.indexOfKey(i) >= 0) {
            this.a.delete(this.b.get(i));
            this.b.delete(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(dmpn dmpnVar, allu alluVar) {
        this.a.put(System.identityHashCode(dmpnVar), alluVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(dmpn dmpnVar) {
        int identityHashCode = System.identityHashCode(dmpnVar);
        e(identityHashCode);
        this.a.delete(identityHashCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized allu c(dmpn dmpnVar) {
        return this.a.get(System.identityHashCode(dmpnVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(dmpn dmpnVar, dmpn dmpnVar2) {
        int identityHashCode = System.identityHashCode(dmpnVar);
        int identityHashCode2 = System.identityHashCode(dmpnVar2);
        e(identityHashCode);
        if (this.a.indexOfKey(identityHashCode) >= 0) {
            this.a.put(identityHashCode2, this.a.get(identityHashCode));
        }
        this.b.put(identityHashCode, identityHashCode2);
    }
}
