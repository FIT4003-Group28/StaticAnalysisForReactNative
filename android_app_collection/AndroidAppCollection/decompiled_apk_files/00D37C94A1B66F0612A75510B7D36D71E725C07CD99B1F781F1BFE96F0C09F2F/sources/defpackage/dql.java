package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dql  reason: default package */
/* loaded from: classes3.dex */
public final class dql {
    public dqk a;
    public dqk b;
    public final List c;

    public dql() {
        this.a = new dqk("", 0L, null);
        this.b = new dqk("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        dql dqlVar = new dql(this.a.clone());
        for (dqk dqkVar : this.c) {
            dqlVar.c.add(dqkVar.clone());
        }
        return dqlVar;
    }

    public dql(dqk dqkVar) {
        this.a = dqkVar;
        this.b = dqkVar.clone();
        this.c = new ArrayList();
    }
}
