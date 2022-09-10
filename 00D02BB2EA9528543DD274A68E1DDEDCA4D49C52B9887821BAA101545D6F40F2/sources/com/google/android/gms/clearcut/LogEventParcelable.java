package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogEventParcelable> CREATOR = new cnks();
    public final cnjx a;
    public final cnjx b;
    public PlayLoggerContext c;
    public byte[] d;
    public int[] e;
    public String[] f;
    public int[] g;
    public byte[][] h;
    public ExperimentTokens[] i;
    public boolean j;
    public duji k;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, duji dujiVar, cnjx cnjxVar, int[] iArr, String[] strArr, int[] iArr2, boolean z) {
        this.c = playLoggerContext;
        this.k = dujiVar;
        this.a = cnjxVar;
        this.b = null;
        this.e = iArr;
        this.f = strArr;
        this.g = iArr2;
        this.h = null;
        this.i = null;
        this.j = z;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.c = playLoggerContext;
        this.d = bArr;
        this.e = iArr;
        this.f = strArr;
        this.k = null;
        this.a = null;
        this.b = null;
        this.g = iArr2;
        this.h = bArr2;
        this.i = experimentTokensArr;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (cnvv.a(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && Arrays.equals(this.e, logEventParcelable.e) && Arrays.equals(this.f, logEventParcelable.f) && cnvv.a(this.k, logEventParcelable.k) && cnvv.a(this.a, logEventParcelable.a)) {
                cnjx cnjxVar = logEventParcelable.b;
                if (cnvv.a(null, null) && Arrays.equals(this.g, logEventParcelable.g) && Arrays.deepEquals(this.h, logEventParcelable.h) && Arrays.equals(this.i, logEventParcelable.i) && this.j == logEventParcelable.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f, this.k, this.a, null, this.g, this.h, this.i, Boolean.valueOf(this.j)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.c);
        sb.append(", ");
        sb.append("LogEventBytes: ");
        byte[] bArr = this.d;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", ");
        sb.append("TestCodes: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ");
        sb.append("MendelPackages: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", ");
        sb.append("LogEvent: ");
        sb.append(this.k);
        sb.append(", ");
        sb.append("ExtensionProducer: ");
        sb.append(this.a);
        sb.append(", ");
        sb.append("VeProducer: ");
        sb.append((Object) null);
        sb.append(", ");
        sb.append("ExperimentIDs: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", ");
        sb.append("ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.h));
        sb.append(", ");
        sb.append("ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.i));
        sb.append(", ");
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.j);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.c, i);
        cnwn.l(parcel, 3, this.d, false);
        cnwn.q(parcel, 4, this.e);
        cnwn.v(parcel, 5, this.f);
        cnwn.q(parcel, 6, this.g);
        cnwn.n(parcel, 7, this.h);
        cnwn.e(parcel, 8, this.j);
        cnwn.x(parcel, 9, this.i, i);
        cnwn.c(parcel, d);
    }
}
