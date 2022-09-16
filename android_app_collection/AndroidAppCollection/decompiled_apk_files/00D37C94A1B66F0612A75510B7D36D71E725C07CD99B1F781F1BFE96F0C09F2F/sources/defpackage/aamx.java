package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aamx  reason: default package */
/* loaded from: classes.dex */
final class aamx extends zer {
    public aamx() {
        super("Set<ProgressiveVideoItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection) aank.bq.get());
        hashSet.add(Integer.valueOf(aank.e));
        hashSet.add(Integer.valueOf(aank.d));
        hashSet.add(Integer.valueOf(aank.c));
        return Collections.unmodifiableSet(hashSet);
    }
}
