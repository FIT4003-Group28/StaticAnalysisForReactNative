package defpackage;

import defpackage.cnnq;
/* compiled from: PG */
/* renamed from: cnsq  reason: default package */
/* loaded from: classes.dex */
public final class cnsq<A extends cnnq, L> {
    public final cnsk<A, L> a;
    public final cntj<A, L> b;
    public final Runnable c;

    public cnsq(cnsk<A, L> cnskVar, cntj<A, L> cntjVar, Runnable runnable) {
        this.a = cnskVar;
        this.b = cntjVar;
        this.c = runnable;
    }

    public static <A extends cnnq, L> cnsp<A, L> a() {
        return new cnsp<>();
    }
}
