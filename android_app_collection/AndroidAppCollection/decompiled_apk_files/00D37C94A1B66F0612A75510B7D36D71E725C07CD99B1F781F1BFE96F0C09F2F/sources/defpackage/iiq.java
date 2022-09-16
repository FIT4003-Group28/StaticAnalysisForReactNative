package defpackage;

import android.net.Uri;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: iiq  reason: default package */
/* loaded from: classes3.dex */
public final class iiq implements ajpy {
    public static final Uri a = ajqa.g(4, "subscribe_button", "channelId");
    public final Uri b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final Boolean h;
    public final avbh i;
    public final avbl j;
    public final apos k;

    public iiq() {
    }

    public iiq(Uri uri, String str, long j, long j2, boolean z, boolean z2, Boolean bool, avbh avbhVar, avbl avblVar, apos aposVar) {
        this.b = uri;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = z2;
        this.h = bool;
        this.i = avbhVar;
        this.j = avblVar;
        this.k = aposVar;
    }

    public static Uri a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a.buildUpon().appendPath(str).build();
    }

    public static iip b(avaq avaqVar) {
        avbl avblVar;
        avbh avbhVar;
        iip c = c(avaqVar.f);
        c.c = Boolean.valueOf(avaqVar.l);
        avao avaoVar = avaqVar.p;
        if (avaoVar == null) {
            avaoVar = avao.a;
        }
        apos aposVar = null;
        if (avaoVar.b == 119226798) {
            avao avaoVar2 = avaqVar.p;
            if (avaoVar2 == null) {
                avaoVar2 = avao.a;
            }
            if (avaoVar2.b == 119226798) {
                avblVar = (avbl) avaoVar2.c;
            } else {
                avblVar = avbl.a;
            }
        } else {
            avblVar = null;
        }
        c.e = avblVar;
        avao avaoVar3 = avaqVar.p;
        if (avaoVar3 == null) {
            avaoVar3 = avao.a;
        }
        if (avaoVar3.b == 136076983) {
            avao avaoVar4 = avaqVar.p;
            if (avaoVar4 == null) {
                avaoVar4 = avao.a;
            }
            if (avaoVar4.b == 136076983) {
                avbhVar = (avbh) avaoVar4.c;
            } else {
                avbhVar = avbh.a;
            }
        } else {
            avbhVar = null;
        }
        c.d = avbhVar;
        apok apokVar = avaqVar.o;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 2) != 0) {
            apok apokVar2 = avaqVar.o;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            aposVar = apokVar2.d;
            if (aposVar == null) {
                aposVar = apos.a;
            }
        }
        c.f = aposVar;
        c.b(avaqVar.F);
        c.d(avaqVar.G);
        return c;
    }

    public static iip c(String str) {
        aqxo.p(!TextUtils.isEmpty(str));
        iip iipVar = new iip();
        if (str != null) {
            iipVar.b = str;
            Uri a2 = a(str);
            if (a2 != null) {
                iipVar.a = a2;
                iipVar.c(false);
                iipVar.e(false);
                iipVar.b(0L);
                iipVar.d(0L);
                return iipVar;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null channelId");
    }

    public static iiq d(ajqa ajqaVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ajpy b = ajqaVar.b(a(str));
        if (!(b instanceof iiq)) {
            return null;
        }
        return (iiq) b;
    }

    @Override // defpackage.ajpy
    public final ajpy e(ajpy ajpyVar) {
        long j;
        iiq iiqVar;
        iiq iiqVar2;
        if (!(ajpyVar instanceof iiq)) {
            return this;
        }
        iiq iiqVar3 = (iiq) ajpyVar;
        long j2 = this.d;
        if (j2 > 0 || iiqVar3.d > 0) {
            j = iiqVar3.d;
        } else {
            j2 = this.e;
            j = iiqVar3.e;
        }
        if (j2 != 0 && (j == 0 || j > j2)) {
            iiqVar2 = this;
            iiqVar = iiqVar3;
        } else {
            iiqVar = this;
            iiqVar2 = iiqVar3;
        }
        iip f = iiqVar.f();
        Boolean bool = iiqVar.h;
        if (bool == null) {
            bool = iiqVar2.h;
        }
        f.c = bool;
        f.d(Math.max(this.d, iiqVar3.d));
        f.b(Math.max(this.e, iiqVar3.e));
        if (iiqVar.i == null && iiqVar.j == null && iiqVar.k == null) {
            f.d = iiqVar2.i;
            f.e = iiqVar2.j;
            f.f = iiqVar2.k;
        }
        return f.a();
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        avbh avbhVar;
        avbl avblVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iiq) {
            iiq iiqVar = (iiq) obj;
            if (this.b.equals(iiqVar.b) && this.c.equals(iiqVar.c) && this.d == iiqVar.d && this.e == iiqVar.e && this.f == iiqVar.f && this.g == iiqVar.g && ((bool = this.h) != null ? bool.equals(iiqVar.h) : iiqVar.h == null) && ((avbhVar = this.i) != null ? avbhVar.equals(iiqVar.i) : iiqVar.i == null) && ((avblVar = this.j) != null ? avblVar.equals(iiqVar.j) : iiqVar.j == null)) {
                apos aposVar = this.k;
                apos aposVar2 = iiqVar.k;
                if (aposVar != null ? aposVar.equals(aposVar2) : aposVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final iip f() {
        return new iip(this);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        long j = this.d;
        long j2 = this.e;
        int i = (((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i2 = 1237;
        int i3 = (i ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        int i4 = (i3 ^ i2) * 1000003;
        Boolean bool = this.h;
        int i5 = 0;
        int hashCode3 = (i4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        avbh avbhVar = this.i;
        int hashCode4 = (hashCode3 ^ (avbhVar == null ? 0 : avbhVar.hashCode())) * 1000003;
        avbl avblVar = this.j;
        int hashCode5 = (hashCode4 ^ (avblVar == null ? 0 : avblVar.hashCode())) * 1000003;
        apos aposVar = this.k;
        if (aposVar != null) {
            i5 = aposVar.hashCode();
        }
        return hashCode5 ^ i5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        long j = this.d;
        long j2 = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        String valueOf2 = String.valueOf(this.h);
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 300 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("SubscribeButtonStateModel{uri=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(str);
        sb.append(", serverTimestamp=");
        sb.append(j);
        sb.append(", clientTimestamp=");
        sb.append(j2);
        sb.append(", subscriptionStateChanged=");
        sb.append(z);
        sb.append(", didRequireSignIn=");
        sb.append(z2);
        sb.append(", subscribed=");
        sb.append(valueOf2);
        sb.append(", subscriptionNotificationToggleButtonRenderer=");
        sb.append(valueOf3);
        sb.append(", subscriptionNotificationOptionsRenderer=");
        sb.append(valueOf4);
        sb.append(", toggleButtonRenderer=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
