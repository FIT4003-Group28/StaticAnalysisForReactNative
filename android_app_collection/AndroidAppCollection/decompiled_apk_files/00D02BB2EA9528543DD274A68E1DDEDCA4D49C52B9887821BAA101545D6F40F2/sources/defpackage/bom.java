package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bom  reason: default package */
/* loaded from: classes3.dex */
final class bom {
    private static final bph a = bph.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(bpj bpjVar) {
        bpjVar.d();
        int n = (int) (bpjVar.n() * 255.0d);
        int n2 = (int) (bpjVar.n() * 255.0d);
        int n3 = (int) (bpjVar.n() * 255.0d);
        while (bpjVar.h()) {
            bpjVar.p();
        }
        bpjVar.e();
        return Color.argb(255, n, n2, n3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> b(bpj bpjVar, float f) {
        ArrayList arrayList = new ArrayList();
        bpjVar.d();
        while (bpjVar.r() == 1) {
            bpjVar.d();
            arrayList.add(c(bpjVar, f));
            bpjVar.e();
        }
        bpjVar.e();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF c(bpj bpjVar, float f) {
        int r = bpjVar.r();
        int i = r - 1;
        if (r != 0) {
            if (i == 0) {
                bpjVar.d();
                float n = (float) bpjVar.n();
                float n2 = (float) bpjVar.n();
                while (bpjVar.r() != 2) {
                    bpjVar.p();
                }
                bpjVar.e();
                return new PointF(n * f, n2 * f);
            } else if (i != 2) {
                if (i == 6) {
                    float n3 = (float) bpjVar.n();
                    float n4 = (float) bpjVar.n();
                    while (bpjVar.h()) {
                        bpjVar.p();
                    }
                    return new PointF(n3 * f, n4 * f);
                }
                String a2 = bpi.a(bpjVar.r());
                StringBuilder sb = new StringBuilder(a2.length() + 26);
                sb.append("Unknown point starts with ");
                sb.append(a2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                bpjVar.f();
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (bpjVar.h()) {
                    int j = bpjVar.j(a);
                    if (j == 0) {
                        f2 = d(bpjVar);
                    } else if (j == 1) {
                        f3 = d(bpjVar);
                    } else {
                        bpjVar.k();
                        bpjVar.p();
                    }
                }
                bpjVar.g();
                return new PointF(f2 * f, f3 * f);
            }
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(bpj bpjVar) {
        int r = bpjVar.r();
        int i = r - 1;
        if (r != 0) {
            if (i == 0) {
                bpjVar.d();
                float n = (float) bpjVar.n();
                while (bpjVar.h()) {
                    bpjVar.p();
                }
                bpjVar.e();
                return n;
            } else if (i != 6) {
                String a2 = bpi.a(r);
                StringBuilder sb = new StringBuilder(a2.length() + 32);
                sb.append("Unknown value for token of type ");
                sb.append(a2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                return (float) bpjVar.n();
            }
        }
        throw null;
    }
}
