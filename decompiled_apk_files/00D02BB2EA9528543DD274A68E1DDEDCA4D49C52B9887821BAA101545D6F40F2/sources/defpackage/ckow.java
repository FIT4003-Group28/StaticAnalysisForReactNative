package defpackage;
/* compiled from: PG */
/* renamed from: ckow  reason: default package */
/* loaded from: classes.dex */
public enum ckow {
    ACTIVITY_FOREGROUND_SPANS,
    ACTIVITY_SCOPED_SPANS,
    APPLICATION_SCOPED_SPANS,
    SELF_MANAGED;

    public final boolean a() {
        return equals(ACTIVITY_SCOPED_SPANS) || equals(ACTIVITY_FOREGROUND_SPANS);
    }
}
