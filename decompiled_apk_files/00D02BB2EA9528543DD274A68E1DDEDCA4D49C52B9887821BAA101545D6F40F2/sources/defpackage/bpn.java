package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bpn  reason: default package */
/* loaded from: classes4.dex */
public final class bpn implements bju {
    private static final Set<String> a = new HashSet();

    @Override // defpackage.bju
    public final void a(String str) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }
}
