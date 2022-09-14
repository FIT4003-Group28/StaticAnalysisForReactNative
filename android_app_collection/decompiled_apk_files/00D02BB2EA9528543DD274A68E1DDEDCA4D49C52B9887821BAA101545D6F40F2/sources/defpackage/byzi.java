package defpackage;
/* compiled from: PG */
/* renamed from: byzi  reason: default package */
/* loaded from: classes4.dex */
public class byzi {
    public static final /* synthetic */ int a = 0;
    private static final eaow b = eaow.c(2);

    @dzsi
    public final byzg a(bzdk bzdkVar) {
        bzdh g = bzdkVar.g();
        if (g instanceof bzdf) {
            return byzg.WALK;
        }
        if (g instanceof bzdl) {
            return byzg.TAKE;
        }
        if (g instanceof bzcz) {
            if (g.e().p(b)) {
                return byzg.RIDE;
            }
            return byzg.GET_OFF;
        } else if (g instanceof bzcn) {
            return byzg.ARRIVE;
        } else {
            if (!(g instanceof bzcw)) {
                return null;
            }
            return byzg.ERROR;
        }
    }
}
