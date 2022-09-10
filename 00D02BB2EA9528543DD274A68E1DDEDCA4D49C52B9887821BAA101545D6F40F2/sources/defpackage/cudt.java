package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cudt  reason: default package */
/* loaded from: classes5.dex */
public final class cudt extends cugu {
    public final String a;
    public final ContactId b;
    public final ConversationId c;
    public final Long d;
    public final dbsg<String> e;
    public final cugm f;
    public final cugo g;
    public final dbsg<String> h;
    public final dcdn<String, dspd> i;
    public final int j;
    public final cugr k;
    public final int l;
    public final int m;
    public final int n;

    public cudt(String str, int i, ContactId contactId, ConversationId conversationId, Long l, dbsg<String> dbsgVar, cugm cugmVar, cugo cugoVar, dbsg<String> dbsgVar2, dcdn<String, dspd> dcdnVar, int i2, cugr cugrVar, int i3, int i4) {
        this.a = str;
        this.n = i;
        this.b = contactId;
        this.c = conversationId;
        this.d = l;
        this.e = dbsgVar;
        this.f = cugmVar;
        this.g = cugoVar;
        this.h = dbsgVar2;
        this.i = dcdnVar;
        this.j = i2;
        this.k = cugrVar;
        this.l = i3;
        this.m = i4;
    }

    @Override // defpackage.cugu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cugu
    public final ContactId b() {
        return this.b;
    }

    @Override // defpackage.cugu
    public final ConversationId c() {
        return this.c;
    }

    @Override // defpackage.cugu
    public final Long d() {
        return this.d;
    }

    @Override // defpackage.cugu
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cugu) {
            cugu cuguVar = (cugu) obj;
            if (this.a.equals(cuguVar.a())) {
                int i = this.n;
                int o = cuguVar.o();
                if (i == 0) {
                    throw null;
                }
                if (i == o && this.b.equals(cuguVar.b()) && this.c.equals(cuguVar.c()) && this.d.equals(cuguVar.d()) && this.e.equals(cuguVar.e()) && this.f.equals(cuguVar.f()) && this.g.equals(cuguVar.g()) && this.h.equals(cuguVar.h()) && this.i.equals(cuguVar.i()) && this.j == cuguVar.j() && this.k.equals(cuguVar.k()) && this.l == cuguVar.l() && this.m == cuguVar.m()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cugu
    public final cugm f() {
        return this.f;
    }

    @Override // defpackage.cugu
    public final cugo g() {
        return this.g;
    }

    @Override // defpackage.cugu
    public final dbsg<String> h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.n;
        if (i != 0) {
            return ((((((((((((((((((((((((hashCode ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m;
        }
        throw null;
    }

    @Override // defpackage.cugu
    public final dcdn<String, dspd> i() {
        return this.i;
    }

    @Override // defpackage.cugu
    public final int j() {
        return this.j;
    }

    @Override // defpackage.cugu
    public final cugr k() {
        return this.k;
    }

    @Override // defpackage.cugu
    public final int l() {
        return this.l;
    }

    @Override // defpackage.cugu
    public final int m() {
        return this.m;
    }

    @Override // defpackage.cugu
    public final cugi n() {
        return new cuds(this);
    }

    @Override // defpackage.cugu
    public final int o() {
        return this.n;
    }

    public final String toString() {
        String str = this.a;
        int i = this.n;
        String str2 = i != 1 ? i != 2 ? "null" : "OUTGOING" : "INCOMING";
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        int i2 = this.j;
        String valueOf9 = String.valueOf(this.k);
        int i3 = this.l;
        int i4 = this.m;
        int length = String.valueOf(str).length();
        int length2 = str2.length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("Message{messageId=");
        sb.append(str);
        sb.append(", messageType=");
        sb.append(str2);
        sb.append(", sender=");
        sb.append(valueOf);
        sb.append(", conversationId=");
        sb.append(valueOf2);
        sb.append(", serverTimestampUs=");
        sb.append(valueOf3);
        sb.append(", fallback=");
        sb.append(valueOf4);
        sb.append(", messageContent=");
        sb.append(valueOf5);
        sb.append(", messageStatus=");
        sb.append(valueOf6);
        sb.append(", snippet=");
        sb.append(valueOf7);
        sb.append(", metadata=");
        sb.append(valueOf8);
        sb.append(", capability=");
        sb.append(i2);
        sb.append(", renderingDetails=");
        sb.append(valueOf9);
        sb.append(", intendedRenderingType=");
        sb.append(i3);
        sb.append(", filterableFlags=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
