package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cudd  reason: default package */
/* loaded from: classes5.dex */
public final class cudd extends cufp {
    public final ConversationId a;
    public final dbsg<String> b;
    public final dbsg<String> c;
    public final dbsg<Bitmap> d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final boolean h;
    public final Map<String, byte[]> i;
    public final dbsg<cuib> j;
    public final dcdc<Integer> k;
    public final Long l;
    public final Long m;

    public cudd(ConversationId conversationId, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<Bitmap> dbsgVar3, boolean z, Long l, Long l2, boolean z2, Map<String, byte[]> map, dbsg<cuib> dbsgVar4, dcdc<Integer> dcdcVar, Long l3, Long l4) {
        this.a = conversationId;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = z;
        this.f = l;
        this.g = l2;
        this.h = z2;
        this.i = map;
        this.j = dbsgVar4;
        this.k = dcdcVar;
        this.l = l3;
        this.m = l4;
    }

    @Override // defpackage.cufp
    public final ConversationId a() {
        return this.a;
    }

    @Override // defpackage.cufp
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.cufp
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.cufp
    public final dbsg<Bitmap> d() {
        return this.d;
    }

    @Override // defpackage.cufp
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.cufp
    public final Long f() {
        return this.f;
    }

    @Override // defpackage.cufp
    public final Long g() {
        return this.g;
    }

    @Override // defpackage.cufp
    public final boolean h() {
        return this.h;
    }

    @Override // defpackage.cufp
    public final Map<String, byte[]> i() {
        return this.i;
    }

    @Override // defpackage.cufp
    public final dbsg<cuib> j() {
        return this.j;
    }

    @Override // defpackage.cufp
    public final dcdc<Integer> k() {
        return this.k;
    }

    @Override // defpackage.cufp
    public final Long l() {
        return this.l;
    }

    @Override // defpackage.cufp
    public final Long m() {
        return this.m;
    }

    @Override // defpackage.cufp
    public final cufo n() {
        return new cudc(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        boolean z2 = this.h;
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        String valueOf11 = String.valueOf(this.m);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        StringBuilder sb = new StringBuilder(length + 235 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("Conversation{conversationId=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(valueOf2);
        sb.append(", imageUrl=");
        sb.append(valueOf3);
        sb.append(", image=");
        sb.append(valueOf4);
        sb.append(", isImageStale=");
        sb.append(z);
        sb.append(", expirationTimeMillis=");
        sb.append(valueOf5);
        sb.append(", lastDeletedTimeMillis=");
        sb.append(valueOf6);
        sb.append(", blockable=");
        sb.append(z2);
        sb.append(", appData=");
        sb.append(valueOf7);
        sb.append(", suggestionList=");
        sb.append(valueOf8);
        sb.append(", capabilities=");
        sb.append(valueOf9);
        sb.append(", propertiesExpirationTimeMillis=");
        sb.append(valueOf10);
        sb.append(", serverTimestampUs=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }
}
