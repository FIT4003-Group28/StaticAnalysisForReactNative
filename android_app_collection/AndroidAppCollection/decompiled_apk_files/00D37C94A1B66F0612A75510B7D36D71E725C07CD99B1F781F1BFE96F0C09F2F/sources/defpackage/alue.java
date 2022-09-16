package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alue  reason: default package */
/* loaded from: classes.dex */
public class alue extends dvd implements IInterface {
    public final alvg a;
    final /* synthetic */ alty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alue(alty altyVar, alvg alvgVar) {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        this.b = altyVar;
        this.a = alvgVar;
    }

    public void a(int i, Bundle bundle) {
        this.b.c.e();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                a(parcel.readInt(), (Bundle) dve.a(parcel, Bundle.CREATOR));
                break;
            case 3:
                parcel.readInt();
                Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 4:
                parcel.readInt();
                Bundle bundle2 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 5:
                parcel.readInt();
                Bundle bundle3 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 6:
                this.b.c.e();
                int i3 = ((Bundle) dve.a(parcel, Bundle.CREATOR)).getInt("error_code");
                alty.a.a("onError(%d)", Integer.valueOf(i3));
                this.a.a(new altl(i3));
                break;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                this.b.c.e();
                break;
            case 8:
                Bundle bundle4 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 9:
                Bundle bundle5 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 10:
                Bundle bundle6 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 11:
                Bundle bundle7 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 12:
                Bundle bundle8 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            case 13:
                Bundle bundle9 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                this.b.c.e();
                break;
            default:
                return false;
        }
        return true;
    }
}
