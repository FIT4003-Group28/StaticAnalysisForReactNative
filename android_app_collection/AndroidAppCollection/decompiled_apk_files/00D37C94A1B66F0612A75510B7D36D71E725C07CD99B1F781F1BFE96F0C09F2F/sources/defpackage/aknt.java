package defpackage;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aknt  reason: default package */
/* loaded from: classes.dex */
public final class aknt implements abea {
    public final List a;
    private final aacz b;

    public aknt(aacz aaczVar, Executor executor, PackageManager packageManager) {
        aaczVar.getClass();
        this.b = aaczVar;
        executor.getClass();
        this.a = new ArrayList();
        executor.execute(new akns(this, packageManager));
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        atfw atfwVar = this.b.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        apgv apgvVar = atfwVar.m;
        if (apgvVar == null) {
            apgvVar = apgv.a;
        }
        atfw atfwVar2 = this.b.b().k;
        if (atfwVar2 == null) {
            atfwVar2 = atfw.a;
        }
        if ((atfwVar2.b & 131072) != 0) {
            synchronized (this) {
                for (String str : this.a) {
                    Integer q = apwt.q(str, apgvVar);
                    if (q != null) {
                        abedVar.t(q.intValue());
                    }
                }
            }
        }
    }
}
