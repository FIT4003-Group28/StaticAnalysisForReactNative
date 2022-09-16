package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;
import com.google.android.gms.potokens.PoToken;
/* compiled from: PG */
/* renamed from: qig  reason: default package */
/* loaded from: classes4.dex */
public final class qig extends dvd implements IInterface {
    final /* synthetic */ rvh a;
    private final /* synthetic */ int b;

    public qig() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar, int i, char[] cArr) {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
        this.b = i;
        this.a = rvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar, int i) {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
        this.b = i;
        this.a = rvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar) {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
        this.a = rvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar, int i, byte[] bArr) {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
        this.b = i;
        this.a = rvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar, int i, short[] sArr) {
        super("com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
        this.b = i;
        this.a = rvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar, int i, int[] iArr) {
        super("com.google.android.gms.cast.firstparty.internal.ICastSettingsCallback");
        this.b = i;
        this.a = rvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar, int i, boolean[] zArr) {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        this.b = i;
        this.a = rvhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qig(rvh rvhVar, int i, float[] fArr) {
        super("com.google.android.gms.potokens.internal.ITokenCallbacks");
        this.b = i;
        this.a = rvhVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                if (i != 2) {
                    return false;
                }
                qiq.a((Status) dve.a(parcel, Status.CREATOR), (AccountChangeEventsResponse) dve.a(parcel, AccountChangeEventsResponse.CREATOR), this.a);
                return true;
            case 1:
                if (i != 2) {
                    return false;
                }
                qiq.a((Status) dve.a(parcel, Status.CREATOR), (Bundle) dve.a(parcel, Bundle.CREATOR), this.a);
                return true;
            case 2:
                if (i != 2) {
                    return false;
                }
                qiq.a((Status) dve.a(parcel, Status.CREATOR), parcel.createTypedArrayList(Account.CREATOR), this.a);
                return true;
            case 3:
                if (i != 2) {
                    return false;
                }
                qiq.a((Status) dve.a(parcel, Status.CREATOR), (Bundle) dve.a(parcel, Bundle.CREATOR), this.a);
                return true;
            case 4:
                if (i != 2) {
                    return false;
                }
                qiq.a((Status) dve.a(parcel, Status.CREATOR), Integer.valueOf(parcel.readInt()), this.a);
                return true;
            case 5:
                if (i != 1) {
                    return false;
                }
                tgo.l(Status.a, (Bundle) dve.a(parcel, Bundle.CREATOR), this.a);
                return true;
            case 6:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) dve.a(parcel, Status.CREATOR);
                SyncResult syncResult = (SyncResult) dve.a(parcel, SyncResult.CREATOR);
                if (status.c()) {
                    bArr = syncResult.a;
                }
                tgo.m(status, bArr, this.a);
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) dve.a(parcel, Status.CREATOR);
                PoToken poToken = (PoToken) dve.a(parcel, PoToken.CREATOR);
                if (poToken != null) {
                    bArr = poToken.a;
                }
                tgo.l(status2, bArr, this.a);
                return true;
        }
    }
}
