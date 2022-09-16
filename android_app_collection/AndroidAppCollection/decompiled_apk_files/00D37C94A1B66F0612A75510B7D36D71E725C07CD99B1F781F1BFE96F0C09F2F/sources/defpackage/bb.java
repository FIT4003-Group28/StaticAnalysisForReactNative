package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: bb  reason: default package */
/* loaded from: classes2.dex */
public class bb {
    @Deprecated
    public static ai a(dt dtVar) {
        return new ai(dtVar);
    }

    @Deprecated
    public static ai b(dt dtVar, ae aeVar) {
        if (aeVar == null) {
            aeVar = dtVar.getDefaultViewModelProviderFactory();
        }
        return new ai(dtVar.getViewModelStore(), aeVar);
    }
}
