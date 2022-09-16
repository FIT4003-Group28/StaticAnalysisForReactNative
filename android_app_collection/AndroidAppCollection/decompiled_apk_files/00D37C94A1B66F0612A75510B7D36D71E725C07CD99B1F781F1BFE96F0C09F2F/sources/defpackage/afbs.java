package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afbs  reason: default package */
/* loaded from: classes.dex */
final class afbs implements afbw {
    final /* synthetic */ afbx a;
    private final int b;
    private final afbo c;

    public afbs(afbx afbxVar, afbo afboVar, int i) {
        this.a = afbxVar;
        this.c = afboVar;
        this.b = i;
    }

    @Override // defpackage.afbw
    public final int a() {
        return this.c.a;
    }

    @Override // defpackage.afbw
    public final int b() {
        int a = a();
        if (a == 1) {
            return 100;
        }
        aopa createBuilder = aqxk.a.createBuilder();
        int i = this.b;
        createBuilder.copyOnWrite();
        aqxk aqxkVar = (aqxk) createBuilder.instance;
        aqxkVar.b = 1 | aqxkVar.b;
        aqxkVar.c = i;
        long millis = TimeUnit.SECONDS.toMillis(20L);
        createBuilder.copyOnWrite();
        aqxk aqxkVar2 = (aqxk) createBuilder.instance;
        aqxkVar2.b |= 4;
        aqxkVar2.e = (int) millis;
        createBuilder.copyOnWrite();
        aqxk aqxkVar3 = (aqxk) createBuilder.instance;
        aqxkVar3.b |= 2;
        aqxkVar3.d = 1.3f;
        createBuilder.copyOnWrite();
        aqxk aqxkVar4 = (aqxk) createBuilder.instance;
        aqxkVar4.b |= 8;
        aqxkVar4.f = 0.1f;
        final aqxk aqxkVar5 = (aqxk) createBuilder.mo39build();
        return new afls(new amqo() { // from class: afbr
            @Override // defpackage.amqo
            public final Object get() {
                return aqxk.this;
            }
        }).a(a - 1);
    }

    @Override // defpackage.afbw
    public final /* synthetic */ long c() {
        return -9223372036854775807L;
    }

    @Override // defpackage.afbw
    public final void d() {
        this.c.a++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[RETURN] */
    @Override // defpackage.afbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r3 = this;
            int r0 = r3.a()
            afbx r1 = r3.a
            amqo r1 = r1.b
            java.lang.Object r1 = r1.get()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r1 = (com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel) r1
            atzv r1 = r1.c
            aqwu r1 = r1.e
            if (r1 != 0) goto L16
            aqwu r1 = defpackage.aqwu.b
        L16:
            int r1 = r1.bt
            r2 = -1
            if (r1 > 0) goto L21
            if (r1 == r2) goto L20
            r1 = 10
            goto L26
        L20:
            r1 = -1
        L21:
            if (r1 != r2) goto L26
            r1 = 2147483647(0x7fffffff, float:NaN)
        L26:
            if (r0 >= r1) goto L2a
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbs.e():boolean");
    }
}
