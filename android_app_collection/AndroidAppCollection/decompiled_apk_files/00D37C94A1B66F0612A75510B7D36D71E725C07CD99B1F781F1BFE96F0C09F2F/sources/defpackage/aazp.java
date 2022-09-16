package defpackage;
/* compiled from: PG */
/* renamed from: aazp  reason: default package */
/* loaded from: classes.dex */
public final class aazp extends aars {
    private final aarl a;
    private boolean b;

    public aazp(aaqj aaqjVar, aaqf aaqfVar, yqw yqwVar, aacz aaczVar) {
        super(aaqfVar, yqwVar);
        boolean z = false;
        this.b = false;
        this.a = c(arrk.a, aaqjVar, aayx.m, aayd.u);
        apyy b = aaczVar.b();
        if (b != null) {
            atfw atfwVar = b.k;
            aqwl aqwlVar = (atfwVar == null ? atfw.a : atfwVar).k;
            z = (aqwlVar == null ? aqwl.a : aqwlVar).e;
        }
        this.b = z;
    }

    public final aazo a(afvm afvmVar, String str, boolean z) {
        return new aazo(this.e, afvmVar, str, this.b, z);
    }

    public final void b(aazo aazoVar, afzf afzfVar) {
        this.a.e(aazoVar, afzfVar);
    }
}
