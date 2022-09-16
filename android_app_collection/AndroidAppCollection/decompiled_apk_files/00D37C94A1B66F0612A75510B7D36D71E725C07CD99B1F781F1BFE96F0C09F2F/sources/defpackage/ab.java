package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ab  reason: default package */
/* loaded from: classes.dex */
public final class ab {
    public final l a;
    private final Handler b = new Handler();
    private aa c;

    public ab(apy apyVar) {
        this.a = new l(apyVar);
    }

    public final void a(aps apsVar) {
        aa aaVar = this.c;
        if (aaVar != null) {
            aaVar.run();
        }
        aa aaVar2 = new aa(this.a, apsVar);
        this.c = aaVar2;
        this.b.postAtFrontOfQueue(aaVar2);
    }
}
