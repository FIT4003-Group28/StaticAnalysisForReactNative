package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ceb  reason: default package */
/* loaded from: classes4.dex */
final class ceb implements cdk {
    private final cdz a;
    private final cje b;

    public ceb(cdz cdzVar, cje cjeVar) {
        this.a = cdzVar;
        this.b = cjeVar;
    }

    @Override // defpackage.cdk
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.cdk
    public final void b(bxn bxnVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                bxnVar.a(bitmap);
            }
            throw iOException;
        }
    }
}
