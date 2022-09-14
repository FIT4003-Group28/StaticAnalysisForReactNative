package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: btwc  reason: default package */
/* loaded from: classes4.dex */
public final class btwc {
    final dvdm a;
    final boolean b;
    final boolean c;
    final dvdo d;

    public btwc(dvdm dvdmVar, boolean z, boolean z2, dvdo dvdoVar) {
        this.a = dvdmVar;
        this.b = z;
        this.c = z2;
        this.d = dvdoVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btwc)) {
            return false;
        }
        btwc btwcVar = (btwc) obj;
        return this.a == btwcVar.a && this.b == btwcVar.b && this.c == btwcVar.c && this.d == btwcVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }
}
