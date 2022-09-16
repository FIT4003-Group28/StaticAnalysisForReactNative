package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rov  reason: default package */
/* loaded from: classes4.dex */
public final class rov implements Runnable {
    final long a;
    final long b;
    final /* synthetic */ row c;

    public rov(row rowVar, long j, long j2) {
        this.c = rowVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.aH().g(new Runnable() { // from class: rou
            @Override // java.lang.Runnable
            public final void run() {
                rov rovVar = rov.this;
                row rowVar = rovVar.c;
                long j = rovVar.a;
                long j2 = rovVar.b;
                rowVar.b.n();
                rowVar.b.aG().j.a("Application going to the background");
                boolean z = true;
                rowVar.b.M().p.a(true);
                Bundle bundle = new Bundle();
                if (!rowVar.b.J().r()) {
                    rowVar.b.d.c();
                    if (rowVar.b.J().o(rkg.ah)) {
                        bundle.putLong("_et", rowVar.b.e(j2));
                        rps.E(rowVar.b.k().o(true), bundle, true);
                    } else {
                        z = false;
                    }
                    rowVar.b.o(false, z, j2);
                }
                rowVar.b.j().v("auto", "_ab", j, bundle);
            }
        });
    }
}
