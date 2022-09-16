package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: aamd  reason: default package */
/* loaded from: classes.dex */
final class aamd extends zer {
    public aamd() {
        super("Set<H264AdaptiveVideoItags>");
    }

    @Override // defpackage.zer
    public final /* bridge */ /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aank.m());
        hashSet.addAll(aank.i());
        return Collections.unmodifiableSet(hashSet);
    }
}
