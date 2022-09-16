package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: otl  reason: default package */
/* loaded from: classes4.dex */
final class otl implements otm {
    @Override // defpackage.otm
    public final osv a(String str, boolean z) {
        List a = oty.a(str, z);
        if (a.isEmpty()) {
            return null;
        }
        return (osv) a.get(0);
    }
}
