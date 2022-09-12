package defpackage;
/* compiled from: PG */
/* renamed from: dybq  reason: default package */
/* loaded from: classes6.dex */
public final class dybq implements dybp {
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.h("PhotosDirectFeature__increment_selectionid_with_groups", true);
        b = cxjsVar.h("PhotosDirectFeature__log_selected_recipients_with_groups", true);
    }

    @Override // defpackage.dybp
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dybp
    public final boolean b() {
        return b.f().booleanValue();
    }
}
