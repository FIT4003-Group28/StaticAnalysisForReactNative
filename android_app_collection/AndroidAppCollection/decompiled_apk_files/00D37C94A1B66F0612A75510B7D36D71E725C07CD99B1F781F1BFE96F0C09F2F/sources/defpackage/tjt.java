package defpackage;

import j$.util.Objects;
/* compiled from: PG */
/* renamed from: tjt  reason: default package */
/* loaded from: classes4.dex */
public final class tjt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tjt(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static tjs a() {
        return new tjs();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tjt tjtVar = (tjt) obj;
            if (Objects.equals(this.a, tjtVar.a) && Objects.equals(this.b, tjtVar.b) && Objects.equals(this.c, tjtVar.c) && Objects.equals(this.d, tjtVar.d) && Objects.equals(this.e, tjtVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }
}
