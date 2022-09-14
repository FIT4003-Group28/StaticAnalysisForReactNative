package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ContextData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContextData> CREATOR = new cnyd();
    public dsjc a;
    public byte[] b;
    public cnyl c;

    public ContextData(dsjc dsjcVar) {
        cnwc.a(dsjcVar);
        this.a = dsjcVar;
        this.b = null;
        b();
    }

    public final void a() {
        byte[] bArr;
        if (this.a == null && (bArr = this.b) != null) {
            try {
                this.a = (dsjc) dsqw.cr(dsjc.j, bArr, dsqa.c());
                this.b = null;
            } catch (dsrm e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final void b() {
        dsjc dsjcVar = this.a;
        if (dsjcVar != null || this.b == null) {
            if (dsjcVar != null && this.b == null) {
                return;
            }
            if (dsjcVar != null && this.b != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (dsjcVar != null || this.b != null) {
                throw new IllegalStateException("Impossible");
            }
            throw new IllegalStateException("Invalid internal representation - empty");
        }
    }

    public final byte[] c() {
        byte[] bArr = this.b;
        return bArr != null ? bArr : this.a.bS();
    }

    public final String d() {
        a();
        return this.a.b;
    }

    public final cnyl e() {
        a();
        dsjc dsjcVar = this.a;
        if ((dsjcVar.a & 32) != 0) {
            if (this.c == null) {
                dsjo dsjoVar = dsjcVar.g;
                if (dsjoVar == null) {
                    dsjoVar = dsjo.e;
                }
                this.c = new cnyl(dsjoVar);
            }
            return this.c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextData)) {
            return false;
        }
        ContextData contextData = (ContextData) obj;
        a();
        contextData.a();
        if (d().equals(contextData.d())) {
            dsjk dsjkVar = this.a.c;
            if (dsjkVar == null) {
                dsjkVar = dsjk.e;
            }
            int i = dsjkVar.d;
            dsjk dsjkVar2 = contextData.a.c;
            if (dsjkVar2 == null) {
                dsjkVar2 = dsjk.e;
            }
            if (i == dsjkVar2.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        Object[] objArr = new Object[2];
        objArr[0] = d();
        dsjk dsjkVar = this.a.c;
        if (dsjkVar == null) {
            dsjkVar = dsjk.e;
        }
        objArr[1] = Integer.valueOf(dsjkVar.d);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        a();
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.l(parcel, 2, c(), false);
        cnwn.c(parcel, d);
    }

    public ContextData(byte[] bArr) {
        this.a = null;
        this.b = (byte[]) cnwc.a(bArr);
        b();
    }
}
