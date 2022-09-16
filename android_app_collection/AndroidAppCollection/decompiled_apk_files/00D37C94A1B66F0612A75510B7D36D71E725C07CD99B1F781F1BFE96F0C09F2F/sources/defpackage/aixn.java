package defpackage;

import java.util.Deque;
/* compiled from: PG */
@Deprecated
/* renamed from: aixn  reason: default package */
/* loaded from: classes.dex */
public final class aixn {
    public static zib a;

    public static aixl a(Deque deque, boolean z) {
        Object poll = z ? deque.poll() : deque.peek();
        if (poll == null || poll.getClass() != aixl.class) {
            return null;
        }
        return (aixl) poll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ aiwz b(Deque deque) {
        Object peek = deque.peek();
        if (peek == null || peek.getClass() != aiwz.class) {
            return null;
        }
        return (aiwz) peek;
    }
}
