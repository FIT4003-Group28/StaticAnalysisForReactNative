package defpackage;

import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: alzs  reason: default package */
/* loaded from: classes2.dex */
public final class alzs implements alzo {
    public final dcdc<alzr> a;
    @dzsi
    public final dmxh b;
    public final dcdc<alzp> c;
    public final String d;
    public final String e;
    public final akry f;

    public alzs(List<alzr> list, dcdc<alzp> dcdcVar, alzq alzqVar, bttf bttfVar) {
        dbsk.b(!list.isEmpty(), "No tile requests specified when creating a batch request");
        this.a = dcdc.r(list);
        this.c = dcdcVar;
        akry a = list.get(0).a();
        this.f = a;
        this.b = alzqVar.a(a.H);
        this.d = bvom.a(Locale.getDefault());
        this.e = bttfVar.a();
    }
}
