package defpackage;
/* compiled from: PG */
/* renamed from: val  reason: default package */
/* loaded from: classes4.dex */
public abstract class val {
    private final baaw a;

    public val(baaw baawVar) {
        this.a = baawVar;
    }

    public abstract long a(String str);

    public abstract baaw b(Long l);

    public abstract boolean c();

    public final baaw d() {
        aopa mo52toBuilder = e(null).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        baaw baawVar = (baaw) mo52toBuilder.instance;
        baawVar.b |= 2;
        baawVar.c = -1L;
        return (baaw) mo52toBuilder.mo39build();
    }

    public final baaw e(Long l) {
        int i = azst.i(this.a.d);
        if (i != 0 && i == 5) {
            if (l == null || l.longValue() == this.a.c) {
                return this.a;
            }
            aopa createBuilder = baaw.a.createBuilder();
            int i2 = azst.i(this.a.d);
            if (i2 == 0) {
                i2 = 1;
            }
            createBuilder.copyOnWrite();
            baaw baawVar = (baaw) createBuilder.instance;
            baawVar.d = i2 - 1;
            baawVar.b |= 4;
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            baaw baawVar2 = (baaw) createBuilder.instance;
            baawVar2.b |= 2;
            baawVar2.c = longValue;
            return (baaw) createBuilder.mo39build();
        }
        return this.a;
    }
}
