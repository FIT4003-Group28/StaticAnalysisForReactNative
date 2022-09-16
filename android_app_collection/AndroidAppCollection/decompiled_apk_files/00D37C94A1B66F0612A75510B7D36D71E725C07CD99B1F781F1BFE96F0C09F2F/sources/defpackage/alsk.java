package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: alsk  reason: default package */
/* loaded from: classes.dex */
public final class alsk extends also {
    final /* synthetic */ alvg a;
    final /* synthetic */ alsm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alsk(alsm alsmVar, alvg alvgVar, alvg alvgVar2) {
        super(alvgVar);
        this.b = alsmVar;
        this.a = alvgVar2;
    }

    @Override // defpackage.also
    protected final void a() {
        try {
            alsm alsmVar = this.b;
            alrp alrpVar = (alrp) alsmVar.b.l;
            String str = alsmVar.c;
            Bundle a = alro.a("review");
            alsl alslVar = new alsl(this.b, this.a);
            Parcel pv = alrpVar.pv();
            pv.writeString(str);
            dve.g(pv, a);
            dve.i(pv, alslVar);
            alrpVar.py(2, pv);
        } catch (RemoteException e) {
            alsm.a.b(e, "error requesting in-app review for %s", this.b.c);
            this.a.a(new RuntimeException(e));
        }
    }
}
