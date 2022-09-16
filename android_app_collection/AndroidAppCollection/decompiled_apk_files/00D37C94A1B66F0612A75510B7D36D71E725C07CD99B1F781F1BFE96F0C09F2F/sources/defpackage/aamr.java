package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aamr  reason: default package */
/* loaded from: classes.dex */
final class aamr extends zer {
    public aamr() {
        super("Set<OpusAdaptiveAudioItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aank.T));
        hashSet.add(Integer.valueOf(aank.U));
        hashSet.add(Integer.valueOf(aank.V));
        hashSet.add(Integer.valueOf(aank.W));
        return Collections.unmodifiableSet(hashSet);
    }
}
