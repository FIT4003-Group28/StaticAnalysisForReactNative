package defpackage;

import java.io.File;
/* renamed from: bdfu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdfu implements dbsl {
    static final dbsl a = new bdfu();

    private bdfu() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        return new File(((bbtm) obj).r().b()).exists();
    }
}
