package defpackage;
/* compiled from: PG */
/* renamed from: aijx  reason: default package */
/* loaded from: classes.dex */
public enum aijx {
    NEW,
    VIDEO_LOADING,
    VIDEO_PLAYBACK_ERROR,
    VIDEO_PLAYBACK_LOADED,
    VIDEO_WATCH_LOADED;

    public final boolean a(aijx... aijxVarArr) {
        for (aijx aijxVar : aijxVarArr) {
            if (this == aijxVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(aijx aijxVar) {
        return ordinal() >= aijxVar.ordinal();
    }
}
