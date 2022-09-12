package defpackage;

import java.io.File;
/* renamed from: bztt  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bztt implements dbrn {
    static final dbrn a = new bztt();

    private bztt() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Boolean.valueOf(new File((String) obj).exists());
    }
}
