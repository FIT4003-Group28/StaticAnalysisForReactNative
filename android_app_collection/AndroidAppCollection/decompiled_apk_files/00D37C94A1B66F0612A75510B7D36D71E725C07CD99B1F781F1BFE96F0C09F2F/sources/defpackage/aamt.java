package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aamt  reason: default package */
/* loaded from: classes.dex */
final class aamt extends zer {
    public aamt() {
        super("Set<AdaptiveAudioItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aank.a());
        hashSet.addAll(aank.t());
        hashSet.addAll(aank.x());
        return Collections.unmodifiableSet(hashSet);
    }
}
