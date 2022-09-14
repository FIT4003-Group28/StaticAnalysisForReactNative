package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Set;
/* compiled from: PG */
/* renamed from: czke  reason: default package */
/* loaded from: classes5.dex */
final class czke extends BroadcastReceiver {
    public final deig<Void> a = deig.d();
    public final Set<String> b;

    public czke(Set<String> set) {
        Set<String> g = dcnm.g();
        this.b = g;
        g.addAll(set);
        a();
    }

    private final void a() {
        if (this.b.isEmpty()) {
            this.a.j(null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b.remove(dbsj.e(intent.getPackage()));
        a();
    }
}
