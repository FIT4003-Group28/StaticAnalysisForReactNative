package defpackage;
/* compiled from: PG */
/* renamed from: bxbu  reason: default package */
/* loaded from: classes4.dex */
public final class bxbu<T> extends btrh<T> {
    public bxbu(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        float f;
        bxbr bxbrVar = (bxbr) this.a;
        ahld ahldVar = (ahld) obj;
        float f2 = ahldVar.b;
        if (f2 == -1000.0f) {
            dhkb dhkbVar = bxbrVar.a.l().c;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            f = dhkbVar.c;
        } else {
            f = -f2;
        }
        bxbrVar.a.setOrientation(ahldVar.a, f);
    }
}
