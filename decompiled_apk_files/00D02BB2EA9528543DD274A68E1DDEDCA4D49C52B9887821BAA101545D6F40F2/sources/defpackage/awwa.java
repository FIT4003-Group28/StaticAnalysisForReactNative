package defpackage;
/* compiled from: PG */
/* renamed from: awwa  reason: default package */
/* loaded from: classes.dex */
public enum awwa {
    NOT_REQUESTED,
    DATA_INCOMPLETE_FETCH_IN_PROGRESS,
    DATA_INCOMPLETE_FETCH_FAILED,
    DATA_COMPLETE_FROM_CACHE_NO_REFETCH_NEEDED,
    DATA_COMPLETE_FROM_CACHE_REFETCH_IN_PROGRESS,
    DATA_COMPLETE_FROM_CACHE_REFETCH_FAILED,
    DATA_COMPLETE_FROM_SERVER;

    public final boolean a() {
        return this == DATA_COMPLETE_FROM_SERVER || this == DATA_COMPLETE_FROM_CACHE_NO_REFETCH_NEEDED || this == DATA_COMPLETE_FROM_CACHE_REFETCH_IN_PROGRESS || this == DATA_COMPLETE_FROM_CACHE_REFETCH_FAILED;
    }

    public final boolean b() {
        return this == DATA_INCOMPLETE_FETCH_IN_PROGRESS || this == DATA_COMPLETE_FROM_CACHE_REFETCH_IN_PROGRESS;
    }
}
