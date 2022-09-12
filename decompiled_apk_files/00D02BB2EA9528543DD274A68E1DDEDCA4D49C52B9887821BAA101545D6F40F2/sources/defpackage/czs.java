package defpackage;
/* compiled from: PG */
/* renamed from: czs  reason: default package */
/* loaded from: classes5.dex */
public enum czs {
    NONE(0),
    INERTIAL_BACKGROUND(1),
    INERTIAL_FOREGROUND(2),
    CAMERA(3);
    
    private final int e;

    czs(int i) {
        this.e = i;
    }

    public final boolean a(czs czsVar) {
        return this.e >= czsVar.e;
    }
}
