package defpackage;
/* compiled from: PG */
/* renamed from: bvqz  reason: default package */
/* loaded from: classes.dex */
final class bvqz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        if (str.length() <= 15) {
            return;
        }
        throw new IllegalArgumentException(String.format("Thread name %s can't be longer than the systrace limit of %d.", str, 15));
    }
}
