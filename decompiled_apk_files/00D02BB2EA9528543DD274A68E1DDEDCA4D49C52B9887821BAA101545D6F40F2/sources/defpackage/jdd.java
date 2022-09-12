package defpackage;

import android.net.Uri;
import java.io.File;
/* renamed from: jdd  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class jdd implements dbrn {
    static final dbrn a = new jdd();

    private jdd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Uri.fromFile((File) obj);
    }
}
