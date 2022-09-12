package defpackage;

import android.text.TextUtils;
/* renamed from: blkp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blkp implements dbrn {
    static final dbrn a = new blkp();

    private blkp() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return TextUtils.concat("…", " ", (CharSequence) obj);
    }
}
