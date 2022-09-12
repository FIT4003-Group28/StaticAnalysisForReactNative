package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bbtq  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbtq implements Serializable {
    public static final bbtq a;
    public static final bbtq b;
    public static final bbtq c;

    static {
        bbtp f = f();
        bbsh bbshVar = (bbsh) f;
        bbshVar.a = dtxy.cC;
        bbshVar.b = dtxy.cD;
        bbshVar.c = dtxy.cq;
        bbshVar.d = dtxy.co;
        bbshVar.e = dtxy.cG;
        a = f.a();
        bbtp f2 = f();
        bbsh bbshVar2 = (bbsh) f2;
        bbshVar2.a = dtxl.fa;
        bbshVar2.b = dtxl.fb;
        bbshVar2.c = dtxl.eZ;
        bbshVar2.d = dtxl.eY;
        bbshVar2.e = dtxl.fc;
        b = f2.a();
        bbtp f3 = f();
        bbsh bbshVar3 = (bbsh) f3;
        bbshVar3.a = dtye.z;
        bbshVar3.b = dtye.A;
        bbshVar3.c = dtye.x;
        bbshVar3.d = dtye.v;
        bbshVar3.e = dtye.w;
        c = f3.a();
    }

    public static bbtp f() {
        return new bbsh();
    }

    public abstract ddho a();

    public abstract ddho b();

    public abstract ddho c();

    public abstract ddho d();

    public abstract ddho e();
}
