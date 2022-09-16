package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adlu  reason: default package */
/* loaded from: classes.dex */
public final class adlu {
    public final String a;

    public adlu(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35719, iArr, 0);
        int i3 = iArr[0];
        byte[] bArr = new byte[i3];
        int[] iArr2 = new int[1];
        GLES20.glGetActiveUniform(i, i2, i3, iArr2, 0, new int[1], 0, new int[1], 0, bArr, 0);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            } else if (bArr[i4] == 0) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        String str = new String(bArr, 0, i3);
        this.a = str;
        GLES20.glGetUniformLocation(i, str);
        aais.e("Initializing uniform");
    }

    public adlu(String str) {
        this.a = str;
    }

    private static int c(int i) {
        aqxo.p(i >= 0);
        return (int) TimeUnit.DAYS.toSeconds(i);
    }

    private static int d(int i) {
        aqxo.p(true);
        return (int) TimeUnit.HOURS.toMillis(i);
    }

    private static aopa e(int i) {
        aopa createBuilder = atdk.a.createBuilder();
        createBuilder.copyOnWrite();
        atdk atdkVar = (atdk) createBuilder.instance;
        atdkVar.e = 2;
        atdkVar.b |= 1;
        i(createBuilder, 3);
        aopa createBuilder2 = atde.a.createBuilder();
        createBuilder2.copyOnWrite();
        atde atdeVar = (atde) createBuilder2.instance;
        atdeVar.c = 3;
        atdeVar.b |= 1;
        int i2 = i + 1;
        createBuilder.ay(j(i2 + i2, 7));
        createBuilder2.copyOnWrite();
        atde atdeVar2 = (atde) createBuilder2.instance;
        atdk atdkVar2 = (atdk) createBuilder.mo39build();
        atdkVar2.getClass();
        atdeVar2.d = atdkVar2;
        atdeVar2.b |= 2;
        return createBuilder2;
    }

    private static void f(aopa aopaVar) {
        aopa createBuilder = atdg.a.createBuilder();
        int d = d(18);
        createBuilder.copyOnWrite();
        atdg atdgVar = (atdg) createBuilder.instance;
        atdgVar.b |= 1;
        atdgVar.c = d;
        int d2 = d(24);
        createBuilder.copyOnWrite();
        atdg atdgVar2 = (atdg) createBuilder.instance;
        atdgVar2.b |= 2;
        atdgVar2.d = d2;
        atdg atdgVar3 = (atdg) createBuilder.mo39build();
        aopa createBuilder2 = atdi.b.createBuilder();
        createBuilder2.copyOnWrite();
        atdi atdiVar = (atdi) createBuilder2.instance;
        atdgVar3.getClass();
        aopu aopuVar = atdiVar.d;
        if (!aopuVar.c()) {
            atdiVar.d = aopi.mutableCopy(aopuVar);
        }
        atdiVar.d.add(atdgVar3);
        atdi atdiVar2 = (atdi) createBuilder2.mo39build();
        atdk atdkVar = ((atde) aopaVar.instance).d;
        if (atdkVar == null) {
            atdkVar = atdk.a;
        }
        aopa mo52toBuilder = atdkVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((atdk) mo52toBuilder.instance).i = atdk.emptyProtobufList();
        mo52toBuilder.az(atdiVar2);
        aopaVar.copyOnWrite();
        atde atdeVar = (atde) aopaVar.instance;
        atdk atdkVar2 = (atdk) mo52toBuilder.mo39build();
        atdkVar2.getClass();
        atdeVar.d = atdkVar2;
        atdeVar.b |= 2;
    }

    private static void g(aopa aopaVar) {
        aopa createBuilder = atdi.b.createBuilder();
        createBuilder.aA(atcl.DAY_OF_WEEK_SATURDAY);
        createBuilder.aA(atcl.DAY_OF_WEEK_SUNDAY);
        atdi atdiVar = (atdi) createBuilder.mo39build();
        atdk atdkVar = ((atde) aopaVar.instance).d;
        if (atdkVar == null) {
            atdkVar = atdk.a;
        }
        aopa mo52toBuilder = atdkVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((atdk) mo52toBuilder.instance).i = atdk.emptyProtobufList();
        mo52toBuilder.az(atdiVar);
        aopaVar.copyOnWrite();
        atde atdeVar = (atde) aopaVar.instance;
        atdk atdkVar2 = (atdk) mo52toBuilder.mo39build();
        atdkVar2.getClass();
        atdeVar.d = atdkVar2;
        atdeVar.b |= 2;
    }

    private static void h(aopa aopaVar, int i, int i2, int i3) {
        aopaVar.copyOnWrite();
        atde atdeVar = (atde) aopaVar.instance;
        atde atdeVar2 = atde.a;
        atdeVar.c = 1;
        atdeVar.b |= 1;
        aopa createBuilder = atdk.a.createBuilder();
        createBuilder.copyOnWrite();
        atdk atdkVar = (atdk) createBuilder.instance;
        atdkVar.e = 2;
        atdkVar.b = 1 | atdkVar.b;
        i(createBuilder, i);
        createBuilder.ay(j(i2, i3));
        aopaVar.copyOnWrite();
        atde atdeVar3 = (atde) aopaVar.instance;
        atdk atdkVar2 = (atdk) createBuilder.mo39build();
        atdkVar2.getClass();
        atdeVar3.d = atdkVar2;
        atdeVar3.b |= 2;
    }

    private static void i(aopa aopaVar, int i) {
        aopa createBuilder = atdh.a.createBuilder();
        createBuilder.copyOnWrite();
        atdh atdhVar = (atdh) createBuilder.instance;
        atdhVar.c = i - 1;
        atdhVar.b |= 1;
        aopa createBuilder2 = atdg.a.createBuilder();
        createBuilder2.copyOnWrite();
        atdg atdgVar = (atdg) createBuilder2.instance;
        atdgVar.b |= 1;
        atdgVar.c = 0;
        createBuilder2.copyOnWrite();
        atdg atdgVar2 = (atdg) createBuilder2.instance;
        atdgVar2.b |= 2;
        atdgVar2.d = 0;
        createBuilder.copyOnWrite();
        atdh atdhVar2 = (atdh) createBuilder.instance;
        atdg atdgVar3 = (atdg) createBuilder2.mo39build();
        atdgVar3.getClass();
        atdhVar2.d = atdgVar3;
        atdhVar2.b |= 2;
        aopaVar.copyOnWrite();
        atdk atdkVar = (atdk) aopaVar.instance;
        atdh atdhVar3 = (atdh) createBuilder.mo39build();
        atdk atdkVar2 = atdk.a;
        atdhVar3.getClass();
        aopu aopuVar = atdkVar.c;
        if (!aopuVar.c()) {
            atdkVar.c = aopi.mutableCopy(aopuVar);
        }
        atdkVar.c.add(atdhVar3);
    }

    private static atdf j(int i, int i2) {
        aopa createBuilder = atdf.a.createBuilder();
        createBuilder.copyOnWrite();
        atdf atdfVar = (atdf) createBuilder.instance;
        atdfVar.c = 1;
        atdfVar.b |= 1;
        aopa createBuilder2 = atdg.a.createBuilder();
        createBuilder2.copyOnWrite();
        atdg atdgVar = (atdg) createBuilder2.instance;
        atdgVar.b = 1 | atdgVar.b;
        atdgVar.c = i;
        createBuilder2.copyOnWrite();
        atdg atdgVar2 = (atdg) createBuilder2.instance;
        atdgVar2.b |= 2;
        atdgVar2.d = i;
        createBuilder.copyOnWrite();
        atdf atdfVar2 = (atdf) createBuilder.instance;
        atdg atdgVar3 = (atdg) createBuilder2.mo39build();
        atdgVar3.getClass();
        atdfVar2.d = atdgVar3;
        atdfVar2.b |= 2;
        int c = c(i2);
        createBuilder.copyOnWrite();
        atdf atdfVar3 = (atdf) createBuilder.instance;
        atdfVar3.b |= 4;
        atdfVar3.e = c;
        return (atdf) createBuilder.mo39build();
    }

    public final List a() {
        if (adih.b(this.a)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        aopa createBuilder = atdd.a.createBuilder();
        createBuilder.copyOnWrite();
        atdd atddVar = (atdd) createBuilder.instance;
        atddVar.c = 1;
        atddVar.b |= 1;
        createBuilder.copyOnWrite();
        atdd atddVar2 = (atdd) createBuilder.instance;
        atddVar2.b |= 2;
        atddVar2.d = 150;
        createBuilder.copyOnWrite();
        atdd atddVar3 = (atdd) createBuilder.instance;
        atddVar3.b |= 8;
        atddVar3.f = 10;
        createBuilder.copyOnWrite();
        atdd atddVar4 = (atdd) createBuilder.instance;
        atddVar4.b |= 16;
        atddVar4.g = 1500;
        int c = c(7);
        createBuilder.copyOnWrite();
        atdd atddVar5 = (atdd) createBuilder.instance;
        atddVar5.b |= 4;
        atddVar5.e = c;
        arrayList.add((atdd) createBuilder.mo39build());
        aopa createBuilder2 = atdd.a.createBuilder();
        createBuilder2.copyOnWrite();
        atdd atddVar6 = (atdd) createBuilder2.instance;
        atddVar6.c = 3;
        atddVar6.b = 1 | atddVar6.b;
        createBuilder2.copyOnWrite();
        atdd atddVar7 = (atdd) createBuilder2.instance;
        atddVar7.b |= 2;
        atddVar7.d = 200;
        createBuilder2.copyOnWrite();
        atdd atddVar8 = (atdd) createBuilder2.instance;
        atddVar8.b |= 8;
        atddVar8.f = 5;
        createBuilder2.copyOnWrite();
        atdd atddVar9 = (atdd) createBuilder2.instance;
        atddVar9.b |= 16;
        atddVar9.g = 3000;
        int c2 = c(44);
        createBuilder2.copyOnWrite();
        atdd atddVar10 = (atdd) createBuilder2.instance;
        atddVar10.b |= 4;
        atddVar10.e = c2;
        arrayList.add((atdd) createBuilder2.mo39build());
        return arrayList;
    }

    public final List b() {
        int i;
        int i2;
        if (adih.b(this.a)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 5) {
            if (i3 == 0) {
                i3 = 0;
                i = 0;
                i2 = 3;
            } else {
                i = i3;
                i2 = 4;
            }
            int pow = i3 == 0 ? 0 : (int) (Math.pow(2.0d, i3 - 1) * 30.0d);
            int i4 = i3 + i3;
            aopa createBuilder = atde.a.createBuilder();
            h(createBuilder, i2, i4, pow);
            f(createBuilder);
            arrayList.add((atde) createBuilder.mo39build());
            aopa createBuilder2 = atde.a.createBuilder();
            h(createBuilder2, i2, i4, pow);
            g(createBuilder2);
            arrayList.add((atde) createBuilder2.mo39build());
            i3 = i + 1;
            int i5 = (i3 + i3) - 1;
            aopa createBuilder3 = atde.a.createBuilder();
            h(createBuilder3, 3, i5, 7);
            f(createBuilder3);
            arrayList.add((atde) createBuilder3.mo39build());
            aopa createBuilder4 = atde.a.createBuilder();
            h(createBuilder4, 3, i5, 7);
            g(createBuilder4);
            arrayList.add((atde) createBuilder4.mo39build());
            aopa e = e(i);
            f(e);
            arrayList.add((atde) e.mo39build());
            aopa e2 = e(i);
            g(e2);
            arrayList.add((atde) e2.mo39build());
        }
        return arrayList;
    }
}
