package defpackage;

import com.google.android.libraries.social.populous.core.ContactMethodField;
/* renamed from: cytv  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cytv implements dbrn {
    static final dbrn a = new cytv();

    private cytv() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        ContactMethodField contactMethodField = (ContactMethodField) obj;
        if (contactMethodField.SA() == cyep.PROFILE_ID) {
            return contactMethodField.a().toString();
        }
        return contactMethodField.k();
    }
}
