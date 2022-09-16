package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
/* compiled from: PG */
/* renamed from: qes  reason: default package */
/* loaded from: classes4.dex */
public final class qes extends dvd implements qet {
    private final qgg a;
    private final qfx b;

    public qes() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // defpackage.qet
    public final void a() {
        qfx qfxVar = this.b;
        if (qfxVar != null) {
            rad a = rac.a(this.a);
            Parcel pv = qfxVar.pv();
            dve.i(pv, a);
            qfxVar.px(8, pv);
        }
    }

    @Override // defpackage.qet
    public final void f() {
        qfx qfxVar = this.b;
        if (qfxVar != null) {
            rad a = rac.a(this.a);
            Parcel pv = qfxVar.pv();
            dve.i(pv, a);
            qfxVar.px(6, pv);
        }
    }

    @Override // defpackage.qet
    public final void g(int i) {
        qfx qfxVar = this.b;
        if (qfxVar != null) {
            rad a = rac.a(this.a);
            Parcel pv = qfxVar.pv();
            dve.i(pv, a);
            pv.writeInt(i);
            qfxVar.px(9, pv);
        }
    }

    @Override // defpackage.qet
    public final void h(AdErrorParcel adErrorParcel) {
    }

    @Override // defpackage.qet
    public final void i() {
    }

    @Override // defpackage.qet
    public final void j() {
        qfx qfxVar = this.b;
        if (qfxVar != null) {
            rad a = rac.a(this.a);
            Parcel pv = qfxVar.pv();
            dve.i(pv, a);
            qfxVar.px(3, pv);
        }
    }

    @Override // defpackage.qet
    public final void k() {
        qfx qfxVar = this.b;
        if (qfxVar != null) {
            rad a = rac.a(this.a);
            Parcel pv = qfxVar.pv();
            dve.i(pv, a);
            qfxVar.px(4, pv);
        }
    }

    @Override // defpackage.qet
    public final void l(String str, String str2) {
    }

    @Override // defpackage.qet
    public final void m(qdr qdrVar, String str) {
    }

    public qes(qgg qggVar, qfx qfxVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        this.a = qggVar;
        this.b = qfxVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qfy qfyVar;
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                f();
                break;
            case 3:
                g(parcel.readInt());
                break;
            case 4:
            case 8:
            case 11:
            case 15:
            case 20:
                break;
            case 5:
                k();
                break;
            case 6:
                j();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof qeu) {
                        qeu qeuVar = (qeu) queryLocalInterface;
                        break;
                    } else {
                        new qeu(readStrongBinder);
                        break;
                    }
                }
                break;
            case 9:
                parcel.readString();
                parcel.readString();
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof qdr) {
                        qdr qdrVar = (qdr) queryLocalInterface2;
                    } else {
                        new qdr(readStrongBinder2);
                    }
                }
                parcel.readString();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                qfx qfxVar = this.b;
                if (qfxVar != null) {
                    rad a = rac.a(this.a);
                    Parcel pv = qfxVar.pv();
                    dve.i(pv, a);
                    qfxVar.px(5, pv);
                    break;
                }
                break;
            case 14:
                RewardItemParcel rewardItemParcel = (RewardItemParcel) dve.a(parcel, RewardItemParcel.CREATOR);
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    qfyVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface3 instanceof qfy) {
                        qfyVar = (qfy) queryLocalInterface3;
                    } else {
                        qfyVar = new qfy(readStrongBinder3);
                    }
                }
                qfx qfxVar2 = this.b;
                if (qfxVar2 != null) {
                    rad a2 = rac.a(this.a);
                    Parcel pw = qfyVar.pw(1, qfyVar.pv());
                    String readString = pw.readString();
                    pw.recycle();
                    Parcel pw2 = qfyVar.pw(2, qfyVar.pv());
                    int readInt = pw2.readInt();
                    pw2.recycle();
                    RewardItemParcel rewardItemParcel2 = new RewardItemParcel(readString, readInt);
                    Parcel pv2 = qfxVar2.pv();
                    dve.i(pv2, a2);
                    dve.g(pv2, rewardItemParcel2);
                    qfxVar2.px(7, pv2);
                    break;
                }
                break;
            case 17:
                parcel.readInt();
                break;
            case 18:
                qfx qfxVar3 = this.b;
                if (qfxVar3 != null) {
                    rad a3 = rac.a(this.a);
                    Parcel pv3 = qfxVar3.pv();
                    dve.i(pv3, a3);
                    qfxVar3.px(11, pv3);
                    break;
                }
                break;
            case 19:
                Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
                break;
            case 21:
                parcel.readString();
                break;
            case 22:
                parcel.readInt();
                parcel.readString();
                break;
            case 23:
                AdErrorParcel adErrorParcel = (AdErrorParcel) dve.a(parcel, AdErrorParcel.CREATOR);
                break;
            case 24:
                AdErrorParcel adErrorParcel2 = (AdErrorParcel) dve.a(parcel, AdErrorParcel.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
