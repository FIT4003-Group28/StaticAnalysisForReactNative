package defpackage;
/* compiled from: PG */
/* renamed from: wsd  reason: default package */
/* loaded from: classes4.dex */
public final class wsd implements wsg {
    private final wlg a;
    private final /* synthetic */ int b;

    public wsd(wlg wlgVar) {
        this.a = wlgVar;
    }

    public wsd(wlg wlgVar, int i) {
        this.b = i;
        this.a = wlgVar;
    }

    @Override // defpackage.wsg
    public final String a() {
        return "";
    }

    @Override // defpackage.wsg
    public final String b(xac xacVar) {
        tjt j;
        tjt j2;
        tjt j3;
        int i = this.b;
        if (i == 0) {
            if (xacVar.d(xad.class)) {
                j = (tjt) xacVar.c(xad.class);
            } else {
                j = this.a.j();
            }
            return j != null ? j.c : "";
        } else if (i == 1) {
            if (xacVar.d(xad.class)) {
                j2 = (tjt) xacVar.c(xad.class);
            } else {
                j2 = this.a.j();
            }
            return j2 != null ? j2.a : "";
        } else {
            if (xacVar.d(xad.class)) {
                j3 = (tjt) xacVar.c(xad.class);
            } else {
                j3 = this.a.j();
            }
            return j3 != null ? j3.b : "";
        }
    }
}
