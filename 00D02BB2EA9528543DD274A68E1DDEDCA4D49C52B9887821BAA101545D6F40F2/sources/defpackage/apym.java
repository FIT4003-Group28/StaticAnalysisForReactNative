package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: apym  reason: default package */
/* loaded from: classes2.dex */
final class apym extends apzc {
    private final apzb a;
    private final dbsg<ConversationId> b;
    private final dbsg<String> c;
    private final dbsg<String> d;
    private final dbsg<String> e;
    private final dbsg<Long> f;
    private final dbsg<apys> g;
    private final dbsg<dcep<String>> h;

    public apym(apzb apzbVar, dbsg<ConversationId> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<String> dbsgVar4, dbsg<Long> dbsgVar5, dbsg<apys> dbsgVar6, dbsg<dcep<String>> dbsgVar7) {
        this.a = apzbVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = dbsgVar4;
        this.f = dbsgVar5;
        this.g = dbsgVar6;
        this.h = dbsgVar7;
    }

    @Override // defpackage.apzc
    public final apzb a() {
        return this.a;
    }

    @Override // defpackage.apzc
    public final dbsg<ConversationId> b() {
        return this.b;
    }

    @Override // defpackage.apzc
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.apzc
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.apzc
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apzc) {
            apzc apzcVar = (apzc) obj;
            if (this.a.equals(apzcVar.a()) && this.b.equals(apzcVar.b()) && this.c.equals(apzcVar.c()) && this.d.equals(apzcVar.d()) && this.e.equals(apzcVar.e()) && this.f.equals(apzcVar.f()) && this.g.equals(apzcVar.g()) && this.h.equals(apzcVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.apzc
    public final dbsg<Long> f() {
        return this.f;
    }

    @Override // defpackage.apzc
    public final dbsg<apys> g() {
        return this.g;
    }

    @Override // defpackage.apzc
    public final dbsg<dcep<String>> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 164 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("OpenConversationParams{openConversationEntryPointType=");
        sb.append(valueOf);
        sb.append(", conversationId=");
        sb.append(valueOf2);
        sb.append(", intentArg=");
        sb.append(valueOf3);
        sb.append(", hintText=");
        sb.append(valueOf4);
        sb.append(", gaiaId=");
        sb.append(valueOf5);
        sb.append(", intentSentTimestampMs=");
        sb.append(valueOf6);
        sb.append(", businessInformation=");
        sb.append(valueOf7);
        sb.append(", categoryIds=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
