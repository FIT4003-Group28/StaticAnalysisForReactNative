package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: dakd  reason: default package */
/* loaded from: classes5.dex */
final class dakd implements dajs {
    @Override // defpackage.dajs
    public final boolean a(Object obj, File file, File file2) {
        try {
            Class<?> cls = Class.forName("dalvik.system.DexFile");
            try {
                return !((Boolean) Boolean.class.cast(dakl.e(cls, "isDexOptNeeded", String.class).invoke(null, file.getPath()))).booleanValue();
            } catch (Exception e) {
                throw new dakm(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e);
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
