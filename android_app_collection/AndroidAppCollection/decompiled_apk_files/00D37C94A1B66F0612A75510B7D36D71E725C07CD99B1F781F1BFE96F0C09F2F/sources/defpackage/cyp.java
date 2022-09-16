package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: cyp  reason: default package */
/* loaded from: classes3.dex */
public abstract class cyp implements Cloneable {
    private cyv a;
    public dde b;
    public cyr c;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void o(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
            throw new IllegalStateException(valueOf.length() != 0 ? "The following props are not marked as optional and were not supplied: ".concat(valueOf) : new String("The following props are not marked as optional and were not supplied: "));
        }
    }

    public final void A(String str) {
        cyo C = this.c.C();
        C.a = (byte) (C.a | 2);
        C.d = str;
    }

    public final void B(int i) {
        cyn c = this.c.C().c();
        c.a |= 131072;
        c.k = i;
    }

    public final void C(Object obj) {
        this.c.C().D().q(obj);
    }

    public final void D(float f) {
        int a = this.b.a(f);
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 1;
        cymVar.b = a;
    }

    public final void E(YogaEdge yogaEdge, int i) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 8388608;
        if (cymVar.y == null) {
            cymVar.y = new dam();
        }
        cymVar.y.d(yogaEdge, i);
    }

    public final void F(Object obj) {
        this.c.C().e = obj;
    }

    public final void G(float f) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 32768;
        cymVar.n = f;
    }

    public final void H(float f) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 65536;
        cymVar.o = f;
    }

    public final void I(float f) {
        int a = this.b.a(f);
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 64;
        cymVar.h = a;
    }

    public final void J(float f) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 128;
        cymVar.i = f;
    }

    public final void K(daq daqVar) {
        cyn c = this.c.C().c();
        c.a |= 64;
        c.d = daqVar;
    }

    public final void L(YogaEdge yogaEdge, int i) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 33554432;
        if (cymVar.w == null) {
            cymVar.w = new dam();
        }
        cymVar.w.d(yogaEdge, i);
    }

    public final void M(int i) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 256;
        cymVar.j = i;
    }

    public final void N(YogaEdge yogaEdge, int i) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 2097152;
        if (cymVar.v == null) {
            cymVar.v = new dam();
        }
        cymVar.v.d(yogaEdge, i);
    }

    public final void O(YogaPositionType yogaPositionType) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 1048576;
        cymVar.u = yogaPositionType;
    }

    public final void P(YogaEdge yogaEdge, float f) {
        int a = this.b.a(f);
        cyn c = this.c.C().c();
        c.a |= 256;
        if (c.f == null) {
            c.f = new dam();
        }
        c.f.d(yogaEdge, a);
    }

    public final void Q(daq daqVar) {
        this.c.C().D().p(daqVar);
    }

    public final void R(daq daqVar) {
        cyn c = this.c.C().c();
        c.a |= 8;
        c.b = daqVar;
    }

    public final void S(float f) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 2;
        cymVar.c = f;
    }

    public final void T() {
        this.c.C().f = true;
    }

    public abstract cyr a();

    protected abstract void b(cyr cyrVar);

    /* renamed from: m */
    public final cyp clone() {
        try {
            cyp cypVar = (cyp) super.clone();
            cyr j = this.c.j();
            cypVar.c = j;
            cypVar.b(j);
            return cypVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public final cyp n(YogaEdge yogaEdge, float f) {
        L(yogaEdge, this.b.a(f));
        return this;
    }

    public final void p(float f) {
        cyo C = this.c.C();
        C.D().c(f);
        C.a = (byte) (f == 1.0f ? C.a & (-9) : C.a | 8);
    }

    public final void q(Drawable drawable) {
        cyo C = this.c.C();
        C.a = (byte) (C.a | 1);
        C.c = drawable;
    }

    public final void r(daq daqVar) {
        this.c.C().D().d(daqVar);
    }

    public void s(boolean z) {
        this.c.C().D().f(z);
    }

    public void t(CharSequence charSequence) {
        this.c.C().D().g(charSequence);
    }

    public final void u(boolean z) {
        this.c.C().D().k(z);
    }

    public final void v(int i) {
        cyn c = this.c.C().c();
        c.a |= 1;
        c.e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(cyv cyvVar, cyr cyrVar) {
        this.b = cyvVar.g;
        this.c = cyrVar;
        this.a = cyvVar;
        cyr cyrVar2 = cyvVar.f;
        if (cyrVar2 != null) {
            this.c.l = cyrVar2.m;
        }
        this.c.r = cyvVar.b;
    }

    public final void x(String str) {
        if (str == null) {
            cyr cyrVar = this.a.f;
            String o = cyrVar != null ? cyrVar.o() : "unknown component";
            StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 99);
            sb.append("Setting a null key from ");
            sb.append(o);
            sb.append(" which is usually a mistake! If it is not, explicitly set the String 'null'");
            czq.a(2, "Component:NullKeySet", sb.toString());
            str = "null";
        }
        cyr cyrVar2 = this.c;
        cyrVar2.o = true;
        cyrVar2.n = str;
    }

    public final void y(YogaDirection yogaDirection) {
        cym cymVar = (cym) this.c.C().C();
        cymVar.a |= 4096;
        cymVar.s = yogaDirection;
    }

    public final void z(YogaEdge yogaEdge, float f) {
        E(yogaEdge, this.b.a(f));
    }
}
