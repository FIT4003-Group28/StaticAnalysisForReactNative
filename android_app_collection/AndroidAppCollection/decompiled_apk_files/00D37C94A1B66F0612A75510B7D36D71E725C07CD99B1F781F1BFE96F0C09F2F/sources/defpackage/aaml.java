package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aaml  reason: default package */
/* loaded from: classes.dex */
final class aaml extends zer {
    public aaml() {
        super("Set<LowQualityAdaptiveAudioItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aank.aO));
        hashSet.add(Integer.valueOf(aank.bh));
        hashSet.add(Integer.valueOf(aank.U));
        hashSet.add(Integer.valueOf(aank.V));
        return Collections.unmodifiableSet(hashSet);
    }
}
