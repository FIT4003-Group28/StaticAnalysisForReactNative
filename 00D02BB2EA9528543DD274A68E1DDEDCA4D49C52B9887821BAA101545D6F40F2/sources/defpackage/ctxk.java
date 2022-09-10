package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctxk  reason: default package */
/* loaded from: classes5.dex */
public final class ctxk extends ctxm {
    private Integer a;
    private dcdc<Long> l;
    private dbsg<ContactId> b = dbpy.a;
    private dbsg<String> c = dbpy.a;
    private dbsg<String> d = dbpy.a;
    private dbsg<ContactId> e = dbpy.a;
    private dbsg<ConversationId> f = dbpy.a;
    private dbsg<Integer> g = dbpy.a;
    private dbsg<Integer> h = dbpy.a;
    private dbsg<Integer> i = dbpy.a;
    private dbsg<Integer> j = dbpy.a;
    private dbsg<Integer> k = dbpy.a;
    private dbsg<cuil> m = dbpy.a;
    private dbsg<Integer> n = dbpy.a;
    private dbsg<Long> o = dbpy.a;
    private dbsg<ctyj> p = dbpy.a;
    private dbsg<ctxz> q = dbpy.a;

    @Override // defpackage.ctxm
    public final void b(ctxz ctxzVar) {
        this.q = dbsg.i(ctxzVar);
    }

    @Override // defpackage.ctxm
    public final void c(ContactId contactId) {
        this.e = dbsg.i(contactId);
    }

    @Override // defpackage.ctxm
    public final void d(ConversationId conversationId) {
        this.f = dbsg.i(conversationId);
    }

    @Override // defpackage.ctxm
    public final void e(long j) {
        this.o = dbsg.i(Long.valueOf(j));
    }

    @Override // defpackage.ctxm
    public final void f(int i) {
        this.h = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.ctxm
    public final void g(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.ctxm
    public final void h(dcdc<Long> dcdcVar) {
        if (dcdcVar != null) {
            this.l = dcdcVar;
            return;
        }
        throw new NullPointerException("Null experimentIds");
    }

    @Override // defpackage.ctxm
    public final void i(ctyj ctyjVar) {
        this.p = dbsg.i(ctyjVar);
    }

    @Override // defpackage.ctxm
    public final void j(int i) {
        this.g = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.ctxm
    public final void k(int i) {
        this.n = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.ctxm
    public final void l(int i) {
        this.j = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.ctxm
    public final void m(Integer num) {
        this.i = dbsg.i(num);
    }

    @Override // defpackage.ctxm
    public final void n(ContactId contactId) {
        this.b = dbsg.i(contactId);
    }

    @Override // defpackage.ctxm
    public final void o(String str) {
        this.c = dbsg.i(str);
    }

    @Override // defpackage.ctxm
    public final void p(String str) {
        this.d = dbsg.i(str);
    }

    @Override // defpackage.ctxm
    public final void q(int i) {
        this.k = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.ctxm
    public final void r(cuil cuilVar) {
        this.m = dbsg.i(cuilVar);
    }

    @Override // defpackage.ctxm
    public final ctxn a() {
        String str = this.a == null ? " eventType" : "";
        if (this.l == null) {
            str = str.concat(" experimentIds");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctxl(this.a.intValue(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }
}
