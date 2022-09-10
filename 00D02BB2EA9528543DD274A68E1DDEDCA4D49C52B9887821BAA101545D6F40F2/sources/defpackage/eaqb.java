package defpackage;
/* compiled from: PG */
/* renamed from: eaqb  reason: default package */
/* loaded from: classes.dex */
public abstract class eaqb implements eapq {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eapq) && o() == ((eapq) obj).o();
    }

    @Override // defpackage.eapq
    public eaow h() {
        throw null;
    }

    public final int hashCode() {
        long o = o();
        return (int) (o ^ (o >>> 32));
    }

    @Override // defpackage.eapq
    public final boolean p(eapq eapqVar) {
        if (eapqVar == null) {
            eapqVar = eaow.a;
        }
        return compareTo(eapqVar) > 0;
    }

    @Override // defpackage.eapq
    public final boolean q(eapq eapqVar) {
        if (eapqVar == null) {
            eapqVar = eaow.a;
        }
        return compareTo(eapqVar) < 0;
    }

    public final eapn r() {
        return new eapn(o());
    }

    @Override // java.lang.Comparable
    /* renamed from: s */
    public final int compareTo(eapq eapqVar) {
        long o = o();
        long o2 = eapqVar.o();
        if (o < o2) {
            return -1;
        }
        return o > o2 ? 1 : 0;
    }

    public final String toString() {
        long o = o();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        int i = (int) o;
        if (i == o) {
            eauk.b(stringBuffer, i);
        } else {
            stringBuffer.append(Long.toString(o));
        }
        while (true) {
            if (stringBuffer.length() >= (o < 0 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(o < 0 ? 3 : 2, "0");
        }
        if ((o / 1000) * 1000 == o) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
