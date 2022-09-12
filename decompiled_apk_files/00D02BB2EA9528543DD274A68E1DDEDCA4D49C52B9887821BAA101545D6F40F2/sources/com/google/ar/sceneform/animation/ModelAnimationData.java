package com.google.ar.sceneform.animation;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ModelAnimationData extends dbef {
    public long a;

    public ModelAnimationData(byte[] bArr, String str, dbeo<dbef> dbeoVar) {
        if (dbdg.a) {
            long createAnimationDataNative = createAnimationDataNative(bArr, str);
            this.a = createAnimationDataNative;
            dbeoVar.a(this, new dbdi(createAnimationDataNative));
        }
    }

    private native long createAnimationDataNative(byte[] bArr, String str);

    public static native void destroyAnimationDataNative(long j);

    private native long getDurationNative(long j);

    private native String getNameNative(long j);

    @Override // defpackage.dbef
    public final String a() {
        long j = this.a;
        return j != 0 ? getNameNative(j) : "";
    }

    @Override // defpackage.dbef
    public final long b() {
        long j = this.a;
        if (j != 0) {
            return getDurationNative(j);
        }
        return 0L;
    }
}
