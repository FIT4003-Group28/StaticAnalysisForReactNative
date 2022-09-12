package defpackage;

import android.net.Uri;
import java.io.File;
/* renamed from: bcpm  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bcpm implements dbrn {
    static final dbrn a = new bcpm();

    private bcpm() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Uri.fromFile((File) obj);
    }
}
