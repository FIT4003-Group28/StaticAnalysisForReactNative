package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahqg  reason: default package */
/* loaded from: classes.dex */
final class ahqg implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ ahqo b;

    public ahqg(ahqo ahqoVar, List list) {
        this.b = ahqoVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.j(this.a);
    }
}
