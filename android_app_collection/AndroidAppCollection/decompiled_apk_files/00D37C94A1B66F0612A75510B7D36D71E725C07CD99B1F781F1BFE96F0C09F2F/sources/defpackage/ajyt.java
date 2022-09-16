package defpackage;
/* compiled from: PG */
/* renamed from: ajyt  reason: default package */
/* loaded from: classes.dex */
public class ajyt implements ajrt {
    private final int a;

    public ajyt(int i) {
        this.a = i;
    }

    @Override // defpackage.ajrt
    public void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        ajrsVar.f("showLineSeparator", Boolean.valueOf(b(ajqmVar, i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(ajqm ajqmVar, int i) {
        ajri l;
        boolean z = i == ajqmVar.a() + (-1);
        boolean z2 = !z && (ajqmVar instanceof ajrj) && (l = ((ajrj) ajqmVar).l(i)) != null && l.f(i) == l.a.a() + (-1);
        int i2 = this.a;
        if (i2 == 0) {
            return z || z2;
        } else if (i2 == 1) {
            return z2;
        } else {
            if (i2 == 2) {
                return z;
            }
            return false;
        }
    }
}
