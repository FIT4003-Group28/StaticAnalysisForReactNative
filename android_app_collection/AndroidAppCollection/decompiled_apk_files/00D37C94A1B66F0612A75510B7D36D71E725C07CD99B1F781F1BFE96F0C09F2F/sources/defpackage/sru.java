package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: sru  reason: default package */
/* loaded from: classes4.dex */
public final class sru {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final awmt e;
    public final awmt f;
    public final tcs g;
    public final DialogInterface.OnKeyListener h;
    public final int i;
    public final srt j;
    public final Object k;
    public final aoob l;
    public final int m;

    public sru() {
    }

    public sru(String str, String str2, String str3, String str4, awmt awmtVar, awmt awmtVar2, tcs tcsVar, DialogInterface.OnKeyListener onKeyListener, int i, int i2, srt srtVar, Object obj, aoob aoobVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = awmtVar;
        this.f = awmtVar2;
        this.g = tcsVar;
        this.h = onKeyListener;
        this.m = i;
        this.i = i2;
        this.j = srtVar;
        this.k = obj;
        this.l = aoobVar;
    }

    public static srs a() {
        srs srsVar = new srs();
        srsVar.l = 1;
        srsVar.b(-1);
        return srsVar;
    }

    public final boolean equals(Object obj) {
        srt srtVar;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sru) {
            sru sruVar = (sru) obj;
            String str = this.a;
            if (str != null ? str.equals(sruVar.a) : sruVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(sruVar.b) : sruVar.b == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(sruVar.c) : sruVar.c == null) {
                        String str4 = this.d;
                        if (str4 != null ? str4.equals(sruVar.d) : sruVar.d == null) {
                            awmt awmtVar = this.e;
                            if (awmtVar != null ? awmtVar.equals(sruVar.e) : sruVar.e == null) {
                                awmt awmtVar2 = this.f;
                                if (awmtVar2 != null ? awmtVar2.equals(sruVar.f) : sruVar.f == null) {
                                    tcs tcsVar = this.g;
                                    if (tcsVar != null ? tcsVar.equals(sruVar.g) : sruVar.g == null) {
                                        DialogInterface.OnKeyListener onKeyListener = this.h;
                                        if (onKeyListener != null ? onKeyListener.equals(sruVar.h) : sruVar.h == null) {
                                            int i = this.m;
                                            int i2 = sruVar.m;
                                            if (i == 0) {
                                                throw null;
                                            }
                                            if (i == i2 && this.i == sruVar.i && ((srtVar = this.j) != null ? srtVar.equals(sruVar.j) : sruVar.j == null) && ((obj2 = this.k) != null ? obj2.equals(sruVar.k) : sruVar.k == null)) {
                                                aoob aoobVar = this.l;
                                                aoob aoobVar2 = sruVar.l;
                                                if (aoobVar != null ? aoobVar.equals(aoobVar2) : aoobVar2 == null) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
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
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        awmt awmtVar = this.e;
        int hashCode5 = (hashCode4 ^ (awmtVar == null ? 0 : awmtVar.hashCode())) * 1000003;
        awmt awmtVar2 = this.f;
        int hashCode6 = (hashCode5 ^ (awmtVar2 == null ? 0 : awmtVar2.hashCode())) * 1000003;
        tcs tcsVar = this.g;
        int hashCode7 = (hashCode6 ^ (tcsVar == null ? 0 : tcsVar.hashCode())) * 1000003;
        DialogInterface.OnKeyListener onKeyListener = this.h;
        int hashCode8 = (hashCode7 ^ (onKeyListener == null ? 0 : onKeyListener.hashCode())) * 1000003;
        int i2 = this.m;
        if (i2 != 0) {
            int i3 = (((hashCode8 ^ i2) * 1000003) ^ this.i) * 1000003;
            srt srtVar = this.j;
            int hashCode9 = (i3 ^ (srtVar == null ? 0 : srtVar.hashCode())) * 1000003;
            Object obj = this.k;
            int hashCode10 = (hashCode9 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
            aoob aoobVar = this.l;
            if (aoobVar != null) {
                i = aoobVar.hashCode();
            }
            return hashCode10 ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        int i = this.m;
        String str5 = i != 1 ? i != 2 ? i != 3 ? "null" : "LAYOUT_FULLSCREEN" : "FULLSCREEN" : "ALERT";
        int i2 = this.i;
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(valueOf).length();
        int length6 = String.valueOf(valueOf2).length();
        int length7 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 239 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf4).length() + str5.length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("DialogData{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", actionTitle=");
        sb.append(str3);
        sb.append(", cancelTitle=");
        sb.append(str4);
        sb.append(", actionCommand=");
        sb.append(valueOf);
        sb.append(", cancelCommand=");
        sb.append(valueOf2);
        sb.append(", commandEventData=");
        sb.append(valueOf3);
        sb.append(", onKeyListener=");
        sb.append(valueOf4);
        sb.append(", dialogType=");
        sb.append(str5);
        sb.append(", requestedOrientation=");
        sb.append(i2);
        sb.append(", dialogEventListener=");
        sb.append(valueOf5);
        sb.append(", interactionLogger=");
        sb.append(valueOf6);
        sb.append(", newScreenTrackingParams=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
