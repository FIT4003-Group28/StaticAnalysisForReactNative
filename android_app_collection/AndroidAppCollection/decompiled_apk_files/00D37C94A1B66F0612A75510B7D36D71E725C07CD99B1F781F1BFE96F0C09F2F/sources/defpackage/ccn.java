package defpackage;

import android.graphics.Path;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccn  reason: default package */
/* loaded from: classes2.dex */
public final class ccn {
    private static final ccv a = ccv.a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cax a(ccw ccwVar, bwx bwxVar) {
        cab cabVar = null;
        String str = null;
        bzy bzyVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                str = ccwVar.h();
            } else if (c == 1) {
                bzyVar = lg.i(ccwVar, bwxVar);
            } else if (c == 2) {
                cabVar = lg.m(ccwVar, bwxVar);
            } else if (c == 3) {
                z = ccwVar.q();
            } else if (c == 4) {
                i = ccwVar.b();
            } else if (c == 5) {
                z2 = ccwVar.q();
            } else {
                ccwVar.n();
                ccwVar.o();
            }
        }
        return new cax(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, bzyVar, cabVar == null ? new cab(Collections.singletonList(new cdi(100))) : cabVar, z2);
    }
}
