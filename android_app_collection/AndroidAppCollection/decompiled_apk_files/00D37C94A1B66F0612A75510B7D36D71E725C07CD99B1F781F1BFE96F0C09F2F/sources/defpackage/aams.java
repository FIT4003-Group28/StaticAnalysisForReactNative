package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aams  reason: default package */
/* loaded from: classes.dex */
final class aams extends zer {
    public aams() {
        super("Set<AacAdaptiveAudioItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Set) aank.bm.get());
        hashSet.addAll(aank.g());
        return Collections.unmodifiableSet(hashSet);
    }
}
