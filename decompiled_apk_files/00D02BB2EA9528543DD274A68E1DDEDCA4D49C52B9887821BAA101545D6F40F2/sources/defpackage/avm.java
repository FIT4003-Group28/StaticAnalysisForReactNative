package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avm  reason: default package */
/* loaded from: classes.dex */
public final class avm implements avo {
    final Set<String> a = new HashSet();

    public avm(avp avpVar) {
        avpVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.avo
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
