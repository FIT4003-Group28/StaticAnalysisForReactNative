package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alfq  reason: default package */
/* loaded from: classes2.dex */
public final class alfq {
    public static final dcqe a = dcqe.c("alfq");
    public static final dmqx b;
    public static final dcdc<dmlo> c;
    public final akvz d;
    public final Context e;
    public final boolean f;
    public final List<akuh> g = new ArrayList();
    public final Map<alfo, akuh> h = new HashMap();
    public boolean i = false;
    public final dbty<akuh> j = dbud.a(new dbty(this) { // from class: alfh
        private final alfq a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            alfq alfqVar = this.a;
            int color = alfqVar.f ? alfqVar.e.getResources().getColor(R.color.callout_nightmode_background) : -1;
            akvz akvzVar = alfqVar.d;
            dmqt dmqtVar = (dmqt) dmqx.e.bZ();
            dmoo dmooVar = (dmoo) dmop.h.bZ();
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar = (dmop) dmooVar.b;
            dmopVar.a |= 1;
            dmopVar.b = 0;
            dmpq bZ = dmpv.s.bZ();
            dmsr bZ2 = dmsu.u.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmsu dmsuVar = (dmsu) bZ2.b;
            int i = dmsuVar.a | 4;
            dmsuVar.a = i;
            dmsuVar.d = color;
            int i2 = i | 64;
            dmsuVar.a = i2;
            dmsuVar.j = 1;
            int i3 = i2 | 128;
            dmsuVar.a = i3;
            dmsuVar.k = 1;
            int i4 = i3 | 256;
            dmsuVar.a = i4;
            dmsuVar.l = 1493172224;
            int i5 = i4 | 512;
            dmsuVar.a = i5;
            dmsuVar.m = 16;
            int i6 = i5 | 8192;
            dmsuVar.a = i6;
            dmsuVar.s = 2.0f;
            dmsuVar.a = i6 | 16384;
            dmsuVar.t = 2.0f;
            dmsu dmsuVar2 = (dmsu) bZ2.b;
            dmsuVar2.o = 3;
            int i7 = dmsuVar2.a | 2048;
            dmsuVar2.a = i7;
            int i8 = i7 | 32;
            dmsuVar2.a = i8;
            dmsuVar2.g = 7;
            int i9 = i8 | 16;
            dmsuVar2.a = i9;
            dmsuVar2.f = 3;
            dmsuVar2.a = i9 | 1024;
            dmsuVar2.n = 16;
            dmsu.c(dmsuVar2);
            bZ2.a(alfq.c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmpv dmpvVar = (dmpv) bZ.b;
            dmsu bK = bZ2.bK();
            bK.getClass();
            dmpvVar.f = bK;
            dmpvVar.a |= 8;
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar2 = (dmop) dmooVar.b;
            dmpv bK2 = bZ.bK();
            bK2.getClass();
            dmopVar2.d = bK2;
            dmopVar2.a |= 4;
            dmqtVar.a(dmooVar);
            aktg c2 = akvzVar.c((dmqx) dmqtVar.bK());
            alfqVar.g.add(c2);
            return c2;
        }
    });
    public final dbty<akuh> k = dbud.a(new dbty(this) { // from class: alfi
        private final alfq a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            alfq alfqVar = this.a;
            aktg c2 = alfqVar.d.c(alfq.b);
            alfqVar.g.add(c2);
            return c2;
        }
    });
    public final dbty<akuh> l = dbud.a(new dbty(this) { // from class: alfj
        private final alfq a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            alfq alfqVar = this.a;
            akuh c2 = alfqVar.c(alfp.CAR, false);
            alfqVar.g.add(c2);
            return c2;
        }
    });
    public final dbty<akuh> m = dbud.a(new dbty(this) { // from class: alfk
        private final alfq a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            alfq alfqVar = this.a;
            akuh c2 = alfqVar.c(alfp.PHONE, false);
            alfqVar.g.add(c2);
            return c2;
        }
    });
    private final dbty<akuh> o = dbud.a(new dbty(this) { // from class: alfl
        private final alfq a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            alfq alfqVar = this.a;
            akuh c2 = alfqVar.c(alfp.CAR, true);
            alfqVar.g.add(c2);
            return c2;
        }
    });
    private final dbty<akuh> p = dbud.a(new dbty(this) { // from class: alfm
        private final alfq a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            alfq alfqVar = this.a;
            akuh c2 = alfqVar.c(alfp.PHONE, true);
            alfqVar.g.add(c2);
            return c2;
        }
    });
    public final dbty<akuh> n = dbud.a(new dbty(this) { // from class: alfn
        private final alfq a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            alfq alfqVar = this.a;
            aktg c2 = alfqVar.d.c(dmqx.e);
            alfqVar.g.add(c2);
            return c2;
        }
    });

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
        dmpq bZ = dmpv.s.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmpvVar.a |= 1;
        dmpvVar.b = -16777216;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i = dmobVar.a | 4;
        dmobVar.a = i;
        dmobVar.d = 100;
        dmobVar.a = i | 1;
        dmobVar.b = 11;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        b = (dmqx) dmqtVar.bK();
        c = dcdc.i(dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT, dmlo.TOP_RIGHT, dmlo.TOP_LEFT);
    }

    public alfq(Context context, akvz akvzVar, boolean z) {
        this.d = akvzVar;
        this.e = context;
        this.f = z;
    }

    public final akuh a(alfp alfpVar) {
        if (this.i) {
            bvoo.h("Attempted to use Jamcident Callout text style after it has been destroyed.", new Object[0]);
        }
        alfp alfpVar2 = alfp.PHONE;
        int ordinal = alfpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.o.a();
            }
            bvoo.h("Attempt to create a style for an unsupported style type: %s", alfpVar);
            return this.n.a();
        }
        return this.p.a();
    }

    public final akuh b(String str, int i) {
        alew alewVar = new alew(str, Integer.valueOf(i));
        if (this.h.containsKey(alewVar)) {
            return this.h.get(alewVar);
        }
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        dmog dmogVar = (dmog) dmoh.h.bZ();
        if (dmogVar.c) {
            dmogVar.bF();
            dmogVar.c = false;
        }
        dmoh dmohVar = (dmoh) dmogVar.b;
        str.getClass();
        int i2 = dmohVar.a | 1;
        dmohVar.a = i2;
        dmohVar.b = str;
        int i3 = i2 | 8;
        dmohVar.a = i3;
        dmohVar.d = i;
        dmohVar.a = i3 | 16;
        dmohVar.e = i;
        bZ.a(dmogVar);
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK = bZ.bK();
        bK.getClass();
        dmopVar2.d = bK;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        aktg c2 = this.d.c((dmqx) dmqtVar.bK());
        this.g.add(c2);
        this.h.put(alewVar, c2);
        return c2;
    }

    public final akuh c(alfp alfpVar, boolean z) {
        int color;
        if (z) {
            color = true != this.f ? -16777216 : -1;
        } else {
            color = this.e.getResources().getColor(true != this.f ? R.color.directions_redtraffic_text : R.color.directions_redtraffic_nightmode_text);
        }
        akvz akvzVar = this.d;
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        int i = dmpvVar.a | 1;
        dmpvVar.a = i;
        dmpvVar.b = color;
        dmpvVar.a = i | 2;
        dmpvVar.c = 0;
        dmoa bZ2 = dmob.g.bZ();
        alfp alfpVar2 = alfp.PHONE;
        int i2 = alfpVar.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i3 = dmobVar.a | 1;
        dmobVar.a = i3;
        dmobVar.b = i2;
        int i4 = i3 | 32;
        dmobVar.a = i4;
        dmobVar.f = 22;
        int i5 = i4 | 2;
        dmobVar.a = i5;
        dmobVar.c = 1;
        int i6 = i5 | 4;
        dmobVar.a = i6;
        dmobVar.d = 100;
        dmobVar.a = i6 | 8;
        dmobVar.e = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        return akvzVar.c((dmqx) dmqtVar.bK());
    }
}
