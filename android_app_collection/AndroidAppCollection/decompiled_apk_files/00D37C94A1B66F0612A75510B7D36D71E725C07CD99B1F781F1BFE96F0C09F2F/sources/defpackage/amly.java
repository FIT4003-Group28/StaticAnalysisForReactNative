package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: amly  reason: default package */
/* loaded from: classes.dex */
public final class amly {
    public final amme a;
    public final amlt b;
    public final ammp c;

    public amly(amme ammeVar, Set set, ammp ammpVar) {
        this.a = ammeVar;
        this.b = amlt.c(set);
        this.c = ammpVar;
    }

    public final amlv a(String str) {
        return this.a.b(str, this.b, this.c);
    }

    public final amln b(String str, amlt amltVar) {
        return this.a.b(str, amlt.d(this.b, amltVar), this.c);
    }

    public final amln c(String str) {
        return b(str, amls.a);
    }
}
