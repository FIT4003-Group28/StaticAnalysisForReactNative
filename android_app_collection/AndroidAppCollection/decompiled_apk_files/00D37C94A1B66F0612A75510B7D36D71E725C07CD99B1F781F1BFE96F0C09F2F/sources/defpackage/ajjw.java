package defpackage;
/* compiled from: PG */
/* renamed from: ajjw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajjw implements ajkf {
    private final /* synthetic */ int f;
    public static final /* synthetic */ ajjw e = new ajjw(4);
    public static final /* synthetic */ ajjw d = new ajjw(3);
    public static final /* synthetic */ ajjw c = new ajjw(2);
    public static final /* synthetic */ ajjw b = new ajjw(1);
    public static final /* synthetic */ ajjw a = new ajjw();

    private /* synthetic */ ajjw() {
    }

    private /* synthetic */ ajjw(int i) {
        this.f = i;
    }

    @Override // defpackage.ajkf
    public final void a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((ajkc) obj).o = Float.valueOf(((Float) obj2).floatValue());
        } else if (i == 1) {
            ((ajkc) obj).j = Boolean.valueOf(((Boolean) obj2).booleanValue());
        } else if (i == 2) {
            ((ajkc) obj).b = Float.valueOf(((Float) obj2).floatValue());
        } else if (i == 3) {
            ((ajkc) obj).n = Integer.valueOf(((Integer) obj2).intValue());
        } else {
            ((ajkc) obj).a = Integer.valueOf(((Integer) obj2).intValue());
        }
    }
}
