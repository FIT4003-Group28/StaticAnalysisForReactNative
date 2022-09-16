package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.RelatedChipCloudRendererOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajwl  reason: default package */
/* loaded from: classes.dex */
public abstract class ajwl extends ajwd implements ynl {
    private final yni a;
    private final ajsm b;
    public final auuf c;
    public final ajrj d;
    protected final ajsm e;
    public final ajsm f;
    public final ajqh g;
    protected final ajsm h;
    protected final ajxs i;
    public boolean j;
    public int k;
    protected final ampq l;
    public final List m;
    public final akab n;
    private final ajxr o;
    private final boolean p;
    private boolean q;
    private final ajxu r;
    private final int s;
    private final CharSequence t;
    private final CharSequence u;
    private final apzg v;
    private final ajwj w;
    private final ajin x;
    private final ajwh y;

    public ajwl(ajyi ajyiVar, yni yniVar, auuf auufVar, List list, int i, ajxu ajxuVar, ampq ampqVar, CharSequence charSequence, CharSequence charSequence2, apzg apzgVar, int i2, boolean z, akad akadVar, ajin ajinVar, akam akamVar) {
        this(ajyiVar, yniVar, auufVar, list, i, ajxuVar, ampqVar, charSequence, charSequence2, apzgVar, i2, z, akadVar, ajinVar, akamVar, ajwg.a);
    }

    private final boolean pp() {
        int bc = awwc.bc(this.c.s);
        if (bc == 0) {
            bc = 1;
        }
        return bc == 3 || bc == 4;
    }

    protected abstract Class c();

    protected void d() {
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public void j() {
        this.a.m(this);
        this.r.f(this.y);
    }

    @Override // defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i) {
        return aolu.q(this, obj, i);
    }

