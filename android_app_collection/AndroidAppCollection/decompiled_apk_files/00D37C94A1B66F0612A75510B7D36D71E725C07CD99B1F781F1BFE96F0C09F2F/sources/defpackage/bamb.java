package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bamb  reason: default package */
/* loaded from: classes2.dex */
public final class bamb implements bama {
    @Override // defpackage.bama
    public final Set a() {
        return Collections.singleton("UTC");
    }

    @Override // defpackage.bama
    public final baht b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return baht.a;
        }
        return null;
    }
}
