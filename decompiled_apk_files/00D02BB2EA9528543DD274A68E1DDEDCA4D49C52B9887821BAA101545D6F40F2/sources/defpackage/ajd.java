package defpackage;
/* compiled from: PG */
/* renamed from: ajd  reason: default package */
/* loaded from: classes2.dex */
public final class ajd {
    public static <T> dehn<T> a(aja<T> ajaVar) {
        aiy<T> aiyVar = new aiy<>();
        ajc<T> ajcVar = new ajc<>(aiyVar);
        aiyVar.b = ajcVar;
        aiyVar.a = ajaVar.getClass();
        try {
            Object a = ajaVar.a(aiyVar);
            if (a != null) {
                aiyVar.a = a;
            }
        } catch (Exception e) {
            ajcVar.b(e);
        }
        return ajcVar;
    }
}
