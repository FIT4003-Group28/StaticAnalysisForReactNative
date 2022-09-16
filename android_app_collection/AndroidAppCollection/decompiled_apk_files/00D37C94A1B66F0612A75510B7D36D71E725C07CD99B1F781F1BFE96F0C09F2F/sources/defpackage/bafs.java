package defpackage;

import java.net.URI;
/* compiled from: PG */
/* renamed from: bafs  reason: default package */
/* loaded from: classes2.dex */
final class bafs implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bagd b;

    public bafs(bagd bagdVar, String str) {
        this.b = bagdVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bagd bagdVar = this.b;
        bagdVar.p = URI.create(bagdVar.m).resolve(this.a).toString();
        bagd bagdVar2 = this.b;
        bagdVar2.f.add(bagdVar2.p);
        this.b.m(2, 3, new bafr(this));
    }
}
