package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dctb  reason: default package */
/* loaded from: classes.dex */
public final class dctb extends dcsn {
    private static final Set<dcqy<?>> a;
    private static final dcrv<dcqx> b;
    private final String c;
    private final boolean d;

    static {
        Set<dcqy<?>> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(dcqj.a, dcrd.a)));
        a = unmodifiableSet;
        b = dcry.a(unmodifiableSet);
    }

    public dctb(String str) {
        this("", str, true, true);
    }

    public static void e(dcrj dcrjVar, boolean z) {
        boolean z2 = !z;
        dcro dcroVar = dcro.a;
        if (z2 || dcsk.e(dcrjVar, a)) {
            StringBuilder sb = new StringBuilder();
            if (!z2 || dcrjVar.h() == null) {
                dcsk.d(dcrjVar, dcroVar, b, sb);
            } else {
                sb.append("(REDACTED) ");
                sb.append(dcrjVar.h().b);
            }
            sb.toString();
        } else {
            dcsk.a(dcrjVar);
        }
        Throwable th = (Throwable) dcrjVar.l().e(dcqj.a);
        dcsv.b(dcrjVar.d());
    }

    @Override // defpackage.dcrl
    public final boolean b(Level level) {
        int b2 = dcsv.b(level);
        return Log.isLoggable(this.c, b2) || Log.isLoggable("all", b2);
    }

    @Override // defpackage.dcrl
    public final void c(dcrj dcrjVar) {
        e(dcrjVar, this.d);
    }

    public dctb(String str, String str2, boolean z, boolean z2) {
        super(str2);
        this.c = dcsv.a(str, str2, z);
        this.d = z2;
    }
}
