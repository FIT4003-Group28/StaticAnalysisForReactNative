package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
/* compiled from: PG */
/* renamed from: rrn  reason: default package */
/* loaded from: classes4.dex */
public class rrn extends dvd implements IInterface {
    public rrn() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            b((Status) dve.a(parcel, Status.CREATOR), (OpenFileDescriptorResponse) dve.a(parcel, OpenFileDescriptorResponse.CREATOR));
        } else if (i == 2) {
            a((Status) dve.a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            c((Status) dve.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
