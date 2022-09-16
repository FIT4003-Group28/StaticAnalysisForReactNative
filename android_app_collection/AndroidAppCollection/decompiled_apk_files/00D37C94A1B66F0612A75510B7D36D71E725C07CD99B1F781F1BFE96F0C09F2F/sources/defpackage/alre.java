package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: alre  reason: default package */
/* loaded from: classes.dex */
final class alre extends also {
    final /* synthetic */ String a;
    final /* synthetic */ alvg b;
    final /* synthetic */ alri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alre(alri alriVar, alvg alvgVar, String str, alvg alvgVar2) {
        super(alvgVar);
        this.c = alriVar;
        this.a = str;
        this.b = alvgVar2;
    }

    @Override // defpackage.also
    protected final void a() {
        Integer num;
        try {
            alri alriVar = this.c;
            alrm alrmVar = (alrm) alriVar.b.l;
            String str = alriVar.c;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putAll(alri.b());
            bundle.putString("package.name", str2);
            try {
                num = Integer.valueOf(alriVar.d.getPackageManager().getPackageInfo(alriVar.d.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                alri.a.a("The current version of the app could not be retrieved", new Object[0]);
                num = null;
            }
            if (num != null) {
                bundle.putInt("app.version.code", num.intValue());
            }
            alrh alrhVar = new alrh(this.c, this.b);
            Parcel pv = alrmVar.pv();
            pv.writeString(str);
            dve.g(pv, bundle);
            dve.i(pv, alrhVar);
            alrmVar.py(2, pv);
        } catch (RemoteException e) {
            alri.a.b(e, "requestUpdateInfo(%s)", this.a);
            this.b.a(new RuntimeException(e));
        }
    }
}
