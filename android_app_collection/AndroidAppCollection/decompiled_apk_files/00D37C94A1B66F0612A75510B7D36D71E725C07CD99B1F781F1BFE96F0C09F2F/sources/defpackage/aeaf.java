package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aeaf  reason: default package */
/* loaded from: classes.dex */
public final class aeaf implements adzw {
    public final ykg a = new yko(20);

    @Override // defpackage.adzw
    public final boolean a(String str, String str2, long j) {
        int a = ovm.a(str2);
        Set set = (Set) this.a.a(str);
        if (set == null || set.isEmpty()) {
            return true;
        }
        return set.contains(Integer.valueOf(a));
    }

    public final void b(String str, Set set) {
        this.a.d(str, set);
    }
}
