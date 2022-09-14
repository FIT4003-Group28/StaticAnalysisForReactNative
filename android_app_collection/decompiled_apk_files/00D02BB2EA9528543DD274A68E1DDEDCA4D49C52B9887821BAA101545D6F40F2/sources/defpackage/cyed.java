package defpackage;

import com.google.android.libraries.social.populous.core.Photo;
/* renamed from: cyed  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyed implements dbrn {
    static final dbrn a = new cyed();

    private cyed() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cyeh cyehVar = cyeh.PROFILE_PREFERRED;
        boolean z = false;
        if ((obj instanceof Photo) && ((Photo) obj).d()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
