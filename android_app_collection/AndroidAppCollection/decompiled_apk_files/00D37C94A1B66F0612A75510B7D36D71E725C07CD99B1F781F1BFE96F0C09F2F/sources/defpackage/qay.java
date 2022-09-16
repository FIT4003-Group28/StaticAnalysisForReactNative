package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
/* compiled from: PG */
/* renamed from: qay  reason: default package */
/* loaded from: classes4.dex */
public final class qay extends dvd implements qaz {
    private final pxv a;

    public qay(pxv pxvVar, byte[] bArr, byte[] bArr2) {
        super("com.google.android.gms.ads.internal.client.IAdListener");
        this.a = pxvVar;
    }

    @Override // defpackage.qaz
    public final void a() {
    }

    public qay() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                pxv pxvVar = this.a;
                if (pxvVar != null) {
                    pxvVar.b();
                    break;
                }
                break;
            case 2:
                parcel.readInt();
                break;
            case 3:
                break;
            case 4:
                pxv pxvVar2 = this.a;
                if (pxvVar2 != null) {
                    pxvVar2.d();
                    break;
                }
                break;
            case 5:
                pxv pxvVar3 = this.a;
                if (pxvVar3 != null) {
                    pxvVar3.e();
                    break;
                }
                break;
            case 6:
                pxv pxvVar4 = this.a;
                if (pxvVar4 != null) {
                    pxvVar4.a();
                    break;
                }
                break;
            case 7:
                pxv pxvVar5 = this.a;
                if (pxvVar5 != null) {
                    pxvVar5.f();
                    break;
                }
                break;
            case 8:
                AdErrorParcel adErrorParcel = (AdErrorParcel) dve.a(parcel, AdErrorParcel.CREATOR);
                pxv pxvVar6 = this.a;
                if (pxvVar6 != null) {
                    pxvVar6.c(adErrorParcel.b());
                    break;
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
