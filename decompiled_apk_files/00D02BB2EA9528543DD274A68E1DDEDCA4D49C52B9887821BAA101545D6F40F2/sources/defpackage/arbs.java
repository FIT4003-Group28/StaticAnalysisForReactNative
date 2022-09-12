package defpackage;
/* compiled from: PG */
/* renamed from: arbs  reason: default package */
/* loaded from: classes2.dex */
public enum arbs {
    NAVIGATION,
    NAVIGATION_COMPASS,
    MOVE_JUMP_TELEPORT;

    public static arbs a(dqvj dqvjVar) {
        return dqvjVar == dqvj.WALK ? NAVIGATION_COMPASS : NAVIGATION;
    }
}
