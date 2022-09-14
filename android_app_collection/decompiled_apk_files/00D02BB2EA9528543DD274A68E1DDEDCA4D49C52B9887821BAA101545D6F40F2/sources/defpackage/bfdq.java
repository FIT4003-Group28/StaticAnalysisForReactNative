package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bfdq  reason: default package */
/* loaded from: classes3.dex */
public final class bfdq {
    private static final long a = TimeUnit.HOURS.toSeconds(24);

    public static boolean a(@dzsi dgbg dgbgVar, cqat cqatVar) {
        if (dgbgVar != null && (dgbgVar.a & 32) != 0) {
            if (TimeUnit.MILLISECONDS.toSeconds(cqatVar.b()) - dgbgVar.d > a) {
                return true;
            }
        }
        return false;
    }
}
