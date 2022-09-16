package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aamj  reason: default package */
/* loaded from: classes.dex */
final class aamj extends zer {
    public aamj() {
        super("Set<UltralowQualityAdaptiveAudioItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aank.aN));
        hashSet.add(Integer.valueOf(aank.T));
        return Collections.unmodifiableSet(hashSet);
    }
}
