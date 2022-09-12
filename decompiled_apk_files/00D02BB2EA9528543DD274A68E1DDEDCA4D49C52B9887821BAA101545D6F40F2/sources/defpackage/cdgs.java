package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cdgs  reason: default package */
/* loaded from: classes4.dex */
public final class cdgs extends cdhf {
    private final cdgw a;
    private final dvlj b;

    public cdgs(dvlj dvljVar, Context context, ckcw ckcwVar) {
        this.b = dvljVar;
        int a = dvle.a(dvljVar.d);
        int i = (a == 0 ? 2 : a) - 1;
        this.a = i != 2 ? i != 3 ? new cdgu() : new cdgu() : new cdgz(dvljVar, context, ckcwVar);
    }

    @Override // defpackage.cdhf
    public final void b(cdhe cdheVar) {
        Bitmap bitmap = cdheVar.b;
        if (!this.b.a) {
            c(cdheVar);
        } else if (bitmap == null) {
            c(cdheVar);
        } else {
            cdgv a = this.a.a(bitmap);
            cdhg b = a.b();
            if (b != null) {
                cdheVar.b(b);
                c(cdheVar);
                return;
            }
            dcdc<cdgx> a2 = a.a();
            float f = 0.0f;
            if (!a2.isEmpty()) {
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    f = Math.max(f, a2.get(i).a());
                }
            }
            if (f >= this.b.c) {
                cdheVar.c(cdhg.FACE_DETECTION_FOUND_FACE, String.format(Locale.US, "Confidence: %f", Float.valueOf(f)));
            }
            c(cdheVar);
        }
    }
}
