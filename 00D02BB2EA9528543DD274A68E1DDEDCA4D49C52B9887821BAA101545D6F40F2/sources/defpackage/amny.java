package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amny  reason: default package */
/* loaded from: classes.dex */
public abstract class amny {
    public abstract alxl[] a(alxo alxoVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alxl b(alxo alxoVar, int i) {
        alxl[] a = a(alxoVar);
        if (a.length > i) {
            return a[i];
        }
        return alxl.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(alxo alxoVar) {
        return a(alxoVar).length;
    }
}
