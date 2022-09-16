package defpackage;
/* compiled from: PG */
/* renamed from: ahty  reason: default package */
/* loaded from: classes.dex */
public enum ahty {
    NEW,
    LOGGED_NEW_SCREEN,
    LOGGED_ATTACH_PLAYER,
    LOGGED_ATTACH_WATCH_NEXT;

    public final boolean a(ahty ahtyVar) {
        return ordinal() >= ahtyVar.ordinal();
    }
}
