package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aame  reason: default package */
/* loaded from: classes.dex */
final class aame extends zer {
    public aame() {
        super("Set<WebmItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet(aank.y());
        hashSet.addAll(aank.z());
        hashSet.add(Integer.valueOf(aank.Y));
        hashSet.add(Integer.valueOf(aank.X));
        hashSet.add(Integer.valueOf(aank.T));
        hashSet.add(Integer.valueOf(aank.U));
        hashSet.add(Integer.valueOf(aank.V));
        hashSet.add(Integer.valueOf(aank.W));
        return Collections.unmodifiableSet(hashSet);
    }
}
