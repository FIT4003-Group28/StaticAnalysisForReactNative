package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwqt  reason: default package */
/* loaded from: classes4.dex */
public final class bwqt implements Runnable {
    @dzsi
    public Serializable a;
    final /* synthetic */ bwqv b;
    private final bwrm c;

    public bwqt(bwqv bwqvVar, bwrm bwrmVar) {
        this.b = bwqvVar;
        this.c = bwrmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbsi<Serializable, String> q = this.b.q(this.c);
        this.a = q == null ? null : q.a;
    }
}
