package defpackage;
/* compiled from: PG */
/* renamed from: andg  reason: default package */
/* loaded from: classes.dex */
public abstract class andg {
    public final int a;
    public final anbb b;

    public abstract void a(andh andhVar, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public andg(anbb anbbVar, int i) {
        if (anbbVar != null) {
            if (i >= 0) {
                this.a = i;
                this.b = anbbVar;
                return;
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("format options cannot be null");
    }
}
