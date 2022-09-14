package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: ctxl  reason: default package */
/* loaded from: classes5.dex */
final class ctxl extends ctxn {
    private final int a;
    private final dbsg<ContactId> b;
    private final dbsg<String> c;
    private final dbsg<String> d;
    private final dbsg<ContactId> e;
    private final dbsg<ConversationId> f;
    private final dbsg<Integer> g;
    private final dbsg<Integer> h;
    private final dbsg<Integer> i;
    private final dbsg<Integer> j;
    private final dbsg<Integer> k;
    private final dcdc<Long> l;
    private final dbsg<cuil> m;
    private final dbsg<Integer> n;
    private final dbsg<Long> o;
    private final dbsg<ctyj> p;
    private final dbsg<ctxz> q;

    public ctxl(int i, dbsg<ContactId> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<ContactId> dbsgVar4, dbsg<ConversationId> dbsgVar5, dbsg<Integer> dbsgVar6, dbsg<Integer> dbsgVar7, dbsg<Integer> dbsgVar8, dbsg<Integer> dbsgVar9, dbsg<Integer> dbsgVar10, dcdc<Long> dcdcVar, dbsg<cuil> dbsgVar11, dbsg<Integer> dbsgVar12, dbsg<Long> dbsgVar13, dbsg<ctyj> dbsgVar14, dbsg<ctxz> dbsgVar15) {
        this.a = i;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = dbsgVar4;
        this.f = dbsgVar5;
        this.g = dbsgVar6;
        this.h = dbsgVar7;
        this.i = dbsgVar8;
        this.j = dbsgVar9;
        this.k = dbsgVar10;
        this.l = dcdcVar;
        this.m = dbsgVar11;
        this.n = dbsgVar12;
        this.o = dbsgVar13;
        this.p = dbsgVar14;
        this.q = dbsgVar15;
    }

    @Override // defpackage.ctxn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ctxn
    public final dbsg<ContactId> b() {
        return this.b;
    }

    @Override // defpackage.ctxn
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.ctxn
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.ctxn
    public final dbsg<ContactId> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctxn) {
            ctxn ctxnVar = (ctxn) obj;
            if (this.a == ctxnVar.a() && this.b.equals(ctxnVar.b()) && this.c.equals(ctxnVar.c()) && this.d.equals(ctxnVar.d()) && this.e.equals(ctxnVar.e()) && this.f.equals(ctxnVar.f()) && this.g.equals(ctxnVar.g()) && this.h.equals(ctxnVar.h()) && this.i.equals(ctxnVar.i()) && this.j.equals(ctxnVar.j()) && this.k.equals(ctxnVar.k()) && dchl.m(this.l, ctxnVar.l()) && this.m.equals(ctxnVar.m()) && this.n.equals(ctxnVar.n()) && this.o.equals(ctxnVar.o()) && this.p.equals(ctxnVar.p()) && this.q.equals(ctxnVar.q())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctxn
    public final dbsg<ConversationId> f() {
        return this.f;
    }

    @Override // defpackage.ctxn
    public final dbsg<Integer> g() {
        return this.g;
    }

    @Override // defpackage.ctxn
    public final dbsg<Integer> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.ctxn
    public final dbsg<Integer> i() {
        return this.i;
    }

    @Override // defpackage.ctxn
    public final dbsg<Integer> j() {
        return this.j;
    }

    @Override // defpackage.ctxn
    public final dbsg<Integer> k() {
        return this.k;
    }

    @Override // defpackage.ctxn
    public final dcdc<Long> l() {
        return this.l;
    }

    @Override // defpackage.ctxn
    public final dbsg<cuil> m() {
        return this.m;
    }

    @Override // defpackage.ctxn
    public final dbsg<Integer> n() {
        return this.n;
    }

    @Override // defpackage.ctxn
    public final dbsg<Long> o() {
        return this.o;
    }

    @Override // defpackage.ctxn
    public final dbsg<ctyj> p() {
        return this.p;
    }

    @Override // defpackage.ctxn
    public final dbsg<ctxz> q() {
        return this.q;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        String valueOf11 = String.valueOf(this.l);
        String valueOf12 = String.valueOf(this.m);
        String valueOf13 = String.valueOf(this.n);
        String valueOf14 = String.valueOf(this.o);
        String valueOf15 = String.valueOf(this.p);
        String valueOf16 = String.valueOf(this.q);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        int length13 = String.valueOf(valueOf13).length();
        int length14 = String.valueOf(valueOf14).length();
        StringBuilder sb = new StringBuilder(length + 326 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + String.valueOf(valueOf15).length() + String.valueOf(valueOf16).length());
        sb.append("LighterLogData{eventType=");
        sb.append(i);
        sb.append(", source=");
        sb.append(valueOf);
        sb.append(", sourceRegistrationId=");
        sb.append(valueOf2);
        sb.append(", traceId=");
        sb.append(valueOf3);
        sb.append(", destContactId=");
        sb.append(valueOf4);
        sb.append(", destConversationId=");
        sb.append(valueOf5);
        sb.append(", lighterTransportEventType=");
        sb.append(valueOf6);
        sb.append(", eventDetail=");
        sb.append(valueOf7);
        sb.append(", rpcResponseCode=");
        sb.append(valueOf8);
        sb.append(", messageOrigin=");
        sb.append(valueOf9);
        sb.append(", unsupportedCapability=");
        sb.append(valueOf10);
        sb.append(", experimentIds=");
        sb.append(valueOf11);
        sb.append(", visualElementDetail=");
        sb.append(valueOf12);
        sb.append(", linkType=");
        sb.append(valueOf13);
        sb.append(", elapsedTimeUs=");
        sb.append(valueOf14);
        sb.append(", lighterMessageTypeDetail=");
        sb.append(valueOf15);
        sb.append(", bootstrapDetail=");
        sb.append(valueOf16);
        sb.append("}");
        return sb.toString();
    }
}
