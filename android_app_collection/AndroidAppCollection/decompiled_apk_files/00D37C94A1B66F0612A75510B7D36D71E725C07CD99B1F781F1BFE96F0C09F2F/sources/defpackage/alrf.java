package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: alrf  reason: default package */
/* loaded from: classes.dex */
final class alrf extends also {
    final /* synthetic */ alvg a;
    final /* synthetic */ String b;
    final /* synthetic */ alri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrf(alri alriVar, alvg alvgVar, alvg alvgVar2, String str) {
        super(alvgVar);
        this.c = alriVar;
        this.a = alvgVar2;
        this.b = str;
    }

    @Override // defpackage.also
    protected final void a() {
        try {
            alri alriVar = this.c;
            alrm alrmVar = (alrm) alriVar.b.l;
            String str = alriVar.c;
            Bundle b = alri.b();
            alrg alrgVar = new alrg(this.c, this.a);
            Parcel pv = alrmVar.pv();
            pv.writeString(str);
            dve.g(pv, b);
            dve.i(pv, alrgVar);
            alrmVar.py(3, pv);
        } catch (RemoteException e) {
            alri.a.b(e, "completeUpdate(%s)", this.b);
            this.a.a(new RuntimeException(e));
        }
    }
}
