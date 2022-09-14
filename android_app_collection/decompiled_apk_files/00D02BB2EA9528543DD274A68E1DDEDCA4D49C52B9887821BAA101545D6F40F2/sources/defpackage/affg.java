package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: affg  reason: default package */
/* loaded from: classes.dex */
final class affg extends affh {
    public affg(Context context) {
        super(context);
    }

    @Override // defpackage.affh
    public final boolean a(String str) {
        super.a(str);
        File file = new File((File) null, "shared_prefs");
        File file2 = new File(file, String.valueOf(str).concat(".xml"));
        File file3 = new File(String.valueOf(file2.getPath()).concat(".bak"));
        if (file.exists()) {
            file2.delete();
            file3.delete();
        }
        return !file2.exists() && !file3.exists();
    }
}
