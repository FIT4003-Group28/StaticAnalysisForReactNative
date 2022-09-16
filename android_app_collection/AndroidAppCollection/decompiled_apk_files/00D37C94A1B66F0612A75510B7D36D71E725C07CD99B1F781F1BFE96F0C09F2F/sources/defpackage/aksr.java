package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aksr  reason: default package */
/* loaded from: classes.dex */
public final class aksr implements akst {
    public final Executor a;
    public final List b;
    public String c;
    private final abdk d;

    public aksr(abdk abdkVar, Executor executor, List list) {
        this.d = abdkVar;
        this.a = executor;
        this.b = list;
    }

    public final ankt a(String str) {
        abdk abdkVar = this.d;
        abch abchVar = new abch(abdkVar.e, abdkVar.a.c());
        abchVar.a = str;
        abchVar.b = this.c;
        abdk abdkVar2 = this.d;
        ankt b = abdkVar2.b.b(abchVar, this.a);
        final aksq aksqVar = new aksq(str, this.b);
        return anii.h(b, new ampg() { // from class: aksn
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aksq aksqVar2 = aksq.this;
                aksu aksuVar = new aksu((asbu) obj);
                for (aksg aksgVar : aksqVar2.b) {
                    aksgVar.b(aksqVar2.a, aksuVar);
                }
                return aksuVar;
            }
        }, this.a);
    }
}
