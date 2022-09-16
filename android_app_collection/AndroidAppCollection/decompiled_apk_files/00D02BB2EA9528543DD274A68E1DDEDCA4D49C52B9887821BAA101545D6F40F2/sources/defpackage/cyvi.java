package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyvi  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyvi implements cyft, cyff {
    public dcdc<Integer> h = null;

    public static cyvh h(cyvy cyvyVar) {
        cyuk cyukVar = new cyuk();
        cyukVar.f(dcdc.e());
        cyfj a = cyvyVar.a();
        if (a != null) {
            cyukVar.a = a;
            cyukVar.b = cyvyVar.d();
            String b = cyvyVar.b();
            if (b != null) {
                cyukVar.c = b;
                cyukVar.e = cyvyVar.h();
                cygd l = PersonFieldMetadata.l();
                l.k(cyvyVar.c());
                cyukVar.d = l.i();
                cyukVar.f = cyvyVar.e();
                cyukVar.f(cyvyVar.f());
                return cyukVar;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null fieldType");
    }

    public abstract cyfj a();

    @Override // defpackage.cyft
    public abstract PersonFieldMetadata b();

    @dzsi
    public abstract String c();

    public abstract String d();

    @dzsi
    public abstract Email.ExtendedData e();

    public abstract dcdc<Email.Certificate> f();

    public abstract cyvh g();

    @dzsi
    public abstract String k();
}
