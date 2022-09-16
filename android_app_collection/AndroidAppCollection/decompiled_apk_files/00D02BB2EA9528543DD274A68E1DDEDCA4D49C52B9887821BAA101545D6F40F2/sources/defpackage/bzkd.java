package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bzkd  reason: default package */
/* loaded from: classes4.dex */
final class bzkd extends bzlg {
    public dbsg<Long> a = dbpy.a;
    public List<bzjd> b;
    private bzlj c;
    private List<bzjh> d;

    @Override // defpackage.bzlg
    public final void b(List<bzjh> list) {
        if (list != null) {
            this.d = list;
            return;
        }
        throw new NullPointerException("Null departures");
    }

    @Override // defpackage.bzlg
    public final void c(bzlj bzljVar) {
        if (bzljVar != null) {
            this.c = bzljVar;
            return;
        }
        throw new NullPointerException("Null transitContext");
    }

    @Override // defpackage.bzlg
    public final bzlh a() {
        String str = this.c == null ? " transitContext" : "";
        if (this.d == null) {
            str = str.concat(" departures");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" alerts");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bzke(this.c, this.d, this.a, this.b);
    }
}
