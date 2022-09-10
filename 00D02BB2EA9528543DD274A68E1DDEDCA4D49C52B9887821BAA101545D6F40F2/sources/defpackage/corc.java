package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.reporting.UploadRequest;
/* compiled from: PG */
/* renamed from: corc  reason: default package */
/* loaded from: classes.dex */
public final class corc {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 3507;
            case 2:
            case 3:
                return 5;
            case 4:
                return 10;
            case 5:
                return 3500;
            case 6:
                return 3501;
            case 7:
                return 3502;
            case 8:
                return 3503;
            case 9:
            default:
                return 8;
            case 10:
                return 3510;
            case 11:
                return 3511;
            case 12:
                return 3512;
            case 13:
                return 3513;
            case 14:
                return 3514;
        }
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 100) {
                return 3506;
            }
            if (i == 2) {
                return 3505;
            }
            if (i == 3) {
                return 3504;
            }
            if (i == 4) {
                return 3500;
            }
            if (i == 5) {
                return 3508;
            }
            return i != 6 ? 8 : 3509;
        }
        return 0;
    }

    public static final cnoh<cora> c(GoogleApiClient googleApiClient, Account account) {
        return googleApiClient.enqueue(new coqu(googleApiClient, account));
    }

    public static final cnoh<corb> d(GoogleApiClient googleApiClient, UploadRequest uploadRequest) {
        return googleApiClient.execute(new coqw(googleApiClient, uploadRequest));
    }
}
