package defpackage;
/* compiled from: PG */
/* renamed from: byzg  reason: default package */
/* loaded from: classes4.dex */
public enum byzg {
    WALK(false, ddcu.ap, 3),
    TAKE(true, ddcu.ao, 4),
    RIDE(true, ddcu.an, 5),
    GET_OFF(true, ddcu.al, 6),
    ARRIVE(false, ddcu.aj, 7),
    ERROR(false, ddcu.ak, 8);
    
    public final boolean g;
    public final ddcu h;
    public final int i;

    byzg(boolean z, ddcu ddcuVar, int i) {
        this.g = z;
        this.h = ddcuVar;
        this.i = i;
    }
}
