package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
/* compiled from: PG */
/* renamed from: rtj  reason: default package */
/* loaded from: classes4.dex */
public final class rtj extends dvd implements IInterface {
    private final rvh a;

    public rtj(rvh rvhVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = rvhVar;
    }

    public rtj() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 2:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 3:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 4:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), (Configurations) dve.a(parcel, Configurations.CREATOR), this.a);
                return true;
            case 5:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 6:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), (ExperimentTokens) dve.a(parcel, ExperimentTokens.CREATOR), this.a);
                return true;
            case 7:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), (DogfoodsToken) dve.a(parcel, DogfoodsToken.CREATOR), this.a);
                return true;
            case 8:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 9:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), (Flag) dve.a(parcel, Flag.CREATOR), this.a);
                return true;
            case 10:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), (Configurations) dve.a(parcel, Configurations.CREATOR), this.a);
                return true;
            case 11:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), Long.valueOf(parcel.readLong()), this.a);
                return true;
            case 12:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 13:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), (FlagOverrides) dve.a(parcel, FlagOverrides.CREATOR), this.a);
                return true;
            case 14:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 15:
                tgo.k((Status) dve.a(parcel, Status.CREATOR), this.a);
                return true;
            case 16:
                tgo.l((Status) dve.a(parcel, Status.CREATOR), Long.valueOf(parcel.readLong()), this.a);
                return true;
            default:
                return false;
        }
    }
}
