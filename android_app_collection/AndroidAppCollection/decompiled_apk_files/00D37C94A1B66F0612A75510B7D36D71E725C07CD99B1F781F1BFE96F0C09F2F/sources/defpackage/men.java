package defpackage;
/* compiled from: PG */
/* renamed from: men  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class men implements mep {
    private final /* synthetic */ int c;
    public static final /* synthetic */ men b = new men(1);
    public static final /* synthetic */ men a = new men();

    private /* synthetic */ men() {
    }

    private /* synthetic */ men(int i) {
        this.c = i;
    }

    @Override // defpackage.mep
    public final boolean a(Object obj, Object obj2) {
        if (this.c == 0) {
            atxk atxkVar = (atxk) obj;
            atxk atxkVar2 = (atxk) obj2;
            arag aragVar = atxkVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            arag aragVar2 = atxkVar2.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            if (!aragVar.equals(aragVar2)) {
                return false;
            }
            arhs arhsVar = atxkVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhs arhsVar2 = atxkVar2.g;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            if (!arhsVar.equals(arhsVar2)) {
                return false;
            }
            aunb aunbVar = atxkVar.l;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aunb aunbVar2 = atxkVar2.l;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return aunbVar.equals(aunbVar2);
        }
        atxh atxhVar = (atxh) obj2;
        arhs arhsVar3 = ((atxh) obj).g;
        if (arhsVar3 == null) {
            arhsVar3 = arhs.a;
        }
        arhs arhsVar4 = atxhVar.g;
        if (arhsVar4 == null) {
            arhsVar4 = arhs.a;
        }
        return arhsVar3.equals(arhsVar4);
    }
}
