package defpackage;

import android.content.Context;
import com.google.android.gms.languageprofile.LanguagePreference;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ckmc  reason: default package */
/* loaded from: classes.dex */
public final class ckmc {
    private final dxio<akfa> a;
    private final dbsg<cofu> b;

    public ckmc(dxio<akfa> dxioVar, Context context) {
        dbsg<cofu> i = dbsg.i(new cofu(context));
        this.a = dxioVar;
        this.b = i;
    }

    private final List<LanguagePreference> e() {
        bvrj.BACKGROUND_THREADPOOL.c();
        final String o = this.a.a().o();
        if (o == null) {
            return dcdc.e();
        }
        final LanguagePreferenceParams languagePreferenceParams = new LanguagePreferenceParams(-1.0f, 1, 2);
        cntc builder = cntd.builder();
        builder.a = new cnsr(o, languagePreferenceParams) { // from class: cofq
            private final String a;
            private final LanguagePreferenceParams b;

            {
                this.a = o;
                this.b = languagePreferenceParams;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                ((cofx) ((cofy) obj).L()).e(this.a, this.b, new cofs((cpct) obj2));
            }
        };
        cpcq<TResult> c = ((cofu) ((dbsu) this.b).a).c(builder.a());
        try {
            cpda.e(c, 1L, TimeUnit.MINUTES);
            List<LanguagePreference> list = (List) c.d();
            if (list != null) {
                return list;
            }
        } catch (TimeoutException | Exception unused) {
        }
        return dcdc.e();
    }

    @dzsi
    public final String a() {
        return b(dcdc.e());
    }

    @dzsi
    public final String b(final dcdc<String> dcdcVar) {
        dcbg s = dcbg.b(e()).s(cklw.a).s(cklx.a);
        dcdcVar.getClass();
        return (String) s.r(dbst.a(new dbsl(dcdcVar) { // from class: ckly
            private final dcdc a;

            {
                this.a = dcdcVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.contains((String) obj);
            }
        })).f();
    }

    public final List<String> c() {
        return dcbg.b(e()).s(cklz.a).s(ckma.a).z();
    }

    public final List<Locale> d() {
        return dcbg.b(e()).s(ckmb.a).z();
    }
}
