package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aloj  reason: default package */
/* loaded from: classes.dex */
public final class aloj {
    final WeakReference a;
    int b;
    boolean c;

    public aloj(int i, alnw alnwVar) {
        this.a = new WeakReference(alnwVar);
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(alnw alnwVar) {
        return alnwVar != null && this.a.get() == alnwVar;
    }
}
