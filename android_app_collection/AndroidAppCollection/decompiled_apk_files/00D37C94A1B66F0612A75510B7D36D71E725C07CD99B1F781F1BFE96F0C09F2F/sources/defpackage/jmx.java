package defpackage;
/* compiled from: PG */
/* renamed from: jmx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jmx implements ayqb {
    public final /* synthetic */ afzf a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmx(afzf afzfVar, int i) {
        this.b = i;
        this.a = afzfVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.kV(new cff((Throwable) obj));
        } else {
            this.a.lG((jmz) obj);
        }
    }
}
