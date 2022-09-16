package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alrn  reason: default package */
/* loaded from: classes.dex */
public class alrn extends dvd implements IInterface {
    public final alvg b;
    final /* synthetic */ alri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrn(alri alriVar, alvg alvgVar) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.c = alriVar;
        this.b = alvgVar;
    }

    public void a(Bundle bundle) {
        this.c.b.e();
    }

    public void b(Bundle bundle) {
        this.c.b.e();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            b((Bundle) dve.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            a((Bundle) dve.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
