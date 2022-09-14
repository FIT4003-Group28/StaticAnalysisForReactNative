package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: dajr  reason: default package */
/* loaded from: classes5.dex */
final class dajr implements dajs {
    @Override // defpackage.dajs
    public final boolean a(Object obj, File file, File file2) {
        Class<?> cls = obj.getClass();
        try {
            return new File((String) String.class.cast(dakl.e(cls, "optimizedPathFor", File.class, File.class).invoke(null, file, file2))).exists();
        } catch (Exception e) {
            throw new dakm(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e);
        }
    }
}
