package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
/* compiled from: PG */
/* renamed from: coyg  reason: default package */
/* loaded from: classes.dex */
public abstract class coyg extends clb implements coyh {
    public coyg() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                b((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 2:
                c((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 3:
                e((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 4:
                f((Status) clc.d(parcel, Status.CREATOR), (Configurations) clc.d(parcel, Configurations.CREATOR));
                return true;
            case 5:
                g((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 6:
                h((Status) clc.d(parcel, Status.CREATOR), (ExperimentTokens) clc.d(parcel, ExperimentTokens.CREATOR));
                return true;
            case 7:
                i((Status) clc.d(parcel, Status.CREATOR), (DogfoodsToken) clc.d(parcel, DogfoodsToken.CREATOR));
                return true;
            case 8:
                j((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 9:
                k((Status) clc.d(parcel, Status.CREATOR), (Flag) clc.d(parcel, Flag.CREATOR));
                return true;
            case 10:
                l((Status) clc.d(parcel, Status.CREATOR), (Configurations) clc.d(parcel, Configurations.CREATOR));
                return true;
            case 11:
                m((Status) clc.d(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 12:
                n((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 13:
                o((Status) clc.d(parcel, Status.CREATOR), (FlagOverrides) clc.d(parcel, FlagOverrides.CREATOR));
                return true;
            case 14:
                d((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 15:
                p((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 16:
                q((Status) clc.d(parcel, Status.CREATOR), parcel.readLong());
                return true;
            default:
                return false;
        }
    }
}
