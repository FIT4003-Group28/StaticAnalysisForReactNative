package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cqb  reason: default package */
/* loaded from: classes3.dex */
final class cqb implements cpk {
    private final cpz a;
    private final cuv b;

    public cqb(cpz cpzVar, cuv cuvVar) {
        this.a = cpzVar;
        this.b = cuvVar;
    }

    @Override // defpackage.cpk
    public final void a(cld cldVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                cldVar.d(bitmap);
            }
            throw iOException;
        }
    }

    @Override // defpackage.cpk
    public final void b() {
        this.a.a();
    }
}
