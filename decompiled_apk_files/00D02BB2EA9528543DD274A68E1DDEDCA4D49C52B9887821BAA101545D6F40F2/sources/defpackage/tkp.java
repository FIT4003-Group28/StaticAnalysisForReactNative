package defpackage;
/* compiled from: PG */
/* renamed from: tkp  reason: default package */
/* loaded from: classes7.dex */
public final class tkp implements qgl {
    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.qgl
    public final /* bridge */ /* synthetic */ akvo a(vwm vwmVar, qhq qhqVar, qhq qhqVar2, qgn qgnVar) {
        b(vwmVar, 1);
        b(qhqVar, 2);
        b(qhqVar2, 3);
        b(qgnVar, 4);
        return new tko(qhqVar, qhqVar2, qgnVar);
    }
}
