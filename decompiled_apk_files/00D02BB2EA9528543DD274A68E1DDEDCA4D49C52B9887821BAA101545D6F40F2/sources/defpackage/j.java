package defpackage;
/* compiled from: PG */
/* renamed from: j  reason: default package */
/* loaded from: classes.dex */
public enum j {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(j jVar) {
        return compareTo(jVar) >= 0;
    }
}
