package defpackage;

import java.io.File;
/* renamed from: bdkg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdkg implements dbrn {
    static final dbrn a = new bdkg();

    private bdkg() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Boolean.valueOf(new File((String) obj).exists());
    }
}
