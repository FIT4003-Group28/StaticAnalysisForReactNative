package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cljk  reason: default package */
/* loaded from: classes5.dex */
final class cljk implements cllh {
    public final String a;
    final /* synthetic */ cljo b;

    public cljk(cljo cljoVar, String str) {
        this.b = cljoVar;
        this.a = str;
    }

    @Override // defpackage.cllh
    public final dehn<clli> a() {
        return this.b.a.c(new Callable(this) { // from class: cljj
            private final cljk a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cljk cljkVar = this.a;
                try {
                    return new cljn(cljkVar.b, clji.a(cljkVar.a));
                } catch (cljh e) {
                    throw new clle(e);
                }
            }
        });
    }
}
