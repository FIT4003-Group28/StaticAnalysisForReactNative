package defpackage;
/* compiled from: PG */
/* renamed from: dazm  reason: default package */
/* loaded from: classes.dex */
public class dazm {
    private final aim a;
    public boolean b = false;

    public dazm(aim aimVar) {
        this.a = aimVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (dazm dazmVar = this; dazmVar != null; dazmVar = null) {
            for (int i = 0; i < dazmVar.a.j; i++) {
                sb.append(this.a.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
