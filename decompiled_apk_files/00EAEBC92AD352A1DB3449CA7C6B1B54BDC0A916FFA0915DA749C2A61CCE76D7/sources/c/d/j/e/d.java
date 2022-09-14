package c.d.j.e;
/* loaded from: classes.dex */
public enum d {
    LOW,
    MEDIUM,
    HIGH;

    public static d a(d dVar, d dVar2) {
        return dVar == null ? dVar2 : (dVar2 != null && dVar.ordinal() <= dVar2.ordinal()) ? dVar2 : dVar;
    }
}
