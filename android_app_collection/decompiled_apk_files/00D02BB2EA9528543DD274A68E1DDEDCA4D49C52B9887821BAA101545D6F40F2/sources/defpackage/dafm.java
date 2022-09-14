package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dafm  reason: default package */
/* loaded from: classes5.dex */
public final class dafm {
    final WeakReference<daew> a;
    int b;
    boolean c;

    public dafm(int i, daew daewVar) {
        this.a = new WeakReference<>(daewVar);
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(daew daewVar) {
        return daewVar != null && this.a.get() == daewVar;
    }
}
