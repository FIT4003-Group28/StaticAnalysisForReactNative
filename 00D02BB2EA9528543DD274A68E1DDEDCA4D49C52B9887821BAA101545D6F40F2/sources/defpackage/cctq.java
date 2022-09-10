package defpackage;

import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cctq  reason: default package */
/* loaded from: classes4.dex */
public final class cctq {
    public static void a(Bundle bundle, bwqv bwqvVar, bwrs<ilo> bwrsVar) {
        bwqvVar.c(bundle, "placemark_ref", bwrsVar);
    }

    public static bwrs<ilo> b(Bundle bundle, bwqv bwqvVar) {
        try {
            bwrs<ilo> e = bwqvVar.e(ilo.class, bundle, "placemark_ref");
            dbsk.s(e);
            return e;
        } catch (IOException | NullPointerException e2) {
            bvoo.f(new RuntimeException(e2));
            return bwrs.a(null);
        }
    }

    public static boolean c(Bundle bundle) {
        return bundle.containsKey("placemark_ref");
    }
}
