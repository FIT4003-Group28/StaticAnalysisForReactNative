package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaqi  reason: default package */
/* loaded from: classes6.dex */
public class eaqi extends eaqd implements Serializable, eaps {
    private static final long serialVersionUID = 576586928732749278L;
    public volatile eaok a;
    public volatile long b;
    public volatile long c;

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqi(long j, long j2, eaok eaokVar) {
        this.a = eaor.d(eaokVar);
        n(j, j2);
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.eaps
    public final eaok c() {
        return this.a;
    }

    @Override // defpackage.eaps
    public final long d() {
        return this.b;
    }

    @Override // defpackage.eaps
    public final long f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqi(eapr eaprVar, eapq eapqVar) {
        this.a = eaor.c(eaprVar);
        this.b = eaor.b(eaprVar);
        this.c = easy.a(this.b, eaor.f(eapqVar));
        n(this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqi(eapr eaprVar, eapr eaprVar2) {
        if (eaprVar != null || eaprVar2 != null) {
            this.a = eaor.c(eaprVar);
            this.b = eaor.b(eaprVar);
            this.c = eaor.b(eaprVar2);
            n(this.b, this.c);
            return;
        }
        long a = eaor.a();
        this.c = a;
        this.b = a;
        this.a = earp.W();
    }
}
