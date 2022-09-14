package defpackage;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqr  reason: default package */
/* loaded from: classes2.dex */
public final class aqr implements Runnable {
    final /* synthetic */ aqn a;
    final /* synthetic */ Collection b;
    final /* synthetic */ aqu c;
    final /* synthetic */ arh d;

    public aqr(aqu aquVar, arh arhVar, aqn aqnVar, Collection collection) {
        this.c = aquVar;
        this.d = arhVar;
        this.a = aqnVar;
        this.b = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.c, this.a, this.b);
    }
}
