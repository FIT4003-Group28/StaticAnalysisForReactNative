package defpackage;

import android.content.Context;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: mfw  reason: default package */
/* loaded from: classes7.dex */
public final class mfw {
    public final akfa a;
    public final Context b;
    public final mfs c;
    public final nkz d;
    public final ckco e;

    public mfw(Context context, dbty<Calendar> dbtyVar, mfs mfsVar, ckcw ckcwVar, akfa akfaVar) {
        dbsk.s(akfaVar);
        this.a = akfaVar;
        this.b = context;
        this.c = mfsVar;
        this.d = new nkz(dbtyVar);
        this.e = (ckco) ckcwVar.a(ckee.aa);
    }

    public static boolean a(ldm ldmVar) {
        return ldmVar.h.b.equals(dpjs.ENTITY_TYPE_HOME) || ldmVar.h.b.equals(dpjs.ENTITY_TYPE_WORK);
    }
}
