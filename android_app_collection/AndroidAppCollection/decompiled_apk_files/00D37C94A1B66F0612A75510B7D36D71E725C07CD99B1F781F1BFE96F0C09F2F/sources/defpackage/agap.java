package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: agap  reason: default package */
/* loaded from: classes.dex */
public final class agap implements uhq {
    private final yqw a;

    public agap(yqw yqwVar) {
        this.a = yqwVar;
    }

    @Override // defpackage.uhq
    public final uhv a(uht uhtVar) {
        ylr.b();
        try {
            return (uhv) anii.h(this.a.b(new agao(uhtVar)), adrz.p, anjk.a).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            uhu a = uhv.a();
            a.e = e;
            return a.a();
        } catch (ExecutionException e2) {
            uhu a2 = uhv.a();
            a2.e = e2;
            return a2.a();
        }
    }
}
