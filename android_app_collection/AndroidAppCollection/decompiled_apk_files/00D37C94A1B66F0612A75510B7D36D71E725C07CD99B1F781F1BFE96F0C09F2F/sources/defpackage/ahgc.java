package defpackage;
/* compiled from: PG */
/* renamed from: ahgc  reason: default package */
/* loaded from: classes.dex */
public class ahgc {
    private final aeso a;
    private final String b;

    public ahgc(aeso aesoVar, String str) {
        this.a = aesoVar;
        this.b = str;
    }

    public aeso a() {
        return this.a;
    }

    public String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(valueOf).length());
        sb.append("MediaCuePointEvent cpn=");
        sb.append(str);
        sb.append(", cuepoint=");
        sb.append(valueOf);
        return sb.toString();
    }
}
