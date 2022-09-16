package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cfh  reason: default package */
/* loaded from: classes.dex */
public final class cfh implements bud<cfg> {
    @Override // defpackage.btl
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bua buaVar) {
        try {
            cjb.b(((cfg) ((bxd) obj).b()).b(), file);
            return true;
        } catch (IOException unused) {
            if (!Log.isLoggable("GifEncoder", 5)) {
            }
            return false;
        }
    }

    @Override // defpackage.bud
    public final int b() {
        return 1;
    }
}
