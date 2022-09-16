package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: eyq  reason: default package */
/* loaded from: classes3.dex */
public final class eyq {
    public final acsf a;
    public final Set b = new HashSet();

    public eyq(acsf acsfVar) {
        this.a = acsfVar;
    }

    public final void a(arin arinVar) {
        if (this.b.add(arinVar)) {
            this.a.b(new acsd(arinVar.q, 7), aqzj.FLOW_TYPE_IN_APP_UPDATE);
        }
    }
}
