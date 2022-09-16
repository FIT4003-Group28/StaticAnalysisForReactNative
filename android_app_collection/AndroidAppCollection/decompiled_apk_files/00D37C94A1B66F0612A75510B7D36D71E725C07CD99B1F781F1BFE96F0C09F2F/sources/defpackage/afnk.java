package defpackage;
/* compiled from: PG */
/* renamed from: afnk  reason: default package */
/* loaded from: classes.dex */
public enum afnk {
    UNKNOWN(false, false, false, 0),
    NONE(false, false, false, 1),
    TEXTURE(true, false, false, 2),
    SURFACE(afnh.h, false, true, 3),
    YUV_SURFACE(afnh.h, false, true, 4),
    SECURE_SURFACE(afnh.h, true, true, 5),
    GL_GVR(false, false, false, 6),
    GL_VPX(false, false, false, 7),
    APPLICATION(false, false, false, 8);
    
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;

    afnk(boolean z, boolean z2, boolean z3, int i) {
        this.j = z;
        this.k = z3;
        this.l = z2;
        this.m = i;
    }
}
