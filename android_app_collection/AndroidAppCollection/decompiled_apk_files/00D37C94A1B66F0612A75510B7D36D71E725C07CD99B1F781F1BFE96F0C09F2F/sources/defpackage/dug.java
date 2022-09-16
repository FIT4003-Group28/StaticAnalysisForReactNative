package defpackage;
/* compiled from: PG */
/* renamed from: dug  reason: default package */
/* loaded from: classes3.dex */
public final class dug extends dux {
    private static volatile Long h;
    private static final Object i = new Object();

    public dug(dtq dtqVar, aopa aopaVar, int i2) {
        super(dtqVar, "EiShIe/SkHUT8hUfhEivWZP8qDouzBOTt8NvLdB4+VXIimf5N5sD/OzoL/12ALlU", "QD/unac3OeKCZGOjxPE6q0VJk2js7FvkG4I1pjn4ySg=", aopaVar, i2, 22);
    }

    @Override // defpackage.dux
    protected final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            aopa aopaVar = this.g;
            long longValue = h.longValue();
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.b |= 1048576;
            dnwVar.q = longValue;
        }
    }
}
