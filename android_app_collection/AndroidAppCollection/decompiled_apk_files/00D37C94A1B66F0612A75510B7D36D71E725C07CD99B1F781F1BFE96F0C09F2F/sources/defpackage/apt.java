package defpackage;
/* compiled from: PG */
/* renamed from: apt  reason: default package */
/* loaded from: classes2.dex */
public enum apt {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(apt aptVar) {
        return compareTo(aptVar) >= 0;
    }
}
