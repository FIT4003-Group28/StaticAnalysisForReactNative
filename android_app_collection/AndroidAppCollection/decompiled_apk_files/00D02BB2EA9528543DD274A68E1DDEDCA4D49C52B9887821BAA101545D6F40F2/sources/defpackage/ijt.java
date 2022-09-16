package defpackage;
/* compiled from: PG */
/* renamed from: ijt  reason: default package */
/* loaded from: classes6.dex */
public abstract class ijt implements ijr {
    public static ijs j() {
        return new ijg();
    }

    public static ijt k(cjtd cjtdVar, CharSequence charSequence, CharSequence charSequence2, cjtd cjtdVar2, Runnable runnable, cjtd cjtdVar3, Runnable runnable2) {
        ijg ijgVar = (ijg) j();
        ijgVar.a = cjtdVar;
        if (charSequence != null) {
            ijgVar.b = charSequence;
            if (charSequence2 != null) {
                ijgVar.c = charSequence2;
                ijgVar.d = cjtdVar2;
                ijgVar.f = runnable;
                ijgVar.e = cjtdVar3;
                ijgVar.g = runnable2;
                String str = ijgVar.b == null ? " title" : "";
                if (ijgVar.c == null) {
                    str = str.concat(" subtitle");
                }
                if (str.isEmpty()) {
                    return new ijh(ijgVar.a, ijgVar.b, ijgVar.c, ijgVar.d, ijgVar.e, ijgVar.f, ijgVar.g);
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.ijr
    @dzsi
    public abstract cjtd a();

    @Override // defpackage.ijr
    public abstract CharSequence b();

    @Override // defpackage.ijr
    public abstract CharSequence c();

    @Override // defpackage.ijr
    @dzsi
    public abstract cjtd d();

    @Override // defpackage.ijr
    @dzsi
    public abstract cjtd e();

    @dzsi
    public abstract Runnable f();

    @dzsi
    public abstract Runnable g();

    @Override // defpackage.ijr
    public cqkl h() {
        Runnable f = f();
        if (f != null) {
            f.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.ijr
    public cqkl i() {
        Runnable g = g();
        if (g != null) {
            g.run();
        }
        return cqkl.a;
    }
}
