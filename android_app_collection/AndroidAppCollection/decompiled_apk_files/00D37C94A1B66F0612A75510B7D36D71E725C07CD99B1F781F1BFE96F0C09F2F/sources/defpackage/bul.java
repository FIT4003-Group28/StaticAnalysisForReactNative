package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bul  reason: default package */
/* loaded from: classes2.dex */
public final class bul {
    public String a;
    public bpx b;
    public int c;
    public List d;
    public List e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bul)) {
            return false;
        }
        bul bulVar = (bul) obj;
        if (this.c != bulVar.c) {
            return false;
        }
        String str = this.a;
        if (str == null ? bulVar.a != null : !str.equals(bulVar.a)) {
            return false;
        }
        if (this.f != bulVar.f) {
            return false;
        }
        bpx bpxVar = this.b;
        if (bpxVar == null ? bulVar.b != null : !bpxVar.equals(bulVar.b)) {
            return false;
        }
        List list = this.d;
        if (list == null ? bulVar.d != null : !list.equals(bulVar.d)) {
            return false;
        }
        List list2 = this.e;
        if (list2 != null) {
            return list2.equals(bulVar.e);
        }
        return bulVar.e == null;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.f;
        if (i2 != 0) {
            adz.f(i2);
        } else {
            i2 = 0;
        }
        int i3 = (hashCode + i2) * 31;
        bpx bpxVar = this.b;
        int hashCode2 = (((i3 + (bpxVar != null ? bpxVar.hashCode() : 0)) * 31) + this.c) * 31;
        List list = this.d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.e;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }
}
