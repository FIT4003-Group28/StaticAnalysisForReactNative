package defpackage;
/* compiled from: PG */
/* renamed from: dbyz  reason: default package */
/* loaded from: classes5.dex */
public enum dbyz {
    OPEN,
    CLOSED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbyz a(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
