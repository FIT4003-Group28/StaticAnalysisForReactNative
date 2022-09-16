package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggu  reason: default package */
/* loaded from: classes.dex */
public final class aggu implements agpp {
    private static final long a = TimeUnit.HOURS.toSeconds(1);
    private final aadd b;
    private final yjs c;

    public aggu(yjs yjsVar, aadd aaddVar) {
        this.c = yjsVar;
        this.b = aaddVar;
    }

    @Override // defpackage.agpp
    public final void a() {
        atqv atqvVar = this.b.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        atsc atscVar = atqvVar.c;
        if (atscVar == null) {
            atscVar = atsc.a;
        }
        if (atscVar.b) {
            this.c.e("offline_client_state", Math.max(a, atscVar.c), false, 1, null, null, false);
        }
    }
}
