package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaqh  reason: default package */
/* loaded from: classes.dex */
public class eaqh extends eaqb implements Serializable, eapq {
    private static final long serialVersionUID = 2581698638990L;
    public volatile long b;

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqh(long j) {
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqh(long j, long j2) {
        this.b = easy.a(j2, -j);
    }

    @Override // defpackage.eapq
    public final long o() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqh(eapr eaprVar, eapr eaprVar2) {
        if (eaprVar == eaprVar2) {
            this.b = 0L;
            return;
        }
        this.b = easy.a(eaor.b(eaprVar2), -eaor.b(eaprVar));
    }
}
