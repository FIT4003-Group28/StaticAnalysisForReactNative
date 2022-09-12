package defpackage;

import java.io.File;
/* renamed from: bdke  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdke implements dbrn {
    static final dbrn a = new bdke();

    private bdke() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        try {
            return Long.valueOf(new File((String) obj).lastModified());
        } catch (SecurityException unused) {
            return 0L;
        }
    }
}
