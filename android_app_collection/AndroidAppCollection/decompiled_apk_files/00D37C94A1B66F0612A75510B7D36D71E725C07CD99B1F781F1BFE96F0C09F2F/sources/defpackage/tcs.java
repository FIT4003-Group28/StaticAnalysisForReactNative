package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: tcs  reason: default package */
/* loaded from: classes4.dex */
public final class tcs {
    public final View a;
    public final View b;
    public final tfi c;
    public final Object d;
    public final awon e;
    public final tdq f;
    public final String g;
    public final tdz h;
    public final tda i;

    public tcs() {
    }

    public tcs(View view, View view2, tfi tfiVar, Object obj, awon awonVar, tdq tdqVar, String str, tdz tdzVar, tda tdaVar) {
        this.a = view;
        this.b = view2;
        this.c = tfiVar;
        this.d = obj;
        this.e = awonVar;
        this.f = tdqVar;
        this.g = str;
        this.h = tdzVar;
        this.i = tdaVar;
    }

    public static tcq a() {
        tcq tcqVar = new tcq();
        tcqVar.b(tda.a);
        return tcqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tcs) {
            tcs tcsVar = (tcs) obj;
            View view = this.a;
            if (view != null ? view.equals(tcsVar.a) : tcsVar.a == null) {
                View view2 = this.b;
                if (view2 != null ? view2.equals(tcsVar.b) : tcsVar.b == null) {
                    tfi tfiVar = this.c;
                    if (tfiVar != null ? tfiVar.equals(tcsVar.c) : tcsVar.c == null) {
                        Object obj2 = this.d;
                        if (obj2 != null ? obj2.equals(tcsVar.d) : tcsVar.d == null) {
                            awon awonVar = this.e;
                            if (awonVar != null ? awonVar.equals(tcsVar.e) : tcsVar.e == null) {
                                tdq tdqVar = this.f;
                                if (tdqVar != null ? tdqVar.equals(tcsVar.f) : tcsVar.f == null) {
                                    String str = this.g;
                                    if (str != null ? str.equals(tcsVar.g) : tcsVar.g == null) {
                                        tdz tdzVar = this.h;
                                        if (tdzVar != null ? tdzVar.equals(tcsVar.h) : tcsVar.h == null) {
                                            if (this.i.equals(tcsVar.i)) {
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
        return false;
    }

    public final int hashCode() {
        View view = this.a;
        int i = 0;
        int hashCode = ((view == null ? 0 : view.hashCode()) ^ 1000003) * 1000003;
        View view2 = this.b;
        int hashCode2 = (hashCode ^ (view2 == null ? 0 : view2.hashCode())) * 1000003;
        tfi tfiVar = this.c;
        int hashCode3 = (hashCode2 ^ (tfiVar == null ? 0 : tfiVar.hashCode())) * 1000003;
        Object obj = this.d;
        int hashCode4 = (hashCode3 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        awon awonVar = this.e;
        int hashCode5 = (hashCode4 ^ (awonVar == null ? 0 : awonVar.hashCode())) * 1000003;
        tdq tdqVar = this.f;
        int hashCode6 = (hashCode5 ^ (tdqVar == null ? 0 : tdqVar.hashCode())) * 1000003;
        String str = this.g;
        int hashCode7 = (hashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        tdz tdzVar = this.h;
        if (tdzVar != null) {
            i = tdzVar.hashCode();
        }
        return ((hashCode7 ^ i) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String str = this.g;
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 146 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("CommandEventData{view=");
        sb.append(valueOf);
        sb.append(", anchorView=");
        sb.append(valueOf2);
        sb.append(", touchLocation=");
        sb.append(valueOf3);
        sb.append(", customData=");
        sb.append(valueOf4);
        sb.append(", senderState=");
        sb.append(valueOf5);
        sb.append(", elementBuilder=");
        sb.append(valueOf6);
        sb.append(", identifier=");
        sb.append(str);
        sb.append(", elementsConfig=");
        sb.append(valueOf7);
        sb.append(", conversionContext=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
