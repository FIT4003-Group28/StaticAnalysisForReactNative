package defpackage;
/* compiled from: PG */
/* renamed from: crse  reason: default package */
/* loaded from: classes5.dex */
public final class crse<T> extends btrh<T> {
    public crse(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        crsd crsdVar = (crsd) this.a;
        crsg crsgVar = (crsg) obj;
        dbsk.a(crsgVar.a == dqvj.DRIVE);
        if (!crsdVar.b) {
            crsdVar.a.b(new crsf(crsgVar.a));
            crsdVar.b = true;
        }
    }
}
