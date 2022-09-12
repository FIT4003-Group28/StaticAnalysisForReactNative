package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ClientId implements Parcelable {
    public static final ClientId b;
    public static final ClientId c;
    public static final ClientId d;
    public static final ClientId e;
    public static final ClientId f;
    public static final ClientId g;
    public static final ClientId h;
    public static final ClientId i;
    public static final ClientId j;
    public static final ClientId k;
    public static final ClientId l;
    public static final ClientId m;
    public static final ClientId n;
    public final String o;
    public static final Map<String, ClientId> a = new HashMap();
    public static final Parcelable.Creator<ClientId> CREATOR = new cyej();

    static {
        a("SAM");
        a("SAM_EC");
        a("SAM_CR");
        a("SAM_CA");
        a("SAM_DWFTC");
        a("SAM_EQC");
        a("SAM_PO");
        a("PHO");
        a("PHO_B");
        a("PHO_A");
        a("DYN");
        a("DYN_H");
        a("DYN_C");
        a("DYN_I");
        a("DYN_OOD");
        a("DYN_OOD_H");
        a("DYN_OOD_C");
        a("DYN_OOD_I");
        a("HUB_C");
        a("DRI_S");
        a("DRI_M");
        a("DRI_A");
        a("DRI_L");
        a("DRI_D");
        a("DOC_S");
        a("DOC_M");
        a("DOC_L");
        a("SHE_S");
        a("SHE_M");
        a("SHE_L");
        a("SLI_S");
        a("SLI_M");
        a("SLI_L");
        a("PHO_WGC");
        b = a("PHO_WGC_IANTS");
        c = a("PHO_ESC");
        d = a("PEP_PL");
        e = a("MAP_LS");
        f = a("MAP_CJS");
        g = a("MAP_O");
        h = a("MAP_OIAS");
        i = a("NWS");
        j = a("JAM");
        a("TEZ");
        a("TEZ_H");
        a("TEZ_I");
        a("TEZ_R");
        a("TEZ_S");
        a("TEZ_SS");
        k = a("GAL_S");
        a("GAL_C");
        a("PAY_S");
        l = a("GOO_H");
        a("GML_C");
        m = a("GML_CE");
        a("GML_G");
        a("CAL");
        a("CAL_A");
        a("CAL_P");
        a("NGA");
        a("GOO_O");
        n = a("KEE");
        a("DUO");
    }

    public ClientId(String str) {
        this.o = str;
    }

    public static ClientId a(String str) {
        Map<String, ClientId> map = a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(str.length() != 0 ? "Duplicate ClientId name found: ".concat(str) : new String("Duplicate ClientId name found: "));
        }
        ClientId clientId = new ClientId(str);
        map.put(str, clientId);
        return clientId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientId) {
            return this.o.equals(((ClientId) obj).o);
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.o);
    }
}
