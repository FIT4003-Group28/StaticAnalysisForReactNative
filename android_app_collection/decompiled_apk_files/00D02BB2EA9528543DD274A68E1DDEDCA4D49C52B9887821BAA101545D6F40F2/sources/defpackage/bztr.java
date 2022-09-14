package defpackage;

import android.provider.MediaStore;
/* renamed from: bztr  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bztr implements dbrn {
    static final dbrn a = new bztr();

    private bztr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String str = bzud.a;
        if (((bbti) obj).equals(bbti.VIDEO)) {
            return MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }
}
