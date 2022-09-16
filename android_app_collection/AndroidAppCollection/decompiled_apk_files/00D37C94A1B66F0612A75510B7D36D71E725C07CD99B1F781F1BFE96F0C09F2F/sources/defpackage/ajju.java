package defpackage;
/* compiled from: PG */
/* renamed from: ajju  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajju implements ajkm {
    private final /* synthetic */ int l;
    public static final /* synthetic */ ajju k = new ajju(10);
    public static final /* synthetic */ ajju j = new ajju(9);
    public static final /* synthetic */ ajju i = new ajju(8);
    public static final /* synthetic */ ajju h = new ajju(7);
    public static final /* synthetic */ ajju g = new ajju(6);
    public static final /* synthetic */ ajju f = new ajju(5);
    public static final /* synthetic */ ajju e = new ajju(4);
    public static final /* synthetic */ ajju d = new ajju(3);
    public static final /* synthetic */ ajju c = new ajju(2);
    public static final /* synthetic */ ajju b = new ajju(1);
    public static final /* synthetic */ ajju a = new ajju();

    private /* synthetic */ ajju() {
    }

    private /* synthetic */ ajju(int i2) {
        this.l = i2;
    }

    @Override // defpackage.ajkm
    public final void a(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                ((ajka) obj).I = Boolean.valueOf(((Boolean) obj2).booleanValue());
                return;
            case 1:
                ((ajka) obj).F = Boolean.valueOf(((Boolean) obj2).booleanValue());
                return;
            case 2:
                ((ajka) obj).q = Boolean.valueOf(((Boolean) obj2).booleanValue());
                return;
            case 3:
                ((ajka) obj).B = Float.valueOf(((Float) obj2).floatValue());
                return;
            case 4:
                ((ajka) obj).h = Float.valueOf(((Float) obj2).floatValue());
                return;
            case 5:
                ((ajka) obj).M = Float.valueOf(((Float) obj2).floatValue());
                return;
            case 6:
                ((ajka) obj).b = Integer.valueOf(((Integer) obj2).intValue());
                return;
            case 7:
                ((ajka) obj).j = Integer.valueOf(((Integer) obj2).intValue());
                return;
            case 8:
                ((ajka) obj).t = Integer.valueOf(((Integer) obj2).intValue());
                return;
            case 9:
                ((ajka) obj).E = Integer.valueOf(((Integer) obj2).intValue());
                return;
            default:
                String str = (String) obj2;
                if (str != null) {
                    ((ajka) obj).i = str;
                    return;
                }
                throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
        }
    }
}
