package defpackage;
/* compiled from: PG */
/* renamed from: dyas  reason: default package */
/* loaded from: classes6.dex */
public final class dyas implements dyar {
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;
    public static final cxju<Boolean> c;
    public static final cxju<Boolean> d;
    public static final cxju<Boolean> e;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.h("ClientApiFeature__disable_empty_query_autocomplete_callback", true);
        b = cxjsVar.h("ClientApiFeature__enable_lean_autocomplete_boosting", false);
        c = cxjsVar.h("ClientApiFeature__enable_lean_autocomplete_filtering", false);
        d = cxjsVar.h("ClientApiFeature__enable_non_lean_autocomplete_boosting", false);
        e = cxjsVar.h("ClientApiFeature__enable_send_target_type_conversion", false);
    }

    @Override // defpackage.dyar
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dyar
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // defpackage.dyar
    public final boolean c() {
        return c.f().booleanValue();
    }

    @Override // defpackage.dyar
    public final boolean d() {
        return d.f().booleanValue();
    }

    @Override // defpackage.dyar
    public final boolean e() {
        return e.f().booleanValue();
    }
}
