package defpackage;

import java.net.URI;
/* compiled from: PG */
/* renamed from: ealn  reason: default package */
/* loaded from: classes6.dex */
final class ealn implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ eamc b;

    public ealn(eamc eamcVar, String str) {
        this.b = eamcVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eamc eamcVar = this.b;
        eamcVar.o = URI.create(eamcVar.l).resolve(this.a).toString();
        eamc eamcVar2 = this.b;
        eamcVar2.e.add(eamcVar2.o);
        this.b.f(2, 3, new ealm(this));
    }
}
