package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ucw  reason: default package */
/* loaded from: classes4.dex */
public final class ucw {
    public final String a;
    public final Long b;
    public final Long c;
    public final aolz d;
    public final List e;
    public final Long f;
    public final String g;
    public final aono h;
    public final String i;
    public final String j;
    public final Long k;
    public final Long l;
    public final aomt m;
    public final List n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    public ucw() {
    }

    public ucw(String str, int i, int i2, int i3, int i4, Long l, Long l2, aolz aolzVar, List list, Long l3, String str2, aono aonoVar, String str3, String str4, Long l4, Long l5, int i5, aomt aomtVar, List list2) {
        this.a = str;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = i4;
        this.b = l;
        this.c = l2;
        this.d = aolzVar;
        this.e = list;
        this.f = l3;
        this.g = str2;
        this.h = aonoVar;
        this.i = str3;
        this.j = str4;
        this.k = l4;
        this.l = l5;
        this.s = i5;
        this.m = aomtVar;
        this.n = list2;
    }

    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ucw ucwVar = (ucw) it.next();
            aopa createBuilder = aolq.a.createBuilder();
            String str = ucwVar.a;
            createBuilder.copyOnWrite();
            aolq aolqVar = (aolq) createBuilder.instance;
            str.getClass();
            aolqVar.b |= 1;
            aolqVar.c = str;
            long longValue = ucwVar.b.longValue();
            createBuilder.copyOnWrite();
            aolq aolqVar2 = (aolq) createBuilder.instance;
            aolqVar2.b |= 2;
            aolqVar2.d = longValue;
            long longValue2 = ucwVar.f.longValue();
            createBuilder.copyOnWrite();
            aolq aolqVar3 = (aolq) createBuilder.instance;
            aolqVar3.b |= 4;
            aolqVar3.e = longValue2;
            arrayList.add((aolq) createBuilder.mo39build());
        }
        return arrayList;
    }

    public static uco b() {
        uco ucoVar = new uco();
        ucoVar.c(aolz.a);
        ucoVar.i(1);
        ucoVar.h(1);
        ucoVar.g(1);
        ucoVar.k(1);
        ucoVar.a = 0L;
        ucoVar.b = 0L;
        ucoVar.g = 0L;
        ucoVar.c = 0L;
        ucoVar.d("chime_default_group");
        ucoVar.h = 0L;
        ucoVar.f(Collections.emptyList());
        ucoVar.b(Collections.emptyList());
        ucoVar.j(1);
        return ucoVar;
    }

    public final boolean equals(Object obj) {
        String str;
        aono aonoVar;
        String str2;
        aomt aomtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucw) {
            ucw ucwVar = (ucw) obj;
            if (this.a.equals(ucwVar.a)) {
                int i = this.o;
                int i2 = ucwVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.p;
                    int i4 = ucwVar.p;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        int i5 = this.q;
                        int i6 = ucwVar.q;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            int i7 = this.r;
                            int i8 = ucwVar.r;
                            if (i7 == 0) {
                                throw null;
                            }
                            if (i7 == i8 && this.b.equals(ucwVar.b) && this.c.equals(ucwVar.c) && this.d.equals(ucwVar.d) && this.e.equals(ucwVar.e) && this.f.equals(ucwVar.f) && ((str = this.g) != null ? str.equals(ucwVar.g) : ucwVar.g == null) && ((aonoVar = this.h) != null ? aonoVar.equals(ucwVar.h) : ucwVar.h == null) && ((str2 = this.i) != null ? str2.equals(ucwVar.i) : ucwVar.i == null) && this.j.equals(ucwVar.j) && this.k.equals(ucwVar.k) && this.l.equals(ucwVar.l)) {
                                int i9 = this.s;
                                int i10 = ucwVar.s;
                                if (i9 == 0) {
                                    throw null;
                                }
                                if (i9 == i10 && ((aomtVar = this.m) != null ? aomtVar.equals(ucwVar.m) : ucwVar.m == null) && this.n.equals(ucwVar.n)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.o;
        if (i != 0) {
            int i2 = (hashCode ^ i) * 1000003;
            int i3 = this.p;
            if (i3 == 0) {
                throw null;
            }
            int i4 = (i2 ^ i3) * 1000003;
            int i5 = this.q;
            if (i5 == 0) {
                throw null;
            }
            int i6 = (i4 ^ i5) * 1000003;
            int i7 = this.r;
            if (i7 == 0) {
                throw null;
            }
            int hashCode2 = (((((((((((i6 ^ i7) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
            String str = this.g;
            int i8 = 0;
            int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
            aono aonoVar = this.h;
            int hashCode4 = (hashCode3 ^ (aonoVar == null ? 0 : aonoVar.hashCode())) * 1000003;
            String str2 = this.i;
            int hashCode5 = (((((((hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
            int i9 = this.s;
            if (i9 == 0) {
                throw null;
            }
            int i10 = (hashCode5 ^ i9) * 1000003;
            aomt aomtVar = this.m;
            if (aomtVar != null) {
                i8 = aomtVar.hashCode();
            }
            return ((i10 ^ i8) * 1000003) ^ this.n.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        int i = this.o;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.p;
        String num2 = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        int i3 = this.q;
        String num3 = i3 != 0 ? Integer.toString(i3 - 1) : "null";
        int i4 = this.r;
        String num4 = i4 != 0 ? Integer.toString(i4 - 1) : "null";
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String str2 = this.g;
        String valueOf6 = String.valueOf(this.h);
        String str3 = this.i;
        String str4 = this.j;
        String str5 = "null";
        String valueOf7 = String.valueOf(this.k);
        String valueOf8 = String.valueOf(this.l);
        int i5 = this.s;
        if (i5 != 0) {
            str5 = Integer.toString(i5 - 1);
        }
        String valueOf9 = String.valueOf(this.m);
        String valueOf10 = String.valueOf(this.n);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        int length3 = String.valueOf(num2).length();
        int length4 = String.valueOf(num3).length();
        int length5 = String.valueOf(num4).length();
        int length6 = String.valueOf(valueOf).length();
        int length7 = String.valueOf(valueOf2).length();
        int length8 = String.valueOf(valueOf3).length();
        int length9 = String.valueOf(valueOf4).length();
        int length10 = String.valueOf(valueOf5).length();
        int length11 = String.valueOf(str2).length();
        int length12 = String.valueOf(valueOf6).length();
        int length13 = String.valueOf(str3).length();
        int length14 = String.valueOf(str4).length();
        int length15 = String.valueOf(valueOf7).length();
        int length16 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 330 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + String.valueOf(str5).length() + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("ChimeThread{id=");
        sb.append(str);
        sb.append(", readState=");
        sb.append(num);
        sb.append(", deletionStatus=");
        sb.append(num2);
        sb.append(", countBehavior=");
        sb.append(num3);
        sb.append(", systemTrayBehavior=");
        sb.append(num4);
        sb.append(", lastUpdatedVersion=");
        sb.append(valueOf);
        sb.append(", lastNotificationVersion=");
        sb.append(valueOf2);
        sb.append(", androidSdkMessage=");
        sb.append(valueOf3);
        sb.append(", notificationMetadataList=");
        sb.append(valueOf4);
        sb.append(", creationId=");
        sb.append(valueOf5);
        sb.append(", payloadType=");
        sb.append(str2);
        sb.append(", payload=");
        sb.append(valueOf6);
        sb.append(", updateThreadStateToken=");
        sb.append(str3);
        sb.append(", groupId=");
        sb.append(str4);
        sb.append(", expirationTimestampUsec=");
        sb.append(valueOf7);
        sb.append(", insertionTimeMs=");
        sb.append(valueOf8);
        sb.append(", storageMode=");
        sb.append(str5);
        sb.append(", schedule=");
        sb.append(valueOf9);
        sb.append(", actionList=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
