package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aamb  reason: default package */
/* loaded from: classes.dex */
final class aamb extends zer {
    public aamb() {
        super("Set<ClearAdaptiveVideoItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aank.m());
        hashSet.addAll(aank.n());
        hashSet.addAll(aank.o());
        hashSet.addAll(aank.k());
        hashSet.addAll(aank.l());
        return Collections.unmodifiableSet(hashSet);
    }
}
