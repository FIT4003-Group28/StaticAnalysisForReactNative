package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blg  reason: default package */
/* loaded from: classes2.dex */
public final class blg implements bli {
    final Set a = new HashSet();

    public blg(blj bljVar) {
        bljVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.bli
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
