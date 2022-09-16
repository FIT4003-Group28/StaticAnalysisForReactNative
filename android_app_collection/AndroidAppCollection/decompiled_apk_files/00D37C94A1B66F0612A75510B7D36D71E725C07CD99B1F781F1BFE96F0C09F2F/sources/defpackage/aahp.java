package defpackage;

import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aahp  reason: default package */
/* loaded from: classes.dex */
public final class aahp {
    public static final void a(aaho aahoVar, int i, vou vouVar) {
        aahoVar.a(vouVar);
        int i2 = i - 1;
        if (i2 == 0) {
            vouVar.b(" = ");
        } else if (i2 == 1) {
            vouVar.b(" != ");
        } else if (i2 == 2) {
            vouVar.b(" < ");
        } else if (i2 == 3) {
            vouVar.b(" <= ");
        } else if (i2 == 4) {
            vouVar.b(" > ");
        } else if (i2 != 5) {
            vouVar.b(" LIKE ");
        } else {
            vouVar.b(" >= ");
        }
        vouVar.b(" ? ");
    }

    public static final aahl b(aahn aahnVar, List list) {
        vou vouVar = new vou();
        vouVar.b("SELECT entity_key FROM ");
        aahnVar.b(vouVar);
        vouVar.b(" WHERE ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((aahk) it.next()).a(vouVar);
        }
        return new aahl(aahnVar, vouVar.a());
    }

    public static final void c(final aaho aahoVar, final int i, final Long l, aahn aahnVar, List list) {
        aahnVar.c(aahoVar);
        list.add(new aahk() { // from class: aahi
            @Override // defpackage.aahk
            public final void a(vou vouVar) {
                aaho aahoVar2 = aaho.this;
                int i2 = i;
                Long l2 = l;
                aahp.a(aahoVar2, i2, vouVar);
                aahoVar2.c(vouVar, l2);
            }
        });
    }

    public static final void d(final aaho aahoVar, final int i, final String str, aahn aahnVar, List list) {
        aahnVar.c(aahoVar);
        list.add(new aahk() { // from class: aahj
            @Override // defpackage.aahk
            public final void a(vou vouVar) {
                aaho aahoVar2 = aaho.this;
                int i2 = i;
                String str2 = str;
                aahp.a(aahoVar2, i2, vouVar);
                aahoVar2.c(vouVar, str2);
            }
        });
    }

    public static aotm e(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        aopa createBuilder = aotm.a.createBuilder();
        createBuilder.copyOnWrite();
        aotm.a((aotm) createBuilder.instance);
        createBuilder.copyOnWrite();
        aotm.b((aotm) createBuilder.instance);
        createBuilder.copyOnWrite();
        aotm aotmVar = (aotm) createBuilder.instance;
        aotmVar.f = 1;
        aotmVar.b |= 4;
        for (int i = 0; i < 9; i++) {
            createBuilder.U(fArr[i]);
        }
        return (aotm) createBuilder.mo39build();
    }

    public static aotm f() {
        return e(new Matrix());
    }

    public static void g(axbl axblVar, zqz zqzVar) {
        int i = zqzVar.d;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).G(i);
        int i2 = zqzVar.e;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).D(i2);
    }
}
