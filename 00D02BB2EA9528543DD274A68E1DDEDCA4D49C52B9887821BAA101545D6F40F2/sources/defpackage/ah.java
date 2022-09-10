package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ah  reason: default package */
/* loaded from: classes2.dex */
public final class ah {
    public final o a;
    private final Handler b = new Handler();
    private ag c;

    public ah(m mVar) {
        this.a = new o(mVar);
    }

    public final void a(i iVar) {
        ag agVar = this.c;
        if (agVar != null) {
            agVar.run();
        }
        ag agVar2 = new ag(this.a, iVar);
        this.c = agVar2;
        this.b.postAtFrontOfQueue(agVar2);
    }
}
