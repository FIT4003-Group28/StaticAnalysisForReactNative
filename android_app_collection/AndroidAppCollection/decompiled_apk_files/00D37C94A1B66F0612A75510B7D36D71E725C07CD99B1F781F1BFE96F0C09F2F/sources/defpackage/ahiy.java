package defpackage;
/* compiled from: PG */
/* renamed from: ahiy  reason: default package */
/* loaded from: classes.dex */
public final class ahiy extends ylz implements ynl {
    public final yni d;
    private final int e;

    public ahiy(yni yniVar, int i) {
        this.d = yniVar;
        this.e = i;
    }

    @Override // defpackage.ylz
    public final void b() {
        this.d.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahif ahifVar = (ahif) obj;
                int i2 = this.e;
                if (i2 > 0) {
                    if (ahifVar.a < i2) {
                        return null;
                    }
                    this.d.m(this);
                    this.c = true;
                    a();
                    return null;
                } else if (i2 >= 0 || ahifVar.b - ahifVar.a > (-i2)) {
                    return null;
                } else {
                    this.d.m(this);
                    this.c = true;
                    a();
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahif.class};
    }
}
