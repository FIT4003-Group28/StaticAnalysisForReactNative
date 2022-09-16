package defpackage;
/* compiled from: PG */
/* renamed from: tmn  reason: default package */
/* loaded from: classes4.dex */
public final class tmn {
    public final tmm a;

    public tmn(tmt tmtVar) {
        this.a = new tmm(tmtVar);
    }

    public static final tlx a(int i) {
        aopa createBuilder = angf.a.createBuilder();
        createBuilder.copyOnWrite();
        angf angfVar = (angf) createBuilder.instance;
        angfVar.b |= 8;
        angfVar.d = i;
        return new tlx(new tma(createBuilder));
    }
}
