package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ctzb  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctzb implements Serializable {
    public static ctza g() {
        return new cucf();
    }

    private final ContactId i(String str) {
        cufk f = ContactId.f();
        f.c(str);
        f.e(ContactId.ContactType.EMAIL);
        f.d(d());
        return f.a();
    }

    private final ContactId j(String str) {
        cufk f = ContactId.f();
        f.c(str);
        f.e(ContactId.ContactType.DEVICE_ID);
        f.d(d());
        return f.a();
    }

    public abstract dbsg<String> a();

    public abstract Set<String> b();

    public abstract dbsg<String> c();

    public abstract String d();

    public final ContactId e() {
        if (a().a()) {
            return i(a().b());
        }
        if (c().a()) {
            return j(c().b());
        }
        return h(b().iterator().next());
    }

    public final dcdc<ContactId> f() {
        dccx F = dcdc.F();
        if (a().a()) {
            F.g(i(a().b()));
        }
        if (c().a()) {
            F.g(j(c().b()));
        }
        F.i(dcbg.b(b()).s(new dbrn(this) { // from class: ctyz
            private final ctzb a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.h((String) obj);
            }
        }));
        return F.f();
    }

    public final ContactId h(String str) {
        cufk f = ContactId.f();
        f.c(str);
        f.e(ContactId.ContactType.PHONE_NUMBER);
        f.d(d());
        return f.a();
    }
}
