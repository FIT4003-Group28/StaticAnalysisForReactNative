package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aani  reason: default package */
/* loaded from: classes.dex */
final class aani extends zer {
    public aani() {
        super("Set<Av1AdaptiveVideoItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aank.k());
        return Collections.unmodifiableSet(hashSet);
    }
}
