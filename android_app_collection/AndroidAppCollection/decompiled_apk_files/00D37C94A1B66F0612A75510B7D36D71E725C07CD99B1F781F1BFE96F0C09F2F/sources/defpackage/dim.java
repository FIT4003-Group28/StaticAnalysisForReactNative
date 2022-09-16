package defpackage;

import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dim  reason: default package */
/* loaded from: classes3.dex */
public final class dim {
    public static final dic b = new dic(1, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, dib.a, dib.e, null, null);
    public static final xs a = new vq((byte[]) null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(dcz dczVar, dik dikVar) {
        dczVar.a = dikVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.cyv r9, defpackage.dcz r10, defpackage.dcz r11, defpackage.dcz r12, defpackage.dcz r13, defpackage.dcz r14, defpackage.dcz r15, defpackage.dcz r16, defpackage.dhj r17, defpackage.dic r18, defpackage.dle r19, boolean r20, boolean r21) {
        /*
            r0 = r9
            r1 = r18
            dif r2 = r1.c
            dnt r3 = r1.f
            android.content.Context r3 = r0.b
            int r3 = r1.a
            djo r4 = new djo
            r4.<init>(r3)
            r3 = r16
            r3.a = r4
            dkx r3 = new dkx
            r3.<init>()
            r3.r = r4
            float r4 = r2.a
            r3.b = r4
            r4 = 0
            r3.g = r4
            dbu r5 = r2.i
            r3.s = r5
            boolean r5 = r2.c
            r3.d = r5
            boolean r5 = r2.h
            r3.q = r5
            r5 = r21
            r3.h = r5
            boolean r5 = r2.b
            r3.j = r5
            boolean r5 = r2.e
            r3.l = r5
            boolean r5 = r2.f
            r3.m = r5
            int r5 = r2.g
            dlc r3 = r3.a(r9)
            din r5 = new din
            boolean r2 = r2.d
            r5.<init>(r3, r2)
            dhk r2 = new dhk
            r2.<init>(r9)
            r3 = r13
            r3.a = r5
            int r3 = r1.b
            int r6 = r1.d
            int r7 = r1.e
            r8 = -1
            if (r3 == r8) goto L79
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r7) goto L67
            switch(r3) {
                case 2147483645: goto L73;
                case 2147483646: goto L6d;
                default: goto L64;
            }
        L64:
            r6 = r10
            r3 = r4
            goto L7f
        L67:
            xf r3 = new xf
            r3.<init>()
            goto L7e
        L6d:
            wq r3 = new wq
            r3.<init>()
            goto L7e
        L73:
            dja r3 = new dja
            r3.<init>(r6)
            goto L7e
        L79:
            dlp r3 = new dlp
            r3.<init>(r7)
        L7e:
            r6 = r10
        L7f:
            r6.a = r3
            dhq r3 = new dhq
            r3.<init>(r2, r5)
            r2 = r17
            java.lang.String r2 = r2.e
            r3.c = r2
            dhv r2 = new dhv
            r2.<init>(r3)
            r3 = r11
            r3.a = r2
            if (r19 == 0) goto L99
            r3 = r19
            goto L9e
        L99:
            dle r3 = new dle
            r3.<init>(r4)
        L9e:
            int r1 = r1.b
            r3.b = r1
            r1 = r15
            r1.a = r3
            dgz r1 = new dgz
            r1.<init>(r9, r3)
            r0 = r12
            r0.a = r1
            r2.e = r1
            dij r0 = new dij
            r0.<init>(r2)
            dlc r1 = r5.a
            dmp r1 = r1.D
            r1.a(r0)
            dlc r0 = r5.a
            r1 = r20
            r0.q = r1
            dik r0 = defpackage.dik.LOADING
            r1 = r14
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dim.b(cyv, dcz, dcz, dcz, dcz, dcz, dcz, dcz, dhj, dic, dle, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(dit ditVar) {
        ditVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(cyv cyvVar, dhv dhvVar) {
        dhj dhjVar;
        int i = dii.M;
        cyr cyrVar = cyvVar.f;
        if (cyrVar != null) {
            dii diiVar = (dii) cyrVar;
        }
        synchronized (dhvVar) {
            boolean z = dhvVar.a;
            dhjVar = dhvVar.c;
        }
        if (dhjVar == null) {
            return;
        }
        dhvVar.f(dhjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyr e(cyv cyvVar, dhj dhjVar, cyr cyrVar, cyr cyrVar2, cyr cyrVar3, List list, boolean z, boolean z2, boolean z3, xs xsVar, int i, int i2, int i3, int i4, int i5, akcr akcrVar, ya yaVar, boolean z4, dic dicVar, dle dleVar, djo djoVar, dik dikVar, dit ditVar, dhv dhvVar, xz xzVar) {
        int i6 = dii.M;
        if (cyvVar.f != null) {
            ddk ddkVar = new ddk(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, true);
            ComponentTree componentTree = cyvVar.j;
            if (componentTree != null) {
                String str = cyvVar.f.m;
                synchronized (componentTree) {
                    if (componentTree.s != null) {
                        componentTree.w.m(str, ddkVar, true);
                    }
                }
            }
        }
        synchronized (dhvVar) {
            boolean z5 = dhvVar.a;
            dhj dhjVar2 = dhvVar.c;
            if (dhjVar2 == null || dhjVar2.f != dhjVar.f) {
                dhj dhjVar3 = dhvVar.d;
                if (dhjVar3 == null || dhjVar3.f != dhjVar.f) {
                    dhvVar.d = dhv.b(dhjVar, false);
                    dhvVar.l(0, null, null);
                }
            }
        }
        boolean z6 = dikVar == dik.ERROR && cyrVar3 == null;
        if (!(dikVar == dik.EMPTY && cyrVar2 == null) && !z6) {
            boolean z7 = dicVar.a != 0 && !z4;
            djw djwVar = new djw();
            djw.c(djwVar, cyvVar, new djy());
            djy djyVar = djwVar.a;
            djyVar.d = z;
            djyVar.w = i2;
            djyVar.H = i3;
            djyVar.f175J = i4;
            djyVar.b = i5;
            djwVar.s(z2);
            djy djyVar2 = djwVar.a;
            djyVar2.x = z3;
            djyVar2.I = 0;
            djyVar2.D = -1;
            djyVar2.A = i;
            djyVar2.C = dleVar;
            daq H = !z7 ? null : dii.H(dii.class, cyvVar, -1873243140, new Object[]{cyvVar, dhvVar});
            djy djyVar3 = djwVar.a;
            djyVar3.E = H;
            djyVar3.B = z7;
            djyVar3.O = null;
            djyVar3.g = false;
            djyVar3.K = false;
            djyVar3.f = djwVar.b.a(0.0f);
            dil dilVar = new dil(djoVar);
            if (djwVar.a.z == Collections.EMPTY_LIST) {
                djwVar.a.z = new ArrayList();
            }
            djwVar.a.z.add(dilVar);
            if (list != null) {
                if (djwVar.a.z.isEmpty()) {
                    djwVar.a.z = list;
                } else {
                    djwVar.a.z.addAll(list);
                }
            }
            djy djyVar4 = djwVar.a;
            djyVar4.F = null;
            djyVar4.G = -12425294;
            djyVar4.N = xzVar;
            djyVar4.M = akcrVar;
            djyVar4.y = yaVar;
            djyVar4.a = ditVar;
            djwVar.d.set(0);
            vq vqVar = xsVar;
            if (a == vqVar) {
                vqVar = new vq((byte[]) null);
            }
            djwVar.a.v = vqVar;
            djwVar.H(0.0f);
            djwVar.Q(null);
            if (!ditVar.f()) {
                dif difVar = dicVar.c;
                djwVar.O(YogaPositionType.ABSOLUTE);
                djwVar.N(YogaEdge.ALL, 0);
            }
            cyk a2 = cyl.a(cyvVar);
            a2.H(0.0f);
            a2.d(YogaAlign.FLEX_START);
            a2.l(djwVar);
            if (dikVar == dik.LOADING && cyrVar != null) {
                dfa a3 = dfb.a(cyvVar);
                a3.e(cyrVar);
                a3.H(0.0f);
                a3.O(YogaPositionType.ABSOLUTE);
                a3.N(YogaEdge.ALL, 0);
                a2.l(a3);
            } else if (dikVar == dik.EMPTY) {
                dfa a4 = dfb.a(cyvVar);
                a4.e(cyrVar2);
                a4.H(0.0f);
                a4.O(YogaPositionType.ABSOLUTE);
                a4.N(YogaEdge.ALL, 0);
                a2.l(a4);
            } else if (dikVar == dik.ERROR) {
                dfa a5 = dfb.a(cyvVar);
                a5.e(cyrVar3);
                a5.H(0.0f);
                a5.O(YogaPositionType.ABSOLUTE);
                a5.N(YogaEdge.ALL, 0);
                a2.l(a5);
            }
            return a2.a;
        }
        return null;
    }
}
