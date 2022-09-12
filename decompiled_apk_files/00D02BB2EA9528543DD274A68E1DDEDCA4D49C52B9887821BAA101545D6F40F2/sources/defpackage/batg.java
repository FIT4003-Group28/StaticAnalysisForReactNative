package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: batg  reason: default package */
/* loaded from: classes3.dex */
public final class batg {
    private final Context a;

    public batg(Context context) {
        this.a = context;
    }

    public static final bate b(dndr dndrVar) {
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = dndrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return bate.WORK_VAGUE_SUGGESTION;
            }
            return bate.VAGUE_SUGGESTION;
        }
        return bate.HOME_VAGUE_SUGGESTION;
    }

    public final String a(dndr dndrVar, batf batfVar) {
        Context context = this.a;
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = dndrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return context.getString(batfVar.e);
            }
            return context.getString(batfVar.f);
        }
        return context.getString(batfVar.d);
    }
}
