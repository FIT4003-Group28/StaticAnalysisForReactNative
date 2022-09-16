package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: uoc  reason: default package */
/* loaded from: classes4.dex */
public final class uoc {
    public final uof a;
    public final uld b;
    public final ujx c;
    public final Class d;
    public final uox e;
    public final upq f;
    public final umq g;
    private final ExecutorService h;
    private final toq i;

    public uoc() {
    }

    public uoc(uof uofVar, uld uldVar, ExecutorService executorService, ujx ujxVar, Class cls, uox uoxVar, toq toqVar, upq upqVar, umq umqVar) {
        this.a = uofVar;
        this.b = uldVar;
        this.h = executorService;
        this.c = ujxVar;
        this.d = cls;
        this.e = uoxVar;
        this.i = toqVar;
        this.f = upqVar;
        this.g = umqVar;
    }

    public static uob a(Context context, Class cls) {
        uob uobVar = new uob();
        uobVar.b = cls;
        uobVar.g(new uoa());
        uobVar.a = context.getApplicationContext();
        return uobVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uoc) {
            uoc uocVar = (uoc) obj;
            if (this.a.equals(uocVar.a) && this.b.equals(uocVar.b) && this.h.equals(uocVar.h) && this.c.equals(uocVar.c) && this.d.equals(uocVar.d) && this.e.equals(uocVar.e) && this.i.equals(uocVar.i) && this.f.equals(uocVar.f) && this.g.equals(uocVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.c);
        String valueOf5 = String.valueOf(this.d);
        String valueOf6 = String.valueOf(this.e);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.f);
        String valueOf9 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 202 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("ExpressSignInManager{limitedAvailableAccountsModel=");
        sb.append(valueOf);
        sb.append(", internalAccountsModel=");
        sb.append(valueOf2);
        sb.append(", backgroundExecutor=");
        sb.append(valueOf3);
        sb.append(", avatarImageLoader=");
        sb.append(valueOf4);
        sb.append(", accountClass=");
        sb.append(valueOf5);
        sb.append(", oneGoogleEventLogger=");
        sb.append(valueOf6);
        sb.append(", vePrimitives=");
        sb.append(valueOf7);
        sb.append(", visualElements=");
        sb.append(valueOf8);
        sb.append(", accountLayer=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}
