package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: alse  reason: default package */
/* loaded from: classes.dex */
public final class alse extends also {
    final /* synthetic */ alsb a;
    final /* synthetic */ alvg b;
    final /* synthetic */ alsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alse(alsf alsfVar, alvg alvgVar, alsb alsbVar, alvg alvgVar2) {
        super(alvgVar);
        this.c = alsfVar;
        this.a = alsbVar;
        this.b = alvgVar2;
    }

    @Override // defpackage.also
    protected final void a() {
        try {
            alsf alsfVar = this.c;
            alsg alsgVar = (alsg) alsfVar.b.l;
            String str = alsfVar.c;
            alsb alsbVar = this.a;
            ArrayList arrayList = new ArrayList();
            for (String str2 : new ArrayList(alsbVar.a)) {
                Bundle bundle = new Bundle();
                bundle.putString("url", str2);
                arrayList.add(bundle);
            }
            Bundle bundle2 = new Bundle();
            alsh alshVar = new alsh(this.c);
            Parcel pv = alsgVar.pv();
            pv.writeString(str);
            pv.writeTypedList(arrayList);
            dve.g(pv, bundle2);
            dve.i(pv, alshVar);
            alsgVar.py(1, pv);
        } catch (RemoteException e) {
            alsf.a.b(e, "prewarm(%s)", this.c.c);
            this.b.a(new RuntimeException(e));
        }
    }
}
