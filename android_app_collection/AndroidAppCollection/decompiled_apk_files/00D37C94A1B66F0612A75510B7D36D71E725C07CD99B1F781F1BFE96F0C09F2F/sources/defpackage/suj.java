package defpackage;
/* compiled from: PG */
/* renamed from: suj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class suj implements acv {
    private final /* synthetic */ int c;
    public static final /* synthetic */ suj b = new suj(1);
    public static final /* synthetic */ suj a = new suj();

    private /* synthetic */ suj() {
    }

    private /* synthetic */ suj(int i) {
        this.c = i;
    }

    @Override // defpackage.acv
    public final Object a(Object obj) {
        if (this.c == 0) {
            return new ted("Error creating Component", (Throwable) obj);
        }
        return new ted("Error creating EntitiesProcessorResolver", (Throwable) obj);
    }
}
