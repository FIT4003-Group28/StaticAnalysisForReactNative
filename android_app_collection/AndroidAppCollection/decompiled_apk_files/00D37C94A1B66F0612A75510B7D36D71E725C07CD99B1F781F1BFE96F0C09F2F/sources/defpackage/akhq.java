package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akhq  reason: default package */
/* loaded from: classes.dex */
public final class akhq {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final List e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final Set l;
    public final int m;
    public final int n;
    public final String o;
    public final String p;
    public final int q;

    public akhq() {
    }

    public akhq(String str, String str2, int i, int i2, List list, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, Set set, int i9, int i10, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = z;
        this.k = i7;
        this.q = i8;
        this.l = set;
        this.m = i9;
        this.n = i10;
        this.o = str3;
        this.p = str4;
    }

    public static final asci a(akhl akhlVar, int i) {
        aopa createBuilder = asci.a.createBuilder();
        if (i < 0) {
            i = -1;
        }
        createBuilder.copyOnWrite();
        asci asciVar = (asci) createBuilder.instance;
        asciVar.b |= 1;
        asciVar.c = i;
        int i2 = akhlVar.c;
        createBuilder.copyOnWrite();
        asci asciVar2 = (asci) createBuilder.instance;
        asciVar2.b |= 2;
        asciVar2.d = i2;
        List x = almu.x(akhlVar.d);
        createBuilder.copyOnWrite();
        asci asciVar3 = (asci) createBuilder.instance;
        aopq aopqVar = asciVar3.e;
        if (!aopqVar.c()) {
            asciVar3.e = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll((Iterable) x, (List) asciVar3.e);
        int i3 = akhlVar.k;
        createBuilder.copyOnWrite();
        asci asciVar4 = (asci) createBuilder.instance;
        asciVar4.f = i3 - 1;
        asciVar4.b |= 8;
        return (asci) createBuilder.mo39build();
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akhq) {
            akhq akhqVar = (akhq) obj;
            if (this.a.equals(akhqVar.a) && ((str = this.b) != null ? str.equals(akhqVar.b) : akhqVar.b == null) && this.c == akhqVar.c && this.d == akhqVar.d && ((list = this.e) != null ? list.equals(akhqVar.e) : akhqVar.e == null) && this.f == akhqVar.f && this.g == akhqVar.g && this.h == akhqVar.h && this.i == akhqVar.i && this.j == akhqVar.j && this.k == akhqVar.k) {
                int i = this.q;
                int i2 = akhqVar.q;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.l.equals(akhqVar.l) && this.m == akhqVar.m && this.n == akhqVar.n && ((str2 = this.o) != null ? str2.equals(akhqVar.o) : akhqVar.o == null)) {
                    String str3 = this.p;
                    String str4 = akhqVar.p;
                    if (str3 != null ? str3.equals(str4) : str4 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        List list = this.e;
        int hashCode3 = (((((((((((((hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k) * 1000003;
        int i2 = this.q;
        if (i2 != 0) {
            int hashCode4 = (((((((hashCode3 ^ i2) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003;
            String str2 = this.o;
            int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
            String str3 = this.p;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode5 ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        String valueOf = String.valueOf(this.e);
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        boolean z = this.j;
        int i7 = this.k;
        int i8 = this.q;
        String num = i8 != 0 ? Integer.toString(i8 - 1) : "null";
        String valueOf2 = String.valueOf(this.l);
        int i9 = this.m;
        int i10 = this.n;
        String str3 = this.o;
        String str4 = this.p;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(num).length();
        StringBuilder sb = new StringBuilder(length + 491 + length2 + length3 + length4 + String.valueOf(valueOf2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("SearchboxStatsWrapper{clientName=");
        sb.append(str);
        sb.append(", originalQuery=");
        sb.append(str2);
        sb.append(", assistedQueryIndex=");
        sb.append(i);
        sb.append(", lastVisibleSuggestionIndex=");
        sb.append(i2);
        sb.append(", suggestions=");
        sb.append(valueOf);
        sb.append(", experimentTriggered=");
        sb.append(i3);
        sb.append(", firstEditTimeMillis=");
        sb.append(i4);
        sb.append(", lastEditTimeMillis=");
        sb.append(i5);
        sb.append(", sessionDurationMillis=");
        sb.append(i6);
        sb.append(", zeroPrefixSuggestionsEnabled=");
        sb.append(z);
        sb.append(", numZeroPrefixSuggestionsShown=");
        sb.append(i7);
        sb.append(", searchMethod=");
        sb.append(num);
        sb.append(", inputMethods=");
        sb.append(valueOf2);
        sb.append(", maxRoundTripTimeMsec=");
        sb.append(i9);
        sb.append(", totalRoundTripTimeMsec=");
        sb.append(i10);
        sb.append(", compressedRoundTripHistogram=");
        sb.append(str3);
        sb.append(", sessionId=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
