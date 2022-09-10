package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: eavi  reason: default package */
/* loaded from: classes6.dex */
public final class eavi implements eavh {
    @Override // defpackage.eavh
    public final eaou a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return eaou.b;
        }
        return null;
    }

    @Override // defpackage.eavh
    public final Set<String> b() {
        return Collections.singleton("UTC");
    }
}
