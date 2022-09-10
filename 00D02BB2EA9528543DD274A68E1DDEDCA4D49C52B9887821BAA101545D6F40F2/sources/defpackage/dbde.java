package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbde  reason: default package */
/* loaded from: classes5.dex */
public final class dbde {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbeb a(dbcm dbcmVar, dbeb dbebVar, dbip dbipVar) {
        dbeb r = dbcmVar.r(dbebVar);
        View view = dbipVar.b;
        int width = view.getWidth();
        int height = view.getHeight();
        int width2 = dbipVar.b.getWidth();
        float f = dbipVar.k.a(dbipVar.b).a;
        float f2 = f == 0.0f ? 0.0f : width2 / f;
        int i = (int) (r.a * f2);
        int i2 = (int) (r.b * f2);
        int i3 = width / 2;
        int i4 = dbipVar.m;
        int i5 = i4 - 1;
        if (i4 != 0) {
            if (i5 == 0) {
                i2 = height - i2;
            }
            int i6 = dbipVar.n;
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i7 == 1) {
                i += i3;
            }
            return new dbeb(i, i2, 0.0f);
        }
        throw null;
    }
}
