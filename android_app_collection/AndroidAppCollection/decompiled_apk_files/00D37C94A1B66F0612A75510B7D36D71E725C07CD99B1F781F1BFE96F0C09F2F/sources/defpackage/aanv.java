package defpackage;
/* compiled from: PG */
/* renamed from: aanv  reason: default package */
/* loaded from: classes.dex */
public enum aanv {
    RECTANGULAR_2D,
    SPHERICAL,
    SPHERICAL_3D,
    RECTANGULAR_3D,
    NOOP,
    MESH;

    public final boolean a() {
        return this == SPHERICAL || this == SPHERICAL_3D || this == MESH;
    }
}
