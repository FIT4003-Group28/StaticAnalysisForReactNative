package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zrg  reason: default package */
/* loaded from: classes4.dex */
public final class zrg {
    public final Set a;

    public zrg() {
        this.a = new HashSet();
    }

    public zrg(Set set) {
        this.a = set;
    }

    public final boolean a(avxv avxvVar) {
        Set set = this.a;
        if (set == null || avxvVar == null) {
            return false;
        }
        return set.contains(avxvVar);
    }
}
