package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bokx  reason: default package */
/* loaded from: classes3.dex */
final class bokx implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bola b;

    public bokx(bola bolaVar, List list) {
        this.b = bolaVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<String> k = dchl.k(this.a, new bokw());
        try {
            bola bolaVar = this.b;
            bolaVar.c.c(bolaVar.a, k);
        } finally {
            this.b.c.a();
        }
    }
}
