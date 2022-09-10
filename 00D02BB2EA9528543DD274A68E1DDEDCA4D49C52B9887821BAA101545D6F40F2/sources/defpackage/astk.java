package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: astk  reason: default package */
/* loaded from: classes2.dex */
public final class astk {
    public static boolean a(Context context, btvo btvoVar, @dzsi akfa akfaVar, @dzsi dzsj<ckrp> dzsjVar, @dzsi daqq daqqVar, @dzsi asik asikVar) {
        if (akfaVar == null || !akfaVar.d()) {
            if (dzsjVar != null && ckri.a(context, akfaVar, btvoVar.getEnableFeatureParameters())) {
                return true;
            }
            return (asikVar == null || !asikVar.a()) && daqqVar != null && daqqVar.d;
        }
        return false;
    }
}
