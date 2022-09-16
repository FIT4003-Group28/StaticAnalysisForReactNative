package defpackage;

import android.graphics.Color;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aleq  reason: default package */
/* loaded from: classes2.dex */
public final class aleq implements alee {
    private static final dmqx h;
    public final akuh b;
    public final akuh c;
    private final Map<Integer, akuh> i;
    private final akvz j;
    private int k;
    private static final dcqe d = dcqe.c("aleq");
    public static final decj a = decj.h(4, 8, 11, 12, 13, 16);
    private static final int[] e = {3, 5, 7, 8, 8, 6, 8};
    private static final int[] f = {0, 0, 0, 0, 0, 8, 10};
    private static final int[] g = {4, 7, 11, 12, 12, 20, 22};

    static {
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmqj bZ = dmqk.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmqk dmqkVar = (dmqk) bZ.b;
        dmqkVar.a |= 8;
        dmqkVar.d = true;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmqk bK = bZ.bK();
        bK.getClass();
        dmopVar2.e = bK;
        dmopVar2.a |= 8;
        dmqtVar.a(dmooVar);
        h = (dmqx) dmqtVar.bK();
    }

    public aleq(akvz akvzVar) {
        HashMap hashMap = new HashMap();
        this.k = 0;
        this.j = akvzVar;
        this.i = hashMap;
        aktg c = akvzVar.c(h);
        this.b = c;
        hashMap.put(0, c);
        this.c = akvzVar.c(albu.c(1224412166, -1, -1033214, dcdc.e(), bntp.POLYLINE_OVERLAY, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAWCAYAAADJqhx8AAAAAXNSR0IArs4c6QAAAOJJREFUOBGdkz0OgkAQRr8lVrQ2ngFtiaewtNba+2ir1J5E7UzwCMaC2g7WHRLNOAvLLDQsO3xv3vBjMPJ4rpBWLxzMmHy5RNY0OFuLLIkFlDm2dY0bhSmrNvgqw2LDm6oAXJmHaT04glSWgF6DPmUVIKQsAd4IQ8oS8BtBq9wJiFFmgHeSYGdaZYu9K6SsGFwag4cLr+cXd64tjjFh9+kV0xlyClOXSbDVf7FVXlxR8G0VgCvzMK291yhvkMqyHjLoVFYBQsoS4I8gnrIMyGs+gkq5ExCjLAG45zjRf+AVlBsf0d9mMDTLt3oAAAAASUVORK5CYII=", e, f, g, a.g()));
    }

    public static int b(int i) {
        return Color.argb(Color.alpha(i), (int) (Color.red(i) * 0.77f), (int) (Color.green(i) * 0.77f), (int) (Color.blue(i) * 0.77f));
    }

    @Override // defpackage.alde
    public final aleh a(aldc aldcVar) {
        return new alep(this, aldcVar.a);
    }

    public final void c(int i) {
        d(i, b(i));
    }

    public final void d(int i, int i2) {
        this.k = i;
        Map<Integer, akuh> map = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return;
        }
        this.i.put(valueOf, this.j.c(albu.a(i2, i, bntp.POLYLINE)));
    }

    public final akuh e() {
        int i = this.k;
        Map<Integer, akuh> map = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            bvoo.h("Attempting to retrieve a cached style for a color that is not contained by the TransitPolylineStyles.", new Object[0]);
        }
        akuh akuhVar = this.i.get(valueOf);
        if (akuhVar != null) {
            return akuhVar;
        }
        bvoo.h("getCachedStyle attempted to return a null style.", new Object[0]);
        return this.b;
    }
}
