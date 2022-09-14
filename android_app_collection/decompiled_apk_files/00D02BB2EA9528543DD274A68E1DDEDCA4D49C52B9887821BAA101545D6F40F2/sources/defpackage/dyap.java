package defpackage;
/* compiled from: PG */
/* renamed from: dyap  reason: default package */
/* loaded from: classes6.dex */
public final class dyap implements dyao {
    public static final cxju<Boolean> a;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.h("AvatarFeature__enable_has_avatar_logging_in_lookups", true);
        cxjsVar.h("AvatarFeature__use_edge_in_lookups", true);
    }

    @Override // defpackage.dyao
    public final boolean a() {
        return a.f().booleanValue();
    }
}
