package defpackage;
/* compiled from: PG */
/* renamed from: alwz  reason: default package */
/* loaded from: classes.dex */
public final class alwz {
    public final alyb a;
    public final alvm b;

    private alwz(alyb alybVar, alvm alvmVar) {
        this.a = alybVar;
        this.b = alvmVar;
    }

    public static alwz a(dmnn dmnnVar) {
        alyb alybVar = new alyb(dmnnVar);
        dmme dmmeVar = dmnnVar.b;
        if (dmmeVar == null) {
            dmmeVar = dmme.d;
        }
        return new alwz(alybVar, new alvm(dmmeVar));
    }
}
