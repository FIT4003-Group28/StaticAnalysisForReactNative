package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aamg  reason: default package */
/* loaded from: classes.dex */
final class aamg extends zer {
    public aamg() {
        super("Set<ClearAacAdaptiveAudioItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aank.aN));
        hashSet.add(Integer.valueOf(aank.aO));
        hashSet.add(Integer.valueOf(aank.aP));
        hashSet.add(Integer.valueOf(aank.aQ));
        return Collections.unmodifiableSet(hashSet);
    }
}
