package defpackage;
/* compiled from: PG */
/* renamed from: dfjw  reason: default package */
/* loaded from: classes6.dex */
enum dfjw {
    CREATE_PENDING,
    CREATED,
    DESTROY_PENDING,
    DESTROYED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this == DESTROY_PENDING || this == DESTROYED;
    }
}
