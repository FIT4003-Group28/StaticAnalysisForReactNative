package defpackage;

import android.content.Context;
import com.google.android.filament.R;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.android.AndroidLibAutocompleteSession;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
/* compiled from: PG */
/* renamed from: lni  reason: default package */
/* loaded from: classes7.dex */
public final class lni implements lno {
    private final Context a;
    private final lng b;
    @dzsi
    private cxye c;
    @dzsi
    private ContactMethodField d;

    public lni(Context context, lng lngVar) {
        this.a = context;
        this.b = lngVar;
    }

    private static ContactMethodField g(Person person) {
        return person.p().get(0);
    }

    private final void h() {
        cxye cxyeVar = this.c;
        dbsk.s(cxyeVar);
        synchronized (cxyeVar.k) {
            cxyeVar.k.clear();
        }
        this.c = null;
    }

    @Override // defpackage.lno
    public final void a(String str, cxyp cxypVar) {
        cyah cyahVar;
        lng lngVar = this.b;
        synchronized (lngVar.c) {
            cyahVar = lngVar.c.get(str);
            if (cyahVar == null) {
                cyag cyagVar = new cyag();
                cyagVar.e(str, "com.google");
                cyagVar.f(lngVar.a);
                cyagVar.g(cybq.b());
                cyagVar.g = lngVar.b;
                cyahVar = cyagVar.d();
                lngVar.c.put(str, cyahVar);
            }
        }
        Context context = this.a;
        cyec a = cybq.a();
        a.f(ClientId.f);
        a.g(cygp.FIELD_FLATTENED);
        a.m(true);
        a.h(100);
        cygu a2 = SocialAffinityAllEventSource.a();
        a2.c(163);
        a2.g(R.styleable.AppCompatTheme_windowActionModeOverlay);
        a2.e(813);
        a2.b(164);
        a2.f(162);
        a2.d(814);
        a.h = a2.a();
        AndroidLibAutocompleteSession a3 = cyahVar.a(context, a.b(), null, cxypVar);
        this.c = a3;
        a3.e("");
    }

    @Override // defpackage.lno
    public final void b() {
        if (this.d == null) {
            try {
                cxye cxyeVar = this.c;
                dbsk.s(cxyeVar);
                cxyeVar.o(3, new ContactMethodField[0]);
                h();
            } catch (cxzr e) {
                throw new IllegalStateException("May only call one of onShareCanceled(), onMenuDismissed() and onShareInitiated()", e);
            }
        }
    }

    @Override // defpackage.lno
    public final void c(Person person) {
        cxye cxyeVar = this.c;
        dbsk.s(cxyeVar);
        cxyeVar.j(g(person));
    }

    @Override // defpackage.lno
    public final void d(Person person) {
        ContactMethodField g = g(person);
        dbsk.s(g);
        this.d = g;
        cxye cxyeVar = this.c;
        dbsk.s(cxyeVar);
        cxyeVar.l(this.d);
    }

    @Override // defpackage.lno
    public final void e() {
        ContactMethodField contactMethodField = this.d;
        dbsk.s(contactMethodField);
        try {
            cxye cxyeVar = this.c;
            dbsk.s(cxyeVar);
            cxyeVar.o(2, new ContactMethodField[]{contactMethodField});
            h();
        } catch (cxzr e) {
            throw new IllegalStateException("May only call one of onShareCanceled(), onMenuDismissed() and onShareInitiated()", e);
        }
    }

    @Override // defpackage.lno
    public final void f() {
        dbsk.s(this.d);
        cxye cxyeVar = this.c;
        dbsk.s(cxyeVar);
        cxyeVar.k(this.d);
        try {
            cxye cxyeVar2 = this.c;
            dbsk.s(cxyeVar2);
            cxyeVar2.o(3, new ContactMethodField[0]);
            h();
        } catch (cxzr e) {
            throw new IllegalStateException("May only call one of onShareCanceled(), onMenuDismissed() and onShareInitiated()", e);
        }
    }
}
