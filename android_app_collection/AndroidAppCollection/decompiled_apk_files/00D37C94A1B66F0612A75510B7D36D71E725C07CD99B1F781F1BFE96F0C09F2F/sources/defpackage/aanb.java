package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aanb  reason: default package */
/* loaded from: classes.dex */
final class aanb extends zer {
    public aanb() {
        super("Set<HfrVideoItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aank.z());
        hashSet.addAll(aank.e());
        return Collections.unmodifiableSet(hashSet);
    }
}
