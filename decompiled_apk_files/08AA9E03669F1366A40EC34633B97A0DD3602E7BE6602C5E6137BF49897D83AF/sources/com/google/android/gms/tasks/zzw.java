package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class zzw implements Continuation<Void, List<TResult>> {
    private final /* synthetic */ Collection zzagk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(Collection collection) {
        this.zzagk = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task<Void> task) {
        if (this.zzagk.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Task task2 : this.zzagk) {
            arrayList.add(task2.getResult());
        }
        return arrayList;
    }
}
