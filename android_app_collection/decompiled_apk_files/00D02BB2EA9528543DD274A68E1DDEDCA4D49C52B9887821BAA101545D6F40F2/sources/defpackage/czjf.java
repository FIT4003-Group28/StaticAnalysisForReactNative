package defpackage;
/* compiled from: PG */
/* renamed from: czjf  reason: default package */
/* loaded from: classes5.dex */
public final class czjf {
    public static void a(boolean z, @dzsi String str, @dzsi Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
