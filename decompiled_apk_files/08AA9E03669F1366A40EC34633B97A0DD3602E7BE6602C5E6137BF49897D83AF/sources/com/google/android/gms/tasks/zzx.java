package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzx implements Continuation<Void, Task<List<Task<?>>>> {
    private final /* synthetic */ Collection zzagk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(Collection collection) {
        this.zzagk = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<List<Task<?>>> then(Task<Void> task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzagk);
        return Tasks.forResult(arrayList);
    }
}
