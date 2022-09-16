package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.j;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.b {
    private static int a = 1;
    private final SparseArray b = new SparseArray();

    private final synchronized void c(SelectableItemKey selectableItemKey) {
        WeakReference weakReference = (WeakReference) this.b.get(selectableItemKey.a);
        j jVar = weakReference != null ? (j) weakReference.get() : null;
        if (jVar != null) {
            jVar.a(selectableItemKey.b);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c
    public final void a(SelectableItemKey selectableItemKey) {
        c(selectableItemKey);
    }

    public final synchronized int b(j jVar) {
        SparseArray sparseArray = this.b;
        int i = a + 1;
        a = i;
        sparseArray.append(i, new WeakReference(jVar));
        return a;
    }
}
