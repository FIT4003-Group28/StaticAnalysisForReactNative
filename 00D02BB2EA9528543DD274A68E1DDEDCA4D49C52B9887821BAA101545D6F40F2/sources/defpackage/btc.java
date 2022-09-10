package defpackage;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btc  reason: default package */
/* loaded from: classes.dex */
public final class btc {
    public final ArrayDeque<btb> a = new ArrayDeque<>();
    final /* synthetic */ bte b;

    public btc(bte bteVar) {
        this.b = bteVar;
    }

    public final synchronized btb a(cac cacVar) {
        btb poll;
        poll = this.a.poll();
        if (poll == null) {
            poll = new btb(this.b);
        }
        poll.b = cacVar;
        return poll;
    }
}
