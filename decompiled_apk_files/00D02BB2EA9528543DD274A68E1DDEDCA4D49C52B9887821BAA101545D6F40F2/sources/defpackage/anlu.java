package defpackage;
/* compiled from: PG */
/* renamed from: anlu  reason: default package */
/* loaded from: classes2.dex */
final class anlu extends dclu<dvay> {
    private static final int q(@dzsi dvay dvayVar) {
        if (dvayVar == null || dvayVar.b == 7) {
            return 0;
        }
        dwyn dwynVar = dvayVar.g;
        if (dwynVar == null) {
            dwynVar = dwyn.d;
        }
        long j = dwynVar.b;
        dwyn dwynVar2 = dvayVar.f;
        if (dwynVar2 == null) {
            dwynVar2 = dwyn.d;
        }
        return (int) (j - dwynVar2.b);
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(@dzsi Object obj, @dzsi Object obj2) {
        return q((dvay) obj) - q((dvay) obj2);
    }
}
