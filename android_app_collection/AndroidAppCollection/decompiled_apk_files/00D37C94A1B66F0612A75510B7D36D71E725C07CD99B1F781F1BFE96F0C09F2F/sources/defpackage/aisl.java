package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aisl  reason: default package */
/* loaded from: classes.dex */
public final class aisl {
    final aios a;
    final ajft b;
    final yni c;
    final Set d;
    final aisp e;
    final Set f;
    final aikh g;

    public aisl(aikh aikhVar, aios aiosVar, ajft ajftVar, yni yniVar, Set set, aisp aispVar, Set set2) {
        this.g = aikhVar;
        this.a = aiosVar;
        this.b = ajftVar;
        this.c = yniVar;
        this.d = set;
        this.e = aispVar;
        this.f = set2;
    }

    public final void a() {
        this.c.g(this.g);
        this.c.g(this.a);
        aynx aynxVar = this.e.a;
        ajft ajftVar = this.b;
        ajftVar.getClass();
        aynxVar.Z(new aisk(ajftVar, 1));
        aynx aynxVar2 = this.e.i;
        ajft ajftVar2 = this.b;
        ajftVar2.getClass();
        aynxVar2.Z(new aisk(ajftVar2));
        for (aijm aijmVar : this.d) {
            aijn.b(aijmVar);
        }
        for (aiiz aiizVar : this.f) {
            aiizVar.a();
        }
    }
}
