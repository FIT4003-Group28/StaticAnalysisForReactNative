package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aanf  reason: default package */
/* loaded from: classes.dex */
final class aanf extends zer {
    public aanf() {
        super("Set<Vp9AdaptiveVideoItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aank.n());
        hashSet.addAll(aank.j());
        return Collections.unmodifiableSet(hashSet);
    }
}