    public final int l(int i) {
        auuf auufVar = this.c;
        int i2 = auufVar.d;
        if (i2 != 45) {
            return i2 == 46 ? Math.max(((Integer) auufVar.e).intValue(), i) : i;
        }
        return ((Integer) auufVar.e).intValue();
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(akad akadVar) {
        this.n.b(akadVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r10 = this;
            ajsm r0 = r10.f
            r0.clear()
            java.util.List r0 = r10.m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L55
            java.util.List r0 = r10.m
            int r0 = r0.size()
            int r1 = r10.k
            r2 = 1
            if (r1 == r2) goto L1b
            if (r0 != r2) goto L21
            r0 = 1
        L1b:
            boolean r1 = r10.po()
            if (r1 == 0) goto L4e
        L21:
            int r1 = r10.k
            if (r1 <= 0) goto L55
            int r2 = r0 + r1
            int r2 = r2 + (-1)
            int r2 = r2 / r1
            r1 = 0
        L2b:
            if (r1 >= r2) goto L55
            int r3 = r10.k
            int r4 = r1 + 1
            int r5 = r4 * r3
            int r5 = java.lang.Math.min(r5, r0)
            ajsm r6 = r10.f
            ajwj r7 = r10.w
            int r8 = r10.k
            java.util.List r9 = r10.m
            int r3 = r3 * r1
            java.util.List r3 = r9.subList(r3, r5)
            ajqo r1 = r7.a(r8, r3, r1, r2)
            r6.add(r1)
            r1 = r4
            goto L2b
        L4e:
            ajsm r0 = r10.f
            java.util.List r1 = r10.m
            r0.addAll(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwl.n():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r5 = this;
            ajqh r0 = r5.g
            int r0 = r0.a()
            ajsm r1 = r5.f
            int r1 = r1.size()
            auuf r2 = r5.c
            aqtd r2 = r2.v
            if (r2 != 0) goto L14
            aqtd r2 = defpackage.aqtd.a
        L14:
            int r2 = r2.b
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L29
            auuf r2 = r5.c
            aqtd r2 = r2.v
            if (r2 != 0) goto L22
            aqtd r2 = defpackage.aqtd.a
        L22:
            boolean r2 = r2.c
            if (r2 == 0) goto L27
            goto L29
        L27:
            r2 = 0
            goto L2a
        L29:
            r2 = 1
        L2a:
            boolean r4 = r5.pp()
            r4 = r4 ^ r3
            r2 = r2 & r4
            r4 = 0
            if (r0 >= r1) goto L4b
            ajxs r0 = r5.i
            java.lang.CharSequence r1 = r5.t
            r0.b = r1
            r1 = 2
            r0.e = r1
            ajwf r1 = new ajwf
            r1.<init>(r5, r3)
            r0.c = r1
            ajxs r0 = r5.i
            r0.d = r4
            r5.s(r0)
            return
        L4b:
            apzg r0 = r5.v
            if (r0 == 0) goto L6a
            java.lang.CharSequence r0 = r5.u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L58
            goto L6a
        L58:
            ajxs r0 = r5.i
            java.lang.CharSequence r1 = r5.u
            r0.a = r1
            r0.e = r3
            r0.c = r4
            apzg r1 = r5.v
            r0.d = r1
            r5.s(r0)
            return
        L6a:
            boolean r0 = r5.p
            if (r0 == 0) goto L91
            int r0 = r5.s
            java.util.List r1 = r5.m
            int r1 = r1.size()
            if (r0 < r1) goto L79
            goto L91
        L79:
            ajxs r0 = r5.i
            java.lang.CharSequence r1 = r5.u
            r0.a = r1
            r1 = 3
            r0.e = r1
            r0.d = r4
            ajwf r1 = new ajwf
            r1.<init>(r5)
            r0.c = r1
            ajxs r0 = r5.i
            r5.s(r0)
            return
        L91:
            if (r2 == 0) goto L99
            ajxr r0 = r5.o
            r5.s(r0)
            return
        L99:
            ajsm r0 = r5.b
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwl.o():void");
    }

    public final void p(Object obj) {
        if (obj == this.c) {
            t(false);
        } else if (!this.m.remove(obj)) {
        } else {
            if (this.m.isEmpty()) {
                t(false);
                return;
            }
            if (this.k > 1) {
                n();
            } else {
                this.f.remove(obj);
            }
            o();
        }
    }

    @Override // defpackage.ajwd, defpackage.ajzh
    public akam pn() {
        return new ajwk(this.j, this.m, this.q);
    }

    protected boolean po() {
        return pp();
    }

    public final void r(Object obj, Object obj2) {
        int indexOf = this.m.indexOf(obj);
        if (indexOf != -1) {
            this.m.set(indexOf, obj2);
            if (this.k > 1) {
                int size = this.m.size();
                int i = this.k;
                int i2 = indexOf / i;
                this.f.set(i2, this.w.a(this.k, this.m.subList(i * i2, Math.min((i2 + 1) * i, size)), i2, ((size + i) - 1) / i));
                return;
            }
            this.f.set(indexOf, obj2);
        }
    }

    protected final void s(Object obj) {
        if (this.b.isEmpty()) {
            this.b.add(obj);
        } else {
            this.b.n(0, obj);
        }
    }

    public final void t(boolean z) {
        if (this.q == z) {
            return;
        }
        this.q = z;
        if (!z || this.m.isEmpty()) {
            this.d.t();
            return;
        }
        this.d.m(this.e);
        this.d.m(this.g);
        this.d.m(this.b);
        this.d.m(this.h);
    }

    public final void u() {
        if (this.j) {
            this.g.h(Integer.MAX_VALUE);
            return;
        }
        int min = Math.min(this.s, this.m.size());
        int i = this.k;
        if (i > 1) {
            min = ((min + i) - 1) / i;
        }
        this.g.h(min);
    }

    public ajwl(ajyi ajyiVar, yni yniVar, auuf auufVar, List list, int i, ajxu ajxuVar, ampq ampqVar, CharSequence charSequence, CharSequence charSequence2, apzg apzgVar, int i2, boolean z, akad akadVar, ajin ajinVar, akam akamVar, ajwj ajwjVar) {
        list.getClass();
        this.a = yniVar;
        this.c = auufVar;
        this.s = i;
        this.l = ampqVar;
        this.x = ajinVar;
        ajrj ajrjVar = new ajrj();
        this.d = ajrjVar;
        final ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        ajsm ajsmVar2 = new ajsm();
        this.f = ajsmVar2;
        ajqh ajqhVar = new ajqh(ajsmVar2);
        this.g = ajqhVar;
        ajsm ajsmVar3 = new ajsm();
        this.b = ajsmVar3;
        ajsm ajsmVar4 = new ajsm();
        this.h = ajsmVar4;
        ajxs ajxsVar = new ajxs();
        this.i = ajxsVar;
        ajxsVar.f = i2;
        this.o = new ajxr();
        ajwjVar.getClass();
        this.w = ajwjVar;
        ajyiVar.a(c());
        yniVar.h(this, ajwl.class);
        ajxu ajxuVar2 = ajxuVar != null ? ajxuVar : akaj.a;
        this.r = ajxuVar2;
        ajwh ajwhVar = new ajwh(this);
        this.y = ajwhVar;
        ajxuVar2.e(ajwhVar);
        this.k = l(ajxuVar2.a());
        this.t = charSequence;
        this.u = charSequence2;
        this.v = apzgVar;
        this.p = z;
        ajrjVar.mG(new ajxv(ajxuVar2));
        akab akabVar = new akab();
        this.n = akabVar;
        d();
        m(akadVar);
        boolean z2 = true;
        if (akamVar instanceof ajwk) {
            ajwk ajwkVar = (ajwk) akamVar;
            this.m = ajwkVar.b;
            this.j = ajwkVar.a;
            this.q = ajwkVar.c;
        } else {
            this.m = akabVar.a(list);
            this.q = true;
        }
        if (this.m.isEmpty()) {
            return;
        }
        if (this.q) {
            ajrjVar.m(ajsmVar);
            ajrjVar.m(ajqhVar);
            ajrjVar.m(ajsmVar3);
            ajrjVar.m(ajsmVar4);
        }
        if (!auufVar.m) {
            if ((auufVar.b & 8) == 0) {
                ajsmVar.add(auufVar);
            } else {
                aunb aunbVar = auufVar.i;
                if ((aunbVar == null ? aunb.a : aunbVar).qn(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer)) {
                    aunb aunbVar2 = auufVar.i;
                    ajsmVar.add((aunbVar2 == null ? aunb.a : aunbVar2).qm(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer));
                } else {
                    aunb aunbVar3 = auufVar.i;
                    if ((aunbVar3 == null ? aunb.a : aunbVar3).qn(ElementRendererOuterClass.elementRenderer) && ajinVar != null) {
                        aunb aunbVar4 = auufVar.i;
                        ajinVar.b(aunbVar4 == null ? aunb.a : aunbVar4, new akac() { // from class: ajwi
                            @Override // defpackage.akac
                            public final void a(Object obj) {
                                ajsm.this.add(obj);
                            }
                        });
                    }
                }
            }
        }
        if (!this.j && this.m.size() > i) {
            z2 = false;
        }
        this.j = z2;
        u();
        n();
        o();
    }
}
