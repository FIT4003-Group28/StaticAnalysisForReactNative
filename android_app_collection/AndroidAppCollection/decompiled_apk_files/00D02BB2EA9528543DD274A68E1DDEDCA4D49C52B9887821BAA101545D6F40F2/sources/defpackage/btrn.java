package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: btrn  reason: default package */
/* loaded from: classes.dex */
final class btrn extends ThreadLocal<Queue<btrp>> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Queue<btrp> initialValue() {
        return new ArrayDeque();
    }
}
