package defpackage;

import android.os.RemoteException;
import java.util.List;
/* compiled from: PG */
/* renamed from: dalw  reason: default package */
/* loaded from: classes5.dex */
final class dalw extends daij {
    final /* synthetic */ List b;
    final /* synthetic */ dane c;
    final /* synthetic */ damc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dalw(damc damcVar, dane daneVar, List list, dane daneVar2) {
        super(daneVar);
        this.d = damcVar;
        this.b = list;
        this.c = daneVar2;
    }

    @Override // defpackage.daij
    protected final void a() {
        try {
            damc damcVar = this.d;
            damcVar.c.j.f(damcVar.b, damc.a(this.b), damc.b(), new daly(this.d, this.c));
        } catch (RemoteException e) {
            damc.a.e("deferredLanguageInstall(%s)", this.b);
            this.c.a(new RuntimeException(e));
        }
    }
}
