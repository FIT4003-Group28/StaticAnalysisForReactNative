package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aami  reason: default package */
/* loaded from: classes.dex */
final class aami extends zer {
    public aami() {
        super("Set<CencAdaptiveAudioItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aank.bh));
        hashSet.add(Integer.valueOf(aank.bi));
        return Collections.unmodifiableSet(hashSet);
    }
}
