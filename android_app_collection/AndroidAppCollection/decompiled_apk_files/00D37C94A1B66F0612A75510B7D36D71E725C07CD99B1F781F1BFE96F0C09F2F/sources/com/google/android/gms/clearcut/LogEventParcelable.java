package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(2);
    public PlayLoggerContext a;
    public byte[] b;
    public int[] c;
    public String[] d;
    public int[] e;
    public byte[][] f;
    public ExperimentTokens[] g;
    public boolean h;
    public axir i;
    public final vpn j;
    public final vpn k;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, axir axirVar, vpn vpnVar, int[] iArr, String[] strArr, int[] iArr2, boolean z) {
        this.a = playLoggerContext;
        this.i = axirVar;
        this.j = vpnVar;
        this.k = null;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = null;
        this.h = true;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.a = playLoggerContext;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.i = null;
        this.j = null;
        this.k = null;
        this.e = iArr2;
        this.f = bArr2;
        this.g = experimentTokensArr;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (tnk.j(this.a, logEventParcelable.a) && Arrays.equals(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && tnk.j(this.i, logEventParcelable.i) && tnk.j(this.j, logEventParcelable.j)) {
                vpn vpnVar = logEventParcelable.k;
                if (tnk.j(null, null) && Arrays.equals(this.e, logEventParcelable.e) && Arrays.deepEquals(this.f, logEventParcelable.f) && Arrays.equals(this.g, logEventParcelable.g) && this.h == logEventParcelable.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.i, this.j, null, this.e, this.f, this.g, Boolean.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.i);
        sb.append(", ExtensionProducer: ");
        sb.append(this.j);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 2, this.a, i);
        tqj.w(parcel, 3, this.b);
        tqj.z(parcel, 4, this.c);
        tqj.G(parcel, 5, this.d);
        tqj.z(parcel, 6, this.e);
        tqj.x(parcel, 7, this.f);
        tqj.o(parcel, 8, this.h);
        tqj.I(parcel, 9, this.g, i);
        tqj.n(parcel, m);
    }
}
