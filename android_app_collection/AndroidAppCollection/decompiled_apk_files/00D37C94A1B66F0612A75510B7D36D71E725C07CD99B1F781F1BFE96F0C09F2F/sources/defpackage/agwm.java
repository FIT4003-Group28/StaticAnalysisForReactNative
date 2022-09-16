package defpackage;
/* compiled from: PG */
/* renamed from: agwm  reason: default package */
/* loaded from: classes.dex */
public final class agwm {
    private final adzz a;

    public agwm(adzz adzzVar) {
        this.a = adzzVar;
    }

    public final agws a(agql agqlVar) {
        agwr agwrVar = new agwr();
        agwrVar.a = agqlVar;
        agwrVar.c = 2;
        agwrVar.b = 0;
        if (aank.v().contains(Integer.valueOf(agqlVar.a()))) {
            return agwrVar.a();
        }
        if (!this.a.g(agqlVar.g(), agqlVar.a(), agqlVar.h(), 0L, 1)) {
            agwrVar.b(0L);
        }
        return agwrVar.a();
    }
}
