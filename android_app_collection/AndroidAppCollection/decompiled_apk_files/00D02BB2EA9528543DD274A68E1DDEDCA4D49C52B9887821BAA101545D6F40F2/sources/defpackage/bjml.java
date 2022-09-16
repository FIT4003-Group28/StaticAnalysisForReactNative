package defpackage;
/* compiled from: PG */
/* renamed from: bjml  reason: default package */
/* loaded from: classes3.dex */
public abstract class bjml {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static bjml f(ilo iloVar, bjfs bjfsVar, btlu btluVar, bjfz bjfzVar, boolean z) {
        bjlh bjlhVar = new bjlh();
        bjlhVar.a(false);
        if (iloVar != null) {
            bjlhVar.a = iloVar;
            if (bjfsVar != null) {
                bjlhVar.b = bjfsVar;
                if (btluVar != null) {
                    bjlhVar.c = btluVar;
                    if (bjfzVar != null) {
                        bjlhVar.e = bjfzVar;
                        bjlhVar.a(z);
                        String str = bjlhVar.a == null ? " placemark" : "";
                        if (bjlhVar.b == null) {
                            str = str.concat(" questionBundle");
                        }
                        if (bjlhVar.c == null) {
                            str = String.valueOf(str).concat(" gmmAccount");
                        }
                        if (bjlhVar.d == null) {
                            str = String.valueOf(str).concat(" isReadyToRender");
                        }
                        if (bjlhVar.e == null) {
                            str = String.valueOf(str).concat(" options");
                        }
                        if (str.isEmpty()) {
                            return new bjli(bjlhVar.a, bjlhVar.b, bjlhVar.c, bjlhVar.d.booleanValue(), bjlhVar.e);
                        }
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    throw new NullPointerException("Null options");
                }
                throw new NullPointerException("Null gmmAccount");
            }
            throw new NullPointerException("Null questionBundle");
        }
        throw new NullPointerException("Null placemark");
    }

    public abstract ilo a();

    public abstract bjfs b();

    public abstract btlu c();

    public abstract boolean d();

    public abstract bjfz e();
}
