package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aamf  reason: default package */
/* loaded from: classes.dex */
final class aamf extends zer {
    public aamf() {
        super("Set<AdaptiveVideoItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Set) aank.bk.get());
        hashSet.addAll(aank.h());
        return Collections.unmodifiableSet(hashSet);
    }
}
