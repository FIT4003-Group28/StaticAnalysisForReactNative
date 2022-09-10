package defpackage;

import android.graphics.Color;
/* compiled from: PG */
/* renamed from: ctuh  reason: default package */
/* loaded from: classes5.dex */
public final class ctuh {
    public static dugy a(int i) {
        dugx bZ = dugy.e.bZ();
        float d = d(Color.red(i));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dugy) bZ.b).a = d;
        float d2 = d(Color.green(i));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dugy) bZ.b).b = d2;
        float d3 = d(Color.blue(i));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dugy) bZ.b).c = d3;
        dsql bZ2 = dsqm.b.bZ();
        float d4 = d(Color.alpha(i));
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dsqm) bZ2.b).a = d4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsqm bK = bZ2.bK();
        bK.getClass();
        ((dugy) bZ.b).d = bK;
        return bZ.bK();
    }

    private static int c(float f) {
        if (f <= 1.0f) {
            f *= 255.0f;
        }
        int i = (int) f;
        if (i < 0) {
            return 0;
        }
        if (i <= 255) {
            return i;
        }
        return 255;
    }

    private static float d(int i) {
        return i / 255.0f;
    }

    public static int b(dugy dugyVar) {
        int c = c(dugyVar.a);
        int c2 = c(dugyVar.b);
        int c3 = c(dugyVar.c);
        dsqm dsqmVar = dugyVar.d;
        if (dsqmVar == null) {
            return Color.rgb(c, c2, c3);
        }
        return Color.argb(c(dsqmVar.a), c, c2, c3);
    }
}
