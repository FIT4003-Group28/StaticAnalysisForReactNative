package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ancu  reason: default package */
/* loaded from: classes.dex */
public final class ancu extends ancg {
    private static final Set a;
    private static final anbq b;
    private final String c;
    private final Level d;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(anac.a, anaz.a)));
        a = unmodifiableSet;
        b = anbt.a(unmodifiableSet);
    }

    public ancu(String str, Level level) {
        super(str);
        this.c = ancv.e(str);
        this.d = level;
    }

    @Override // defpackage.anbf
    public final void c(anbe anbeVar) {
        e(anbeVar, this.c, this.d);
    }

    @Override // defpackage.anbf
    public final boolean d(Level level) {
        int d = ancv.d(level);
        return Log.isLoggable(this.c, d) || Log.isLoggable("all", d);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.anbe r17, java.lang.String r18, java.util.logging.Level r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ancu.e(anbe, java.lang.String, java.util.logging.Level):void");
    }
}
